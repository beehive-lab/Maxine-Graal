/*
 * Copyright 2000-2010 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 */

# include "incls/_precompiled.incl"
# include "incls/_c1x_VMEntries.cpp.incl"

// public byte[] RiMethod_code(long vmId);
JNIEXPORT jbyteArray JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1code(JNIEnv *env, jobject, jlong vmId) {
  methodOop method = VmIds::get<methodOop>(vmId);
  int code_size = method->code_size();
  jbyteArray result = env->NewByteArray(code_size);
  env->SetByteArrayRegion(result, 0, code_size, (const jbyte *) method->code_base());
  return result;
}

// public int RiMethod_maxStackSize(long vmId);
JNIEXPORT jint JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1maxStackSize(JNIEnv *, jobject, jlong vmId) {
  return VmIds::get<methodOop>(vmId)->max_stack();
}

// public int RiMethod_maxLocals(long vmId);
JNIEXPORT jint JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1maxLocals(JNIEnv *, jobject, jlong vmId) {
  return VmIds::get<methodOop>(vmId)->max_locals();
}

// public RiType RiMethod_holder(long vmId);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1holder(JNIEnv *, jobject, jlong vmId) {
  VM_ENTRY_MARK
  KlassHandle klass = VmIds::get<methodOop>(vmId)->method_holder();
  Handle name = VmIds::toString<Handle>(klass->name(), CHECK_NULL);
  oop holder = C1XCompiler::createHotSpotTypeResolved(klass, name, CHECK_NULL);
  return JNIHandles::make_local(THREAD, holder);
}

// public String RiMethod_signature(long vmId);
JNIEXPORT jstring JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1signature(JNIEnv *env, jobject, jlong vmId) {
  VM_ENTRY_MARK
  methodOop method = VmIds::get<methodOop>(vmId);
  method->constMethod()->exception_table();
  return VmIds::toString<jstring>(method->signature(), THREAD);
}

// public int RiMethod_accessFlags(long vmId);
JNIEXPORT jint JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1accessFlags(JNIEnv *, jobject, jlong vmId) {
  return VmIds::get<methodOop>(vmId)->access_flags().as_int();
}

// public RiExceptionHandler[] RiMethod_exceptionHandlers(long vmId);
JNIEXPORT jobjectArray JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1exceptionHandlers(JNIEnv *, jobject, jlong vmId) {
  VM_ENTRY_MARK
  methodHandle method = VmIds::get<methodOop>(vmId);
  typeArrayHandle handlers = method->exception_table();
  int handler_count = handlers.is_null() ? 0 : handlers->length() / 4;

  instanceKlass::cast(HotSpotExceptionHandler::klass())->initialize(CHECK_NULL);
  objArrayHandle array = oopFactory::new_objArray(SystemDictionary::RiExceptionHandler_klass(), handler_count, CHECK_NULL);

  for (int i = 0; i < handler_count; i++) {
    // exception handlers are stored as four integers: start bci, end bci, handler bci, catch class constant pool index
    int base = i * 4;
    Handle entry = instanceKlass::cast(HotSpotExceptionHandler::klass())->allocate_instance(CHECK_NULL);
    HotSpotExceptionHandler::set_startBci(entry, handlers->int_at(base + 0));
    HotSpotExceptionHandler::set_endBci(entry, handlers->int_at(base + 1));
    HotSpotExceptionHandler::set_handlerBci(entry, handlers->int_at(base + 2));
    int catch_class_index = handlers->int_at(base + 3);
    HotSpotExceptionHandler::set_catchClassIndex(entry, catch_class_index);

    if (catch_class_index == 0) {
      HotSpotExceptionHandler::set_catchClass(entry, NULL);
    } else {
      constantPoolOop cp = instanceKlass::cast(method->method_holder())->constants();
      ciInstanceKlass* loading_klass = (ciInstanceKlass *) CURRENT_ENV->get_object(method->method_holder());
      bool is_accessible = false;
      ciKlass *klass = CURRENT_ENV->get_klass_by_index(cp, catch_class_index, is_accessible, loading_klass);
      oop catch_class = C1XCompiler::get_RiType(klass, method->method_holder(), CHECK_NULL);

      HotSpotExceptionHandler::set_catchClass(entry, catch_class);
    }
    array->obj_at_put(i, entry());
  }

  return (jobjectArray) JNIHandles::make_local(array());
}

// public RiType RiSignature_lookupType(String returnType, long accessingClassVmId);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiSignature_1lookupType(JNIEnv *env, jobject, jstring jname, jlong accessingClassVmId) {
  VM_ENTRY_MARK;

  symbolOop nameSymbol = VmIds::toSymbol(jname);
  Handle name = JNIHandles::resolve(jname);

  oop result;
  if (nameSymbol == vmSymbols::int_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_INT, THREAD);
  } else if (nameSymbol == vmSymbols::long_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_LONG, THREAD);
  } else if (nameSymbol == vmSymbols::bool_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_BOOLEAN, THREAD);
  } else if (nameSymbol == vmSymbols::char_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_CHAR, THREAD);
  } else if (nameSymbol == vmSymbols::short_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_SHORT, THREAD);
  } else if (nameSymbol == vmSymbols::byte_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_BYTE, THREAD);
  } else if (nameSymbol == vmSymbols::double_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_DOUBLE, THREAD);
  } else if (nameSymbol == vmSymbols::float_signature()) {
    result = VMExits::createRiTypePrimitive((int) T_FLOAT, THREAD);
  } else {
    Handle classloader;
    Handle protectionDomain;
    if (accessingClassVmId != 0) {
      classloader = VmIds::get<klassOop>(accessingClassVmId)->klass_part()->class_loader();
      protectionDomain = VmIds::get<klassOop>(accessingClassVmId)->klass_part()->protection_domain();
    }
    klassOop resolved_type = SystemDictionary::resolve_or_null(nameSymbol, classloader, protectionDomain, THREAD);
    if (resolved_type != NULL) {
      result = C1XCompiler::createHotSpotTypeResolved(resolved_type, name, CHECK_NULL);
    } else {
      result = VMExits::createRiTypeUnresolved(name, accessingClassVmId, THREAD);
    }
  }

  return JNIHandles::make_local(THREAD, result);
}

// public Object RiConstantPool_lookupConstant(long vmId, int cpi);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupConstant(JNIEnv *env, jobject, jlong vmId, jint index) {
  VM_ENTRY_MARK;

  constantPoolOop cp = VmIds::get<constantPoolOop>(vmId);

  oop result = NULL;
  constantTag tag = cp->tag_at(index);
  if (tag.is_int()) {
    result = VMExits::createCiConstantInt(cp->int_at(index), CHECK_0);
  } else if (tag.is_long()) {
    result = VMExits::createCiConstantLong(cp->long_at(index), CHECK_0);
  } else if (tag.is_float()) {
    result = VMExits::createCiConstantFloat(cp->float_at(index), CHECK_0);
  } else if (tag.is_double()) {
    result = VMExits::createCiConstantDouble(cp->double_at(index), CHECK_0);
  } else if (tag.is_string() || tag.is_unresolved_string()) {
    oop string = NULL;
    if (cp->is_pseudo_string_at(index)) {
      string = cp->pseudo_string_at(index);
    } else {
      string = cp->string_at(index, THREAD);
      if (HAS_PENDING_EXCEPTION) {
        CLEAR_PENDING_EXCEPTION;
        // TODO: Gracefully exit compilation.
        fatal("out of memory during compilation!");
        return NULL;
      }
    }
    result = VMExits::createCiConstantObject(VmIds::add<oop>(string), CHECK_0);
  } else if (tag.is_klass() || tag.is_unresolved_klass()) {
    bool ignore;
    ciInstanceKlass* accessor = (ciInstanceKlass*) ciEnv::current()->get_object(cp->pool_holder());
    ciKlass* klass = ciEnv::current()->get_klass_by_index(cp, index, ignore, accessor);
    result = C1XCompiler::get_RiType(klass, cp->pool_holder(), CHECK_NULL);
  } else if (tag.is_object()) {
    oop obj = cp->object_at(index);
    assert(obj->is_instance(), "must be an instance");
    result = VMExits::createCiConstantObject(VmIds::add<oop>(obj), CHECK_NULL);
  } else {
    ShouldNotReachHere();
  }

  return JNIHandles::make_local(THREAD, result);
}

// public RiMethod RiConstantPool_lookupMethod(long vmId, int cpi, byte byteCode);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupMethod(JNIEnv *env, jobject, jlong vmId, jint index, jbyte byteCode) {
  VM_ENTRY_MARK;

  constantPoolHandle cp = VmIds::get<constantPoolOop>(vmId);

  Bytecodes::Code bc = (Bytecodes::Code) (((int) byteCode) & 0xFF);
  ciInstanceKlass* loading_klass = (ciInstanceKlass *) CURRENT_ENV->get_object(cp->pool_holder());
  ciMethod *cimethod = CURRENT_ENV->get_method_by_index(cp, index, bc, loading_klass);
  if (cimethod->is_loaded()) {
    methodOop method = (methodOop) cimethod->get_oop();
    Handle name = VmIds::toString<Handle>(method->name(), CHECK_NULL);
    return JNIHandles::make_local(THREAD, VMExits::createRiMethodResolved(VmIds::add<methodOop>(method), name, THREAD));
  } else {
    Handle name = VmIds::toString<Handle>((symbolOop) cimethod->name()->get_oop(), CHECK_NULL);
    Handle signature = VmIds::toString<Handle>((symbolOop) cimethod->signature()->as_symbol()->get_oop(), CHECK_NULL);
    Handle holder = C1XCompiler::get_RiType(cimethod->holder(), cp->klass(), THREAD);
    return JNIHandles::make_local(THREAD, VMExits::createRiMethodUnresolved(name, signature, holder, THREAD));
  }
}

// public RiSignature RiConstantPool_lookupSignature(long vmId, int cpi);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupSignature(JNIEnv *env, jobject, jlong vmId, jint index) {
  fatal("currently unsupported");
  return NULL;
}

// public RiType RiConstantPool_lookupType(long vmId, int cpi);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupType(JNIEnv *env, jobject, jlong vmId, jint index) {
  VM_ENTRY_MARK;

  constantPoolOop cp = VmIds::get<constantPoolOop>(vmId);

  ciInstanceKlass* loading_klass = (ciInstanceKlass *) CURRENT_ENV->get_object(cp->pool_holder());
  bool is_accessible = false;
  ciKlass *klass = CURRENT_ENV->get_klass_by_index(cp, index, is_accessible, loading_klass);
  return JNIHandles::make_local(THREAD, C1XCompiler::get_RiType(klass, cp->klass(), THREAD));
}

// public RiField RiConstantPool_lookupField(long vmId, int cpi);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupField(JNIEnv *env, jobject, jlong vmId, jint index) {
  VM_ENTRY_MARK;

  constantPoolOop cp = VmIds::get<constantPoolOop>(vmId);

  ciInstanceKlass* loading_klass = (ciInstanceKlass *) CURRENT_ENV->get_object(cp->pool_holder());
  ciField *field = CURRENT_ENV->get_field_by_index(loading_klass, index);
  return JNIHandles::make_local(THREAD, C1XCompiler::get_RiField(field, THREAD));
}

// public RiConstantPool RiType_constantPool(long vmId);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiType_1constantPool(JNIEnv *, jobject, jlong vmId) {
  VM_ENTRY_MARK;

  constantPoolOop constantPool = instanceKlass::cast(VmIds::get<klassOop>(vmId))->constants();
  return JNIHandles::make_local(VMExits::createRiConstantPool(VmIds::add<constantPoolOop>(constantPool), THREAD));
}

// public RiMethod RiType_resolveMethodImpl(long vmId, String name, String signature);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiType_3resolveMethodImpl(JNIEnv *, jobject, jlong vmId, jstring name, jstring signature) {
  VM_ENTRY_MARK;

  klassOop klass = VmIds::get<klassOop>(vmId);
  methodOop method = klass->klass_part()->lookup_method(VmIds::toSymbol(name), VmIds::toSymbol(signature));
  return JNIHandles::make_local(THREAD, VMExits::createRiMethodResolved(VmIds::add<methodOop>(method), Handle(JNIHandles::resolve(name)), THREAD));
}

// public boolean RiType_isSubtypeOf(long vmId, RiType other);
JNIEXPORT jboolean JNICALL Java_com_sun_hotspot_c1x_VMEntries_RiType_2isSubtypeOf(JNIEnv *, jobject, jlong vmId, jobject jother) {
  oop other = JNIHandles::resolve(jother);
  assert(other->is_a(HotSpotTypeResolved::klass()), "resolved hotspot type expected");
  klassOop thisKlass = VmIds::get<klassOop>(vmId);
  klassOop otherKlass = VmIds::get<klassOop>(HotSpotTypeResolved::vmId(other));
  return instanceKlass::cast(thisKlass)->is_subtype_of(otherKlass);
}

// helpers used to set fields in the HotSpotVMConfig object
jfieldID getFieldID(JNIEnv* env, jobject obj, const char* name, const char* sig) {
  jfieldID id = env->GetFieldID(env->GetObjectClass(obj), name, sig);
  if (id == NULL) {
    TRACE_C1X_1("field not found: %s (%s)", name, sig);
    fatal("field not found");
  }
  return id;
}

// public RiType getPrimitiveArrayType(CiKind kind);
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_getPrimitiveArrayType(JNIEnv *env, jobject, jobject kind) {
  VM_ENTRY_MARK;
  BasicType type;
  switch(CiKind::typeChar(kind)) {
    case 'z': type = T_BOOLEAN; break;
    case 'b': type = T_BYTE; break;
    case 's': type = T_SHORT; break;
    case 'c': type = T_CHAR; break;
    case 'i': type = T_INT; break;
    case 'f': type = T_FLOAT; break;
    case 'l': type = T_LONG; break;
    case 'd': type = T_DOUBLE; break;
    case 'a':
    default:
      fatal("unexpected CiKind in getPrimitiveArrayType");
      break;
  }
  ciKlass* klass = ciTypeArrayKlass::make(type);
  return JNIHandles::make_local(THREAD, C1XCompiler::get_RiType(klass, NULL, THREAD));
}


void set_boolean(JNIEnv* env, jobject obj, const char* name, bool value) { env->SetBooleanField(obj, getFieldID(env, obj, name, "Z"), value); }
void set_int(JNIEnv* env, jobject obj, const char* name, int value) { env->SetIntField(obj, getFieldID(env, obj, name, "I"), value); }
void set_long(JNIEnv* env, jobject obj, const char* name, long value) { env->SetLongField(obj, getFieldID(env, obj, name, "J"), value); }
void set_object(JNIEnv* env, jobject obj, const char* name, jobject value) { env->SetObjectField(obj, getFieldID(env, obj, name, "Ljava/lang/Object;"), value); }
void set_int_array(JNIEnv* env, jobject obj, const char* name, jarray value) { env->SetObjectField(obj, getFieldID(env, obj, name, "[I"), value); }

jboolean get_boolean(JNIEnv* env, jobject obj, const char* name) { return env->GetBooleanField(obj, getFieldID(env, obj, name, "Z")); }
jint get_int(JNIEnv* env, jobject obj, const char* name) { return env->GetIntField(obj, getFieldID(env, obj, name, "I")); }
jlong get_long(JNIEnv* env, jobject obj, const char* name) { return env->GetLongField(obj, getFieldID(env, obj, name, "J")); }
jobject get_object(JNIEnv* env, jobject obj, const char* name) { return env->GetObjectField(obj, getFieldID(env, obj, name, "Ljava/lang/Object;")); }
jobject get_object(JNIEnv* env, jobject obj, const char* name, const char* sig) { return env->GetObjectField(obj, getFieldID(env, obj, name, sig)); }


BasicType basicTypes[] = { T_BOOLEAN, T_BYTE, T_SHORT, T_CHAR, T_INT, T_FLOAT, T_LONG, T_DOUBLE, T_OBJECT };
int basicTypeCount = sizeof(basicTypes) / sizeof(BasicType);

// public HotSpotVMConfig getConfiguration();
JNIEXPORT jobject JNICALL Java_com_sun_hotspot_c1x_VMEntries_getConfiguration(JNIEnv *env, jobject) {
  jclass klass = env->FindClass("com/sun/hotspot/c1x/HotSpotVMConfig");
  assert(klass != NULL, "HotSpot vm config class not found");
  jobject config = env->AllocObject(klass);
#ifdef _WIN64
  set_boolean(env, config, "windowsOs", true);
#else
  set_boolean(env, config, "windowsOs", false);
#endif
  set_int(env, config, "codeEntryAlignment", CodeEntryAlignment);
  set_int(env, config, "vmPageSize", os::vm_page_size());
  set_int(env, config, "stackShadowPages", StackShadowPages);
  set_int(env, config, "hubOffset", oopDesc::klass_offset_in_bytes());
  set_int(env, config, "arrayLengthOffset", arrayOopDesc::length_offset_in_bytes());
  set_int(env, config, "threadTlabTopOffset", in_bytes(JavaThread::tlab_top_offset()));
  set_int(env, config, "threadTlabEndOffset", in_bytes(JavaThread::tlab_end_offset()));
  set_int(env, config, "instanceHeaderPrototypeOffset", Klass::prototype_header_offset_in_bytes() + klassOopDesc::klass_part_offset_in_bytes());
  set_int(env, config, "threadExceptionOopOffset", in_bytes(JavaThread::exception_oop_offset()));
  set_int(env, config, "threadExceptionPcOffset", in_bytes(JavaThread::exception_pc_offset()));
  set_int(env, config, "threadMultiNewArrayStorage", in_bytes(JavaThread::c1x_multinewarray_storage_offset()));

  set_long(env, config, "debugStub", VmIds::addStub((address)warning));
  set_long(env, config, "instanceofStub", VmIds::addStub(Runtime1::entry_for(Runtime1::slow_subtype_check_id)));
  set_long(env, config, "newInstanceStub", VmIds::addStub(Runtime1::entry_for(Runtime1::fast_new_instance_init_check_id)));
  set_long(env, config, "newTypeArrayStub", VmIds::addStub(Runtime1::entry_for(Runtime1::new_type_array_id)));
  set_long(env, config, "newObjectArrayStub", VmIds::addStub(Runtime1::entry_for(Runtime1::new_object_array_id)));
  set_long(env, config, "newMultiArrayStub", VmIds::addStub(Runtime1::entry_for(Runtime1::new_multi_array_id)));
  set_long(env, config, "loadKlassStub", VmIds::addStub(Runtime1::entry_for(Runtime1::load_klass_patching_id)));
  set_long(env, config, "resolveStaticCallStub", VmIds::addStub(SharedRuntime::get_resolve_static_call_stub()));
  set_long(env, config, "unwindExceptionStub", VmIds::addStub(Runtime1::entry_for(Runtime1::c1x_unwind_exception_call_id)));
  set_long(env, config, "handleExceptionStub", VmIds::addStub(Runtime1::entry_for(Runtime1::handle_exception_nofpu_id)));
  set_long(env, config, "throwClassCastException", VmIds::addStub(Runtime1::entry_for(Runtime1::throw_class_cast_exception_id)));
  set_long(env, config, "throwArrayStoreException", VmIds::addStub(Runtime1::entry_for(Runtime1::throw_array_store_exception_id)));
  set_long(env, config, "throwArrayIndexException", VmIds::addStub(Runtime1::entry_for(Runtime1::throw_range_check_failed_id)));

  jintArray arrayOffsets = env->NewIntArray(basicTypeCount);
  for (int i=0; i<basicTypeCount; i++) {
    jint offset = arrayOopDesc::base_offset_in_bytes(basicTypes[i]);
    env->SetIntArrayRegion(arrayOffsets, i, 1, &offset);
  }
  set_int_array(env, config, "arrayOffsets", arrayOffsets);
  set_int(env, config, "arrayClassElementOffset", objArrayKlass::element_klass_offset_in_bytes() + sizeof(oopDesc));
  return config;
}

// public void installMethod(HotSpotTargetMethod targetMethod);
JNIEXPORT void JNICALL Java_com_sun_hotspot_c1x_VMEntries_installMethod(JNIEnv *jniEnv, jobject, jobject targetMethod) {
  CodeInstaller installer(JNIHandles::resolve(targetMethod));
}

// public HotSpotProxy installStub(HotSpotTargetMethod targetMethod, String name);
JNIEXPORT jlong JNICALL Java_com_sun_hotspot_c1x_VMEntries_installStub(JNIEnv *jniEnv, jobject, jobject targetMethod) {
  jlong id;
  CodeInstaller installer(JNIHandles::resolve(targetMethod), id);
  return id;
}




#define CC (char*)  /*cast a literal from (const char*)*/
#define FN_PTR(f) CAST_FROM_FN_PTR(void*, &f)

#define PROXY           "J"
#define TYPE            "Lcom/sun/cri/ri/RiType;"
#define METHOD          "Lcom/sun/cri/ri/RiMethod;"
#define SIGNATURE       "Lcom/sun/cri/ri/RiSignature;"
#define FIELD           "Lcom/sun/cri/ri/RiField;"
#define CONSTANT_POOL   "Lcom/sun/cri/ri/RiConstantPool;"
#define EXCEPTION_HANDLERS "[Lcom/sun/cri/ri/RiExceptionHandler;"
#define TARGET_METHOD   "Lcom/sun/hotspot/c1x/HotSpotTargetMethod;"
#define CONFIG          "Lcom/sun/hotspot/c1x/HotSpotVMConfig;"
#define HS_METHOD       "Lcom/sun/hotspot/c1x/HotSpotMethod;"
#define CI_CONSTANT     "Lcom/sun/cri/ci/CiConstant;"
#define CI_KIND         "Lcom/sun/cri/ci/CiKind;"
#define STRING          "Ljava/lang/String;"
#define OBJECT          "Ljava/lang/Object;"

JNINativeMethod VMEntries_methods[] = {
  {CC"RiMethod_code",                   CC"("PROXY")[B",                    FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1code)},
  {CC"RiMethod_maxStackSize",           CC"("PROXY")I",                     FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1maxStackSize)},
  {CC"RiMethod_maxLocals",              CC"("PROXY")I",                     FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1maxLocals)},
  {CC"RiMethod_holder",                 CC"("PROXY")"TYPE,                  FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1holder)},
  {CC"RiMethod_signature",              CC"("PROXY")"STRING,                FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1signature)},
  {CC"RiMethod_accessFlags",            CC"("PROXY")I",                     FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1accessFlags)},
  {CC"RiMethod_exceptionHandlers",      CC"("PROXY")"EXCEPTION_HANDLERS,    FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiMethod_1exceptionHandlers)},
  {CC"RiSignature_lookupType",          CC"("STRING PROXY")"TYPE,           FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiSignature_1lookupType)},
  {CC"RiConstantPool_lookupConstant",   CC"("PROXY"I)"OBJECT,               FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupConstant)},
  {CC"RiConstantPool_lookupMethod",     CC"("PROXY"IB)"METHOD,              FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupMethod)},
  {CC"RiConstantPool_lookupSignature",  CC"("PROXY"I)"SIGNATURE,            FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupSignature)},
  {CC"RiConstantPool_lookupType",       CC"("PROXY"I)"TYPE,                 FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupType)},
  {CC"RiConstantPool_lookupField",      CC"("PROXY"I)"FIELD,                FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiConstantPool_1lookupField)},
  {CC"RiType_constantPool",             CC"("PROXY")"CONSTANT_POOL,         FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiType_1constantPool)},
  {CC"RiType_resolveMethodImpl",        CC"("PROXY STRING STRING")"METHOD,  FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiType_3resolveMethodImpl)},
  {CC"RiType_isSubtypeOf",              CC"("PROXY TYPE")Z",                FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_RiType_2isSubtypeOf)},
  {CC"getPrimitiveArrayType",           CC"("CI_KIND")"TYPE,                FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_getPrimitiveArrayType)},
  {CC"getConfiguration",                CC"()"CONFIG,                       FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_getConfiguration)},
  {CC"installMethod",                   CC"("TARGET_METHOD")V",             FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_installMethod)},
  {CC"installStub",                     CC"("TARGET_METHOD")"PROXY,         FN_PTR(Java_com_sun_hotspot_c1x_VMEntries_installStub)}
};

int VMEntries_methods_count() {
  return sizeof(VMEntries_methods) / sizeof(JNINativeMethod);
}
