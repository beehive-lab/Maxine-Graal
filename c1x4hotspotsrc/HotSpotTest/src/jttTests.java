
import com.sun.hotspot.c1x.logging.Logger;

public class jttTests {

	public static void main(String[] args) {
		runTests(128, 128);
		Logger.info("total: " + executed + " tests executed, " + passed + " passed, " + failed + " failed");
	}

	private static int testNumber;
	private static String testName;
	
	private static int executed = 0;
	private static int passed = 0;
	private static int failed = 0;
	
	
	public static boolean runTests(int start, int end) {
		while (start <= end) {
			testNumber = start;
			if (!runTest(start)) {
				return false;
			}
			start++;
		}
		return true;
	}

	static void begin(String testName) {
		jttTests.testName = testName;
		executed++;
	}

	static void pass() {
		Logger.info("# " + testNumber + ": " + testName + " passed");
		passed++;
	}

	static void fail(String runString) {
		Logger.info("# " + testNumber + ": " + testName + " failed for " +runString);
		failed++;
	}

	static void fail(String runString, Throwable thrown) {
		Logger.info("# " + testNumber + ": " + testName + " failed for " +runString +", exception " + thrown);
		failed++;
	}

	// Checkstyle: stop
	// GENERATED TEST RUNS
	public static boolean runTest(int num) {
		switch (num) {
		case 0:
			jtt_bytecode_BC_aaload();
			break;
		case 1:
			jtt_bytecode_BC_aaload_1();
			break;
		case 2:
			jtt_bytecode_BC_aastore();
			break;
		case 3:
			jtt_bytecode_BC_aload_0();
			break;
		case 4:
			jtt_bytecode_BC_aload_1();
			break;
		case 5:
			jtt_bytecode_BC_aload_2();
			break;
		case 6:
			jtt_bytecode_BC_aload_3();
			break;
		case 7:
			jtt_bytecode_BC_anewarray();
			break;
		case 8:
			jtt_bytecode_BC_areturn();
			break;
		case 9:
			jtt_bytecode_BC_arraylength();
			break;
		case 10:
			//jtt_bytecode_BC_athrow();
			break;
		case 11:
			jtt_bytecode_BC_baload();
			break;
		case 12:
			jtt_bytecode_BC_bastore();
			break;
		case 13:
			jtt_bytecode_BC_caload();
			break;
		case 14:
			jtt_bytecode_BC_castore();
			break;
		case 15:
			//jtt_bytecode_BC_checkcast01();
			break;
		case 16:
			//jtt_bytecode_BC_checkcast02();
			break;
		case 17:
			jtt_bytecode_BC_d2f();
			break;
		case 18:
			//jtt_bytecode_BC_d2i01();
			break;
		case 19:
			//jtt_bytecode_BC_d2i02();
			break;
		case 20:
			//jtt_bytecode_BC_d2l01();
			break;
		case 21:
			//jtt_bytecode_BC_d2l02();
			break;
		case 22:
			jtt_bytecode_BC_dadd();
			break;
		case 23:
			jtt_bytecode_BC_daload();
			break;
		case 24:
			jtt_bytecode_BC_dastore();
			break;
		case 25:
			jtt_bytecode_BC_dcmp01();
			break;
		case 26:
			jtt_bytecode_BC_dcmp02();
			break;
		case 27:
			jtt_bytecode_BC_dcmp03();
			break;
		case 28:
			jtt_bytecode_BC_dcmp04();
			break;
		case 29:
			jtt_bytecode_BC_dcmp05();
			break;
		case 30:
			jtt_bytecode_BC_dcmp06();
			break;
		case 31:
			jtt_bytecode_BC_dcmp07();
			break;
		case 32:
			jtt_bytecode_BC_dcmp08();
			break;
		case 33:
			jtt_bytecode_BC_dcmp09();
			break;
		case 34:
			jtt_bytecode_BC_dcmp10();
			break;
		case 35:
			jtt_bytecode_BC_ddiv();
			break;
		case 36:
			jtt_bytecode_BC_dmul();
			break;
		case 37:
			jtt_bytecode_BC_dneg();
			break;
		case 38:
			//jtt_bytecode_BC_drem();
			break;
		case 39:
			jtt_bytecode_BC_dreturn();
			break;
		case 40:
			jtt_bytecode_BC_dsub();
			break;
		case 41:
			jtt_bytecode_BC_f2d();
			break;
		case 42:
			jtt_bytecode_BC_f2i01();
			break;
		case 43:
			jtt_bytecode_BC_f2i02();
			break;
		case 44:
			jtt_bytecode_BC_f2l01();
			break;
		case 45:
			jtt_bytecode_BC_f2l02();
			break;
		case 46:
			jtt_bytecode_BC_fadd();
			break;
		case 47:
			jtt_bytecode_BC_faload();
			break;
		case 48:
			jtt_bytecode_BC_fastore();
			break;
		case 49:
			jtt_bytecode_BC_fcmp01();
			break;
		case 50:
			jtt_bytecode_BC_fcmp02();
			break;
		case 51:
			jtt_bytecode_BC_fcmp03();
			break;
		case 52:
			jtt_bytecode_BC_fcmp04();
			break;
		case 53:
			jtt_bytecode_BC_fcmp05();
			break;
		case 54:
			jtt_bytecode_BC_fcmp06();
			break;
		case 55:
			jtt_bytecode_BC_fcmp07();
			break;
		case 56:
			jtt_bytecode_BC_fcmp08();
			break;
		case 57:
			jtt_bytecode_BC_fcmp09();
			break;
		case 58:
			jtt_bytecode_BC_fcmp10();
			break;
		case 59:
			jtt_bytecode_BC_fdiv();
			break;
		case 60:
			jtt_bytecode_BC_fload();
			break;
		case 61:
			jtt_bytecode_BC_fload_2();
			break;
		case 62:
			jtt_bytecode_BC_fmul();
			break;
		case 63:
			jtt_bytecode_BC_fneg();
			break;
		case 64:
			//jtt_bytecode_BC_frem();
			break;
		case 65:
			jtt_bytecode_BC_freturn();
			break;
		case 66:
			jtt_bytecode_BC_fsub();
			break;
		case 67:
			jtt_bytecode_BC_getfield();
			break;
		case 68:
			jtt_bytecode_BC_getstatic_b();
			break;
		case 69:
			jtt_bytecode_BC_getstatic_c();
			break;
		case 70:
			jtt_bytecode_BC_getstatic_d();
			break;
		case 71:
			jtt_bytecode_BC_getstatic_f();
			break;
		case 72:
			jtt_bytecode_BC_getstatic_i();
			break;
		case 73:
			jtt_bytecode_BC_getstatic_l();
			break;
		case 74:
			jtt_bytecode_BC_getstatic_s();
			break;
		case 75:
			jtt_bytecode_BC_getstatic_z();
			break;
		case 76:
			jtt_bytecode_BC_i2b();
			break;
		case 77:
			jtt_bytecode_BC_i2c();
			break;
		case 78:
			jtt_bytecode_BC_i2d();
			break;
		case 79:
			jtt_bytecode_BC_i2f();
			break;
		case 80:
			jtt_bytecode_BC_i2l();
			break;
		case 81:
			jtt_bytecode_BC_i2s();
			break;
		case 82:
			jtt_bytecode_BC_iadd();
			break;
		case 83:
			jtt_bytecode_BC_iadd2();
			break;
		case 84:
			jtt_bytecode_BC_iadd3();
			break;
		case 85:
			jtt_bytecode_BC_iaload();
			break;
		case 86:
			jtt_bytecode_BC_iand();
			break;
		case 87:
			jtt_bytecode_BC_iastore();
			break;
		case 88:
			jtt_bytecode_BC_iconst();
			break;
		case 89:
			jtt_bytecode_BC_idiv();
			break;
		case 90:
			jtt_bytecode_BC_idiv2();
			break;
		case 91:
			jtt_bytecode_BC_ifeq();
			break;
		case 92:
			jtt_bytecode_BC_ifeq_2();
			break;
		case 93:
			jtt_bytecode_BC_ifeq_3();
			break;
		case 94:
			jtt_bytecode_BC_ifge();
			break;
		case 95:
			jtt_bytecode_BC_ifge_2();
			break;
		case 96:
			jtt_bytecode_BC_ifge_3();
			break;
		case 97:
			jtt_bytecode_BC_ifgt();
			break;
		case 98:
			jtt_bytecode_BC_ificmplt1();
			break;
		case 99:
			jtt_bytecode_BC_ificmplt2();
			break;
		case 100:
			jtt_bytecode_BC_ificmpne1();
			break;
		case 101:
			jtt_bytecode_BC_ificmpne2();
			break;
		case 102:
			jtt_bytecode_BC_ifle();
			break;
		case 103:
			jtt_bytecode_BC_iflt();
			break;
		case 104:
			jtt_bytecode_BC_ifne();
			break;
		case 105:
			jtt_bytecode_BC_ifnonnull();
			break;
		case 106:
			jtt_bytecode_BC_ifnonnull_2();
			break;
		case 107:
			jtt_bytecode_BC_ifnonnull_3();
			break;
		case 108:
			jtt_bytecode_BC_ifnull();
			break;
		case 109:
			jtt_bytecode_BC_ifnull_2();
			break;
		case 110:
			jtt_bytecode_BC_ifnull_3();
			break;
		case 111:
			jtt_bytecode_BC_iinc_1();
			break;
		case 112:
			jtt_bytecode_BC_iinc_2();
			break;
		case 113:
			jtt_bytecode_BC_iinc_3();
			break;
		case 114:
			jtt_bytecode_BC_iinc_4();
			break;
		case 115:
			jtt_bytecode_BC_iload_0();
			break;
		case 116:
			jtt_bytecode_BC_iload_0_1();
			break;
		case 117:
			jtt_bytecode_BC_iload_0_2();
			break;
		case 118:
			jtt_bytecode_BC_iload_1();
			break;
		case 119:
			jtt_bytecode_BC_iload_1_1();
			break;
		case 120:
			jtt_bytecode_BC_iload_2();
			break;
		case 121:
			jtt_bytecode_BC_iload_3();
			break;
		case 122:
			jtt_bytecode_BC_imul();
			break;
		case 123:
			jtt_bytecode_BC_ineg();
			break;
		case 124:
			jtt_bytecode_BC_instanceof();
			break;
		case 125:
			jtt_bytecode_BC_invokeinterface();
			break;
		case 126:
			jtt_bytecode_BC_invokespecial();
			break;
		case 127:
			jtt_bytecode_BC_invokespecial2();
			break;
		case 128:
			jtt_bytecode_BC_invokestatic();
			break;
		case 129:
			jtt_bytecode_BC_invokevirtual();
			break;
		case 130:
			jtt_bytecode_BC_ior();
			break;
		case 131:
			jtt_bytecode_BC_irem();
			break;
		case 132:
			jtt_bytecode_BC_irem2();
			break;
		case 133:
			jtt_bytecode_BC_ireturn();
			break;
		case 134:
			jtt_bytecode_BC_ishl();
			break;
		case 135:
			jtt_bytecode_BC_ishr();
			break;
		case 136:
			jtt_bytecode_BC_isub();
			break;
		case 137:
			jtt_bytecode_BC_iushr();
			break;
		case 138:
			jtt_bytecode_BC_ixor();
			break;
		case 139:
			jtt_bytecode_BC_l2d();
			break;
		case 140:
			jtt_bytecode_BC_l2f();
			break;
		case 141:
			jtt_bytecode_BC_l2i();
			break;
		case 142:
			jtt_bytecode_BC_ladd();
			break;
		case 143:
			jtt_bytecode_BC_ladd2();
			break;
		case 144:
			jtt_bytecode_BC_laload();
			break;
		case 145:
			jtt_bytecode_BC_land();
			break;
		case 146:
			jtt_bytecode_BC_lastore();
			break;
		case 147:
			jtt_bytecode_BC_lcmp();
			break;
		case 148:
			jtt_bytecode_BC_ldc_01();
			break;
		case 149:
			jtt_bytecode_BC_ldc_02();
			break;
		case 150:
			jtt_bytecode_BC_ldc_03();
			break;
		case 151:
			jtt_bytecode_BC_ldc_04();
			break;
		case 152:
			jtt_bytecode_BC_ldc_05();
			break;
		case 153:
			jtt_bytecode_BC_ldc_06();
			break;
		case 154:
			jtt_bytecode_BC_ldiv();
			break;
		case 155:
			jtt_bytecode_BC_ldiv2();
			break;
		case 156:
			jtt_bytecode_BC_lload_0();
			break;
		case 157:
			jtt_bytecode_BC_lload_01();
			break;
		case 158:
			jtt_bytecode_BC_lload_1();
			break;
		case 159:
			jtt_bytecode_BC_lload_2();
			break;
		case 160:
			jtt_bytecode_BC_lload_3();
			break;
		case 161:
			jtt_bytecode_BC_lmul();
			break;
		case 162:
			jtt_bytecode_BC_lneg();
			break;
		case 163:
			jtt_bytecode_BC_lookupswitch01();
			break;
		case 164:
			jtt_bytecode_BC_lookupswitch02();
			break;
		case 165:
			jtt_bytecode_BC_lookupswitch03();
			break;
		case 166:
			jtt_bytecode_BC_lookupswitch04();
			break;
		case 167:
			jtt_bytecode_BC_lor();
			break;
		case 168:
			jtt_bytecode_BC_lrem();
			break;
		case 169:
			jtt_bytecode_BC_lrem2();
			break;
		case 170:
			jtt_bytecode_BC_lreturn();
			break;
		case 171:
			jtt_bytecode_BC_lshl();
			break;
		case 172:
			jtt_bytecode_BC_lshr();
			break;
		case 173:
			jtt_bytecode_BC_lsub();
			break;
		case 174:
			jtt_bytecode_BC_lushr();
			break;
		case 175:
			jtt_bytecode_BC_lxor();
			break;
		case 176:
			jtt_bytecode_BC_monitorenter();
			break;
		case 177:
			jtt_bytecode_BC_monitorenter02();
			break;
		case 178:
			jtt_bytecode_BC_multianewarray01();
			break;
		case 179:
			jtt_bytecode_BC_multianewarray02();
			break;
		case 180:
			jtt_bytecode_BC_multianewarray03();
			break;
		case 181:
			jtt_bytecode_BC_multianewarray04();
			break;
		case 182:
			jtt_bytecode_BC_new();
			break;
		case 183:
			jtt_bytecode_BC_newarray();
			break;
		case 184:
			jtt_bytecode_BC_putfield();
			break;
		case 185:
			jtt_bytecode_BC_putstatic();
			break;
		case 186:
			jtt_bytecode_BC_saload();
			break;
		case 187:
			jtt_bytecode_BC_sastore();
			break;
		case 188:
			jtt_bytecode_BC_tableswitch();
			break;
		case 189:
			jtt_bytecode_BC_tableswitch2();
			break;
		case 190:
			jtt_bytecode_BC_tableswitch3();
			break;
		case 191:
			jtt_bytecode_BC_tableswitch4();
			break;
		case 192:
			jtt_bytecode_BC_wide01();
			break;
		case 193:
			jtt_bytecode_BC_wide02();
			break;
		case 194:
			jtt_optimize_ArrayLength01();
			break;
		case 195:
			jtt_optimize_BC_idiv_16();
			break;
		case 196:
			jtt_optimize_BC_idiv_4();
			break;
		case 197:
			jtt_optimize_BC_imul_16();
			break;
		case 198:
			jtt_optimize_BC_imul_4();
			break;
		case 199:
			jtt_optimize_BC_ldiv_16();
			break;
		case 200:
			jtt_optimize_BC_ldiv_4();
			break;
		case 201:
			jtt_optimize_BC_lmul_16();
			break;
		case 202:
			jtt_optimize_BC_lmul_4();
			break;
		case 203:
			jtt_optimize_BC_lshr_C16();
			break;
		case 204:
			jtt_optimize_BC_lshr_C24();
			break;
		case 205:
			jtt_optimize_BC_lshr_C32();
			break;
		case 206:
			jtt_optimize_BlockSkip01();
			break;
		case 207:
			jtt_optimize_Cmov01();
			break;
		case 208:
			jtt_optimize_DeadCode01();
			break;
		case 209:
			jtt_optimize_Fold_Cast01();
			break;
		case 210:
			jtt_optimize_Fold_Convert01();
			break;
		case 211:
			jtt_optimize_Fold_Convert02();
			break;
		case 212:
			jtt_optimize_Fold_Convert03();
			break;
		case 213:
			jtt_optimize_Fold_Convert04();
			break;
		case 214:
			jtt_optimize_Fold_Double01();
			break;
		case 215:
			jtt_optimize_Fold_Double02();
			break;
		case 216:
			jtt_optimize_Fold_Float01();
			break;
		case 217:
			jtt_optimize_Fold_Float02();
			break;
		case 218:
			jtt_optimize_Fold_InstanceOf01();
			break;
		case 219:
			jtt_optimize_Fold_Int01();
			break;
		case 220:
			jtt_optimize_Fold_Int02();
			break;
		case 221:
			jtt_optimize_Fold_Long01();
			break;
		case 222:
			jtt_optimize_Fold_Long02();
			break;
		case 223:
			jtt_optimize_Fold_Math01();
			break;
		case 224:
			jtt_optimize_Inline01();
			break;
		case 225:
			jtt_optimize_Inline02();
			break;
		case 226:
			jtt_optimize_List_reorder_bug();
			break;
		case 227:
			jtt_optimize_NCE_01();
			break;
		case 228:
			jtt_optimize_NCE_02();
			break;
		case 229:
			jtt_optimize_NCE_03();
			break;
		case 230:
			jtt_optimize_NCE_04();
			break;
		case 231:
			jtt_optimize_NCE_FlowSensitive01();
			break;
		case 232:
			jtt_optimize_NCE_FlowSensitive02();
			break;
		case 233:
			jtt_optimize_NCE_FlowSensitive03();
			break;
		case 234:
			jtt_optimize_NCE_FlowSensitive04();
			break;
		case 235:
			jtt_optimize_Narrow_byte01();
			break;
		case 236:
			jtt_optimize_Narrow_byte02();
			break;
		case 237:
			jtt_optimize_Narrow_byte03();
			break;
		case 238:
			jtt_optimize_Narrow_char01();
			break;
		case 239:
			jtt_optimize_Narrow_char02();
			break;
		case 240:
			jtt_optimize_Narrow_char03();
			break;
		case 241:
			jtt_optimize_Narrow_short01();
			break;
		case 242:
			jtt_optimize_Narrow_short02();
			break;
		case 243:
			jtt_optimize_Narrow_short03();
			break;
		case 244:
			jtt_optimize_Phi01();
			break;
		case 245:
			jtt_optimize_Phi02();
			break;
		case 246:
			jtt_optimize_Phi03();
			break;
		case 247:
			jtt_optimize_Reduce_Convert01();
			break;
		case 248:
			jtt_optimize_Reduce_Double01();
			break;
		case 249:
			jtt_optimize_Reduce_Float01();
			break;
		case 250:
			jtt_optimize_Reduce_Int01();
			break;
		case 251:
			jtt_optimize_Reduce_Int02();
			break;
		case 252:
			jtt_optimize_Reduce_Int03();
			break;
		case 253:
			jtt_optimize_Reduce_Int04();
			break;
		case 254:
			jtt_optimize_Reduce_IntShift01();
			break;
		case 255:
			jtt_optimize_Reduce_IntShift02();
			break;
		case 256:
			jtt_optimize_Reduce_Long01();
			break;
		case 257:
			jtt_optimize_Reduce_Long02();
			break;
		case 258:
			jtt_optimize_Reduce_Long03();
			break;
		case 259:
			jtt_optimize_Reduce_Long04();
			break;
		case 260:
			jtt_optimize_Reduce_LongShift01();
			break;
		case 261:
			jtt_optimize_Reduce_LongShift02();
			break;
		case 262:
			jtt_optimize_Switch01();
			break;
		case 263:
			jtt_optimize_Switch02();
			break;
		case 264:
			jtt_optimize_TypeCastElem();
			break;
		case 265:
			jtt_optimize_VN_Cast01();
			break;
		case 266:
			jtt_optimize_VN_Cast02();
			break;
		case 267:
			jtt_optimize_VN_Convert01();
			break;
		case 268:
			jtt_optimize_VN_Convert02();
			break;
		case 269:
			jtt_optimize_VN_Double01();
			break;
		case 270:
			jtt_optimize_VN_Double02();
			break;
		case 271:
			jtt_optimize_VN_Field01();
			break;
		case 272:
			jtt_optimize_VN_Field02();
			break;
		case 273:
			jtt_optimize_VN_Float01();
			break;
		case 274:
			jtt_optimize_VN_Float02();
			break;
		case 275:
			jtt_optimize_VN_InstanceOf01();
			break;
		case 276:
			jtt_optimize_VN_InstanceOf02();
			break;
		case 277:
			jtt_optimize_VN_InstanceOf03();
			break;
		case 278:
			jtt_optimize_VN_Int01();
			break;
		case 279:
			jtt_optimize_VN_Int02();
			break;
		case 280:
			jtt_optimize_VN_Int03();
			break;
		case 281:
			jtt_optimize_VN_Long01();
			break;
		case 282:
			jtt_optimize_VN_Long02();
			break;
		case 283:
			jtt_optimize_VN_Long03();
			break;
		case 284:
			jtt_optimize_VN_Loop01();
			break;
		case 285:
			jtt_except_BC_aaload0();
			break;
		case 286:
			jtt_except_BC_aaload1();
			break;
		case 287:
			jtt_except_BC_aastore0();
			break;
		case 288:
			jtt_except_BC_aastore1();
			break;
		case 289:
			jtt_except_BC_anewarray();
			break;
		case 290:
			jtt_except_BC_arraylength();
			break;
		case 291:
			jtt_except_BC_athrow0();
			break;
		case 292:
			jtt_except_BC_athrow1();
			break;
		case 293:
			jtt_except_BC_athrow2();
			break;
		case 294:
			jtt_except_BC_athrow3();
			break;
		case 295:
			jtt_except_BC_baload();
			break;
		case 296:
			jtt_except_BC_bastore();
			break;
		case 297:
			jtt_except_BC_caload();
			break;
		case 298:
			jtt_except_BC_castore();
			break;
		case 299:
			jtt_except_BC_checkcast();
			break;
		case 300:
			jtt_except_BC_checkcast1();
			break;
		case 301:
			jtt_except_BC_checkcast2();
			break;
		case 302:
			jtt_except_BC_checkcast3();
			break;
		case 303:
			jtt_except_BC_checkcast4();
			break;
		case 304:
			jtt_except_BC_checkcast5();
			break;
		case 305:
			jtt_except_BC_checkcast6();
			break;
		case 306:
			jtt_except_BC_daload();
			break;
		case 307:
			jtt_except_BC_dastore();
			break;
		case 308:
			jtt_except_BC_faload();
			break;
		case 309:
			jtt_except_BC_fastore();
			break;
		case 310:
			jtt_except_BC_getfield();
			break;
		case 311:
			jtt_except_BC_iaload();
			break;
		case 312:
			jtt_except_BC_iastore();
			break;
		case 313:
			jtt_except_BC_idiv();
			break;
		case 314:
			jtt_except_BC_idiv2();
			break;
		case 315:
			jtt_except_BC_invokespecial01();
			break;
		case 316:
			jtt_except_BC_invokevirtual01();
			break;
		case 317:
			jtt_except_BC_invokevirtual02();
			break;
		case 318:
			jtt_except_BC_irem();
			break;
		case 319:
			jtt_except_BC_laload();
			break;
		case 320:
			jtt_except_BC_lastore();
			break;
		case 321:
			jtt_except_BC_ldiv();
			break;
		case 322:
			jtt_except_BC_ldiv2();
			break;
		case 323:
			jtt_except_BC_lrem();
			break;
		case 324:
			jtt_except_BC_monitorenter();
			break;
		case 325:
			jtt_except_BC_multianewarray();
			break;
		case 326:
			jtt_except_BC_newarray();
			break;
		case 327:
			jtt_except_BC_putfield();
			break;
		case 328:
			jtt_except_BC_saload();
			break;
		case 329:
			jtt_except_BC_sastore();
			break;
		case 330:
			jtt_except_Catch_Loop01();
			break;
		case 331:
			jtt_except_Catch_Loop02();
			break;
		case 332:
			jtt_except_Catch_NASE_1();
			break;
		case 333:
			jtt_except_Catch_NASE_2();
			break;
		case 334:
			jtt_except_Catch_NPE_00();
			break;
		case 335:
			jtt_except_Catch_NPE_01();
			break;
		case 336:
			jtt_except_Catch_NPE_02();
			break;
		case 337:
			jtt_except_Catch_NPE_03();
			break;
		case 338:
			jtt_except_Catch_NPE_04();
			break;
		case 339:
			jtt_except_Catch_NPE_05();
			break;
		case 340:
			jtt_except_Catch_NPE_06();
			break;
		case 341:
			jtt_except_Catch_NPE_07();
			break;
		case 342:
			jtt_except_Catch_NPE_08();
			break;
		case 343:
			jtt_except_Catch_NPE_09();
			break;
		case 344:
			jtt_except_Catch_NPE_10();
			break;
		case 345:
			jtt_except_Catch_NPE_11();
			break;
		case 346:
			jtt_except_Catch_StackOverflowError_01();
			break;
		case 347:
			jtt_except_Catch_StackOverflowError_02();
			break;
		case 348:
			jtt_except_Catch_StackOverflowError_03();
			break;
		case 349:
			jtt_except_Catch_Two01();
			break;
		case 350:
			jtt_except_Catch_Two02();
			break;
		case 351:
			jtt_except_Catch_Two03();
			break;
		case 352:
			jtt_except_Except_Synchronized01();
			break;
		case 353:
			jtt_except_Except_Synchronized02();
			break;
		case 354:
			jtt_except_Except_Synchronized03();
			break;
		case 355:
			jtt_except_Except_Synchronized04();
			break;
		case 356:
			jtt_except_Except_Synchronized05();
			break;
		case 357:
			jtt_except_Finally01();
			break;
		case 358:
			jtt_except_Finally02();
			break;
		case 359:
			jtt_except_StackTrace_AIOOBE_00();
			break;
		case 360:
			jtt_except_StackTrace_CCE_00();
			break;
		case 361:
			jtt_except_StackTrace_NPE_00();
			break;
		case 362:
			jtt_except_StackTrace_NPE_01();
			break;
		case 363:
			jtt_except_StackTrace_NPE_02();
			break;
		case 364:
			jtt_except_StackTrace_NPE_03();
			break;
		case 365:
			jtt_except_Throw_InCatch01();
			break;
		case 366:
			jtt_except_Throw_InCatch02();
			break;
		case 367:
			jtt_except_Throw_InCatch03();
			break;
		case 368:
			jtt_except_Throw_NPE_01();
			break;
		case 369:
			jtt_except_Throw_Synchronized01();
			break;
		case 370:
			jtt_except_Throw_Synchronized02();
			break;
		case 371:
			jtt_except_Throw_Synchronized03();
			break;
		case 372:
			jtt_except_Throw_Synchronized04();
			break;
		case 373:
			jtt_except_Throw_Synchronized05();
			break;
		case 374:
			jtt_lang_Boxed_TYPE_01();
			break;
		case 375:
			jtt_lang_Bridge_method01();
			break;
		case 376:
			jtt_lang_ClassLoader_loadClass01();
			break;
		case 377:
			jtt_lang_Class_Literal01();
			break;
		case 378:
			jtt_lang_Class_asSubclass01();
			break;
		case 379:
			jtt_lang_Class_cast01();
			break;
		case 380:
			jtt_lang_Class_cast02();
			break;
		case 381:
			jtt_lang_Class_forName01();
			break;
		case 382:
			jtt_lang_Class_forName02();
			break;
		case 383:
			jtt_lang_Class_forName03();
			break;
		case 384:
			jtt_lang_Class_forName04();
			break;
		case 385:
			jtt_lang_Class_forName05();
			break;
		case 386:
			jtt_lang_Class_getComponentType01();
			break;
		case 387:
			jtt_lang_Class_getInterfaces01();
			break;
		case 388:
			jtt_lang_Class_getName01();
			break;
		case 389:
			jtt_lang_Class_getName02();
			break;
		case 390:
			jtt_lang_Class_getSimpleName01();
			break;
		case 391:
			jtt_lang_Class_getSimpleName02();
			break;
		case 392:
			jtt_lang_Class_getSuperClass01();
			break;
		case 393:
			jtt_lang_Class_isArray01();
			break;
		case 394:
			jtt_lang_Class_isAssignableFrom01();
			break;
		case 395:
			jtt_lang_Class_isAssignableFrom02();
			break;
		case 396:
			jtt_lang_Class_isAssignableFrom03();
			break;
		case 397:
			jtt_lang_Class_isInstance01();
			break;
		case 398:
			jtt_lang_Class_isInstance02();
			break;
		case 399:
			jtt_lang_Class_isInstance03();
			break;
		case 400:
			jtt_lang_Class_isInstance04();
			break;
		case 401:
			jtt_lang_Class_isInstance05();
			break;
		case 402:
			jtt_lang_Class_isInstance06();
			break;
		case 403:
			jtt_lang_Class_isInterface01();
			break;
		case 404:
			jtt_lang_Class_isPrimitive01();
			break;
		case 405:
			jtt_lang_Double_toString();
			break;
		case 406:
			jtt_lang_Float_01();
			break;
		case 407:
			jtt_lang_Float_02();
			break;
		case 408:
			jtt_lang_Int_greater01();
			break;
		case 409:
			jtt_lang_Int_greater02();
			break;
		case 410:
			jtt_lang_Int_greater03();
			break;
		case 411:
			jtt_lang_Int_greaterEqual01();
			break;
		case 412:
			jtt_lang_Int_greaterEqual02();
			break;
		case 413:
			jtt_lang_Int_greaterEqual03();
			break;
		case 414:
			jtt_lang_Int_less01();
			break;
		case 415:
			jtt_lang_Int_less02();
			break;
		case 416:
			jtt_lang_Int_less03();
			break;
		case 417:
			jtt_lang_Int_lessEqual01();
			break;
		case 418:
			jtt_lang_Int_lessEqual02();
			break;
		case 419:
			jtt_lang_Int_lessEqual03();
			break;
		case 420:
			jtt_lang_JDK_ClassLoaders01();
			break;
		case 421:
			jtt_lang_JDK_ClassLoaders02();
			break;
		case 422:
			jtt_lang_Long_greater01();
			break;
		case 423:
			jtt_lang_Long_greater02();
			break;
		case 424:
			jtt_lang_Long_greater03();
			break;
		case 425:
			jtt_lang_Long_greaterEqual01();
			break;
		case 426:
			jtt_lang_Long_greaterEqual02();
			break;
		case 427:
			jtt_lang_Long_greaterEqual03();
			break;
		case 428:
			jtt_lang_Long_less01();
			break;
		case 429:
			jtt_lang_Long_less02();
			break;
		case 430:
			jtt_lang_Long_less03();
			break;
		case 431:
			jtt_lang_Long_lessEqual01();
			break;
		case 432:
			jtt_lang_Long_lessEqual02();
			break;
		case 433:
			jtt_lang_Long_lessEqual03();
			break;
		case 434:
			jtt_lang_Long_reverseBytes01();
			break;
		case 435:
			jtt_lang_Long_reverseBytes02();
			break;
		case 436:
			jtt_lang_Math_pow();
			break;
		case 437:
			jtt_lang_Object_clone01();
			break;
		case 438:
			jtt_lang_Object_clone02();
			break;
		case 439:
			jtt_lang_Object_equals01();
			break;
		case 440:
			jtt_lang_Object_getClass01();
			break;
		case 441:
			jtt_lang_Object_hashCode01();
			break;
		case 442:
			jtt_lang_Object_notify01();
			break;
		case 443:
			jtt_lang_Object_notify02();
			break;
		case 444:
			jtt_lang_Object_notifyAll01();
			break;
		case 445:
			jtt_lang_Object_notifyAll02();
			break;
		case 446:
			jtt_lang_Object_toString01();
			break;
		case 447:
			jtt_lang_Object_toString02();
			break;
		case 448:
			jtt_lang_Object_wait01();
			break;
		case 449:
			jtt_lang_Object_wait02();
			break;
		case 450:
			jtt_lang_Object_wait03();
			break;
		case 451:
			jtt_lang_ProcessEnvironment_init();
			break;
		case 452:
			jtt_lang_StringCoding_Scale();
			break;
		case 453:
			jtt_lang_String_intern01();
			break;
		case 454:
			jtt_lang_String_intern02();
			break;
		case 455:
			jtt_lang_String_intern03();
			break;
		case 456:
			jtt_lang_String_valueOf01();
			break;
		case 457:
			jtt_lang_System_identityHashCode01();
			break;
		case 458:
			jtt_micro_ArrayCompare01();
			break;
		case 459:
			jtt_micro_ArrayCompare02();
			break;
		case 460:
			jtt_micro_BC_invokevirtual2();
			break;
		case 461:
			jtt_micro_BigByteParams01();
			break;
		case 462:
			jtt_micro_BigDoubleParams02();
			break;
		case 463:
			jtt_micro_BigFloatParams01();
			break;
		case 464:
			jtt_micro_BigFloatParams02();
			break;
		case 465:
			jtt_micro_BigIntParams01();
			break;
		case 466:
			jtt_micro_BigIntParams02();
			break;
		case 467:
			jtt_micro_BigInterfaceParams01();
			break;
		case 468:
			jtt_micro_BigLongParams02();
			break;
		case 469:
			jtt_micro_BigMixedParams01();
			break;
		case 470:
			jtt_micro_BigMixedParams02();
			break;
		case 471:
			jtt_micro_BigMixedParams03();
			break;
		case 472:
			jtt_micro_BigObjectParams01();
			break;
		case 473:
			jtt_micro_BigObjectParams02();
			break;
		case 474:
			jtt_micro_BigParamsAlignment();
			break;
		case 475:
			jtt_micro_BigShortParams01();
			break;
		case 476:
			jtt_micro_BigVirtualParams01();
			break;
		case 477:
			jtt_micro_Bubblesort();
			break;
		case 478:
			jtt_micro_Fibonacci();
			break;
		case 479:
			jtt_micro_InvokeVirtual_01();
			break;
		case 480:
			jtt_micro_InvokeVirtual_02();
			break;
		case 481:
			jtt_micro_Matrix01();
			break;
		case 482:
			jtt_micro_StrangeFrames();
			break;
		case 483:
			jtt_micro_String_format01();
			break;
		case 484:
			jtt_micro_String_format02();
			break;
		case 485:
			jtt_micro_VarArgs_String01();
			break;
		case 486:
			jtt_micro_VarArgs_boolean01();
			break;
		case 487:
			jtt_micro_VarArgs_byte01();
			break;
		case 488:
			jtt_micro_VarArgs_char01();
			break;
		case 489:
			jtt_micro_VarArgs_double01();
			break;
		case 490:
			jtt_micro_VarArgs_float01();
			break;
		case 491:
			jtt_micro_VarArgs_int01();
			break;
		case 492:
			jtt_micro_VarArgs_long01();
			break;
		case 493:
			jtt_micro_VarArgs_short01();
			break;
		case 494:
			jtt_reflect_Array_get01();
			break;
		case 495:
			jtt_reflect_Array_get02();
			break;
		case 496:
			jtt_reflect_Array_get03();
			break;
		case 497:
			jtt_reflect_Array_getBoolean01();
			break;
		case 498:
			jtt_reflect_Array_getByte01();
			break;
		case 499:
			jtt_reflect_Array_getChar01();
			break;
		case 500:
			jtt_reflect_Array_getDouble01();
			break;
		case 501:
			jtt_reflect_Array_getFloat01();
			break;
		case 502:
			jtt_reflect_Array_getInt01();
			break;
		case 503:
			jtt_reflect_Array_getLength01();
			break;
		case 504:
			jtt_reflect_Array_getLong01();
			break;
		case 505:
			jtt_reflect_Array_getShort01();
			break;
		case 506:
			jtt_reflect_Array_newInstance01();
			break;
		case 507:
			jtt_reflect_Array_newInstance02();
			break;
		case 508:
			jtt_reflect_Array_newInstance03();
			break;
		case 509:
			jtt_reflect_Array_newInstance04();
			break;
		case 510:
			jtt_reflect_Array_newInstance05();
			break;
		case 511:
			jtt_reflect_Array_newInstance06();
			break;
		case 512:
			jtt_reflect_Array_set01();
			break;
		case 513:
			jtt_reflect_Array_set02();
			break;
		case 514:
			jtt_reflect_Array_set03();
			break;
		case 515:
			jtt_reflect_Array_setBoolean01();
			break;
		case 516:
			jtt_reflect_Array_setByte01();
			break;
		case 517:
			jtt_reflect_Array_setChar01();
			break;
		case 518:
			jtt_reflect_Array_setDouble01();
			break;
		case 519:
			jtt_reflect_Array_setFloat01();
			break;
		case 520:
			jtt_reflect_Array_setInt01();
			break;
		case 521:
			jtt_reflect_Array_setLong01();
			break;
		case 522:
			jtt_reflect_Array_setShort01();
			break;
		case 523:
			jtt_reflect_Class_getDeclaredField01();
			break;
		case 524:
			jtt_reflect_Class_getDeclaredMethod01();
			break;
		case 525:
			jtt_reflect_Class_getField01();
			break;
		case 526:
			jtt_reflect_Class_getField02();
			break;
		case 527:
			jtt_reflect_Class_getMethod01();
			break;
		case 528:
			jtt_reflect_Class_getMethod02();
			break;
		case 529:
			jtt_reflect_Class_newInstance01();
			break;
		case 530:
			jtt_reflect_Class_newInstance02();
			break;
		case 531:
			jtt_reflect_Class_newInstance03();
			break;
		case 532:
			jtt_reflect_Class_newInstance06();
			break;
		case 533:
			jtt_reflect_Class_newInstance07();
			break;
		case 534:
			jtt_reflect_Field_get01();
			break;
		case 535:
			jtt_reflect_Field_get02();
			break;
		case 536:
			jtt_reflect_Field_get03();
			break;
		case 537:
			jtt_reflect_Field_get04();
			break;
		case 538:
			jtt_reflect_Field_getType01();
			break;
		case 539:
			jtt_reflect_Field_set01();
			break;
		case 540:
			jtt_reflect_Field_set02();
			break;
		case 541:
			jtt_reflect_Field_set03();
			break;
		case 542:
			jtt_reflect_Invoke_except01();
			break;
		case 543:
			jtt_reflect_Invoke_main01();
			break;
		case 544:
			jtt_reflect_Invoke_main02();
			break;
		case 545:
			jtt_reflect_Invoke_main03();
			break;
		case 546:
			jtt_reflect_Invoke_virtual01();
			break;
		case 547:
			jtt_reflect_Method_getParameterTypes01();
			break;
		case 548:
			jtt_reflect_Method_getReturnType01();
			break;
		case 549:
			jtt_reflect_Reflection_getCallerClass01();
			break;
		case 550:
			jtt_threads_Monitor_contended01();
			break;
		case 551:
			jtt_threads_Monitor_notowner01();
			break;
		case 552:
			jtt_threads_Monitorenter01();
			break;
		case 553:
			jtt_threads_Monitorenter02();
			break;
		case 554:
			jtt_threads_Object_wait01();
			break;
		case 555:
			jtt_threads_Object_wait02();
			break;
		case 556:
			jtt_threads_Object_wait03();
			break;
		case 557:
			jtt_threads_Object_wait04();
			break;
		case 558:
			jtt_threads_ThreadLocal01();
			break;
		case 559:
			jtt_threads_ThreadLocal02();
			break;
		case 560:
			jtt_threads_ThreadLocal03();
			break;
		case 561:
			jtt_threads_Thread_currentThread01();
			break;
		case 562:
			jtt_threads_Thread_getState01();
			break;
		case 563:
			jtt_threads_Thread_getState02();
			break;
		case 564:
			jtt_threads_Thread_holdsLock01();
			break;
		case 565:
			jtt_threads_Thread_isAlive01();
			break;
		case 566:
			jtt_threads_Thread_isInterrupted01();
			break;
		case 567:
			jtt_threads_Thread_isInterrupted02();
			break;
		case 568:
			jtt_threads_Thread_isInterrupted03();
			break;
		case 569:
			jtt_threads_Thread_isInterrupted04();
			break;
		case 570:
			jtt_threads_Thread_isInterrupted05();
			break;
		case 571:
			jtt_threads_Thread_join01();
			break;
		case 572:
			jtt_threads_Thread_join02();
			break;
		case 573:
			jtt_threads_Thread_join03();
			break;
		case 574:
			jtt_threads_Thread_new01();
			break;
		case 575:
			jtt_threads_Thread_new02();
			break;
		case 576:
			jtt_threads_Thread_setPriority01();
			break;
		case 577:
			jtt_threads_Thread_sleep01();
			break;
		case 578:
			jtt_threads_Thread_start01();
			break;
		case 579:
			jtt_threads_Thread_yield01();
			break;
		case 580:
			jtt_jdk_Class_getName();
			break;
		case 581:
			jtt_jdk_EnumMap01();
			break;
		case 582:
			jtt_jdk_EnumMap02();
			break;
		case 583:
			jtt_jdk_System_currentTimeMillis01();
			break;
		case 584:
			jtt_jdk_System_currentTimeMillis02();
			break;
		case 585:
			jtt_jdk_System_nanoTime01();
			break;
		case 586:
			jtt_jdk_System_nanoTime02();
			break;
		case 587:
			jtt_jdk_UnsafeAccess01();
			break;
		}
		return true;
	}

	static void jtt_bytecode_BC_aaload() {
		begin("jtt.bytecode.BC_aaload");
		String runString = null;
		try {
			// (0) == null
			runString = "(0)";
			if (null != jtt.bytecode.BC_aaload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == null
			runString = "(1)";
			if (null != jtt.bytecode.BC_aaload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == ""
			runString = "(2)";
			if (!"".equals(jtt.bytecode.BC_aaload.test(2))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aaload_1() {
		begin("jtt.bytecode.BC_aaload_1");
		String runString = null;
		try {
			// (0) == null
			runString = "(0)";
			if (null != jtt.bytecode.BC_aaload_1.test(0)) {
				fail(runString);
				return;
			}
			// (1) == null
			runString = "(1)";
			if (null != jtt.bytecode.BC_aaload_1.test(1)) {
				fail(runString);
				return;
			}
			// (2) == ""
			runString = "(2)";
			if (!"".equals(jtt.bytecode.BC_aaload_1.test(2))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aastore() {
		begin("jtt.bytecode.BC_aastore");
		String runString = null;
		try {
			// (true,0) == 0
			runString = "(true,0)";
			if (0 != jtt.bytecode.BC_aastore.test(true, 0)) {
				fail(runString);
				return;
			}
			// (true,1) == 1
			runString = "(true,1)";
			if (1 != jtt.bytecode.BC_aastore.test(true, 1)) {
				fail(runString);
				return;
			}
			// (true,2) == 2
			runString = "(true,2)";
			if (2 != jtt.bytecode.BC_aastore.test(true, 2)) {
				fail(runString);
				return;
			}
			// (false,1) == 1
			runString = "(false,1)";
			if (1 != jtt.bytecode.BC_aastore.test(false, 1)) {
				fail(runString);
				return;
			}
			// (false,2) == 2
			runString = "(false,2)";
			if (2 != jtt.bytecode.BC_aastore.test(false, 2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aload_0() {
		begin("jtt.bytecode.BC_aload_0");
		String runString = null;
		try {
			// (null) == null
			runString = "(null)";
			if (null != jtt.bytecode.BC_aload_0.test(null)) {
				fail(runString);
				return;
			}
			// ("x") == "x"
			runString = "(\"x\")";
			if (!"x".equals(jtt.bytecode.BC_aload_0.test("x"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aload_1() {
		begin("jtt.bytecode.BC_aload_1");
		String runString = null;
		try {
			// (1,null) == null
			runString = "(1,null)";
			if (null != jtt.bytecode.BC_aload_1.test(1, null)) {
				fail(runString);
				return;
			}
			// (1,"x") == "x"
			runString = "(1,\"x\")";
			if (!"x".equals(jtt.bytecode.BC_aload_1.test(1, "x"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aload_2() {
		begin("jtt.bytecode.BC_aload_2");
		String runString = null;
		try {
			// (1,1,null) == null
			runString = "(1,1,null)";
			if (null != jtt.bytecode.BC_aload_2.test(1, 1, null)) {
				fail(runString);
				return;
			}
			// (1,1,"x") == "x"
			runString = "(1,1,\"x\")";
			if (!"x".equals(jtt.bytecode.BC_aload_2.test(1, 1, "x"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_aload_3() {
		begin("jtt.bytecode.BC_aload_3");
		String runString = null;
		try {
			// (1,1,1,"x") == "x"
			runString = "(1,1,1,\"x\")";
			if (!"x".equals(jtt.bytecode.BC_aload_3.test(1, 1, 1, "x"))) {
				fail(runString);
				return;
			}
			// (1,1,1,null) == null
			runString = "(1,1,1,null)";
			if (null != jtt.bytecode.BC_aload_3.test(1, 1, 1, null)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_anewarray() {
		begin("jtt.bytecode.BC_anewarray");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_anewarray.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_anewarray.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_areturn() {
		begin("jtt.bytecode.BC_areturn");
		String runString = null;
		try {
			// (null) == null
			runString = "(null)";
			if (null != jtt.bytecode.BC_areturn.test(null)) {
				fail(runString);
				return;
			}
			// ("") == ""
			runString = "(\"\")";
			if (!"".equals(jtt.bytecode.BC_areturn.test(""))) {
				fail(runString);
				return;
			}
			// ("this") == "this"
			runString = "(\"this\")";
			if (!"this".equals(jtt.bytecode.BC_areturn.test("this"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_arraylength() {
		begin("jtt.bytecode.BC_arraylength");
		String runString = null;
		try {
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.bytecode.BC_arraylength.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if (4 != jtt.bytecode.BC_arraylength.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 5
			runString = "(3)";
			if (5 != jtt.bytecode.BC_arraylength.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 5
			runString = "(4)";
			if (5 != jtt.bytecode.BC_arraylength.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 42
			runString = "(5)";
			if (42 != jtt.bytecode.BC_arraylength.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_athrow() {
		begin("jtt.bytecode.BC_athrow");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_athrow.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_athrow.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.Throwable
			try {
				runString = "(2)";
				jtt.bytecode.BC_athrow.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Throwable.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_athrow.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_baload() {
		begin("jtt.bytecode.BC_baload");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.bytecode.BC_baload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.bytecode.BC_baload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.bytecode.BC_baload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.bytecode.BC_baload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_bastore() {
		begin("jtt.bytecode.BC_bastore");
		String runString = null;
		try {
			// (0,true) == true
			runString = "(0,true)";
			if (true != jtt.bytecode.BC_bastore.test(0, true)) {
				fail(runString);
				return;
			}
			// (1,false) == false
			runString = "(1,false)";
			if (false != jtt.bytecode.BC_bastore.test(1, false)) {
				fail(runString);
				return;
			}
			// (2,true) == true
			runString = "(2,true)";
			if (true != jtt.bytecode.BC_bastore.test(2, true)) {
				fail(runString);
				return;
			}
			// (3,false) == false
			runString = "(3,false)";
			if (false != jtt.bytecode.BC_bastore.test(3, false)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_caload() {
		begin("jtt.bytecode.BC_caload");
		String runString = null;
		try {
			// (0) == '\0'
			runString = "(0)";
			if ((char) 0 != jtt.bytecode.BC_caload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 'a'
			runString = "(1)";
			if ((char) 97 != jtt.bytecode.BC_caload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == ' '
			runString = "(2)";
			if ((char) 32 != jtt.bytecode.BC_caload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == '\23420'
			runString = "(3)";
			if ((char) 10000 != jtt.bytecode.BC_caload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_castore() {
		begin("jtt.bytecode.BC_castore");
		String runString = null;
		try {
			// (0,'a') == 'a'
			runString = "(0,'a')";
			if ((char) 97 != jtt.bytecode.BC_castore.test(0, (char) 97)) {
				fail(runString);
				return;
			}
			// (1,'A') == 'A'
			runString = "(1,'A')";
			if ((char) 65 != jtt.bytecode.BC_castore.test(1, (char) 65)) {
				fail(runString);
				return;
			}
			// (2,'*') == '*'
			runString = "(2,'*')";
			if ((char) 42 != jtt.bytecode.BC_castore.test(2, (char) 42)) {
				fail(runString);
				return;
			}
			// (3,'x') == 'x'
			runString = "(3,'x')";
			if ((char) 120 != jtt.bytecode.BC_castore.test(3, (char) 120)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_checkcast01() {
		begin("jtt.bytecode.BC_checkcast01");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.bytecode.BC_checkcast01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.bytecode.BC_checkcast01.test(1)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.bytecode.BC_checkcast01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_checkcast02() {
		begin("jtt.bytecode.BC_checkcast02");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.bytecode.BC_checkcast02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.bytecode.BC_checkcast02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -1
			runString = "(2)";
			if (-1 != jtt.bytecode.BC_checkcast02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -1
			runString = "(3)";
			if (-1 != jtt.bytecode.BC_checkcast02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_d2f() {
		begin("jtt.bytecode.BC_d2f");
		String runString = null;
		try {
			// (0.0) == 0.0
			runString = "(0.0)";
			if (0.0f != jtt.bytecode.BC_d2f.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 1.0
			runString = "(1.0)";
			if (1.0f != jtt.bytecode.BC_d2f.test(1.0)) {
				fail(runString);
				return;
			}
			// (-1.06) == -1.06
			runString = "(-1.06)";
			if (-1.06f != jtt.bytecode.BC_d2f.test(-1.06)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_d2i01() {
		begin("jtt.bytecode.BC_d2i01");
		String runString = null;
		try {
			// (0.0) == 0
			runString = "(0.0)";
			if (0 != jtt.bytecode.BC_d2i01.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 1
			runString = "(1.0)";
			if (1 != jtt.bytecode.BC_d2i01.test(1.0)) {
				fail(runString);
				return;
			}
			// (-1.06) == -1
			runString = "(-1.06)";
			if (-1 != jtt.bytecode.BC_d2i01.test(-1.06)) {
				fail(runString);
				return;
			}
			// (-156.82743) == -156
			runString = "(-156.82743)";
			if (-156 != jtt.bytecode.BC_d2i01.test(-156.82743)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_d2i02() {
		begin("jtt.bytecode.BC_d2i02");
		String runString = null;
		try {
			// (0) == -2147483648
			runString = "(0)";
			if (-2147483648 != jtt.bytecode.BC_d2i02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_d2l01() {
		begin("jtt.bytecode.BC_d2l01");
		String runString = null;
		try {
			// (0.0) == 0
			runString = "(0.0)";
			if (0L != jtt.bytecode.BC_d2l01.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 1
			runString = "(1.0)";
			if (1L != jtt.bytecode.BC_d2l01.test(1.0)) {
				fail(runString);
				return;
			}
			// (-1.06) == -1
			runString = "(-1.06)";
			if (-1L != jtt.bytecode.BC_d2l01.test(-1.06)) {
				fail(runString);
				return;
			}
			// (-156.82743) == -156
			runString = "(-156.82743)";
			if (-156L != jtt.bytecode.BC_d2l01.test(-156.82743)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_d2l02() {
		begin("jtt.bytecode.BC_d2l02");
		String runString = null;
		try {
			// (0) == -9223372036854775808
			runString = "(0)";
			if (-9223372036854775808L != jtt.bytecode.BC_d2l02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dadd() {
		begin("jtt.bytecode.BC_dadd");
		String runString = null;
		try {
			// (0.0,0.0) == 0.0
			runString = "(0.0,0.0)";
			if (0.0 != jtt.bytecode.BC_dadd.test(0.0, 0.0)) {
				fail(runString);
				return;
			}
			// (1.0,1.0) == 2.0
			runString = "(1.0,1.0)";
			if (2.0 != jtt.bytecode.BC_dadd.test(1.0, 1.0)) {
				fail(runString);
				return;
			}
			// (253.11,54.43) == 307.54
			runString = "(253.11,54.43)";
			if (307.54 != jtt.bytecode.BC_dadd.test(253.11, 54.43)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_daload() {
		begin("jtt.bytecode.BC_daload");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0 != jtt.bytecode.BC_daload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1.1
			runString = "(1)";
			if (-1.1 != jtt.bytecode.BC_daload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4.32
			runString = "(2)";
			if (4.32 != jtt.bytecode.BC_daload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 6.06
			runString = "(3)";
			if (6.06 != jtt.bytecode.BC_daload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dastore() {
		begin("jtt.bytecode.BC_dastore");
		String runString = null;
		try {
			// (0,0.01) == 0.01
			runString = "(0,0.01)";
			if (0.01 != jtt.bytecode.BC_dastore.test(0, 0.01)) {
				fail(runString);
				return;
			}
			// (1,-1.4) == -1.4
			runString = "(1,-1.4)";
			if (-1.4 != jtt.bytecode.BC_dastore.test(1, -1.4)) {
				fail(runString);
				return;
			}
			// (2,0.01) == 0.01
			runString = "(2,0.01)";
			if (0.01 != jtt.bytecode.BC_dastore.test(2, 0.01)) {
				fail(runString);
				return;
			}
			// (3,-1.4) == -1.4
			runString = "(3,-1.4)";
			if (-1.4 != jtt.bytecode.BC_dastore.test(3, -1.4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp01() {
		begin("jtt.bytecode.BC_dcmp01");
		String runString = null;
		try {
			// (0.0,-0.1) == false
			runString = "(0.0,-0.1)";
			if (false != jtt.bytecode.BC_dcmp01.test(0.0, -0.1)) {
				fail(runString);
				return;
			}
			// (78.0,78.001) == true
			runString = "(78.0,78.001)";
			if (true != jtt.bytecode.BC_dcmp01.test(78.0, 78.001)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp02() {
		begin("jtt.bytecode.BC_dcmp02");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_dcmp02.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_dcmp02.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp02.test(0.0)) {
				fail(runString);
				return;
			}
			// (-0.0) == false
			runString = "(-0.0)";
			if (false != jtt.bytecode.BC_dcmp02.test(-0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp03() {
		begin("jtt.bytecode.BC_dcmp03");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_dcmp03.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_dcmp03.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp03.test(0.0)) {
				fail(runString);
				return;
			}
			// (-0.0) == false
			runString = "(-0.0)";
			if (false != jtt.bytecode.BC_dcmp03.test(-0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp04() {
		begin("jtt.bytecode.BC_dcmp04");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_dcmp04.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_dcmp04.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp04.test(0.0)) {
				fail(runString);
				return;
			}
			// (-0.0) == false
			runString = "(-0.0)";
			if (false != jtt.bytecode.BC_dcmp04.test(-0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp05() {
		begin("jtt.bytecode.BC_dcmp05");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_dcmp05.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_dcmp05.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp05.test(0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp06() {
		begin("jtt.bytecode.BC_dcmp06");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_dcmp06.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_dcmp06.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp06.test(0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp07() {
		begin("jtt.bytecode.BC_dcmp07");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_dcmp07.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_dcmp07.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp07.test(0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp08() {
		begin("jtt.bytecode.BC_dcmp08");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_dcmp08.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_dcmp08.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp08.test(0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp09() {
		begin("jtt.bytecode.BC_dcmp09");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_dcmp09.test(-1.0)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_dcmp09.test(1.0)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_dcmp09.test(0.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dcmp10() {
		begin("jtt.bytecode.BC_dcmp10");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.bytecode.BC_dcmp10.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.bytecode.BC_dcmp10.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.bytecode.BC_dcmp10.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.bytecode.BC_dcmp10.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.bytecode.BC_dcmp10.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.bytecode.BC_dcmp10.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.bytecode.BC_dcmp10.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.bytecode.BC_dcmp10.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.bytecode.BC_dcmp10.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ddiv() {
		begin("jtt.bytecode.BC_ddiv");
		String runString = null;
		try {
			// (311.0,10.0) == 31.1
			runString = "(311.0,10.0)";
			if (31.1 != jtt.bytecode.BC_ddiv.test(311.0, 10.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dmul() {
		begin("jtt.bytecode.BC_dmul");
		String runString = null;
		try {
			// (311.0,10.0) == 3110.0
			runString = "(311.0,10.0)";
			if (3110.0 != jtt.bytecode.BC_dmul.test(311.0, 10.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dneg() {
		begin("jtt.bytecode.BC_dneg");
		String runString = null;
		try {
			// (0.0) == -0.0
			runString = "(0.0)";
			if (-0.0 != jtt.bytecode.BC_dneg.test(0.0)) {
				fail(runString);
				return;
			}
			// (-1.01) == 1.01
			runString = "(-1.01)";
			if (1.01 != jtt.bytecode.BC_dneg.test(-1.01)) {
				fail(runString);
				return;
			}
			// (7263.8734) == -7263.8734
			runString = "(7263.8734)";
			if (-7263.8734 != jtt.bytecode.BC_dneg.test(7263.8734)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_drem() {
		begin("jtt.bytecode.BC_drem");
		String runString = null;
		try {
			// (311.0,10.0) == 1.0
			runString = "(311.0,10.0)";
			if (1.0 != jtt.bytecode.BC_drem.test(311.0, 10.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dreturn() {
		begin("jtt.bytecode.BC_dreturn");
		String runString = null;
		try {
			// (0.0) == 0.0
			runString = "(0.0)";
			if (0.0 != jtt.bytecode.BC_dreturn.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.1) == 1.1
			runString = "(1.1)";
			if (1.1 != jtt.bytecode.BC_dreturn.test(1.1)) {
				fail(runString);
				return;
			}
			// (-1.4) == -1.4
			runString = "(-1.4)";
			if (-1.4 != jtt.bytecode.BC_dreturn.test(-1.4)) {
				fail(runString);
				return;
			}
			// (256.33) == 256.33
			runString = "(256.33)";
			if (256.33 != jtt.bytecode.BC_dreturn.test(256.33)) {
				fail(runString);
				return;
			}
			// (1000.001) == 1000.001
			runString = "(1000.001)";
			if (1000.001 != jtt.bytecode.BC_dreturn.test(1000.001)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_dsub() {
		begin("jtt.bytecode.BC_dsub");
		String runString = null;
		try {
			// (0.0,0.0) == 0.0
			runString = "(0.0,0.0)";
			if (0.0 != jtt.bytecode.BC_dsub.test(0.0, 0.0)) {
				fail(runString);
				return;
			}
			// (1.0,1.0) == 0.0
			runString = "(1.0,1.0)";
			if (0.0 != jtt.bytecode.BC_dsub.test(1.0, 1.0)) {
				fail(runString);
				return;
			}
			// (253.11,54.43) == 198.68
			runString = "(253.11,54.43)";
			if (198.68 != jtt.bytecode.BC_dsub.test(253.11, 54.43)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_f2d() {
		begin("jtt.bytecode.BC_f2d");
		String runString = null;
		try {
			// (0.0) == 0.0
			runString = "(0.0)";
			if (0.0 != jtt.bytecode.BC_f2d.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 1.0
			runString = "(1.0)";
			if (1.0 != jtt.bytecode.BC_f2d.test(1.0f)) {
				fail(runString);
				return;
			}
			// (-2.0) == -2.0
			runString = "(-2.0)";
			if (-2.0 != jtt.bytecode.BC_f2d.test(-2.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_f2i01() {
		begin("jtt.bytecode.BC_f2i01");
		String runString = null;
		try {
			// (0.0) == 0
			runString = "(0.0)";
			if (0 != jtt.bytecode.BC_f2i01.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 1
			runString = "(1.0)";
			if (1 != jtt.bytecode.BC_f2i01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (-1.06) == -1
			runString = "(-1.06)";
			if (-1 != jtt.bytecode.BC_f2i01.test(-1.06f)) {
				fail(runString);
				return;
			}
			// (-156.82742) == -156
			runString = "(-156.82742)";
			if (-156 != jtt.bytecode.BC_f2i01.test(-156.82742f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_f2i02() {
		begin("jtt.bytecode.BC_f2i02");
		String runString = null;
		try {
			// (0) == -2147483648
			runString = "(0)";
			if (-2147483648 != jtt.bytecode.BC_f2i02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_f2l01() {
		begin("jtt.bytecode.BC_f2l01");
		String runString = null;
		try {
			// (0.0) == 0
			runString = "(0.0)";
			if (0L != jtt.bytecode.BC_f2l01.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 1
			runString = "(1.0)";
			if (1L != jtt.bytecode.BC_f2l01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (-1.06) == -1
			runString = "(-1.06)";
			if (-1L != jtt.bytecode.BC_f2l01.test(-1.06f)) {
				fail(runString);
				return;
			}
			// (-156.82742) == -156
			runString = "(-156.82742)";
			if (-156L != jtt.bytecode.BC_f2l01.test(-156.82742f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_f2l02() {
		begin("jtt.bytecode.BC_f2l02");
		String runString = null;
		try {
			// (0) == -9223372036854775808
			runString = "(0)";
			if (-9223372036854775808L != jtt.bytecode.BC_f2l02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fadd() {
		begin("jtt.bytecode.BC_fadd");
		String runString = null;
		try {
			// (0.0,0.0) == 0.0
			runString = "(0.0,0.0)";
			if (0.0f != jtt.bytecode.BC_fadd.test(0.0f, 0.0f)) {
				fail(runString);
				return;
			}
			// (1.0,1.0) == 2.0
			runString = "(1.0,1.0)";
			if (2.0f != jtt.bytecode.BC_fadd.test(1.0f, 1.0f)) {
				fail(runString);
				return;
			}
			// (253.11,54.43) == 307.54
			runString = "(253.11,54.43)";
			if (307.54f != jtt.bytecode.BC_fadd.test(253.11f, 54.43f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_faload() {
		begin("jtt.bytecode.BC_faload");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0f != jtt.bytecode.BC_faload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1.1
			runString = "(1)";
			if (-1.1f != jtt.bytecode.BC_faload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4.32
			runString = "(2)";
			if (4.32f != jtt.bytecode.BC_faload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 6.06
			runString = "(3)";
			if (6.06f != jtt.bytecode.BC_faload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fastore() {
		begin("jtt.bytecode.BC_fastore");
		String runString = null;
		try {
			// (0,0.01) == 0.01
			runString = "(0,0.01)";
			if (0.01f != jtt.bytecode.BC_fastore.test(0, 0.01f)) {
				fail(runString);
				return;
			}
			// (1,-1.4) == -1.4
			runString = "(1,-1.4)";
			if (-1.4f != jtt.bytecode.BC_fastore.test(1, -1.4f)) {
				fail(runString);
				return;
			}
			// (2,0.01) == 0.01
			runString = "(2,0.01)";
			if (0.01f != jtt.bytecode.BC_fastore.test(2, 0.01f)) {
				fail(runString);
				return;
			}
			// (3,-1.4) == -1.4
			runString = "(3,-1.4)";
			if (-1.4f != jtt.bytecode.BC_fastore.test(3, -1.4f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp01() {
		begin("jtt.bytecode.BC_fcmp01");
		String runString = null;
		try {
			// (0.0,-0.1) == false
			runString = "(0.0,-0.1)";
			if (false != jtt.bytecode.BC_fcmp01.test(0.0f, -0.1f)) {
				fail(runString);
				return;
			}
			// (78.0,78.001) == true
			runString = "(78.0,78.001)";
			if (true != jtt.bytecode.BC_fcmp01.test(78.0f, 78.001f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp02() {
		begin("jtt.bytecode.BC_fcmp02");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_fcmp02.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_fcmp02.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp02.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp03() {
		begin("jtt.bytecode.BC_fcmp03");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_fcmp03.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_fcmp03.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp03.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp04() {
		begin("jtt.bytecode.BC_fcmp04");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_fcmp04.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_fcmp04.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp04.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp05() {
		begin("jtt.bytecode.BC_fcmp05");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_fcmp05.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_fcmp05.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp05.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp06() {
		begin("jtt.bytecode.BC_fcmp06");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_fcmp06.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_fcmp06.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp06.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp07() {
		begin("jtt.bytecode.BC_fcmp07");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_fcmp07.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_fcmp07.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp07.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp08() {
		begin("jtt.bytecode.BC_fcmp08");
		String runString = null;
		try {
			// (-1.0) == true
			runString = "(-1.0)";
			if (true != jtt.bytecode.BC_fcmp08.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == true
			runString = "(1.0)";
			if (true != jtt.bytecode.BC_fcmp08.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp08.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp09() {
		begin("jtt.bytecode.BC_fcmp09");
		String runString = null;
		try {
			// (-1.0) == false
			runString = "(-1.0)";
			if (false != jtt.bytecode.BC_fcmp09.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.bytecode.BC_fcmp09.test(1.0f)) {
				fail(runString);
				return;
			}
			// (0.0) == false
			runString = "(0.0)";
			if (false != jtt.bytecode.BC_fcmp09.test(0.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fcmp10() {
		begin("jtt.bytecode.BC_fcmp10");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.bytecode.BC_fcmp10.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.bytecode.BC_fcmp10.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.bytecode.BC_fcmp10.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.bytecode.BC_fcmp10.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.bytecode.BC_fcmp10.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.bytecode.BC_fcmp10.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.bytecode.BC_fcmp10.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.bytecode.BC_fcmp10.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.bytecode.BC_fcmp10.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fdiv() {
		begin("jtt.bytecode.BC_fdiv");
		String runString = null;
		try {
			// (311.0,10.0) == 31.1
			runString = "(311.0,10.0)";
			if (31.1f != jtt.bytecode.BC_fdiv.test(311.0f, 10.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fload() {
		begin("jtt.bytecode.BC_fload");
		String runString = null;
		try {
			// (-1.0) == -1.0
			runString = "(-1.0)";
			if (-1.0f != jtt.bytecode.BC_fload.test(-1.0f)) {
				fail(runString);
				return;
			}
			// (-1.01) == -1.01
			runString = "(-1.01)";
			if (-1.01f != jtt.bytecode.BC_fload.test(-1.01f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fload_2() {
		begin("jtt.bytecode.BC_fload_2");
		String runString = null;
		try {
			// (0.0,-1.0) == -1.0
			runString = "(0.0,-1.0)";
			if (-1.0f != jtt.bytecode.BC_fload_2.test(0.0f, -1.0f)) {
				fail(runString);
				return;
			}
			// (0.0,-1.01) == -1.01
			runString = "(0.0,-1.01)";
			if (-1.01f != jtt.bytecode.BC_fload_2.test(0.0f, -1.01f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fmul() {
		begin("jtt.bytecode.BC_fmul");
		String runString = null;
		try {
			// (311.0,10.0) == 3110.0
			runString = "(311.0,10.0)";
			if (3110.0f != jtt.bytecode.BC_fmul.test(311.0f, 10.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fneg() {
		begin("jtt.bytecode.BC_fneg");
		String runString = null;
		try {
			// (0.0) == -0.0
			runString = "(0.0)";
			if (-0.0f != jtt.bytecode.BC_fneg.test(0.0f)) {
				fail(runString);
				return;
			}
			// (-1.01) == 1.01
			runString = "(-1.01)";
			if (1.01f != jtt.bytecode.BC_fneg.test(-1.01f)) {
				fail(runString);
				return;
			}
			// (7263.8735) == -7263.8735
			runString = "(7263.8735)";
			if (-7263.8735f != jtt.bytecode.BC_fneg.test(7263.8735f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_frem() {
		begin("jtt.bytecode.BC_frem");
		String runString = null;
		try {
			// (311.0,10.0) == 1.0
			runString = "(311.0,10.0)";
			if (1.0f != jtt.bytecode.BC_frem.test(311.0f, 10.0f)) {
				fail(runString);
				return;
			}
			// (12.5,6.0) == 0.5
			runString = "(12.5,6.0)";
			if (0.5f != jtt.bytecode.BC_frem.test(12.5f, 6.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_freturn() {
		begin("jtt.bytecode.BC_freturn");
		String runString = null;
		try {
			// (0.0) == 0.0
			runString = "(0.0)";
			if (0.0f != jtt.bytecode.BC_freturn.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.1) == 1.1
			runString = "(1.1)";
			if (1.1f != jtt.bytecode.BC_freturn.test(1.1f)) {
				fail(runString);
				return;
			}
			// (-1.4) == -1.4
			runString = "(-1.4)";
			if (-1.4f != jtt.bytecode.BC_freturn.test(-1.4f)) {
				fail(runString);
				return;
			}
			// (256.33) == 256.33
			runString = "(256.33)";
			if (256.33f != jtt.bytecode.BC_freturn.test(256.33f)) {
				fail(runString);
				return;
			}
			// (1000.001) == 1000.001
			runString = "(1000.001)";
			if (1000.001f != jtt.bytecode.BC_freturn.test(1000.001f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_fsub() {
		begin("jtt.bytecode.BC_fsub");
		String runString = null;
		try {
			// (0.0,0.0) == 0.0
			runString = "(0.0,0.0)";
			if (0.0f != jtt.bytecode.BC_fsub.test(0.0f, 0.0f)) {
				fail(runString);
				return;
			}
			// (1.0,1.0) == 0.0
			runString = "(1.0,1.0)";
			if (0.0f != jtt.bytecode.BC_fsub.test(1.0f, 1.0f)) {
				fail(runString);
				return;
			}
			// (253.11,54.43) == 198.68
			runString = "(253.11,54.43)";
			if (198.68f != jtt.bytecode.BC_fsub.test(253.11f, 54.43f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getfield() {
		begin("jtt.bytecode.BC_getfield");
		String runString = null;
		try {
			// (0) == 13
			runString = "(0)";
			if (13 != jtt.bytecode.BC_getfield.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_b() {
		begin("jtt.bytecode.BC_getstatic_b");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if ((byte) 11 != jtt.bytecode.BC_getstatic_b.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if ((byte) 11 != jtt.bytecode.BC_getstatic_b.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 11
			runString = "(2)";
			if ((byte) 11 != jtt.bytecode.BC_getstatic_b.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_c() {
		begin("jtt.bytecode.BC_getstatic_c");
		String runString = null;
		try {
			// (0) == '\13'
			runString = "(0)";
			if ((char) 11 != jtt.bytecode.BC_getstatic_c.test(0)) {
				fail(runString);
				return;
			}
			// (1) == '\13'
			runString = "(1)";
			if ((char) 11 != jtt.bytecode.BC_getstatic_c.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_d() {
		begin("jtt.bytecode.BC_getstatic_d");
		String runString = null;
		try {
			// (0) == 11.0
			runString = "(0)";
			if (11.0 != jtt.bytecode.BC_getstatic_d.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11.0
			runString = "(1)";
			if (11.0 != jtt.bytecode.BC_getstatic_d.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_f() {
		begin("jtt.bytecode.BC_getstatic_f");
		String runString = null;
		try {
			// (0) == 11.0
			runString = "(0)";
			if (11.0f != jtt.bytecode.BC_getstatic_f.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11.0
			runString = "(1)";
			if (11.0f != jtt.bytecode.BC_getstatic_f.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_i() {
		begin("jtt.bytecode.BC_getstatic_i");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.bytecode.BC_getstatic_i.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.bytecode.BC_getstatic_i.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 11
			runString = "(2)";
			if (11 != jtt.bytecode.BC_getstatic_i.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 11
			runString = "(3)";
			if (11 != jtt.bytecode.BC_getstatic_i.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == 11
			runString = "(-4)";
			if (11 != jtt.bytecode.BC_getstatic_i.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_l() {
		begin("jtt.bytecode.BC_getstatic_l");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11L != jtt.bytecode.BC_getstatic_l.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.bytecode.BC_getstatic_l.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_s() {
		begin("jtt.bytecode.BC_getstatic_s");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if ((short) 11 != jtt.bytecode.BC_getstatic_s.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if ((short) 11 != jtt.bytecode.BC_getstatic_s.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_getstatic_z() {
		begin("jtt.bytecode.BC_getstatic_z");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.bytecode.BC_getstatic_z.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.bytecode.BC_getstatic_z.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2b() {
		begin("jtt.bytecode.BC_i2b");
		String runString = null;
		try {
			// (-1) == -1
			runString = "(-1)";
			if ((byte) -1 != jtt.bytecode.BC_i2b.test(-1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if ((byte) 2 != jtt.bytecode.BC_i2b.test(2)) {
				fail(runString);
				return;
			}
			// (255) == -1
			runString = "(255)";
			if ((byte) -1 != jtt.bytecode.BC_i2b.test(255)) {
				fail(runString);
				return;
			}
			// (128) == -128
			runString = "(128)";
			if ((byte) -128 != jtt.bytecode.BC_i2b.test(128)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2c() {
		begin("jtt.bytecode.BC_i2c");
		String runString = null;
		try {
			// (-1) == '\177777'
			runString = "(-1)";
			if ((char) 65535 != jtt.bytecode.BC_i2c.test(-1)) {
				fail(runString);
				return;
			}
			// (645) == '\1205'
			runString = "(645)";
			if ((char) 645 != jtt.bytecode.BC_i2c.test(645)) {
				fail(runString);
				return;
			}
			// (65535) == '\177777'
			runString = "(65535)";
			if ((char) 65535 != jtt.bytecode.BC_i2c.test(65535)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2d() {
		begin("jtt.bytecode.BC_i2d");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0 != jtt.bytecode.BC_i2d.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0 != jtt.bytecode.BC_i2d.test(1)) {
				fail(runString);
				return;
			}
			// (-34) == -34.0
			runString = "(-34)";
			if (-34.0 != jtt.bytecode.BC_i2d.test(-34)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2f() {
		begin("jtt.bytecode.BC_i2f");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0f != jtt.bytecode.BC_i2f.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0f != jtt.bytecode.BC_i2f.test(1)) {
				fail(runString);
				return;
			}
			// (-34) == -34.0
			runString = "(-34)";
			if (-34.0f != jtt.bytecode.BC_i2f.test(-34)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2l() {
		begin("jtt.bytecode.BC_i2l");
		String runString = null;
		try {
			// (1) == 1
			runString = "(1)";
			if (1L != jtt.bytecode.BC_i2l.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2L != jtt.bytecode.BC_i2l.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3L != jtt.bytecode.BC_i2l.test(3)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1L != jtt.bytecode.BC_i2l.test(-1)) {
				fail(runString);
				return;
			}
			// (-2147483647) == -2147483647
			runString = "(-2147483647)";
			if (-2147483647L != jtt.bytecode.BC_i2l.test(-2147483647)) {
				fail(runString);
				return;
			}
			// (-2147483648) == -2147483648
			runString = "(-2147483648)";
			if (-2147483648L != jtt.bytecode.BC_i2l.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (2147483647) == 2147483647
			runString = "(2147483647)";
			if (2147483647L != jtt.bytecode.BC_i2l.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_i2s() {
		begin("jtt.bytecode.BC_i2s");
		String runString = null;
		try {
			// (-1) == -1
			runString = "(-1)";
			if ((short) -1 != jtt.bytecode.BC_i2s.test(-1)) {
				fail(runString);
				return;
			}
			// (34) == 34
			runString = "(34)";
			if ((short) 34 != jtt.bytecode.BC_i2s.test(34)) {
				fail(runString);
				return;
			}
			// (65535) == -1
			runString = "(65535)";
			if ((short) -1 != jtt.bytecode.BC_i2s.test(65535)) {
				fail(runString);
				return;
			}
			// (32768) == -32768
			runString = "(32768)";
			if ((short) -32768 != jtt.bytecode.BC_i2s.test(32768)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iadd() {
		begin("jtt.bytecode.BC_iadd");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3 != jtt.bytecode.BC_iadd.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1 != jtt.bytecode.BC_iadd.test(0, -1)) {
				fail(runString);
				return;
			}
			// (33,67) == 100
			runString = "(33,67)";
			if (100 != jtt.bytecode.BC_iadd.test(33, 67)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0 != jtt.bytecode.BC_iadd.test(1, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647 != jtt.bytecode.BC_iadd.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
			// (2147483647,1) == -2147483648
			runString = "(2147483647,1)";
			if (-2147483648 != jtt.bytecode.BC_iadd.test(2147483647, 1)) {
				fail(runString);
				return;
			}
			// (-2147483647,-2) == 2147483647
			runString = "(-2147483647,-2)";
			if (2147483647 != jtt.bytecode.BC_iadd.test(-2147483647, -2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iadd2() {
		begin("jtt.bytecode.BC_iadd2");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3 != jtt.bytecode.BC_iadd2.test((byte) 1, (byte) 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1 != jtt.bytecode.BC_iadd2.test((byte) 0, (byte) -1)) {
				fail(runString);
				return;
			}
			// (33,67) == 100
			runString = "(33,67)";
			if (100 != jtt.bytecode.BC_iadd2.test((byte) 33, (byte) 67)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0 != jtt.bytecode.BC_iadd2.test((byte) 1, (byte) -1)) {
				fail(runString);
				return;
			}
			// (-128,1) == -127
			runString = "(-128,1)";
			if (-127 != jtt.bytecode.BC_iadd2.test((byte) -128, (byte) 1)) {
				fail(runString);
				return;
			}
			// (127,1) == 128
			runString = "(127,1)";
			if (128 != jtt.bytecode.BC_iadd2.test((byte) 127, (byte) 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iadd3() {
		begin("jtt.bytecode.BC_iadd3");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3 != jtt.bytecode.BC_iadd3.test((short) 1, (short) 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1 != jtt.bytecode.BC_iadd3.test((short) 0, (short) -1)) {
				fail(runString);
				return;
			}
			// (33,67) == 100
			runString = "(33,67)";
			if (100 != jtt.bytecode.BC_iadd3.test((short) 33, (short) 67)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0 != jtt.bytecode.BC_iadd3.test((short) 1, (short) -1)) {
				fail(runString);
				return;
			}
			// (-128,1) == -127
			runString = "(-128,1)";
			if (-127 != jtt.bytecode.BC_iadd3.test((short) -128, (short) 1)) {
				fail(runString);
				return;
			}
			// (127,1) == 128
			runString = "(127,1)";
			if (128 != jtt.bytecode.BC_iadd3.test((short) 127, (short) 1)) {
				fail(runString);
				return;
			}
			// (-32768,1) == -32767
			runString = "(-32768,1)";
			if (-32767 != jtt.bytecode.BC_iadd3.test((short) -32768, (short) 1)) {
				fail(runString);
				return;
			}
			// (32767,1) == 32768
			runString = "(32767,1)";
			if (32768 != jtt.bytecode.BC_iadd3.test((short) 32767, (short) 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iaload() {
		begin("jtt.bytecode.BC_iaload");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_iaload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.bytecode.BC_iaload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if (4 != jtt.bytecode.BC_iaload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1000000000
			runString = "(3)";
			if (1000000000 != jtt.bytecode.BC_iaload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iand() {
		begin("jtt.bytecode.BC_iand");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.bytecode.BC_iand.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0 != jtt.bytecode.BC_iand.test(0, -1)) {
				fail(runString);
				return;
			}
			// (31,63) == 31
			runString = "(31,63)";
			if (31 != jtt.bytecode.BC_iand.test(31, 63)) {
				fail(runString);
				return;
			}
			// (6,4) == 4
			runString = "(6,4)";
			if (4 != jtt.bytecode.BC_iand.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == 0
			runString = "(-2147483648,1)";
			if (0 != jtt.bytecode.BC_iand.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iastore() {
		begin("jtt.bytecode.BC_iastore");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if (0 != jtt.bytecode.BC_iastore.test(0, 0)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if (-1 != jtt.bytecode.BC_iastore.test(1, -1)) {
				fail(runString);
				return;
			}
			// (2,11) == 11
			runString = "(2,11)";
			if (11 != jtt.bytecode.BC_iastore.test(2, 11)) {
				fail(runString);
				return;
			}
			// (3,-14) == -14
			runString = "(3,-14)";
			if (-14 != jtt.bytecode.BC_iastore.test(3, -14)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iconst() {
		begin("jtt.bytecode.BC_iconst");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_iconst.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_iconst.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_iconst.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_iconst.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.bytecode.BC_iconst.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5 != jtt.bytecode.BC_iconst.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 375
			runString = "(6)";
			if (375 != jtt.bytecode.BC_iconst.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_idiv() {
		begin("jtt.bytecode.BC_idiv");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.bytecode.BC_idiv.test(1, 2)) {
				fail(runString);
				return;
			}
			// (2,-1) == -2
			runString = "(2,-1)";
			if (-2 != jtt.bytecode.BC_idiv.test(2, -1)) {
				fail(runString);
				return;
			}
			// (256,4) == 64
			runString = "(256,4)";
			if (64 != jtt.bytecode.BC_idiv.test(256, 4)) {
				fail(runString);
				return;
			}
			// (135,7) == 19
			runString = "(135,7)";
			if (19 != jtt.bytecode.BC_idiv.test(135, 7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_idiv2() {
		begin("jtt.bytecode.BC_idiv2");
		String runString = null;
		try {
			// (-2147483648,-1) == -2147483648
			runString = "(-2147483648,-1)";
			if (-2147483648 != jtt.bytecode.BC_idiv2.test(-2147483648, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483648
			runString = "(-2147483648,1)";
			if (-2147483648 != jtt.bytecode.BC_idiv2.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifeq() {
		begin("jtt.bytecode.BC_ifeq");
		String runString = null;
		try {
			// (0) == 2
			runString = "(0)";
			if (2 != jtt.bytecode.BC_ifeq.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -2
			runString = "(1)";
			if (-2 != jtt.bytecode.BC_ifeq.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifeq_2() {
		begin("jtt.bytecode.BC_ifeq_2");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.bytecode.BC_ifeq_2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.bytecode.BC_ifeq_2.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifeq_3() {
		begin("jtt.bytecode.BC_ifeq_3");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.bytecode.BC_ifeq_3.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.bytecode.BC_ifeq_3.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifge() {
		begin("jtt.bytecode.BC_ifge");
		String runString = null;
		try {
			// (0) == 2
			runString = "(0)";
			if (2 != jtt.bytecode.BC_ifge.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.bytecode.BC_ifge.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifge_2() {
		begin("jtt.bytecode.BC_ifge_2");
		String runString = null;
		try {
			// (0,1) == false
			runString = "(0,1)";
			if (false != jtt.bytecode.BC_ifge_2.test(0, 1)) {
				fail(runString);
				return;
			}
			// (1,0) == true
			runString = "(1,0)";
			if (true != jtt.bytecode.BC_ifge_2.test(1, 0)) {
				fail(runString);
				return;
			}
			// (1,1) == true
			runString = "(1,1)";
			if (true != jtt.bytecode.BC_ifge_2.test(1, 1)) {
				fail(runString);
				return;
			}
			// (0,-100) == true
			runString = "(0,-100)";
			if (true != jtt.bytecode.BC_ifge_2.test(0, -100)) {
				fail(runString);
				return;
			}
			// (-1,0) == false
			runString = "(-1,0)";
			if (false != jtt.bytecode.BC_ifge_2.test(-1, 0)) {
				fail(runString);
				return;
			}
			// (-12,-12) == true
			runString = "(-12,-12)";
			if (true != jtt.bytecode.BC_ifge_2.test(-12, -12)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifge_3() {
		begin("jtt.bytecode.BC_ifge_3");
		String runString = null;
		try {
			// (0,1) == true
			runString = "(0,1)";
			if (true != jtt.bytecode.BC_ifge_3.test(0, 1)) {
				fail(runString);
				return;
			}
			// (1,0) == false
			runString = "(1,0)";
			if (false != jtt.bytecode.BC_ifge_3.test(1, 0)) {
				fail(runString);
				return;
			}
			// (1,1) == false
			runString = "(1,1)";
			if (false != jtt.bytecode.BC_ifge_3.test(1, 1)) {
				fail(runString);
				return;
			}
			// (0,-100) == false
			runString = "(0,-100)";
			if (false != jtt.bytecode.BC_ifge_3.test(0, -100)) {
				fail(runString);
				return;
			}
			// (-1,0) == true
			runString = "(-1,0)";
			if (true != jtt.bytecode.BC_ifge_3.test(-1, 0)) {
				fail(runString);
				return;
			}
			// (-12,-12) == false
			runString = "(-12,-12)";
			if (false != jtt.bytecode.BC_ifge_3.test(-12, -12)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifgt() {
		begin("jtt.bytecode.BC_ifgt");
		String runString = null;
		try {
			// (0) == -2
			runString = "(0)";
			if (-2 != jtt.bytecode.BC_ifgt.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.bytecode.BC_ifgt.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ificmplt1() {
		begin("jtt.bytecode.BC_ificmplt1");
		String runString = null;
		try {
			// (0) == 12
			runString = "(0)";
			if (12 != jtt.bytecode.BC_ificmplt1.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 13
			runString = "(1)";
			if (13 != jtt.bytecode.BC_ificmplt1.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 13
			runString = "(2)";
			if (13 != jtt.bytecode.BC_ificmplt1.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ificmplt2() {
		begin("jtt.bytecode.BC_ificmplt2");
		String runString = null;
		try {
			// (0) == 12
			runString = "(0)";
			if (12 != jtt.bytecode.BC_ificmplt2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 12
			runString = "(1)";
			if (12 != jtt.bytecode.BC_ificmplt2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 13
			runString = "(2)";
			if (13 != jtt.bytecode.BC_ificmplt2.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ificmpne1() {
		begin("jtt.bytecode.BC_ificmpne1");
		String runString = null;
		try {
			// (0) == 13
			runString = "(0)";
			if (13 != jtt.bytecode.BC_ificmpne1.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 12
			runString = "(1)";
			if (12 != jtt.bytecode.BC_ificmpne1.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 13
			runString = "(2)";
			if (13 != jtt.bytecode.BC_ificmpne1.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ificmpne2() {
		begin("jtt.bytecode.BC_ificmpne2");
		String runString = null;
		try {
			// (0) == 13
			runString = "(0)";
			if (13 != jtt.bytecode.BC_ificmpne2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 12
			runString = "(1)";
			if (12 != jtt.bytecode.BC_ificmpne2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 13
			runString = "(2)";
			if (13 != jtt.bytecode.BC_ificmpne2.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifle() {
		begin("jtt.bytecode.BC_ifle");
		String runString = null;
		try {
			// (0) == 2
			runString = "(0)";
			if (2 != jtt.bytecode.BC_ifle.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -2
			runString = "(1)";
			if (-2 != jtt.bytecode.BC_ifle.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iflt() {
		begin("jtt.bytecode.BC_iflt");
		String runString = null;
		try {
			// (0) == -2
			runString = "(0)";
			if (-2 != jtt.bytecode.BC_iflt.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -2
			runString = "(1)";
			if (-2 != jtt.bytecode.BC_iflt.test(1)) {
				fail(runString);
				return;
			}
			// (-1) == 2
			runString = "(-1)";
			if (2 != jtt.bytecode.BC_iflt.test(-1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifne() {
		begin("jtt.bytecode.BC_ifne");
		String runString = null;
		try {
			// (0) == -2
			runString = "(0)";
			if (-2 != jtt.bytecode.BC_ifne.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.bytecode.BC_ifne.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnonnull() {
		begin("jtt.bytecode.BC_ifnonnull");
		String runString = null;
		try {
			// (null) == 2
			runString = "(null)";
			if (2 != jtt.bytecode.BC_ifnonnull.test(null)) {
				fail(runString);
				return;
			}
			// ("") == -2
			runString = "(\"\")";
			if (-2 != jtt.bytecode.BC_ifnonnull.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnonnull_2() {
		begin("jtt.bytecode.BC_ifnonnull_2");
		String runString = null;
		try {
			// (null) == false
			runString = "(null)";
			if (false != jtt.bytecode.BC_ifnonnull_2.test(null)) {
				fail(runString);
				return;
			}
			// ("") == true
			runString = "(\"\")";
			if (true != jtt.bytecode.BC_ifnonnull_2.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnonnull_3() {
		begin("jtt.bytecode.BC_ifnonnull_3");
		String runString = null;
		try {
			// (null) == 2
			runString = "(null)";
			if (2 != jtt.bytecode.BC_ifnonnull_3.test(null)) {
				fail(runString);
				return;
			}
			// ("") == 1
			runString = "(\"\")";
			if (1 != jtt.bytecode.BC_ifnonnull_3.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnull() {
		begin("jtt.bytecode.BC_ifnull");
		String runString = null;
		try {
			// (null) == -2
			runString = "(null)";
			if (-2 != jtt.bytecode.BC_ifnull.test(null)) {
				fail(runString);
				return;
			}
			// ("") == 2
			runString = "(\"\")";
			if (2 != jtt.bytecode.BC_ifnull.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnull_2() {
		begin("jtt.bytecode.BC_ifnull_2");
		String runString = null;
		try {
			// (null) == true
			runString = "(null)";
			if (true != jtt.bytecode.BC_ifnull_2.test(null)) {
				fail(runString);
				return;
			}
			// ("") == false
			runString = "(\"\")";
			if (false != jtt.bytecode.BC_ifnull_2.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ifnull_3() {
		begin("jtt.bytecode.BC_ifnull_3");
		String runString = null;
		try {
			// (null) == 1
			runString = "(null)";
			if (1 != jtt.bytecode.BC_ifnull_3.test(null)) {
				fail(runString);
				return;
			}
			// ("") == 2
			runString = "(\"\")";
			if (2 != jtt.bytecode.BC_ifnull_3.test("")) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iinc_1() {
		begin("jtt.bytecode.BC_iinc_1");
		String runString = null;
		try {
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.bytecode.BC_iinc_1.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 3
			runString = "(2)";
			if (3 != jtt.bytecode.BC_iinc_1.test(2)) {
				fail(runString);
				return;
			}
			// (4) == 5
			runString = "(4)";
			if (5 != jtt.bytecode.BC_iinc_1.test(4)) {
				fail(runString);
				return;
			}
			// (-1) == 0
			runString = "(-1)";
			if (0 != jtt.bytecode.BC_iinc_1.test(-1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iinc_2() {
		begin("jtt.bytecode.BC_iinc_2");
		String runString = null;
		try {
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.bytecode.BC_iinc_2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if (4 != jtt.bytecode.BC_iinc_2.test(2)) {
				fail(runString);
				return;
			}
			// (4) == 6
			runString = "(4)";
			if (6 != jtt.bytecode.BC_iinc_2.test(4)) {
				fail(runString);
				return;
			}
			// (-2) == 0
			runString = "(-2)";
			if (0 != jtt.bytecode.BC_iinc_2.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iinc_3() {
		begin("jtt.bytecode.BC_iinc_3");
		String runString = null;
		try {
			// (1) == 52
			runString = "(1)";
			if (52 != jtt.bytecode.BC_iinc_3.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 53
			runString = "(2)";
			if (53 != jtt.bytecode.BC_iinc_3.test(2)) {
				fail(runString);
				return;
			}
			// (4) == 55
			runString = "(4)";
			if (55 != jtt.bytecode.BC_iinc_3.test(4)) {
				fail(runString);
				return;
			}
			// (-1) == 50
			runString = "(-1)";
			if (50 != jtt.bytecode.BC_iinc_3.test(-1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iinc_4() {
		begin("jtt.bytecode.BC_iinc_4");
		String runString = null;
		try {
			// (1) == 513
			runString = "(1)";
			if (513 != jtt.bytecode.BC_iinc_4.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 514
			runString = "(2)";
			if (514 != jtt.bytecode.BC_iinc_4.test(2)) {
				fail(runString);
				return;
			}
			// (4) == 516
			runString = "(4)";
			if (516 != jtt.bytecode.BC_iinc_4.test(4)) {
				fail(runString);
				return;
			}
			// (-1) == 511
			runString = "(-1)";
			if (511 != jtt.bytecode.BC_iinc_4.test(-1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_0() {
		begin("jtt.bytecode.BC_iload_0");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_iload_0.test(0)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1 != jtt.bytecode.BC_iload_0.test(-1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_iload_0.test(2)) {
				fail(runString);
				return;
			}
			// (1000345) == 1000345
			runString = "(1000345)";
			if (1000345 != jtt.bytecode.BC_iload_0.test(1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_0_1() {
		begin("jtt.bytecode.BC_iload_0_1");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.bytecode.BC_iload_0_1.test(0)) {
				fail(runString);
				return;
			}
			// (-1) == 0
			runString = "(-1)";
			if (0 != jtt.bytecode.BC_iload_0_1.test(-1)) {
				fail(runString);
				return;
			}
			// (2) == 3
			runString = "(2)";
			if (3 != jtt.bytecode.BC_iload_0_1.test(2)) {
				fail(runString);
				return;
			}
			// (1000345) == 1000346
			runString = "(1000345)";
			if (1000346 != jtt.bytecode.BC_iload_0_1.test(1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_0_2() {
		begin("jtt.bytecode.BC_iload_0_2");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_iload_0_2.test(0)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1 != jtt.bytecode.BC_iload_0_2.test(-1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_iload_0_2.test(2)) {
				fail(runString);
				return;
			}
			// (1000345) == 1000345
			runString = "(1000345)";
			if (1000345 != jtt.bytecode.BC_iload_0_2.test(1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_1() {
		begin("jtt.bytecode.BC_iload_1");
		String runString = null;
		try {
			// (1,0) == 0
			runString = "(1,0)";
			if (0 != jtt.bytecode.BC_iload_1.test(1, 0)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if (-1 != jtt.bytecode.BC_iload_1.test(1, -1)) {
				fail(runString);
				return;
			}
			// (1,2) == 2
			runString = "(1,2)";
			if (2 != jtt.bytecode.BC_iload_1.test(1, 2)) {
				fail(runString);
				return;
			}
			// (1,1000345) == 1000345
			runString = "(1,1000345)";
			if (1000345 != jtt.bytecode.BC_iload_1.test(1, 1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_1_1() {
		begin("jtt.bytecode.BC_iload_1_1");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_iload_1_1.test(0)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1 != jtt.bytecode.BC_iload_1_1.test(-1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_iload_1_1.test(2)) {
				fail(runString);
				return;
			}
			// (1000345) == 1000345
			runString = "(1000345)";
			if (1000345 != jtt.bytecode.BC_iload_1_1.test(1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_2() {
		begin("jtt.bytecode.BC_iload_2");
		String runString = null;
		try {
			// (1,1,0) == 0
			runString = "(1,1,0)";
			if (0 != jtt.bytecode.BC_iload_2.test(1, 1, 0)) {
				fail(runString);
				return;
			}
			// (1,1,-1) == -1
			runString = "(1,1,-1)";
			if (-1 != jtt.bytecode.BC_iload_2.test(1, 1, -1)) {
				fail(runString);
				return;
			}
			// (1,1,2) == 2
			runString = "(1,1,2)";
			if (2 != jtt.bytecode.BC_iload_2.test(1, 1, 2)) {
				fail(runString);
				return;
			}
			// (1,1,1000345) == 1000345
			runString = "(1,1,1000345)";
			if (1000345 != jtt.bytecode.BC_iload_2.test(1, 1, 1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iload_3() {
		begin("jtt.bytecode.BC_iload_3");
		String runString = null;
		try {
			// (1,1,1,0) == 0
			runString = "(1,1,1,0)";
			if (0 != jtt.bytecode.BC_iload_3.test(1, 1, 1, 0)) {
				fail(runString);
				return;
			}
			// (1,1,1,-1) == -1
			runString = "(1,1,1,-1)";
			if (-1 != jtt.bytecode.BC_iload_3.test(1, 1, 1, -1)) {
				fail(runString);
				return;
			}
			// (1,1,1,2) == 2
			runString = "(1,1,1,2)";
			if (2 != jtt.bytecode.BC_iload_3.test(1, 1, 1, 2)) {
				fail(runString);
				return;
			}
			// (1,1,1,1000345) == 1000345
			runString = "(1,1,1,1000345)";
			if (1000345 != jtt.bytecode.BC_iload_3.test(1, 1, 1, 1000345)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_imul() {
		begin("jtt.bytecode.BC_imul");
		String runString = null;
		try {
			// (1,2) == 2
			runString = "(1,2)";
			if (2 != jtt.bytecode.BC_imul.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0 != jtt.bytecode.BC_imul.test(0, -1)) {
				fail(runString);
				return;
			}
			// (33,67) == 2211
			runString = "(33,67)";
			if (2211 != jtt.bytecode.BC_imul.test(33, 67)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if (-1 != jtt.bytecode.BC_imul.test(1, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483648
			runString = "(-2147483648,1)";
			if (-2147483648 != jtt.bytecode.BC_imul.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
			// (2147483647,-1) == -2147483647
			runString = "(2147483647,-1)";
			if (-2147483647 != jtt.bytecode.BC_imul.test(2147483647, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,-1) == -2147483648
			runString = "(-2147483648,-1)";
			if (-2147483648 != jtt.bytecode.BC_imul.test(-2147483648, -1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ineg() {
		begin("jtt.bytecode.BC_ineg");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_ineg.test(0)) {
				fail(runString);
				return;
			}
			// (-1) == 1
			runString = "(-1)";
			if (1 != jtt.bytecode.BC_ineg.test(-1)) {
				fail(runString);
				return;
			}
			// (7263) == -7263
			runString = "(7263)";
			if (-7263 != jtt.bytecode.BC_ineg.test(7263)) {
				fail(runString);
				return;
			}
			// (-2147483648) == -2147483648
			runString = "(-2147483648)";
			if (-2147483648 != jtt.bytecode.BC_ineg.test(-2147483648)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_instanceof() {
		begin("jtt.bytecode.BC_instanceof");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.bytecode.BC_instanceof.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.bytecode.BC_instanceof.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.bytecode.BC_instanceof.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.bytecode.BC_instanceof.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.bytecode.BC_instanceof.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_invokeinterface() {
		begin("jtt.bytecode.BC_invokeinterface");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_invokeinterface.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_invokeinterface.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_invokeinterface.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_invokeinterface.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_invokeinterface.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_invokespecial() {
		begin("jtt.bytecode.BC_invokespecial");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_invokespecial.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_invokespecial.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_invokespecial.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_invokespecial.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_invokespecial.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_invokespecial2() {
		begin("jtt.bytecode.BC_invokespecial2");
		String runString = null;
		try {
			// (0) == 7
			runString = "(0)";
			if (7 != jtt.bytecode.BC_invokespecial2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 8
			runString = "(1)";
			if (8 != jtt.bytecode.BC_invokespecial2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 9
			runString = "(2)";
			if (9 != jtt.bytecode.BC_invokespecial2.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 10
			runString = "(3)";
			if (10 != jtt.bytecode.BC_invokespecial2.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == 3
			runString = "(-4)";
			if (3 != jtt.bytecode.BC_invokespecial2.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_invokestatic() {
		begin("jtt.bytecode.BC_invokestatic");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_invokestatic.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_invokestatic.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_invokestatic.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_invokestatic.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_invokestatic.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_invokevirtual() {
		begin("jtt.bytecode.BC_invokevirtual");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_invokevirtual.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_invokevirtual.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_invokevirtual.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_invokevirtual.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_invokevirtual.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ior() {
		begin("jtt.bytecode.BC_ior");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3 != jtt.bytecode.BC_ior.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1 != jtt.bytecode.BC_ior.test(0, -1)) {
				fail(runString);
				return;
			}
			// (31,63) == 63
			runString = "(31,63)";
			if (63 != jtt.bytecode.BC_ior.test(31, 63)) {
				fail(runString);
				return;
			}
			// (6,4) == 6
			runString = "(6,4)";
			if (6 != jtt.bytecode.BC_ior.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647 != jtt.bytecode.BC_ior.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_irem() {
		begin("jtt.bytecode.BC_irem");
		String runString = null;
		try {
			// (1,2) == 1
			runString = "(1,2)";
			if (1 != jtt.bytecode.BC_irem.test(1, 2)) {
				fail(runString);
				return;
			}
			// (2,-1) == 0
			runString = "(2,-1)";
			if (0 != jtt.bytecode.BC_irem.test(2, -1)) {
				fail(runString);
				return;
			}
			// (256,4) == 0
			runString = "(256,4)";
			if (0 != jtt.bytecode.BC_irem.test(256, 4)) {
				fail(runString);
				return;
			}
			// (135,7) == 2
			runString = "(135,7)";
			if (2 != jtt.bytecode.BC_irem.test(135, 7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_irem2() {
		begin("jtt.bytecode.BC_irem2");
		String runString = null;
		try {
			// (-2147483648,-1) == 0
			runString = "(-2147483648,-1)";
			if (0 != jtt.bytecode.BC_irem2.test(-2147483648, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == 0
			runString = "(-2147483648,1)";
			if (0 != jtt.bytecode.BC_irem2.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ireturn() {
		begin("jtt.bytecode.BC_ireturn");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_ireturn.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_ireturn.test(1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1 != jtt.bytecode.BC_ireturn.test(-1)) {
				fail(runString);
				return;
			}
			// (256) == 256
			runString = "(256)";
			if (256 != jtt.bytecode.BC_ireturn.test(256)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ishl() {
		begin("jtt.bytecode.BC_ishl");
		String runString = null;
		try {
			// (1,2) == 4
			runString = "(1,2)";
			if (4 != jtt.bytecode.BC_ishl.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0 != jtt.bytecode.BC_ishl.test(0, -1)) {
				fail(runString);
				return;
			}
			// (31,1) == 62
			runString = "(31,1)";
			if (62 != jtt.bytecode.BC_ishl.test(31, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 96
			runString = "(6,4)";
			if (96 != jtt.bytecode.BC_ishl.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == 0
			runString = "(-2147483648,1)";
			if (0 != jtt.bytecode.BC_ishl.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ishr() {
		begin("jtt.bytecode.BC_ishr");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.bytecode.BC_ishr.test(1, 2)) {
				fail(runString);
				return;
			}
			// (67,2) == 16
			runString = "(67,2)";
			if (16 != jtt.bytecode.BC_ishr.test(67, 2)) {
				fail(runString);
				return;
			}
			// (31,1) == 15
			runString = "(31,1)";
			if (15 != jtt.bytecode.BC_ishr.test(31, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 0
			runString = "(6,4)";
			if (0 != jtt.bytecode.BC_ishr.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,16) == -32768
			runString = "(-2147483648,16)";
			if (-32768 != jtt.bytecode.BC_ishr.test(-2147483648, 16)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_isub() {
		begin("jtt.bytecode.BC_isub");
		String runString = null;
		try {
			// (1,-2) == 3
			runString = "(1,-2)";
			if (3 != jtt.bytecode.BC_isub.test(1, -2)) {
				fail(runString);
				return;
			}
			// (0,1) == -1
			runString = "(0,1)";
			if (-1 != jtt.bytecode.BC_isub.test(0, 1)) {
				fail(runString);
				return;
			}
			// (33,-67) == 100
			runString = "(33,-67)";
			if (100 != jtt.bytecode.BC_isub.test(33, -67)) {
				fail(runString);
				return;
			}
			// (1,1) == 0
			runString = "(1,1)";
			if (0 != jtt.bytecode.BC_isub.test(1, 1)) {
				fail(runString);
				return;
			}
			// (-2147483648,-1) == -2147483647
			runString = "(-2147483648,-1)";
			if (-2147483647 != jtt.bytecode.BC_isub.test(-2147483648, -1)) {
				fail(runString);
				return;
			}
			// (2147483647,-1) == -2147483648
			runString = "(2147483647,-1)";
			if (-2147483648 != jtt.bytecode.BC_isub.test(2147483647, -1)) {
				fail(runString);
				return;
			}
			// (-2147483647,2) == 2147483647
			runString = "(-2147483647,2)";
			if (2147483647 != jtt.bytecode.BC_isub.test(-2147483647, 2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_iushr() {
		begin("jtt.bytecode.BC_iushr");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.bytecode.BC_iushr.test(1, 2)) {
				fail(runString);
				return;
			}
			// (67,2) == 16
			runString = "(67,2)";
			if (16 != jtt.bytecode.BC_iushr.test(67, 2)) {
				fail(runString);
				return;
			}
			// (31,1) == 15
			runString = "(31,1)";
			if (15 != jtt.bytecode.BC_iushr.test(31, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 0
			runString = "(6,4)";
			if (0 != jtt.bytecode.BC_iushr.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,16) == 32768
			runString = "(-2147483648,16)";
			if (32768 != jtt.bytecode.BC_iushr.test(-2147483648, 16)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ixor() {
		begin("jtt.bytecode.BC_ixor");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3 != jtt.bytecode.BC_ixor.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1 != jtt.bytecode.BC_ixor.test(0, -1)) {
				fail(runString);
				return;
			}
			// (31,63) == 32
			runString = "(31,63)";
			if (32 != jtt.bytecode.BC_ixor.test(31, 63)) {
				fail(runString);
				return;
			}
			// (6,4) == 2
			runString = "(6,4)";
			if (2 != jtt.bytecode.BC_ixor.test(6, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647 != jtt.bytecode.BC_ixor.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_l2d() {
		begin("jtt.bytecode.BC_l2d");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0 != jtt.bytecode.BC_l2d.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0 != jtt.bytecode.BC_l2d.test(1L)) {
				fail(runString);
				return;
			}
			// (-74652389) == -7.4652389E7
			runString = "(-74652389)";
			if (-7.4652389E7 != jtt.bytecode.BC_l2d.test(-74652389L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_l2f() {
		begin("jtt.bytecode.BC_l2f");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0f != jtt.bytecode.BC_l2f.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0f != jtt.bytecode.BC_l2f.test(1L)) {
				fail(runString);
				return;
			}
			// (-74652389) == -7.4652392E7
			runString = "(-74652389)";
			if (-7.4652392E7f != jtt.bytecode.BC_l2f.test(-74652389L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_l2i() {
		begin("jtt.bytecode.BC_l2i");
		String runString = null;
		try {
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_l2i.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_l2i.test(2L)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_l2i.test(3L)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1 != jtt.bytecode.BC_l2i.test(-1L)) {
				fail(runString);
				return;
			}
			// (-2147483647) == -2147483647
			runString = "(-2147483647)";
			if (-2147483647 != jtt.bytecode.BC_l2i.test(-2147483647L)) {
				fail(runString);
				return;
			}
			// (-2147483648) == -2147483648
			runString = "(-2147483648)";
			if (-2147483648 != jtt.bytecode.BC_l2i.test(-2147483648L)) {
				fail(runString);
				return;
			}
			// (2147483647) == 2147483647
			runString = "(2147483647)";
			if (2147483647 != jtt.bytecode.BC_l2i.test(2147483647L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ladd() {
		begin("jtt.bytecode.BC_ladd");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3L != jtt.bytecode.BC_ladd.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1L != jtt.bytecode.BC_ladd.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (33,67) == 100
			runString = "(33,67)";
			if (100L != jtt.bytecode.BC_ladd.test(33L, 67L)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0L != jtt.bytecode.BC_ladd.test(1L, -1L)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647L != jtt.bytecode.BC_ladd.test(-2147483648L, 1L)) {
				fail(runString);
				return;
			}
			// (2147483647,1) == 2147483648
			runString = "(2147483647,1)";
			if (2147483648L != jtt.bytecode.BC_ladd.test(2147483647L, 1L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ladd2() {
		begin("jtt.bytecode.BC_ladd2");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3L != jtt.bytecode.BC_ladd2.test(1, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1L != jtt.bytecode.BC_ladd2.test(0, -1)) {
				fail(runString);
				return;
			}
			// (33,67) == 100
			runString = "(33,67)";
			if (100L != jtt.bytecode.BC_ladd2.test(33, 67)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0L != jtt.bytecode.BC_ladd2.test(1, -1)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647L != jtt.bytecode.BC_ladd2.test(-2147483648, 1)) {
				fail(runString);
				return;
			}
			// (2147483647,1) == 2147483648
			runString = "(2147483647,1)";
			if (2147483648L != jtt.bytecode.BC_ladd2.test(2147483647, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_laload() {
		begin("jtt.bytecode.BC_laload");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.bytecode.BC_laload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1L != jtt.bytecode.BC_laload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if (4L != jtt.bytecode.BC_laload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1000000000000
			runString = "(3)";
			if (1000000000000L != jtt.bytecode.BC_laload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_land() {
		begin("jtt.bytecode.BC_land");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.bytecode.BC_land.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0L != jtt.bytecode.BC_land.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (31,63) == 31
			runString = "(31,63)";
			if (31L != jtt.bytecode.BC_land.test(31L, 63L)) {
				fail(runString);
				return;
			}
			// (6,4) == 4
			runString = "(6,4)";
			if (4L != jtt.bytecode.BC_land.test(6L, 4L)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == 0
			runString = "(-2147483648,1)";
			if (0L != jtt.bytecode.BC_land.test(-2147483648L, 1L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lastore() {
		begin("jtt.bytecode.BC_lastore");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if (0L != jtt.bytecode.BC_lastore.test(0, 0L)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if (-1L != jtt.bytecode.BC_lastore.test(1, -1L)) {
				fail(runString);
				return;
			}
			// (2,11) == 11
			runString = "(2,11)";
			if (11L != jtt.bytecode.BC_lastore.test(2, 11L)) {
				fail(runString);
				return;
			}
			// (3,-14) == -14
			runString = "(3,-14)";
			if (-14L != jtt.bytecode.BC_lastore.test(3, -14L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lcmp() {
		begin("jtt.bytecode.BC_lcmp");
		String runString = null;
		try {
			// (0,-1) == false
			runString = "(0,-1)";
			if (false != jtt.bytecode.BC_lcmp.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (77,78) == true
			runString = "(77,78)";
			if (true != jtt.bytecode.BC_lcmp.test(77L, 78L)) {
				fail(runString);
				return;
			}
			// (-1,0) == true
			runString = "(-1,0)";
			if (true != jtt.bytecode.BC_lcmp.test(-1L, 0L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_01() {
		begin("jtt.bytecode.BC_ldc_01");
		String runString = null;
		try {
			// (0) == -123
			runString = "(0)";
			if (-123 != jtt.bytecode.BC_ldc_01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_02() {
		begin("jtt.bytecode.BC_ldc_02");
		String runString = null;
		try {
			// (0) == -2.4
			runString = "(0)";
			if (-2.4f != jtt.bytecode.BC_ldc_02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_03() {
		begin("jtt.bytecode.BC_ldc_03");
		String runString = null;
		try {
			// (0) == -123
			runString = "(0)";
			if (-123L != jtt.bytecode.BC_ldc_03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_04() {
		begin("jtt.bytecode.BC_ldc_04");
		String runString = null;
		try {
			// (0) == "xyz"
			runString = "(0)";
			if (!"xyz".equals(jtt.bytecode.BC_ldc_04.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_05() {
		begin("jtt.bytecode.BC_ldc_05");
		String runString = null;
		try {
			// (0) == -2.33
			runString = "(0)";
			if (-2.33 != jtt.bytecode.BC_ldc_05.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldc_06() {
		begin("jtt.bytecode.BC_ldc_06");
		String runString = null;
		try {
			// (0) == "jtt.bytecode.BC_ldc_06"
			runString = "(0)";
			if (!"jtt.bytecode.BC_ldc_06"
					.equals(jtt.bytecode.BC_ldc_06.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldiv() {
		begin("jtt.bytecode.BC_ldiv");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.bytecode.BC_ldiv.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (2,-1) == -2
			runString = "(2,-1)";
			if (-2L != jtt.bytecode.BC_ldiv.test(2L, -1L)) {
				fail(runString);
				return;
			}
			// (256,4) == 64
			runString = "(256,4)";
			if (64L != jtt.bytecode.BC_ldiv.test(256L, 4L)) {
				fail(runString);
				return;
			}
			// (135,7) == 19
			runString = "(135,7)";
			if (19L != jtt.bytecode.BC_ldiv.test(135L, 7L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_ldiv2() {
		begin("jtt.bytecode.BC_ldiv2");
		String runString = null;
		try {
			// (-9223372036854775808,-1) == -9223372036854775808
			runString = "(-9223372036854775808,-1)";
			if (-9223372036854775808L != jtt.bytecode.BC_ldiv2.test(
					-9223372036854775808L, -1)) {
				fail(runString);
				return;
			}
			// (-9223372036854775808,1) == -9223372036854775808
			runString = "(-9223372036854775808,1)";
			if (-9223372036854775808L != jtt.bytecode.BC_ldiv2.test(
					-9223372036854775808L, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lload_0() {
		begin("jtt.bytecode.BC_lload_0");
		String runString = null;
		try {
			// (1) == 1
			runString = "(1)";
			if (1L != jtt.bytecode.BC_lload_0.test(1L)) {
				fail(runString);
				return;
			}
			// (-3) == -3
			runString = "(-3)";
			if (-3L != jtt.bytecode.BC_lload_0.test(-3L)) {
				fail(runString);
				return;
			}
			// (10000) == 10000
			runString = "(10000)";
			if (10000L != jtt.bytecode.BC_lload_0.test(10000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lload_01() {
		begin("jtt.bytecode.BC_lload_01");
		String runString = null;
		try {
			// (1) == 0
			runString = "(1)";
			if (0L != jtt.bytecode.BC_lload_01.test(1)) {
				fail(runString);
				return;
			}
			// (-3) == 0
			runString = "(-3)";
			if (0L != jtt.bytecode.BC_lload_01.test(-3)) {
				fail(runString);
				return;
			}
			// (100) == 0
			runString = "(100)";
			if (0L != jtt.bytecode.BC_lload_01.test(100)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lload_1() {
		begin("jtt.bytecode.BC_lload_1");
		String runString = null;
		try {
			// (1,1) == 1
			runString = "(1,1)";
			if (1L != jtt.bytecode.BC_lload_1.test(1, 1L)) {
				fail(runString);
				return;
			}
			// (1,-3) == -3
			runString = "(1,-3)";
			if (-3L != jtt.bytecode.BC_lload_1.test(1, -3L)) {
				fail(runString);
				return;
			}
			// (1,10000) == 10000
			runString = "(1,10000)";
			if (10000L != jtt.bytecode.BC_lload_1.test(1, 10000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lload_2() {
		begin("jtt.bytecode.BC_lload_2");
		String runString = null;
		try {
			// (1,1,1) == 1
			runString = "(1,1,1)";
			if (1L != jtt.bytecode.BC_lload_2.test(1, 1, 1L)) {
				fail(runString);
				return;
			}
			// (1,1,-3) == -3
			runString = "(1,1,-3)";
			if (-3L != jtt.bytecode.BC_lload_2.test(1, 1, -3L)) {
				fail(runString);
				return;
			}
			// (1,1,10000) == 10000
			runString = "(1,1,10000)";
			if (10000L != jtt.bytecode.BC_lload_2.test(1, 1, 10000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lload_3() {
		begin("jtt.bytecode.BC_lload_3");
		String runString = null;
		try {
			// (1,1,1,1) == 1
			runString = "(1,1,1,1)";
			if (1L != jtt.bytecode.BC_lload_3.test(1, 1, 1, 1L)) {
				fail(runString);
				return;
			}
			// (1,1,1,-3) == -3
			runString = "(1,1,1,-3)";
			if (-3L != jtt.bytecode.BC_lload_3.test(1, 1, 1, -3L)) {
				fail(runString);
				return;
			}
			// (1,1,1,10000) == 10000
			runString = "(1,1,1,10000)";
			if (10000L != jtt.bytecode.BC_lload_3.test(1, 1, 1, 10000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lmul() {
		begin("jtt.bytecode.BC_lmul");
		String runString = null;
		try {
			// (1,2) == 2
			runString = "(1,2)";
			if (2L != jtt.bytecode.BC_lmul.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0L != jtt.bytecode.BC_lmul.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (33,67) == 2211
			runString = "(33,67)";
			if (2211L != jtt.bytecode.BC_lmul.test(33L, 67L)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if (-1L != jtt.bytecode.BC_lmul.test(1L, -1L)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483648
			runString = "(-2147483648,1)";
			if (-2147483648L != jtt.bytecode.BC_lmul.test(-2147483648L, 1L)) {
				fail(runString);
				return;
			}
			// (2147483647,-1) == -2147483647
			runString = "(2147483647,-1)";
			if (-2147483647L != jtt.bytecode.BC_lmul.test(2147483647L, -1L)) {
				fail(runString);
				return;
			}
			// (-2147483648,-1) == 2147483648
			runString = "(-2147483648,-1)";
			if (2147483648L != jtt.bytecode.BC_lmul.test(-2147483648L, -1L)) {
				fail(runString);
				return;
			}
			// (1000000,1000000) == 1000000000000
			runString = "(1000000,1000000)";
			if (1000000000000L != jtt.bytecode.BC_lmul.test(1000000L, 1000000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lneg() {
		begin("jtt.bytecode.BC_lneg");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.bytecode.BC_lneg.test(0L)) {
				fail(runString);
				return;
			}
			// (-1) == 1
			runString = "(-1)";
			if (1L != jtt.bytecode.BC_lneg.test(-1L)) {
				fail(runString);
				return;
			}
			// (7263) == -7263
			runString = "(7263)";
			if (-7263L != jtt.bytecode.BC_lneg.test(7263L)) {
				fail(runString);
				return;
			}
			// (-2147483648) == 2147483648
			runString = "(-2147483648)";
			if (2147483648L != jtt.bytecode.BC_lneg.test(-2147483648L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lookupswitch01() {
		begin("jtt.bytecode.BC_lookupswitch01");
		String runString = null;
		try {
			// (0) == 42
			runString = "(0)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 42
			runString = "(1)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(1)) {
				fail(runString);
				return;
			}
			// (66) == 42
			runString = "(66)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(66)) {
				fail(runString);
				return;
			}
			// (67) == 0
			runString = "(67)";
			if (0 != jtt.bytecode.BC_lookupswitch01.test(67)) {
				fail(runString);
				return;
			}
			// (68) == 42
			runString = "(68)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(68)) {
				fail(runString);
				return;
			}
			// (96) == 42
			runString = "(96)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(96)) {
				fail(runString);
				return;
			}
			// (97) == 1
			runString = "(97)";
			if (1 != jtt.bytecode.BC_lookupswitch01.test(97)) {
				fail(runString);
				return;
			}
			// (98) == 42
			runString = "(98)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(98)) {
				fail(runString);
				return;
			}
			// (106) == 42
			runString = "(106)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(106)) {
				fail(runString);
				return;
			}
			// (107) == 2
			runString = "(107)";
			if (2 != jtt.bytecode.BC_lookupswitch01.test(107)) {
				fail(runString);
				return;
			}
			// (108) == 42
			runString = "(108)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(108)) {
				fail(runString);
				return;
			}
			// (132) == 42
			runString = "(132)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(132)) {
				fail(runString);
				return;
			}
			// (133) == 3
			runString = "(133)";
			if (3 != jtt.bytecode.BC_lookupswitch01.test(133)) {
				fail(runString);
				return;
			}
			// (134) == 42
			runString = "(134)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(134)) {
				fail(runString);
				return;
			}
			// (211) == 42
			runString = "(211)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(211)) {
				fail(runString);
				return;
			}
			// (212) == 4
			runString = "(212)";
			if (4 != jtt.bytecode.BC_lookupswitch01.test(212)) {
				fail(runString);
				return;
			}
			// (213) == 42
			runString = "(213)";
			if (42 != jtt.bytecode.BC_lookupswitch01.test(213)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lookupswitch02() {
		begin("jtt.bytecode.BC_lookupswitch02");
		String runString = null;
		try {
			// (0) == 42
			runString = "(0)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 42
			runString = "(1)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(1)) {
				fail(runString);
				return;
			}
			// (66) == 42
			runString = "(66)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(66)) {
				fail(runString);
				return;
			}
			// (67) == 0
			runString = "(67)";
			if (0 != jtt.bytecode.BC_lookupswitch02.test(67)) {
				fail(runString);
				return;
			}
			// (68) == 42
			runString = "(68)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(68)) {
				fail(runString);
				return;
			}
			// (96) == 42
			runString = "(96)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(96)) {
				fail(runString);
				return;
			}
			// (97) == 1
			runString = "(97)";
			if (1 != jtt.bytecode.BC_lookupswitch02.test(97)) {
				fail(runString);
				return;
			}
			// (98) == 42
			runString = "(98)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(98)) {
				fail(runString);
				return;
			}
			// (106) == 42
			runString = "(106)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(106)) {
				fail(runString);
				return;
			}
			// (107) == 2
			runString = "(107)";
			if (2 != jtt.bytecode.BC_lookupswitch02.test(107)) {
				fail(runString);
				return;
			}
			// (108) == 42
			runString = "(108)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(108)) {
				fail(runString);
				return;
			}
			// (132) == 42
			runString = "(132)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(132)) {
				fail(runString);
				return;
			}
			// (133) == 3
			runString = "(133)";
			if (3 != jtt.bytecode.BC_lookupswitch02.test(133)) {
				fail(runString);
				return;
			}
			// (134) == 42
			runString = "(134)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(134)) {
				fail(runString);
				return;
			}
			// (211) == 42
			runString = "(211)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(211)) {
				fail(runString);
				return;
			}
			// (212) == 4
			runString = "(212)";
			if (4 != jtt.bytecode.BC_lookupswitch02.test(212)) {
				fail(runString);
				return;
			}
			// (213) == 42
			runString = "(213)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(213)) {
				fail(runString);
				return;
			}
			// (-121) == 42
			runString = "(-121)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(-121)) {
				fail(runString);
				return;
			}
			// (-122) == 5
			runString = "(-122)";
			if (5 != jtt.bytecode.BC_lookupswitch02.test(-122)) {
				fail(runString);
				return;
			}
			// (-123) == 42
			runString = "(-123)";
			if (42 != jtt.bytecode.BC_lookupswitch02.test(-123)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lookupswitch03() {
		begin("jtt.bytecode.BC_lookupswitch03");
		String runString = null;
		try {
			// (0) == 42
			runString = "(0)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 42
			runString = "(1)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(1)) {
				fail(runString);
				return;
			}
			// (66) == 42
			runString = "(66)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(66)) {
				fail(runString);
				return;
			}
			// (67) == 0
			runString = "(67)";
			if (0 != jtt.bytecode.BC_lookupswitch03.test(67)) {
				fail(runString);
				return;
			}
			// (68) == 42
			runString = "(68)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(68)) {
				fail(runString);
				return;
			}
			// (96) == 42
			runString = "(96)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(96)) {
				fail(runString);
				return;
			}
			// (97) == 1
			runString = "(97)";
			if (1 != jtt.bytecode.BC_lookupswitch03.test(97)) {
				fail(runString);
				return;
			}
			// (98) == 42
			runString = "(98)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(98)) {
				fail(runString);
				return;
			}
			// (106) == 42
			runString = "(106)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(106)) {
				fail(runString);
				return;
			}
			// (107) == 2
			runString = "(107)";
			if (2 != jtt.bytecode.BC_lookupswitch03.test(107)) {
				fail(runString);
				return;
			}
			// (108) == 42
			runString = "(108)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(108)) {
				fail(runString);
				return;
			}
			// (132) == 42
			runString = "(132)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(132)) {
				fail(runString);
				return;
			}
			// (133) == 3
			runString = "(133)";
			if (3 != jtt.bytecode.BC_lookupswitch03.test(133)) {
				fail(runString);
				return;
			}
			// (134) == 42
			runString = "(134)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(134)) {
				fail(runString);
				return;
			}
			// (211) == 42
			runString = "(211)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(211)) {
				fail(runString);
				return;
			}
			// (212) == 4
			runString = "(212)";
			if (4 != jtt.bytecode.BC_lookupswitch03.test(212)) {
				fail(runString);
				return;
			}
			// (213) == 42
			runString = "(213)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(213)) {
				fail(runString);
				return;
			}
			// (-121) == 42
			runString = "(-121)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(-121)) {
				fail(runString);
				return;
			}
			// (-122) == 5
			runString = "(-122)";
			if (5 != jtt.bytecode.BC_lookupswitch03.test(-122)) {
				fail(runString);
				return;
			}
			// (-123) == 42
			runString = "(-123)";
			if (42 != jtt.bytecode.BC_lookupswitch03.test(-123)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lookupswitch04() {
		begin("jtt.bytecode.BC_lookupswitch04");
		String runString = null;
		try {
			// (0) == 42
			runString = "(0)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 42
			runString = "(1)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(1)) {
				fail(runString);
				return;
			}
			// (66) == 42
			runString = "(66)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(66)) {
				fail(runString);
				return;
			}
			// (67) == 0
			runString = "(67)";
			if (0 != jtt.bytecode.BC_lookupswitch04.test(67)) {
				fail(runString);
				return;
			}
			// (68) == 42
			runString = "(68)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(68)) {
				fail(runString);
				return;
			}
			// (96) == 42
			runString = "(96)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(96)) {
				fail(runString);
				return;
			}
			// (97) == 1
			runString = "(97)";
			if (1 != jtt.bytecode.BC_lookupswitch04.test(97)) {
				fail(runString);
				return;
			}
			// (98) == 42
			runString = "(98)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(98)) {
				fail(runString);
				return;
			}
			// (106) == 42
			runString = "(106)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(106)) {
				fail(runString);
				return;
			}
			// (107) == 2
			runString = "(107)";
			if (2 != jtt.bytecode.BC_lookupswitch04.test(107)) {
				fail(runString);
				return;
			}
			// (108) == 42
			runString = "(108)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(108)) {
				fail(runString);
				return;
			}
			// (132) == 42
			runString = "(132)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(132)) {
				fail(runString);
				return;
			}
			// (133) == 3
			runString = "(133)";
			if (3 != jtt.bytecode.BC_lookupswitch04.test(133)) {
				fail(runString);
				return;
			}
			// (134) == 42
			runString = "(134)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(134)) {
				fail(runString);
				return;
			}
			// (211) == 42
			runString = "(211)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(211)) {
				fail(runString);
				return;
			}
			// (212) == 4
			runString = "(212)";
			if (4 != jtt.bytecode.BC_lookupswitch04.test(212)) {
				fail(runString);
				return;
			}
			// (213) == 42
			runString = "(213)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(213)) {
				fail(runString);
				return;
			}
			// (-121) == 42
			runString = "(-121)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(-121)) {
				fail(runString);
				return;
			}
			// (-122) == 5
			runString = "(-122)";
			if (5 != jtt.bytecode.BC_lookupswitch04.test(-122)) {
				fail(runString);
				return;
			}
			// (-123) == 42
			runString = "(-123)";
			if (42 != jtt.bytecode.BC_lookupswitch04.test(-123)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lor() {
		begin("jtt.bytecode.BC_lor");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3L != jtt.bytecode.BC_lor.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1L != jtt.bytecode.BC_lor.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (31,63) == 63
			runString = "(31,63)";
			if (63L != jtt.bytecode.BC_lor.test(31L, 63L)) {
				fail(runString);
				return;
			}
			// (6,4) == 6
			runString = "(6,4)";
			if (6L != jtt.bytecode.BC_lor.test(6L, 4L)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647L != jtt.bytecode.BC_lor.test(-2147483648L, 1L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lrem() {
		begin("jtt.bytecode.BC_lrem");
		String runString = null;
		try {
			// (1,2) == 1
			runString = "(1,2)";
			if (1L != jtt.bytecode.BC_lrem.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (2,-1) == 0
			runString = "(2,-1)";
			if (0L != jtt.bytecode.BC_lrem.test(2L, -1L)) {
				fail(runString);
				return;
			}
			// (256,4) == 0
			runString = "(256,4)";
			if (0L != jtt.bytecode.BC_lrem.test(256L, 4L)) {
				fail(runString);
				return;
			}
			// (135,7) == 2
			runString = "(135,7)";
			if (2L != jtt.bytecode.BC_lrem.test(135L, 7L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lrem2() {
		begin("jtt.bytecode.BC_lrem2");
		String runString = null;
		try {
			// (-9223372036854775808,-1) == 0
			runString = "(-9223372036854775808,-1)";
			if (0L != jtt.bytecode.BC_lrem2.test(-9223372036854775808L, -1)) {
				fail(runString);
				return;
			}
			// (-9223372036854775808,1) == 0
			runString = "(-9223372036854775808,1)";
			if (0L != jtt.bytecode.BC_lrem2.test(-9223372036854775808L, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lreturn() {
		begin("jtt.bytecode.BC_lreturn");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.bytecode.BC_lreturn.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1L != jtt.bytecode.BC_lreturn.test(1L)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if (-1L != jtt.bytecode.BC_lreturn.test(-1L)) {
				fail(runString);
				return;
			}
			// (256) == 256
			runString = "(256)";
			if (256L != jtt.bytecode.BC_lreturn.test(256L)) {
				fail(runString);
				return;
			}
			// (1000000000000) == 1000000000000
			runString = "(1000000000000)";
			if (1000000000000L != jtt.bytecode.BC_lreturn.test(1000000000000L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lshl() {
		begin("jtt.bytecode.BC_lshl");
		String runString = null;
		try {
			// (1,2) == 4
			runString = "(1,2)";
			if (4L != jtt.bytecode.BC_lshl.test(1L, 2)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0L != jtt.bytecode.BC_lshl.test(0L, -1)) {
				fail(runString);
				return;
			}
			// (31,1) == 62
			runString = "(31,1)";
			if (62L != jtt.bytecode.BC_lshl.test(31L, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 96
			runString = "(6,4)";
			if (96L != jtt.bytecode.BC_lshl.test(6L, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -4294967296
			runString = "(-2147483648,1)";
			if (-4294967296L != jtt.bytecode.BC_lshl.test(-2147483648L, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lshr() {
		begin("jtt.bytecode.BC_lshr");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.bytecode.BC_lshr.test(1L, 2)) {
				fail(runString);
				return;
			}
			// (67,2) == 16
			runString = "(67,2)";
			if (16L != jtt.bytecode.BC_lshr.test(67L, 2)) {
				fail(runString);
				return;
			}
			// (31,1) == 15
			runString = "(31,1)";
			if (15L != jtt.bytecode.BC_lshr.test(31L, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 0
			runString = "(6,4)";
			if (0L != jtt.bytecode.BC_lshr.test(6L, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,16) == -32768
			runString = "(-2147483648,16)";
			if (-32768L != jtt.bytecode.BC_lshr.test(-2147483648L, 16)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lsub() {
		begin("jtt.bytecode.BC_lsub");
		String runString = null;
		try {
			// (1,-2) == 3
			runString = "(1,-2)";
			if (3L != jtt.bytecode.BC_lsub.test(1L, -2L)) {
				fail(runString);
				return;
			}
			// (0,1) == -1
			runString = "(0,1)";
			if (-1L != jtt.bytecode.BC_lsub.test(0L, 1L)) {
				fail(runString);
				return;
			}
			// (33,-67) == 100
			runString = "(33,-67)";
			if (100L != jtt.bytecode.BC_lsub.test(33L, -67L)) {
				fail(runString);
				return;
			}
			// (1,1) == 0
			runString = "(1,1)";
			if (0L != jtt.bytecode.BC_lsub.test(1L, 1L)) {
				fail(runString);
				return;
			}
			// (-2147483648,-1) == -2147483647
			runString = "(-2147483648,-1)";
			if (-2147483647L != jtt.bytecode.BC_lsub.test(-2147483648L, -1L)) {
				fail(runString);
				return;
			}
			// (2147483647,-1) == 2147483648
			runString = "(2147483647,-1)";
			if (2147483648L != jtt.bytecode.BC_lsub.test(2147483647L, -1L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lushr() {
		begin("jtt.bytecode.BC_lushr");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.bytecode.BC_lushr.test(1L, 2)) {
				fail(runString);
				return;
			}
			// (67,2) == 16
			runString = "(67,2)";
			if (16L != jtt.bytecode.BC_lushr.test(67L, 2)) {
				fail(runString);
				return;
			}
			// (31,1) == 15
			runString = "(31,1)";
			if (15L != jtt.bytecode.BC_lushr.test(31L, 1)) {
				fail(runString);
				return;
			}
			// (6,4) == 0
			runString = "(6,4)";
			if (0L != jtt.bytecode.BC_lushr.test(6L, 4)) {
				fail(runString);
				return;
			}
			// (-2147483648,16) == 281474976677888
			runString = "(-2147483648,16)";
			if (281474976677888L != jtt.bytecode.BC_lushr
					.test(-2147483648L, 16)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_lxor() {
		begin("jtt.bytecode.BC_lxor");
		String runString = null;
		try {
			// (1,2) == 3
			runString = "(1,2)";
			if (3L != jtt.bytecode.BC_lxor.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (0,-1) == -1
			runString = "(0,-1)";
			if (-1L != jtt.bytecode.BC_lxor.test(0L, -1L)) {
				fail(runString);
				return;
			}
			// (31,63) == 32
			runString = "(31,63)";
			if (32L != jtt.bytecode.BC_lxor.test(31L, 63L)) {
				fail(runString);
				return;
			}
			// (6,4) == 2
			runString = "(6,4)";
			if (2L != jtt.bytecode.BC_lxor.test(6L, 4L)) {
				fail(runString);
				return;
			}
			// (-2147483648,1) == -2147483647
			runString = "(-2147483648,1)";
			if (-2147483647L != jtt.bytecode.BC_lxor.test(-2147483648L, 1L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_monitorenter() {
		begin("jtt.bytecode.BC_monitorenter");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_monitorenter.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_monitorenter.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -2
			runString = "(-2)";
			if (-2 != jtt.bytecode.BC_monitorenter.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_monitorenter02() {
		begin("jtt.bytecode.BC_monitorenter02");
		String runString = null;
		try {
			// (0,1) == 0
			runString = "(0,1)";
			if (0 != jtt.bytecode.BC_monitorenter02.test(0, 1)) {
				fail(runString);
				return;
			}
			// (1,1) == 1
			runString = "(1,1)";
			if (1 != jtt.bytecode.BC_monitorenter02.test(1, 1)) {
				fail(runString);
				return;
			}
			// (-2,1) == -2
			runString = "(-2,1)";
			if (-2 != jtt.bytecode.BC_monitorenter02.test(-2, 1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_multianewarray01() {
		begin("jtt.bytecode.BC_multianewarray01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_multianewarray01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_multianewarray01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_multianewarray02() {
		begin("jtt.bytecode.BC_multianewarray02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_multianewarray02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_multianewarray02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_multianewarray03() {
		begin("jtt.bytecode.BC_multianewarray03");
		String runString = null;
		try {
			// (1) == 4
			runString = "(1)";
			if (4 != jtt.bytecode.BC_multianewarray03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 8
			runString = "(2)";
			if (8 != jtt.bytecode.BC_multianewarray03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 12
			runString = "(3)";
			if (12 != jtt.bytecode.BC_multianewarray03.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_multianewarray04() {
		begin("jtt.bytecode.BC_multianewarray04");
		String runString = null;
		try {
			// (1) == 41
			runString = "(1)";
			if (41 != jtt.bytecode.BC_multianewarray04.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 81
			runString = "(2)";
			if (81 != jtt.bytecode.BC_multianewarray04.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_new() {
		begin("jtt.bytecode.BC_new");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_new.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_newarray() {
		begin("jtt.bytecode.BC_newarray");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_newarray.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_newarray.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_putfield() {
		begin("jtt.bytecode.BC_putfield");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_putfield.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_putfield.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_putfield.test(2)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_putfield.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_putstatic() {
		begin("jtt.bytecode.BC_putstatic");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.bytecode.BC_putstatic.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.bytecode.BC_putstatic.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.bytecode.BC_putstatic.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.bytecode.BC_putstatic.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.bytecode.BC_putstatic.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_saload() {
		begin("jtt.bytecode.BC_saload");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.bytecode.BC_saload.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if ((short) -1 != jtt.bytecode.BC_saload.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if ((short) 4 != jtt.bytecode.BC_saload.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 10000
			runString = "(3)";
			if ((short) 10000 != jtt.bytecode.BC_saload.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_sastore() {
		begin("jtt.bytecode.BC_sastore");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if ((short) 0 != jtt.bytecode.BC_sastore.test(0, (short) 0)) {
				fail(runString);
				return;
			}
			// (1,-1) == -1
			runString = "(1,-1)";
			if ((short) -1 != jtt.bytecode.BC_sastore.test(1, (short) -1)) {
				fail(runString);
				return;
			}
			// (2,11) == 11
			runString = "(2,11)";
			if ((short) 11 != jtt.bytecode.BC_sastore.test(2, (short) 11)) {
				fail(runString);
				return;
			}
			// (3,-14) == -14
			runString = "(3,-14)";
			if ((short) -14 != jtt.bytecode.BC_sastore.test(3, (short) -14)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_tableswitch() {
		begin("jtt.bytecode.BC_tableswitch");
		String runString = null;
		try {
			// (-1) == 42
			runString = "(-1)";
			if (42 != jtt.bytecode.BC_tableswitch.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.bytecode.BC_tableswitch.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 20
			runString = "(1)";
			if (20 != jtt.bytecode.BC_tableswitch.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 30
			runString = "(2)";
			if (30 != jtt.bytecode.BC_tableswitch.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 42
			runString = "(3)";
			if (42 != jtt.bytecode.BC_tableswitch.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 40
			runString = "(4)";
			if (40 != jtt.bytecode.BC_tableswitch.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 50
			runString = "(5)";
			if (50 != jtt.bytecode.BC_tableswitch.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 42
			runString = "(6)";
			if (42 != jtt.bytecode.BC_tableswitch.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_tableswitch2() {
		begin("jtt.bytecode.BC_tableswitch2");
		String runString = null;
		try {
			// (-1) == 11
			runString = "(-1)";
			if (11 != jtt.bytecode.BC_tableswitch2.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.bytecode.BC_tableswitch2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.bytecode.BC_tableswitch2.test(1)) {
				fail(runString);
				return;
			}
			// (5) == 55
			runString = "(5)";
			if (55 != jtt.bytecode.BC_tableswitch2.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 66
			runString = "(6)";
			if (66 != jtt.bytecode.BC_tableswitch2.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 77
			runString = "(7)";
			if (77 != jtt.bytecode.BC_tableswitch2.test(7)) {
				fail(runString);
				return;
			}
			// (8) == 11
			runString = "(8)";
			if (11 != jtt.bytecode.BC_tableswitch2.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_tableswitch3() {
		begin("jtt.bytecode.BC_tableswitch3");
		String runString = null;
		try {
			// (-1) == 11
			runString = "(-1)";
			if (11 != jtt.bytecode.BC_tableswitch3.test(-1)) {
				fail(runString);
				return;
			}
			// (-2) == 22
			runString = "(-2)";
			if (22 != jtt.bytecode.BC_tableswitch3.test(-2)) {
				fail(runString);
				return;
			}
			// (-3) == 99
			runString = "(-3)";
			if (99 != jtt.bytecode.BC_tableswitch3.test(-3)) {
				fail(runString);
				return;
			}
			// (-4) == 99
			runString = "(-4)";
			if (99 != jtt.bytecode.BC_tableswitch3.test(-4)) {
				fail(runString);
				return;
			}
			// (1) == 77
			runString = "(1)";
			if (77 != jtt.bytecode.BC_tableswitch3.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 99
			runString = "(2)";
			if (99 != jtt.bytecode.BC_tableswitch3.test(2)) {
				fail(runString);
				return;
			}
			// (10) == 99
			runString = "(10)";
			if (99 != jtt.bytecode.BC_tableswitch3.test(10)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_tableswitch4() {
		begin("jtt.bytecode.BC_tableswitch4");
		String runString = null;
		try {
			// (-1) == 11
			runString = "(-1)";
			if (11 != jtt.bytecode.BC_tableswitch4.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.bytecode.BC_tableswitch4.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.bytecode.BC_tableswitch4.test(1)) {
				fail(runString);
				return;
			}
			// (-5) == 55
			runString = "(-5)";
			if (55 != jtt.bytecode.BC_tableswitch4.test(-5)) {
				fail(runString);
				return;
			}
			// (-4) == 44
			runString = "(-4)";
			if (44 != jtt.bytecode.BC_tableswitch4.test(-4)) {
				fail(runString);
				return;
			}
			// (-3) == 33
			runString = "(-3)";
			if (33 != jtt.bytecode.BC_tableswitch4.test(-3)) {
				fail(runString);
				return;
			}
			// (-8) == 11
			runString = "(-8)";
			if (11 != jtt.bytecode.BC_tableswitch4.test(-8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_wide01() {
		begin("jtt.bytecode.BC_wide01");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.bytecode.BC_wide01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 12
			runString = "(1)";
			if (12 != jtt.bytecode.BC_wide01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_bytecode_BC_wide02() {
		begin("jtt.bytecode.BC_wide02");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.bytecode.BC_wide02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 12
			runString = "(1)";
			if (12 != jtt.bytecode.BC_wide02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_ArrayLength01() {
		begin("jtt.optimize.ArrayLength01");
		String runString = null;
		try {
			// (0) == 5
			runString = "(0)";
			if (5 != jtt.optimize.ArrayLength01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 6
			runString = "(1)";
			if (6 != jtt.optimize.ArrayLength01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 7
			runString = "(2)";
			if (7 != jtt.optimize.ArrayLength01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 8
			runString = "(3)";
			if (8 != jtt.optimize.ArrayLength01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.optimize.ArrayLength01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_idiv_16() {
		begin("jtt.optimize.BC_idiv_16");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if (0 != jtt.optimize.BC_idiv_16.test(0, 0)) {
				fail(runString);
				return;
			}
			// (0,16) == 1
			runString = "(0,16)";
			if (1 != jtt.optimize.BC_idiv_16.test(0, 16)) {
				fail(runString);
				return;
			}
			// (0,17) == 1
			runString = "(0,17)";
			if (1 != jtt.optimize.BC_idiv_16.test(0, 17)) {
				fail(runString);
				return;
			}
			// (0,-1) == 0
			runString = "(0,-1)";
			if (0 != jtt.optimize.BC_idiv_16.test(0, -1)) {
				fail(runString);
				return;
			}
			// (0,-16) == -1
			runString = "(0,-16)";
			if (-1 != jtt.optimize.BC_idiv_16.test(0, -16)) {
				fail(runString);
				return;
			}
			// (0,-17) == -1
			runString = "(0,-17)";
			if (-1 != jtt.optimize.BC_idiv_16.test(0, -17)) {
				fail(runString);
				return;
			}
			// (0,-1024) == -64
			runString = "(0,-1024)";
			if (-64 != jtt.optimize.BC_idiv_16.test(0, -1024)) {
				fail(runString);
				return;
			}
			// (1,0) == 0
			runString = "(1,0)";
			if (0 != jtt.optimize.BC_idiv_16.test(1, 0)) {
				fail(runString);
				return;
			}
			// (1,16) == 1
			runString = "(1,16)";
			if (1 != jtt.optimize.BC_idiv_16.test(1, 16)) {
				fail(runString);
				return;
			}
			// (1,17) == 1
			runString = "(1,17)";
			if (1 != jtt.optimize.BC_idiv_16.test(1, 17)) {
				fail(runString);
				return;
			}
			// (1,-1) == 0
			runString = "(1,-1)";
			if (0 != jtt.optimize.BC_idiv_16.test(1, -1)) {
				fail(runString);
				return;
			}
			// (1,-16) == -1
			runString = "(1,-16)";
			if (-1 != jtt.optimize.BC_idiv_16.test(1, -16)) {
				fail(runString);
				return;
			}
			// (1,-17) == -1
			runString = "(1,-17)";
			if (-1 != jtt.optimize.BC_idiv_16.test(1, -17)) {
				fail(runString);
				return;
			}
			// (1,-1024) == -64
			runString = "(1,-1024)";
			if (-64 != jtt.optimize.BC_idiv_16.test(1, -1024)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_idiv_4() {
		begin("jtt.optimize.BC_idiv_4");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.optimize.BC_idiv_4.test(0)) {
				fail(runString);
				return;
			}
			// (4) == 1
			runString = "(4)";
			if (1 != jtt.optimize.BC_idiv_4.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 1
			runString = "(5)";
			if (1 != jtt.optimize.BC_idiv_4.test(5)) {
				fail(runString);
				return;
			}
			// (-1) == 0
			runString = "(-1)";
			if (0 != jtt.optimize.BC_idiv_4.test(-1)) {
				fail(runString);
				return;
			}
			// (-4) == -1
			runString = "(-4)";
			if (-1 != jtt.optimize.BC_idiv_4.test(-4)) {
				fail(runString);
				return;
			}
			// (-5) == -1
			runString = "(-5)";
			if (-1 != jtt.optimize.BC_idiv_4.test(-5)) {
				fail(runString);
				return;
			}
			// (-256) == -64
			runString = "(-256)";
			if (-64 != jtt.optimize.BC_idiv_4.test(-256)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_imul_16() {
		begin("jtt.optimize.BC_imul_16");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if (0 != jtt.optimize.BC_imul_16.test(0, 0)) {
				fail(runString);
				return;
			}
			// (0,16) == 256
			runString = "(0,16)";
			if (256 != jtt.optimize.BC_imul_16.test(0, 16)) {
				fail(runString);
				return;
			}
			// (0,17) == 272
			runString = "(0,17)";
			if (272 != jtt.optimize.BC_imul_16.test(0, 17)) {
				fail(runString);
				return;
			}
			// (0,-1) == -16
			runString = "(0,-1)";
			if (-16 != jtt.optimize.BC_imul_16.test(0, -1)) {
				fail(runString);
				return;
			}
			// (0,-16) == -256
			runString = "(0,-16)";
			if (-256 != jtt.optimize.BC_imul_16.test(0, -16)) {
				fail(runString);
				return;
			}
			// (0,-17) == -272
			runString = "(0,-17)";
			if (-272 != jtt.optimize.BC_imul_16.test(0, -17)) {
				fail(runString);
				return;
			}
			// (0,2147483647) == -16
			runString = "(0,2147483647)";
			if (-16 != jtt.optimize.BC_imul_16.test(0, 2147483647)) {
				fail(runString);
				return;
			}
			// (0,-2147483648) == 0
			runString = "(0,-2147483648)";
			if (0 != jtt.optimize.BC_imul_16.test(0, -2147483648)) {
				fail(runString);
				return;
			}
			// (1,0) == 0
			runString = "(1,0)";
			if (0 != jtt.optimize.BC_imul_16.test(1, 0)) {
				fail(runString);
				return;
			}
			// (1,16) == 256
			runString = "(1,16)";
			if (256 != jtt.optimize.BC_imul_16.test(1, 16)) {
				fail(runString);
				return;
			}
			// (1,17) == 272
			runString = "(1,17)";
			if (272 != jtt.optimize.BC_imul_16.test(1, 17)) {
				fail(runString);
				return;
			}
			// (1,-1) == -16
			runString = "(1,-1)";
			if (-16 != jtt.optimize.BC_imul_16.test(1, -1)) {
				fail(runString);
				return;
			}
			// (1,-16) == -256
			runString = "(1,-16)";
			if (-256 != jtt.optimize.BC_imul_16.test(1, -16)) {
				fail(runString);
				return;
			}
			// (1,-17) == -272
			runString = "(1,-17)";
			if (-272 != jtt.optimize.BC_imul_16.test(1, -17)) {
				fail(runString);
				return;
			}
			// (1,2147483647) == -16
			runString = "(1,2147483647)";
			if (-16 != jtt.optimize.BC_imul_16.test(1, 2147483647)) {
				fail(runString);
				return;
			}
			// (1,-2147483648) == 0
			runString = "(1,-2147483648)";
			if (0 != jtt.optimize.BC_imul_16.test(1, -2147483648)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_imul_4() {
		begin("jtt.optimize.BC_imul_4");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.optimize.BC_imul_4.test(0)) {
				fail(runString);
				return;
			}
			// (4) == 16
			runString = "(4)";
			if (16 != jtt.optimize.BC_imul_4.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 20
			runString = "(5)";
			if (20 != jtt.optimize.BC_imul_4.test(5)) {
				fail(runString);
				return;
			}
			// (-1) == -4
			runString = "(-1)";
			if (-4 != jtt.optimize.BC_imul_4.test(-1)) {
				fail(runString);
				return;
			}
			// (-4) == -16
			runString = "(-4)";
			if (-16 != jtt.optimize.BC_imul_4.test(-4)) {
				fail(runString);
				return;
			}
			// (-5) == -20
			runString = "(-5)";
			if (-20 != jtt.optimize.BC_imul_4.test(-5)) {
				fail(runString);
				return;
			}
			// (-256) == -1024
			runString = "(-256)";
			if (-1024 != jtt.optimize.BC_imul_4.test(-256)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_ldiv_16() {
		begin("jtt.optimize.BC_ldiv_16");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.optimize.BC_ldiv_16.test(0L)) {
				fail(runString);
				return;
			}
			// (16) == 1
			runString = "(16)";
			if (1L != jtt.optimize.BC_ldiv_16.test(16L)) {
				fail(runString);
				return;
			}
			// (17) == 1
			runString = "(17)";
			if (1L != jtt.optimize.BC_ldiv_16.test(17L)) {
				fail(runString);
				return;
			}
			// (-1) == 0
			runString = "(-1)";
			if (0L != jtt.optimize.BC_ldiv_16.test(-1L)) {
				fail(runString);
				return;
			}
			// (-16) == -1
			runString = "(-16)";
			if (-1L != jtt.optimize.BC_ldiv_16.test(-16L)) {
				fail(runString);
				return;
			}
			// (-17) == -1
			runString = "(-17)";
			if (-1L != jtt.optimize.BC_ldiv_16.test(-17L)) {
				fail(runString);
				return;
			}
			// (-1024) == -64
			runString = "(-1024)";
			if (-64L != jtt.optimize.BC_ldiv_16.test(-1024L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_ldiv_4() {
		begin("jtt.optimize.BC_ldiv_4");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.optimize.BC_ldiv_4.test(0L)) {
				fail(runString);
				return;
			}
			// (4) == 1
			runString = "(4)";
			if (1L != jtt.optimize.BC_ldiv_4.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == 1
			runString = "(5)";
			if (1L != jtt.optimize.BC_ldiv_4.test(5L)) {
				fail(runString);
				return;
			}
			// (-1) == 0
			runString = "(-1)";
			if (0L != jtt.optimize.BC_ldiv_4.test(-1L)) {
				fail(runString);
				return;
			}
			// (-4) == -1
			runString = "(-4)";
			if (-1L != jtt.optimize.BC_ldiv_4.test(-4L)) {
				fail(runString);
				return;
			}
			// (-5) == -1
			runString = "(-5)";
			if (-1L != jtt.optimize.BC_ldiv_4.test(-5L)) {
				fail(runString);
				return;
			}
			// (-256) == -64
			runString = "(-256)";
			if (-64L != jtt.optimize.BC_ldiv_4.test(-256L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_lmul_16() {
		begin("jtt.optimize.BC_lmul_16");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.optimize.BC_lmul_16.test(0L)) {
				fail(runString);
				return;
			}
			// (16) == 256
			runString = "(16)";
			if (256L != jtt.optimize.BC_lmul_16.test(16L)) {
				fail(runString);
				return;
			}
			// (17) == 272
			runString = "(17)";
			if (272L != jtt.optimize.BC_lmul_16.test(17L)) {
				fail(runString);
				return;
			}
			// (-1) == -16
			runString = "(-1)";
			if (-16L != jtt.optimize.BC_lmul_16.test(-1L)) {
				fail(runString);
				return;
			}
			// (-16) == -256
			runString = "(-16)";
			if (-256L != jtt.optimize.BC_lmul_16.test(-16L)) {
				fail(runString);
				return;
			}
			// (-17) == -272
			runString = "(-17)";
			if (-272L != jtt.optimize.BC_lmul_16.test(-17L)) {
				fail(runString);
				return;
			}
			// (-1024) == -16384
			runString = "(-1024)";
			if (-16384L != jtt.optimize.BC_lmul_16.test(-1024L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_lmul_4() {
		begin("jtt.optimize.BC_lmul_4");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.optimize.BC_lmul_4.test(0L)) {
				fail(runString);
				return;
			}
			// (4) == 16
			runString = "(4)";
			if (16L != jtt.optimize.BC_lmul_4.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == 20
			runString = "(5)";
			if (20L != jtt.optimize.BC_lmul_4.test(5L)) {
				fail(runString);
				return;
			}
			// (-1) == -4
			runString = "(-1)";
			if (-4L != jtt.optimize.BC_lmul_4.test(-1L)) {
				fail(runString);
				return;
			}
			// (-4) == -16
			runString = "(-4)";
			if (-16L != jtt.optimize.BC_lmul_4.test(-4L)) {
				fail(runString);
				return;
			}
			// (-5) == -20
			runString = "(-5)";
			if (-20L != jtt.optimize.BC_lmul_4.test(-5L)) {
				fail(runString);
				return;
			}
			// (-256) == -1024
			runString = "(-256)";
			if (-1024L != jtt.optimize.BC_lmul_4.test(-256L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_lshr_C16() {
		begin("jtt.optimize.BC_lshr_C16");
		String runString = null;
		try {
			// (87224824140) == 1330945
			runString = "(87224824140)";
			if (1330945L != jtt.optimize.BC_lshr_C16.test(87224824140L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_lshr_C24() {
		begin("jtt.optimize.BC_lshr_C24");
		String runString = null;
		try {
			// (87224824140) == 5199
			runString = "(87224824140)";
			if (5199L != jtt.optimize.BC_lshr_C24.test(87224824140L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BC_lshr_C32() {
		begin("jtt.optimize.BC_lshr_C32");
		String runString = null;
		try {
			// (87224824140) == 20
			runString = "(87224824140)";
			if (20L != jtt.optimize.BC_lshr_C32.test(87224824140L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_BlockSkip01() {
		begin("jtt.optimize.BlockSkip01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.BlockSkip01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.BlockSkip01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.BlockSkip01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.optimize.BlockSkip01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.optimize.BlockSkip01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Cmov01() {
		begin("jtt.optimize.Cmov01");
		String runString = null;
		try {
			// (-1,-1) == true
			runString = "(-1,-1)";
			if (true != jtt.optimize.Cmov01.test(-1, -1)) {
				fail(runString);
				return;
			}
			// (1,10) == true
			runString = "(1,10)";
			if (true != jtt.optimize.Cmov01.test(1, 10)) {
				fail(runString);
				return;
			}
			// (1,0) == false
			runString = "(1,0)";
			if (false != jtt.optimize.Cmov01.test(1, 0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_DeadCode01() {
		begin("jtt.optimize.DeadCode01");
		String runString = null;
		try {
			// (0) == 4
			runString = "(0)";
			if (4 != jtt.optimize.DeadCode01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 5
			runString = "(1)";
			if (5 != jtt.optimize.DeadCode01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 6
			runString = "(2)";
			if (6 != jtt.optimize.DeadCode01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 4
			runString = "(3)";
			if (4 != jtt.optimize.DeadCode01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 5
			runString = "(4)";
			if (5 != jtt.optimize.DeadCode01.test(4)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7 != jtt.optimize.DeadCode01.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Cast01() {
		begin("jtt.optimize.Fold_Cast01");
		String runString = null;
		try {
			// (0) == 9
			runString = "(0)";
			if (9 != jtt.optimize.Fold_Cast01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 9
			runString = "(1)";
			if (9 != jtt.optimize.Fold_Cast01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.optimize.Fold_Cast01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Convert01() {
		begin("jtt.optimize.Fold_Convert01");
		String runString = null;
		try {
			// (0) == -128
			runString = "(0)";
			if (-128 != jtt.optimize.Fold_Convert01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -32768
			runString = "(1)";
			if (-32768 != jtt.optimize.Fold_Convert01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 65535
			runString = "(2)";
			if (65535 != jtt.optimize.Fold_Convert01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Convert02() {
		begin("jtt.optimize.Fold_Convert02");
		String runString = null;
		try {
			// (0) == -2147483648
			runString = "(0)";
			if (-2147483648L != jtt.optimize.Fold_Convert02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -33
			runString = "(1)";
			if (-33L != jtt.optimize.Fold_Convert02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -78
			runString = "(2)";
			if (-78L != jtt.optimize.Fold_Convert02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Convert03() {
		begin("jtt.optimize.Fold_Convert03");
		String runString = null;
		try {
			// (0) == 1024.0
			runString = "(0)";
			if (1024.0f != jtt.optimize.Fold_Convert03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -33.0
			runString = "(1)";
			if (-33.0f != jtt.optimize.Fold_Convert03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -78.1
			runString = "(2)";
			if (-78.1f != jtt.optimize.Fold_Convert03.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Convert04() {
		begin("jtt.optimize.Fold_Convert04");
		String runString = null;
		try {
			// (0) == 1024.0
			runString = "(0)";
			if (1024.0 != jtt.optimize.Fold_Convert04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1.25
			runString = "(1)";
			if (-1.25 != jtt.optimize.Fold_Convert04.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Double01() {
		begin("jtt.optimize.Fold_Double01");
		String runString = null;
		try {
			// (0.0) == 10.0
			runString = "(0.0)";
			if (10.0 != jtt.optimize.Fold_Double01.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 11.0
			runString = "(1.0)";
			if (11.0 != jtt.optimize.Fold_Double01.test(1.0)) {
				fail(runString);
				return;
			}
			// (2.0) == 12.0
			runString = "(2.0)";
			if (12.0 != jtt.optimize.Fold_Double01.test(2.0)) {
				fail(runString);
				return;
			}
			// (3.0) == 13.0
			runString = "(3.0)";
			if (13.0 != jtt.optimize.Fold_Double01.test(3.0)) {
				fail(runString);
				return;
			}
			// (4.0) == 14.0
			runString = "(4.0)";
			if (14.0 != jtt.optimize.Fold_Double01.test(4.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Double02() {
		begin("jtt.optimize.Fold_Double02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.Fold_Double02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.Fold_Double02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.Fold_Double02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.optimize.Fold_Double02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.optimize.Fold_Double02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.optimize.Fold_Double02.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Float01() {
		begin("jtt.optimize.Fold_Float01");
		String runString = null;
		try {
			// (0.0) == 10.0
			runString = "(0.0)";
			if (10.0f != jtt.optimize.Fold_Float01.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 11.0
			runString = "(1.0)";
			if (11.0f != jtt.optimize.Fold_Float01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == 12.0
			runString = "(2.0)";
			if (12.0f != jtt.optimize.Fold_Float01.test(2.0f)) {
				fail(runString);
				return;
			}
			// (3.0) == 13.0
			runString = "(3.0)";
			if (13.0f != jtt.optimize.Fold_Float01.test(3.0f)) {
				fail(runString);
				return;
			}
			// (4.0) == 14.0
			runString = "(4.0)";
			if (14.0f != jtt.optimize.Fold_Float01.test(4.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Float02() {
		begin("jtt.optimize.Fold_Float02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.Fold_Float02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.Fold_Float02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.Fold_Float02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.optimize.Fold_Float02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.optimize.Fold_Float02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.optimize.Fold_Float02.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_InstanceOf01() {
		begin("jtt.optimize.Fold_InstanceOf01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.Fold_InstanceOf01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.Fold_InstanceOf01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.optimize.Fold_InstanceOf01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Int01() {
		begin("jtt.optimize.Fold_Int01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Fold_Int01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Fold_Int01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Fold_Int01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13 != jtt.optimize.Fold_Int01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14 != jtt.optimize.Fold_Int01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15 != jtt.optimize.Fold_Int01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16 != jtt.optimize.Fold_Int01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17 != jtt.optimize.Fold_Int01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Int02() {
		begin("jtt.optimize.Fold_Int02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.Fold_Int02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.Fold_Int02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.Fold_Int02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.optimize.Fold_Int02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.optimize.Fold_Int02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.optimize.Fold_Int02.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Long01() {
		begin("jtt.optimize.Fold_Long01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.Fold_Long01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.optimize.Fold_Long01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12L != jtt.optimize.Fold_Long01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13L != jtt.optimize.Fold_Long01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14L != jtt.optimize.Fold_Long01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15L != jtt.optimize.Fold_Long01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16L != jtt.optimize.Fold_Long01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17L != jtt.optimize.Fold_Long01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Long02() {
		begin("jtt.optimize.Fold_Long02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.Fold_Long02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.Fold_Long02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.Fold_Long02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.optimize.Fold_Long02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.optimize.Fold_Long02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.optimize.Fold_Long02.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Fold_Math01() {
		begin("jtt.optimize.Fold_Math01");
		String runString = null;
		try {
			// (0) == 10.0
			runString = "(0)";
			if (10.0 != jtt.optimize.Fold_Math01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0.14943813247359922
			runString = "(1)";
			if (0.14943813247359922 != jtt.optimize.Fold_Math01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 0.9887710779360422
			runString = "(2)";
			if (0.9887710779360422 != jtt.optimize.Fold_Math01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 0.15113521805829508
			runString = "(3)";
			if (0.15113521805829508 != jtt.optimize.Fold_Math01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0.04834938665190287
			runString = "(4)";
			if (0.04834938665190287 != jtt.optimize.Fold_Math01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 12.0
			runString = "(5)";
			if (12.0 != jtt.optimize.Fold_Math01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 1.1474024528375417
			runString = "(6)";
			if (1.1474024528375417 != jtt.optimize.Fold_Math01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == -0.8239087409443188
			runString = "(7)";
			if (-0.8239087409443188 != jtt.optimize.Fold_Math01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == 106.62882057436371
			runString = "(8)";
			if (106.62882057436371 != jtt.optimize.Fold_Math01.test(8)) {
				fail(runString);
				return;
			}
			// (9) == 1.1474024528375417
			runString = "(9)";
			if (1.1474024528375417 != jtt.optimize.Fold_Math01.test(9)) {
				fail(runString);
				return;
			}
			// (10) == -1.0
			runString = "(10)";
			if (-1.0 != jtt.optimize.Fold_Math01.test(10)) {
				fail(runString);
				return;
			}
			// (11) == 2.0
			runString = "(11)";
			if (2.0 != jtt.optimize.Fold_Math01.test(11)) {
				fail(runString);
				return;
			}
			// (12) == 42.0
			runString = "(12)";
			if (42.0 != jtt.optimize.Fold_Math01.test(12)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Inline01() {
		begin("jtt.optimize.Inline01");
		String runString = null;
		try {
			// (0) == 2
			runString = "(0)";
			if (2 != jtt.optimize.Inline01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.optimize.Inline01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Inline02() {
		begin("jtt.optimize.Inline02");
		String runString = null;
		try {
			// (0) == 2
			runString = "(0)";
			if (2 != jtt.optimize.Inline02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 5
			runString = "(1)";
			if (5 != jtt.optimize.Inline02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 8
			runString = "(2)";
			if (8 != jtt.optimize.Inline02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_List_reorder_bug() {
		begin("jtt.optimize.List_reorder_bug");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.List_reorder_bug.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_01() {
		begin("jtt.optimize.NCE_01");
		String runString = null;
		try {
			// (0) == 45
			runString = "(0)";
			if (45 != jtt.optimize.NCE_01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_02() {
		begin("jtt.optimize.NCE_02");
		String runString = null;
		try {
			// (0) == 23
			runString = "(0)";
			if (23 != jtt.optimize.NCE_02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_03() {
		begin("jtt.optimize.NCE_03");
		String runString = null;
		try {
			// (0) == 23
			runString = "(0)";
			if (23 != jtt.optimize.NCE_03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_04() {
		begin("jtt.optimize.NCE_04");
		String runString = null;
		try {
			// (0) == 23
			runString = "(0)";
			if (23 != jtt.optimize.NCE_04.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_FlowSensitive01() {
		begin("jtt.optimize.NCE_FlowSensitive01");
		String runString = null;
		try {
			// (null) == null
			runString = "(null)";
			if (null != jtt.optimize.NCE_FlowSensitive01.test(null)) {
				fail(runString);
				return;
			}
			// ("x") == "x"
			runString = "(\"x\")";
			if (!"x".equals(jtt.optimize.NCE_FlowSensitive01.test("x"))) {
				fail(runString);
				return;
			}
			// ("yay") == "yay"
			runString = "(\"yay\")";
			if (!"yay".equals(jtt.optimize.NCE_FlowSensitive01.test("yay"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_FlowSensitive02() {
		begin("jtt.optimize.NCE_FlowSensitive02");
		String runString = null;
		try {
			// (null) == !java.lang.NullPointerException
			try {
				runString = "(null)";
				jtt.optimize.NCE_FlowSensitive02.test(null);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("x") == "x"
			runString = "(\"x\")";
			if (!"x".equals(jtt.optimize.NCE_FlowSensitive02.test("x"))) {
				fail(runString);
				return;
			}
			// ("yay") == "yay"
			runString = "(\"yay\")";
			if (!"yay".equals(jtt.optimize.NCE_FlowSensitive02.test("yay"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_FlowSensitive03() {
		begin("jtt.optimize.NCE_FlowSensitive03");
		String runString = null;
		try {
			// (null) == "null"
			runString = "(null)";
			if (!"null".equals(jtt.optimize.NCE_FlowSensitive03.test(null))) {
				fail(runString);
				return;
			}
			// ("x") == "x"
			runString = "(\"x\")";
			if (!"x".equals(jtt.optimize.NCE_FlowSensitive03.test("x"))) {
				fail(runString);
				return;
			}
			// ("yay") == "yay"
			runString = "(\"yay\")";
			if (!"yay".equals(jtt.optimize.NCE_FlowSensitive03.test("yay"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_NCE_FlowSensitive04() {
		begin("jtt.optimize.NCE_FlowSensitive04");
		String runString = null;
		try {
			// (null) == "null"
			runString = "(null)";
			if (!"null".equals(jtt.optimize.NCE_FlowSensitive04.test(null))) {
				fail(runString);
				return;
			}
			// ("x") == "x"
			runString = "(\"x\")";
			if (!"x".equals(jtt.optimize.NCE_FlowSensitive04.test("x"))) {
				fail(runString);
				return;
			}
			// ("yay") == "yay"
			runString = "(\"yay\")";
			if (!"yay".equals(jtt.optimize.NCE_FlowSensitive04.test("yay"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_byte01() {
		begin("jtt.optimize.Narrow_byte01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((byte) 0 != jtt.optimize.Narrow_byte01.test((byte) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((byte) 1 != jtt.optimize.Narrow_byte01.test((byte) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((byte) -1 != jtt.optimize.Narrow_byte01.test((byte) -1)) {
				fail(runString);
				return;
			}
			// (110) == 110
			runString = "(110)";
			if ((byte) 110 != jtt.optimize.Narrow_byte01.test((byte) 110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_byte02() {
		begin("jtt.optimize.Narrow_byte02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((byte) 0 != jtt.optimize.Narrow_byte02.test((byte) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((byte) 1 != jtt.optimize.Narrow_byte02.test((byte) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((byte) -1 != jtt.optimize.Narrow_byte02.test((byte) -1)) {
				fail(runString);
				return;
			}
			// (110) == 110
			runString = "(110)";
			if ((byte) 110 != jtt.optimize.Narrow_byte02.test((byte) 110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_byte03() {
		begin("jtt.optimize.Narrow_byte03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((byte) 0 != jtt.optimize.Narrow_byte03.test((byte) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((byte) 1 != jtt.optimize.Narrow_byte03.test((byte) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((byte) -1 != jtt.optimize.Narrow_byte03.test((byte) -1)) {
				fail(runString);
				return;
			}
			// (110) == 110
			runString = "(110)";
			if ((byte) 110 != jtt.optimize.Narrow_byte03.test((byte) 110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_char01() {
		begin("jtt.optimize.Narrow_char01");
		String runString = null;
		try {
			// ('\0') == '\0'
			runString = "('\0')";
			if ((char) 0 != jtt.optimize.Narrow_char01.test((char) 0)) {
				fail(runString);
				return;
			}
			// ('\1') == '\1'
			runString = "('\1')";
			if ((char) 1 != jtt.optimize.Narrow_char01.test((char) 1)) {
				fail(runString);
				return;
			}
			// ('\377') == '\377'
			runString = "('\377')";
			if ((char) 255 != jtt.optimize.Narrow_char01.test((char) 255)) {
				fail(runString);
				return;
			}
			// ('\176750') == '\176750'
			runString = "('\176750')";
			if ((char) 65000 != jtt.optimize.Narrow_char01.test((char) 65000)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_char02() {
		begin("jtt.optimize.Narrow_char02");
		String runString = null;
		try {
			// ('\0') == '\0'
			runString = "('\0')";
			if ((char) 0 != jtt.optimize.Narrow_char02.test((char) 0)) {
				fail(runString);
				return;
			}
			// ('\1') == '\1'
			runString = "('\1')";
			if ((char) 1 != jtt.optimize.Narrow_char02.test((char) 1)) {
				fail(runString);
				return;
			}
			// ('\377') == '\377'
			runString = "('\377')";
			if ((char) 255 != jtt.optimize.Narrow_char02.test((char) 255)) {
				fail(runString);
				return;
			}
			// ('\176750') == '\176750'
			runString = "('\176750')";
			if ((char) 65000 != jtt.optimize.Narrow_char02.test((char) 65000)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_char03() {
		begin("jtt.optimize.Narrow_char03");
		String runString = null;
		try {
			// ('\0') == '\0'
			runString = "('\0')";
			if ((char) 0 != jtt.optimize.Narrow_char03.test((char) 0)) {
				fail(runString);
				return;
			}
			// ('\1') == '\1'
			runString = "('\1')";
			if ((char) 1 != jtt.optimize.Narrow_char03.test((char) 1)) {
				fail(runString);
				return;
			}
			// ('\377') == '\377'
			runString = "('\377')";
			if ((char) 255 != jtt.optimize.Narrow_char03.test((char) 255)) {
				fail(runString);
				return;
			}
			// ('\176750') == '\176750'
			runString = "('\176750')";
			if ((char) 65000 != jtt.optimize.Narrow_char03.test((char) 65000)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_short01() {
		begin("jtt.optimize.Narrow_short01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.optimize.Narrow_short01.test((short) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((short) 1 != jtt.optimize.Narrow_short01.test((short) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((short) -1 != jtt.optimize.Narrow_short01.test((short) -1)) {
				fail(runString);
				return;
			}
			// (23110) == 23110
			runString = "(23110)";
			if ((short) 23110 != jtt.optimize.Narrow_short01
					.test((short) 23110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_short02() {
		begin("jtt.optimize.Narrow_short02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.optimize.Narrow_short02.test((short) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((short) 1 != jtt.optimize.Narrow_short02.test((short) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((short) -1 != jtt.optimize.Narrow_short02.test((short) -1)) {
				fail(runString);
				return;
			}
			// (23110) == 23110
			runString = "(23110)";
			if ((short) 23110 != jtt.optimize.Narrow_short02
					.test((short) 23110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Narrow_short03() {
		begin("jtt.optimize.Narrow_short03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.optimize.Narrow_short03.test((short) 0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((short) 1 != jtt.optimize.Narrow_short03.test((short) 1)) {
				fail(runString);
				return;
			}
			// (-1) == -1
			runString = "(-1)";
			if ((short) -1 != jtt.optimize.Narrow_short03.test((short) -1)) {
				fail(runString);
				return;
			}
			// (23110) == 23110
			runString = "(23110)";
			if ((short) 23110 != jtt.optimize.Narrow_short03
					.test((short) 23110)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Phi01() {
		begin("jtt.optimize.Phi01");
		String runString = null;
		try {
			// (0) == 8
			runString = "(0)";
			if (8 != jtt.optimize.Phi01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 10
			runString = "(1)";
			if (10 != jtt.optimize.Phi01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Phi01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 8
			runString = "(3)";
			if (8 != jtt.optimize.Phi01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 10
			runString = "(4)";
			if (10 != jtt.optimize.Phi01.test(4)) {
				fail(runString);
				return;
			}
			// (6) == 14
			runString = "(6)";
			if (14 != jtt.optimize.Phi01.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Phi02() {
		begin("jtt.optimize.Phi02");
		String runString = null;
		try {
			// (0) == 8
			runString = "(0)";
			if (8 != jtt.optimize.Phi02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 10
			runString = "(1)";
			if (10 != jtt.optimize.Phi02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Phi02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 8
			runString = "(3)";
			if (8 != jtt.optimize.Phi02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 10
			runString = "(4)";
			if (10 != jtt.optimize.Phi02.test(4)) {
				fail(runString);
				return;
			}
			// (6) == 14
			runString = "(6)";
			if (14 != jtt.optimize.Phi02.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Phi03() {
		begin("jtt.optimize.Phi03");
		String runString = null;
		try {
			// (0) == 4
			runString = "(0)";
			if (4 != jtt.optimize.Phi03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 5
			runString = "(1)";
			if (5 != jtt.optimize.Phi03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 6
			runString = "(2)";
			if (6 != jtt.optimize.Phi03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 4
			runString = "(3)";
			if (4 != jtt.optimize.Phi03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 5
			runString = "(4)";
			if (5 != jtt.optimize.Phi03.test(4)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7 != jtt.optimize.Phi03.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Convert01() {
		begin("jtt.optimize.Reduce_Convert01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Reduce_Convert01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Reduce_Convert01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Reduce_Convert01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Double01() {
		begin("jtt.optimize.Reduce_Double01");
		String runString = null;
		try {
			// (0.0) == 10.0
			runString = "(0.0)";
			if (10.0 != jtt.optimize.Reduce_Double01.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 11.0
			runString = "(1.0)";
			if (11.0 != jtt.optimize.Reduce_Double01.test(1.0)) {
				fail(runString);
				return;
			}
			// (2.0) == 12.0
			runString = "(2.0)";
			if (12.0 != jtt.optimize.Reduce_Double01.test(2.0)) {
				fail(runString);
				return;
			}
			// (3.0) == 13.0
			runString = "(3.0)";
			if (13.0 != jtt.optimize.Reduce_Double01.test(3.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Float01() {
		begin("jtt.optimize.Reduce_Float01");
		String runString = null;
		try {
			// (0.0) == 10.0
			runString = "(0.0)";
			if (10.0f != jtt.optimize.Reduce_Float01.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 11.0
			runString = "(1.0)";
			if (11.0f != jtt.optimize.Reduce_Float01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == 12.0
			runString = "(2.0)";
			if (12.0f != jtt.optimize.Reduce_Float01.test(2.0f)) {
				fail(runString);
				return;
			}
			// (3.0) == 13.0
			runString = "(3.0)";
			if (13.0f != jtt.optimize.Reduce_Float01.test(3.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Int01() {
		begin("jtt.optimize.Reduce_Int01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Reduce_Int01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Reduce_Int01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Reduce_Int01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13 != jtt.optimize.Reduce_Int01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14 != jtt.optimize.Reduce_Int01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15 != jtt.optimize.Reduce_Int01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16 != jtt.optimize.Reduce_Int01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17 != jtt.optimize.Reduce_Int01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Int02() {
		begin("jtt.optimize.Reduce_Int02");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Reduce_Int02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Reduce_Int02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Reduce_Int02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13 != jtt.optimize.Reduce_Int02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14 != jtt.optimize.Reduce_Int02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15 != jtt.optimize.Reduce_Int02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16 != jtt.optimize.Reduce_Int02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17 != jtt.optimize.Reduce_Int02.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Int03() {
		begin("jtt.optimize.Reduce_Int03");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Reduce_Int03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.optimize.Reduce_Int03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 25
			runString = "(2)";
			if (25 != jtt.optimize.Reduce_Int03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1 != jtt.optimize.Reduce_Int03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.optimize.Reduce_Int03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15 != jtt.optimize.Reduce_Int03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16 != jtt.optimize.Reduce_Int03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0 != jtt.optimize.Reduce_Int03.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Int04() {
		begin("jtt.optimize.Reduce_Int04");
		String runString = null;
		try {
			// (0) == 40
			runString = "(0)";
			if (40 != jtt.optimize.Reduce_Int04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 655360
			runString = "(1)";
			if (655360 != jtt.optimize.Reduce_Int04.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_IntShift01() {
		begin("jtt.optimize.Reduce_IntShift01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.Reduce_IntShift01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Reduce_IntShift01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Reduce_IntShift01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13 != jtt.optimize.Reduce_IntShift01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14 != jtt.optimize.Reduce_IntShift01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15 != jtt.optimize.Reduce_IntShift01.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_IntShift02() {
		begin("jtt.optimize.Reduce_IntShift02");
		String runString = null;
		try {
			// (0) == 80
			runString = "(0)";
			if (80 != jtt.optimize.Reduce_IntShift02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.optimize.Reduce_IntShift02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12 != jtt.optimize.Reduce_IntShift02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13 != jtt.optimize.Reduce_IntShift02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 64
			runString = "(4)";
			if (64 != jtt.optimize.Reduce_IntShift02.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Long01() {
		begin("jtt.optimize.Reduce_Long01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.Reduce_Long01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.optimize.Reduce_Long01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12L != jtt.optimize.Reduce_Long01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13L != jtt.optimize.Reduce_Long01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14L != jtt.optimize.Reduce_Long01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15L != jtt.optimize.Reduce_Long01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16L != jtt.optimize.Reduce_Long01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17L != jtt.optimize.Reduce_Long01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Long02() {
		begin("jtt.optimize.Reduce_Long02");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.Reduce_Long02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.optimize.Reduce_Long02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12L != jtt.optimize.Reduce_Long02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13L != jtt.optimize.Reduce_Long02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14L != jtt.optimize.Reduce_Long02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15L != jtt.optimize.Reduce_Long02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16L != jtt.optimize.Reduce_Long02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 17
			runString = "(7)";
			if (17L != jtt.optimize.Reduce_Long02.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Long03() {
		begin("jtt.optimize.Reduce_Long03");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.Reduce_Long03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0L != jtt.optimize.Reduce_Long03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 25
			runString = "(2)";
			if (25L != jtt.optimize.Reduce_Long03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1L != jtt.optimize.Reduce_Long03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0L != jtt.optimize.Reduce_Long03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15L != jtt.optimize.Reduce_Long03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 16
			runString = "(6)";
			if (16L != jtt.optimize.Reduce_Long03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0L != jtt.optimize.Reduce_Long03.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_Long04() {
		begin("jtt.optimize.Reduce_Long04");
		String runString = null;
		try {
			// (0) == 40
			runString = "(0)";
			if (40L != jtt.optimize.Reduce_Long04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 85899345920
			runString = "(1)";
			if (85899345920L != jtt.optimize.Reduce_Long04.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_LongShift01() {
		begin("jtt.optimize.Reduce_LongShift01");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.Reduce_LongShift01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.optimize.Reduce_LongShift01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12L != jtt.optimize.Reduce_LongShift01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13L != jtt.optimize.Reduce_LongShift01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 14
			runString = "(4)";
			if (14L != jtt.optimize.Reduce_LongShift01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 15
			runString = "(5)";
			if (15L != jtt.optimize.Reduce_LongShift01.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Reduce_LongShift02() {
		begin("jtt.optimize.Reduce_LongShift02");
		String runString = null;
		try {
			// (0) == 80
			runString = "(0)";
			if (80L != jtt.optimize.Reduce_LongShift02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.optimize.Reduce_LongShift02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 12
			runString = "(2)";
			if (12L != jtt.optimize.Reduce_LongShift02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 13
			runString = "(3)";
			if (13L != jtt.optimize.Reduce_LongShift02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 64
			runString = "(4)";
			if (64L != jtt.optimize.Reduce_LongShift02.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Switch01() {
		begin("jtt.optimize.Switch01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.optimize.Switch01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_Switch02() {
		begin("jtt.optimize.Switch02");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.optimize.Switch02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.optimize.Switch02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_TypeCastElem() {
		begin("jtt.optimize.TypeCastElem");
		String runString = null;
		try {
			// (10,13,25) == 27183
			runString = "(10,13,25)";
			if (27183 != jtt.optimize.TypeCastElem.test(10, 13, 25)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Cast01() {
		begin("jtt.optimize.VN_Cast01");
		String runString = null;
		try {
			// (0) == 18
			runString = "(0)";
			if (18 != jtt.optimize.VN_Cast01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 18
			runString = "(1)";
			if (18 != jtt.optimize.VN_Cast01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.optimize.VN_Cast01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Cast02() {
		begin("jtt.optimize.VN_Cast02");
		String runString = null;
		try {
			// (0) == 18
			runString = "(0)";
			if (18 != jtt.optimize.VN_Cast02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 18
			runString = "(1)";
			if (18 != jtt.optimize.VN_Cast02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.optimize.VN_Cast02.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Convert01() {
		begin("jtt.optimize.VN_Convert01");
		String runString = null;
		try {
			// (0) == 20
			runString = "(0)";
			if (20 != jtt.optimize.VN_Convert01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 22
			runString = "(1)";
			if (22 != jtt.optimize.VN_Convert01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 24
			runString = "(2)";
			if (24 != jtt.optimize.VN_Convert01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Convert02() {
		begin("jtt.optimize.VN_Convert02");
		String runString = null;
		try {
			// (0) == 20
			runString = "(0)";
			if (20 != jtt.optimize.VN_Convert02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 22
			runString = "(1)";
			if (22 != jtt.optimize.VN_Convert02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 24
			runString = "(2)";
			if (24 != jtt.optimize.VN_Convert02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Double01() {
		begin("jtt.optimize.VN_Double01");
		String runString = null;
		try {
			// (0.0) == 22.0
			runString = "(0.0)";
			if (22.0 != jtt.optimize.VN_Double01.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 0.0
			runString = "(1.0)";
			if (0.0 != jtt.optimize.VN_Double01.test(1.0)) {
				fail(runString);
				return;
			}
			// (2.0) == 144.0
			runString = "(2.0)";
			if (144.0 != jtt.optimize.VN_Double01.test(2.0)) {
				fail(runString);
				return;
			}
			// (3.0) == 1.0
			runString = "(3.0)";
			if (1.0 != jtt.optimize.VN_Double01.test(3.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Double02() {
		begin("jtt.optimize.VN_Double02");
		String runString = null;
		try {
			// (0.0) == 22.0
			runString = "(0.0)";
			if (22.0 != jtt.optimize.VN_Double02.test(0.0)) {
				fail(runString);
				return;
			}
			// (1.0) == 0.0
			runString = "(1.0)";
			if (0.0 != jtt.optimize.VN_Double02.test(1.0)) {
				fail(runString);
				return;
			}
			// (2.0) == 144.0
			runString = "(2.0)";
			if (144.0 != jtt.optimize.VN_Double02.test(2.0)) {
				fail(runString);
				return;
			}
			// (3.0) == 1.0
			runString = "(3.0)";
			if (1.0 != jtt.optimize.VN_Double02.test(3.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Field01() {
		begin("jtt.optimize.VN_Field01");
		String runString = null;
		try {
			// (0) == 18
			runString = "(0)";
			if (18 != jtt.optimize.VN_Field01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 18
			runString = "(1)";
			if (18 != jtt.optimize.VN_Field01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.optimize.VN_Field01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Field02() {
		begin("jtt.optimize.VN_Field02");
		String runString = null;
		try {
			// (0) == 18
			runString = "(0)";
			if (18 != jtt.optimize.VN_Field02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 18
			runString = "(1)";
			if (18 != jtt.optimize.VN_Field02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.optimize.VN_Field02.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Float01() {
		begin("jtt.optimize.VN_Float01");
		String runString = null;
		try {
			// (0.0) == 22.0
			runString = "(0.0)";
			if (22.0f != jtt.optimize.VN_Float01.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 0.0
			runString = "(1.0)";
			if (0.0f != jtt.optimize.VN_Float01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == 144.0
			runString = "(2.0)";
			if (144.0f != jtt.optimize.VN_Float01.test(2.0f)) {
				fail(runString);
				return;
			}
			// (3.0) == 1.0
			runString = "(3.0)";
			if (1.0f != jtt.optimize.VN_Float01.test(3.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Float02() {
		begin("jtt.optimize.VN_Float02");
		String runString = null;
		try {
			// (0.0) == 22.0
			runString = "(0.0)";
			if (22.0f != jtt.optimize.VN_Float02.test(0.0f)) {
				fail(runString);
				return;
			}
			// (1.0) == 0.0
			runString = "(1.0)";
			if (0.0f != jtt.optimize.VN_Float02.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == 144.0
			runString = "(2.0)";
			if (144.0f != jtt.optimize.VN_Float02.test(2.0f)) {
				fail(runString);
				return;
			}
			// (3.0) == 1.0
			runString = "(3.0)";
			if (1.0f != jtt.optimize.VN_Float02.test(3.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_InstanceOf01() {
		begin("jtt.optimize.VN_InstanceOf01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.VN_InstanceOf01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.VN_InstanceOf01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.optimize.VN_InstanceOf01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_InstanceOf02() {
		begin("jtt.optimize.VN_InstanceOf02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.VN_InstanceOf02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.VN_InstanceOf02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.optimize.VN_InstanceOf02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_InstanceOf03() {
		begin("jtt.optimize.VN_InstanceOf03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.optimize.VN_InstanceOf03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.optimize.VN_InstanceOf03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.optimize.VN_InstanceOf03.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Int01() {
		begin("jtt.optimize.VN_Int01");
		String runString = null;
		try {
			// (0) == 6
			runString = "(0)";
			if (6 != jtt.optimize.VN_Int01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.optimize.VN_Int01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 36
			runString = "(2)";
			if (36 != jtt.optimize.VN_Int01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1 != jtt.optimize.VN_Int01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.optimize.VN_Int01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5 != jtt.optimize.VN_Int01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7 != jtt.optimize.VN_Int01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0 != jtt.optimize.VN_Int01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Int02() {
		begin("jtt.optimize.VN_Int02");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.optimize.VN_Int02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 10
			runString = "(1)";
			if (10 != jtt.optimize.VN_Int02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 48
			runString = "(2)";
			if (48 != jtt.optimize.VN_Int02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Int03() {
		begin("jtt.optimize.VN_Int03");
		String runString = null;
		try {
			// (0) == 6
			runString = "(0)";
			if (6 != jtt.optimize.VN_Int03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.optimize.VN_Int03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 36
			runString = "(2)";
			if (36 != jtt.optimize.VN_Int03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1 != jtt.optimize.VN_Int03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.optimize.VN_Int03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5 != jtt.optimize.VN_Int03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7 != jtt.optimize.VN_Int03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0 != jtt.optimize.VN_Int03.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Long01() {
		begin("jtt.optimize.VN_Long01");
		String runString = null;
		try {
			// (0) == 6
			runString = "(0)";
			if (6L != jtt.optimize.VN_Long01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0L != jtt.optimize.VN_Long01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 36
			runString = "(2)";
			if (36L != jtt.optimize.VN_Long01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1L != jtt.optimize.VN_Long01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0L != jtt.optimize.VN_Long01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5L != jtt.optimize.VN_Long01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7L != jtt.optimize.VN_Long01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0L != jtt.optimize.VN_Long01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Long02() {
		begin("jtt.optimize.VN_Long02");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10L != jtt.optimize.VN_Long02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 10
			runString = "(1)";
			if (10L != jtt.optimize.VN_Long02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 48
			runString = "(2)";
			if (48L != jtt.optimize.VN_Long02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Long03() {
		begin("jtt.optimize.VN_Long03");
		String runString = null;
		try {
			// (0) == 6
			runString = "(0)";
			if (6L != jtt.optimize.VN_Long03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0L != jtt.optimize.VN_Long03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 36
			runString = "(2)";
			if (36L != jtt.optimize.VN_Long03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1L != jtt.optimize.VN_Long03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0L != jtt.optimize.VN_Long03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5L != jtt.optimize.VN_Long03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 7
			runString = "(6)";
			if (7L != jtt.optimize.VN_Long03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 0
			runString = "(7)";
			if (0L != jtt.optimize.VN_Long03.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_optimize_VN_Loop01() {
		begin("jtt.optimize.VN_Loop01");
		String runString = null;
		try {
			// (0) == 6
			runString = "(0)";
			if (6 != jtt.optimize.VN_Loop01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 8
			runString = "(1)";
			if (8 != jtt.optimize.VN_Loop01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 10
			runString = "(2)";
			if (10 != jtt.optimize.VN_Loop01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 12
			runString = "(3)";
			if (12 != jtt.optimize.VN_Loop01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.optimize.VN_Loop01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_aaload0() {
		begin("jtt.except.BC_aaload0");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_aaload0.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_aaload0.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == null
			runString = "(0)";
			if (null != jtt.except.BC_aaload0.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_aaload1() {
		begin("jtt.except.BC_aaload1");
		String runString = null;
		try {
			// (-2) == null
			runString = "(-2)";
			if (null != jtt.except.BC_aaload1.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_aaload1.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == null
			runString = "(0)";
			if (null != jtt.except.BC_aaload1.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_aastore0() {
		begin("jtt.except.BC_aastore0");
		String runString = null;
		try {
			// (true,-2) == !java.lang.NullPointerException
			try {
				runString = "(true,-2)";
				jtt.except.BC_aastore0.test(true, -2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (true,-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(true,-1)";
				jtt.except.BC_aastore0.test(true, -1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (true,0) == 0
			runString = "(true,0)";
			if (0 != jtt.except.BC_aastore0.test(true, 0)) {
				fail(runString);
				return;
			}
			// (true,1) == 1
			runString = "(true,1)";
			if (1 != jtt.except.BC_aastore0.test(true, 1)) {
				fail(runString);
				return;
			}
			// (true,2) == 2
			runString = "(true,2)";
			if (2 != jtt.except.BC_aastore0.test(true, 2)) {
				fail(runString);
				return;
			}
			// (true,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(true,3)";
				jtt.except.BC_aastore0.test(true, 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (false,0) == !java.lang.ArrayStoreException
			try {
				runString = "(false,0)";
				jtt.except.BC_aastore0.test(false, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayStoreException.class) {
					fail(runString, e);
					return;
				}
			}
			// (false,1) == 1
			runString = "(false,1)";
			if (1 != jtt.except.BC_aastore0.test(false, 1)) {
				fail(runString);
				return;
			}
			// (false,2) == 2
			runString = "(false,2)";
			if (2 != jtt.except.BC_aastore0.test(false, 2)) {
				fail(runString);
				return;
			}
			// (false,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(false,3)";
				jtt.except.BC_aastore0.test(false, 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_aastore1() {
		begin("jtt.except.BC_aastore1");
		String runString = null;
		try {
			// (true,-2) == 5
			runString = "(true,-2)";
			if (5 != jtt.except.BC_aastore1.test(true, -2)) {
				fail(runString);
				return;
			}
			// (true,-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(true,-1)";
				jtt.except.BC_aastore1.test(true, -1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (true,0) == 0
			runString = "(true,0)";
			if (0 != jtt.except.BC_aastore1.test(true, 0)) {
				fail(runString);
				return;
			}
			// (true,1) == 1
			runString = "(true,1)";
			if (1 != jtt.except.BC_aastore1.test(true, 1)) {
				fail(runString);
				return;
			}
			// (true,2) == 2
			runString = "(true,2)";
			if (2 != jtt.except.BC_aastore1.test(true, 2)) {
				fail(runString);
				return;
			}
			// (true,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(true,3)";
				jtt.except.BC_aastore1.test(true, 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (false,0) == !java.lang.ArrayStoreException
			try {
				runString = "(false,0)";
				jtt.except.BC_aastore1.test(false, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayStoreException.class) {
					fail(runString, e);
					return;
				}
			}
			// (false,1) == 1
			runString = "(false,1)";
			if (1 != jtt.except.BC_aastore1.test(false, 1)) {
				fail(runString);
				return;
			}
			// (false,2) == 2
			runString = "(false,2)";
			if (2 != jtt.except.BC_aastore1.test(false, 2)) {
				fail(runString);
				return;
			}
			// (false,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(false,3)";
				jtt.except.BC_aastore1.test(false, 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_anewarray() {
		begin("jtt.except.BC_anewarray");
		String runString = null;
		try {
			// (-1) == !java.lang.NegativeArraySizeException
			try {
				runString = "(-1)";
				jtt.except.BC_anewarray.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NegativeArraySizeException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.BC_anewarray.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_arraylength() {
		begin("jtt.except.BC_arraylength");
		String runString = null;
		try {
			// (0) == !java.lang.NullPointerException
			try {
				runString = "(0)";
				jtt.except.BC_arraylength.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.except.BC_arraylength.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 4
			runString = "(2)";
			if (4 != jtt.except.BC_arraylength.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 5
			runString = "(3)";
			if (5 != jtt.except.BC_arraylength.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 42
			runString = "(4)";
			if (42 != jtt.except.BC_arraylength.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_athrow0() {
		begin("jtt.except.BC_athrow0");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_athrow0.test(0)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.Throwable
			try {
				runString = "(2)";
				jtt.except.BC_athrow0.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Throwable.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_athrow1() {
		begin("jtt.except.BC_athrow1");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_athrow1.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.BC_athrow1.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.Throwable
			try {
				runString = "(2)";
				jtt.except.BC_athrow1.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Throwable.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.except.BC_athrow1.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_athrow2() {
		begin("jtt.except.BC_athrow2");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_athrow2.test(0)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.Throwable
			try {
				runString = "(2)";
				jtt.except.BC_athrow2.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Throwable.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.except.BC_athrow2.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_athrow3() {
		begin("jtt.except.BC_athrow3");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_athrow3.test(0)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.Throwable
			try {
				runString = "(2)";
				jtt.except.BC_athrow3.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Throwable.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.except.BC_athrow3.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_baload() {
		begin("jtt.except.BC_baload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_baload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_baload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.BC_baload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_baload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_bastore() {
		begin("jtt.except.BC_bastore");
		String runString = null;
		try {
			// (-2,true) == !java.lang.NullPointerException
			try {
				runString = "(-2,true)";
				jtt.except.BC_bastore.test(-2, true);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,false) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,false)";
				jtt.except.BC_bastore.test(-1, false);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,true) == true
			runString = "(0,true)";
			if (true != jtt.except.BC_bastore.test(0, true)) {
				fail(runString);
				return;
			}
			// (4,true) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,true)";
				jtt.except.BC_bastore.test(4, true);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_caload() {
		begin("jtt.except.BC_caload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_caload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_caload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == '\0'
			runString = "(0)";
			if ((char) 0 != jtt.except.BC_caload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_caload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_castore() {
		begin("jtt.except.BC_castore");
		String runString = null;
		try {
			// (-2,'a') == !java.lang.NullPointerException
			try {
				runString = "(-2,'a')";
				jtt.except.BC_castore.test(-2, (char) 97);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,'c') == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,'c')";
				jtt.except.BC_castore.test(-1, (char) 99);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,'a') == 'a'
			runString = "(0,'a')";
			if ((char) 97 != jtt.except.BC_castore.test(0, (char) 97)) {
				fail(runString);
				return;
			}
			// (4,'a') == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,'a')";
				jtt.except.BC_castore.test(4, (char) 97);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast() {
		begin("jtt.except.BC_checkcast");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_checkcast.test(0)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassCastException
			try {
				runString = "(2)";
				jtt.except.BC_checkcast.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.ClassCastException
			try {
				runString = "(3)";
				jtt.except.BC_checkcast.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast1() {
		begin("jtt.except.BC_checkcast1");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_checkcast1.test(0)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassCastException
			try {
				runString = "(2)";
				jtt.except.BC_checkcast1.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.ClassCastException
			try {
				runString = "(3)";
				jtt.except.BC_checkcast1.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast1.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast2() {
		begin("jtt.except.BC_checkcast2");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.BC_checkcast2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.BC_checkcast2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassCastException
			try {
				runString = "(2)";
				jtt.except.BC_checkcast2.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.ClassCastException
			try {
				runString = "(3)";
				jtt.except.BC_checkcast2.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast2.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast3() {
		begin("jtt.except.BC_checkcast3");
		String runString = null;
		try {
			// (0) == !java.lang.ClassCastException
			try {
				runString = "(0)";
				jtt.except.BC_checkcast3.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == !java.lang.ClassCastException
			try {
				runString = "(1)";
				jtt.except.BC_checkcast3.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (2) == -1
			runString = "(2)";
			if (-1 != jtt.except.BC_checkcast3.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -1
			runString = "(3)";
			if (-1 != jtt.except.BC_checkcast3.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast4() {
		begin("jtt.except.BC_checkcast4");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.BC_checkcast4.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.BC_checkcast4.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassCastException
			try {
				runString = "(2)";
				jtt.except.BC_checkcast4.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.ClassCastException
			try {
				runString = "(3)";
				jtt.except.BC_checkcast4.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast4.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast5() {
		begin("jtt.except.BC_checkcast5");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.BC_checkcast5.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.BC_checkcast5.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -5
			runString = "(2)";
			if (-5 != jtt.except.BC_checkcast5.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -5
			runString = "(3)";
			if (-5 != jtt.except.BC_checkcast5.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast5.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_checkcast6() {
		begin("jtt.except.BC_checkcast6");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.BC_checkcast6.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.BC_checkcast6.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -5
			runString = "(2)";
			if (-5 != jtt.except.BC_checkcast6.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -5
			runString = "(3)";
			if (-5 != jtt.except.BC_checkcast6.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.BC_checkcast6.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_daload() {
		begin("jtt.except.BC_daload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_daload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_daload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0.0
			runString = "(0)";
			if (0.0 != jtt.except.BC_daload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_daload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_dastore() {
		begin("jtt.except.BC_dastore");
		String runString = null;
		try {
			// (-2,0.01) == !java.lang.NullPointerException
			try {
				runString = "(-2,0.01)";
				jtt.except.BC_dastore.test(-2, 0.01);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,-1.4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,-1.4)";
				jtt.except.BC_dastore.test(-1, -1.4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,0.01) == 0.01
			runString = "(0,0.01)";
			if (0.01 != jtt.except.BC_dastore.test(0, 0.01)) {
				fail(runString);
				return;
			}
			// (4,0.01) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,0.01)";
				jtt.except.BC_dastore.test(4, 0.01);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_faload() {
		begin("jtt.except.BC_faload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_faload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_faload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0.0
			runString = "(0)";
			if (0.0f != jtt.except.BC_faload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_faload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_fastore() {
		begin("jtt.except.BC_fastore");
		String runString = null;
		try {
			// (-2,0.01) == !java.lang.NullPointerException
			try {
				runString = "(-2,0.01)";
				jtt.except.BC_fastore.test(-2, 0.01f);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,-1.4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,-1.4)";
				jtt.except.BC_fastore.test(-1, -1.4f);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,0.01) == 0.01
			runString = "(0,0.01)";
			if (0.01f != jtt.except.BC_fastore.test(0, 0.01f)) {
				fail(runString);
				return;
			}
			// (4,0.01) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,0.01)";
				jtt.except.BC_fastore.test(4, 0.01f);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_getfield() {
		begin("jtt.except.BC_getfield");
		String runString = null;
		try {
			// (0) == 13
			runString = "(0)";
			if (13 != jtt.except.BC_getfield.test(0)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.except.BC_getfield.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_iaload() {
		begin("jtt.except.BC_iaload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_iaload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_iaload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_iaload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_iaload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_iastore() {
		begin("jtt.except.BC_iastore");
		String runString = null;
		try {
			// (-2,0) == !java.lang.NullPointerException
			try {
				runString = "(-2,0)";
				jtt.except.BC_iastore.test(-2, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,3)";
				jtt.except.BC_iastore.test(-1, 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,0) == 0
			runString = "(0,0)";
			if (0 != jtt.except.BC_iastore.test(0, 0)) {
				fail(runString);
				return;
			}
			// (4,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,0)";
				jtt.except.BC_iastore.test(4, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_idiv() {
		begin("jtt.except.BC_idiv");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.except.BC_idiv.test(1, 2)) {
				fail(runString);
				return;
			}
			// (11,0) == !java.lang.ArithmeticException
			try {
				runString = "(11,0)";
				jtt.except.BC_idiv.test(11, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArithmeticException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_idiv2() {
		begin("jtt.except.BC_idiv2");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0 != jtt.except.BC_idiv2.test(1, 2)) {
				fail(runString);
				return;
			}
			// (11,0) == -11
			runString = "(11,0)";
			if (-11 != jtt.except.BC_idiv2.test(11, 0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_invokespecial01() {
		begin("jtt.except.BC_invokespecial01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.BC_invokespecial01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.NullPointerException
			try {
				runString = "(1)";
				jtt.except.BC_invokespecial01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_invokevirtual01() {
		begin("jtt.except.BC_invokevirtual01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.BC_invokevirtual01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.NullPointerException
			try {
				runString = "(1)";
				jtt.except.BC_invokevirtual01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_invokevirtual02() {
		begin("jtt.except.BC_invokevirtual02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.BC_invokevirtual02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.NullPointerException
			try {
				runString = "(1)";
				jtt.except.BC_invokevirtual02.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_irem() {
		begin("jtt.except.BC_irem");
		String runString = null;
		try {
			// (1,2) == 1
			runString = "(1,2)";
			if (1 != jtt.except.BC_irem.test(1, 2)) {
				fail(runString);
				return;
			}
			// (11,0) == !java.lang.ArithmeticException
			try {
				runString = "(11,0)";
				jtt.except.BC_irem.test(11, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArithmeticException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_laload() {
		begin("jtt.except.BC_laload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_laload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_laload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.except.BC_laload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_laload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_lastore() {
		begin("jtt.except.BC_lastore");
		String runString = null;
		try {
			// (-2,0) == !java.lang.NullPointerException
			try {
				runString = "(-2,0)";
				jtt.except.BC_lastore.test(-2, 0L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,3)";
				jtt.except.BC_lastore.test(-1, 3L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,0) == 0
			runString = "(0,0)";
			if (0L != jtt.except.BC_lastore.test(0, 0L)) {
				fail(runString);
				return;
			}
			// (4,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,0)";
				jtt.except.BC_lastore.test(4, 0L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_ldiv() {
		begin("jtt.except.BC_ldiv");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.except.BC_ldiv.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (11,0) == !java.lang.ArithmeticException
			try {
				runString = "(11,0)";
				jtt.except.BC_ldiv.test(11L, 0L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArithmeticException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_ldiv2() {
		begin("jtt.except.BC_ldiv2");
		String runString = null;
		try {
			// (1,2) == 0
			runString = "(1,2)";
			if (0L != jtt.except.BC_ldiv2.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (11,0) == -11
			runString = "(11,0)";
			if (-11L != jtt.except.BC_ldiv2.test(11L, 0L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_lrem() {
		begin("jtt.except.BC_lrem");
		String runString = null;
		try {
			// (1,2) == 1
			runString = "(1,2)";
			if (1L != jtt.except.BC_lrem.test(1L, 2L)) {
				fail(runString);
				return;
			}
			// (11,0) == !java.lang.ArithmeticException
			try {
				runString = "(11,0)";
				jtt.except.BC_lrem.test(11L, 0L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArithmeticException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_monitorenter() {
		begin("jtt.except.BC_monitorenter");
		String runString = null;
		try {
			// (true) == true
			runString = "(true)";
			if (true != jtt.except.BC_monitorenter.test(true)) {
				fail(runString);
				return;
			}
			// (false) == !java.lang.NullPointerException
			try {
				runString = "(false)";
				jtt.except.BC_monitorenter.test(false);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_multianewarray() {
		begin("jtt.except.BC_multianewarray");
		String runString = null;
		try {
			// (0,0) == 0
			runString = "(0,0)";
			if (0 != jtt.except.BC_multianewarray.test(0, 0)) {
				fail(runString);
				return;
			}
			// (1,1) == 1
			runString = "(1,1)";
			if (1 != jtt.except.BC_multianewarray.test(1, 1)) {
				fail(runString);
				return;
			}
			// (-1,0) == !java.lang.NegativeArraySizeException
			try {
				runString = "(-1,0)";
				jtt.except.BC_multianewarray.test(-1, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NegativeArraySizeException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,-1) == !java.lang.NegativeArraySizeException
			try {
				runString = "(0,-1)";
				jtt.except.BC_multianewarray.test(0, -1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NegativeArraySizeException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_newarray() {
		begin("jtt.except.BC_newarray");
		String runString = null;
		try {
			// (-1) == !java.lang.NegativeArraySizeException
			try {
				runString = "(-1)";
				jtt.except.BC_newarray.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NegativeArraySizeException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_newarray.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.BC_newarray.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_putfield() {
		begin("jtt.except.BC_putfield");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.BC_putfield.test(0)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.except.BC_putfield.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.except.BC_putfield.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_saload() {
		begin("jtt.except.BC_saload");
		String runString = null;
		try {
			// (-2) == !java.lang.NullPointerException
			try {
				runString = "(-2)";
				jtt.except.BC_saload.test(-2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1)";
				jtt.except.BC_saload.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.except.BC_saload.test(0)) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.except.BC_saload.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_BC_sastore() {
		begin("jtt.except.BC_sastore");
		String runString = null;
		try {
			// (-2,0) == !java.lang.NullPointerException
			try {
				runString = "(-2,0)";
				jtt.except.BC_sastore.test(-2, (short) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (-1,3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(-1,3)";
				jtt.except.BC_sastore.test(-1, (short) 3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0,0) == 0
			runString = "(0,0)";
			if ((short) 0 != jtt.except.BC_sastore.test(0, (short) 0)) {
				fail(runString);
				return;
			}
			// (4,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4,0)";
				jtt.except.BC_sastore.test(4, (short) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_Loop01() {
		begin("jtt.except.Catch_Loop01");
		String runString = null;
		try {
			// (4) == -170
			runString = "(4)";
			if (-170 != jtt.except.Catch_Loop01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == -150
			runString = "(5)";
			if (-150 != jtt.except.Catch_Loop01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == -140
			runString = "(6)";
			if (-140 != jtt.except.Catch_Loop01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == -240
			runString = "(7)";
			if (-240 != jtt.except.Catch_Loop01.test(7)) {
				fail(runString);
				return;
			}
			// (30) == -700
			runString = "(30)";
			if (-700 != jtt.except.Catch_Loop01.test(30)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_Loop02() {
		begin("jtt.except.Catch_Loop02");
		String runString = null;
		try {
			// (4) == -170
			runString = "(4)";
			if (-170 != jtt.except.Catch_Loop02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == -150
			runString = "(5)";
			if (-150 != jtt.except.Catch_Loop02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == -140
			runString = "(6)";
			if (-140 != jtt.except.Catch_Loop02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == -240
			runString = "(7)";
			if (-240 != jtt.except.Catch_Loop02.test(7)) {
				fail(runString);
				return;
			}
			// (30) == -700
			runString = "(30)";
			if (-700 != jtt.except.Catch_Loop02.test(30)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NASE_1() {
		begin("jtt.except.Catch_NASE_1");
		String runString = null;
		try {
			// (-1) == 100
			runString = "(-1)";
			if (100 != jtt.except.Catch_NASE_1.test(-1)) {
				fail(runString);
				return;
			}
			// (-34) == 100
			runString = "(-34)";
			if (100 != jtt.except.Catch_NASE_1.test(-34)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NASE_2() {
		begin("jtt.except.Catch_NASE_2");
		String runString = null;
		try {
			// (-1) == 100
			runString = "(-1)";
			if (100 != jtt.except.Catch_NASE_2.test(-1)) {
				fail(runString);
				return;
			}
			// (-34) == 100
			runString = "(-34)";
			if (100 != jtt.except.Catch_NASE_2.test(-34)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_00() {
		begin("jtt.except.Catch_NPE_00");
		String runString = null;
		try {
			// (-3) == -1
			runString = "(-3)";
			if (-1 != jtt.except.Catch_NPE_00.test(-3)) {
				fail(runString);
				return;
			}
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.Catch_NPE_00.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.except.Catch_NPE_00.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 3
			runString = "(2)";
			if (3 != jtt.except.Catch_NPE_00.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_01() {
		begin("jtt.except.Catch_NPE_01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_01.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.Catch_NPE_01.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_02() {
		begin("jtt.except.Catch_NPE_02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_02.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.Catch_NPE_02.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_03() {
		begin("jtt.except.Catch_NPE_03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_03.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.Catch_NPE_03.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_04() {
		begin("jtt.except.Catch_NPE_04");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_04.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.Catch_NPE_04.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_05() {
		begin("jtt.except.Catch_NPE_05");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_05.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_05.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.Catch_NPE_05.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_06() {
		begin("jtt.except.Catch_NPE_06");
		String runString = null;
		try {
			// ("") == 0
			runString = "(\"\")";
			if (0 != jtt.except.Catch_NPE_06.test("")) {
				fail(runString);
				return;
			}
			// (null) == -1
			runString = "(null)";
			if (-1 != jtt.except.Catch_NPE_06.test(null)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_07() {
		begin("jtt.except.Catch_NPE_07");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_07.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_07.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_08() {
		begin("jtt.except.Catch_NPE_08");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_NPE_08.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.Catch_NPE_08.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -2
			runString = "(-2)";
			if (-2 != jtt.except.Catch_NPE_08.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_09() {
		begin("jtt.except.Catch_NPE_09");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.except.Catch_NPE_09.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.except.Catch_NPE_09.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 1
			runString = "(2)";
			if (1 != jtt.except.Catch_NPE_09.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_10() {
		begin("jtt.except.Catch_NPE_10");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.except.Catch_NPE_10.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.except.Catch_NPE_10.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 1
			runString = "(2)";
			if (1 != jtt.except.Catch_NPE_10.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_NPE_11() {
		begin("jtt.except.Catch_NPE_11");
		String runString = null;
		try {
			// (0) == 10
			runString = "(0)";
			if (10 != jtt.except.Catch_NPE_11.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.except.Catch_NPE_11.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 1
			runString = "(2)";
			if (1 != jtt.except.Catch_NPE_11.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_StackOverflowError_01() {
		begin("jtt.except.Catch_StackOverflowError_01");
		String runString = null;
		try {
			// (0) == !java.lang.StackOverflowError
			try {
				runString = "(0)";
				jtt.except.Catch_StackOverflowError_01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.StackOverflowError.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_StackOverflowError_02() {
		begin("jtt.except.Catch_StackOverflowError_02");
		String runString = null;
		try {
			// (0) == !java.lang.StackOverflowError
			try {
				runString = "(0)";
				jtt.except.Catch_StackOverflowError_02.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.StackOverflowError.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_StackOverflowError_03() {
		begin("jtt.except.Catch_StackOverflowError_03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Catch_StackOverflowError_03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_Two01() {
		begin("jtt.except.Catch_Two01");
		String runString = null;
		try {
			// (0) == "java.lang.NullPointerException"
			runString = "(0)";
			if (!"java.lang.NullPointerException".equals(jtt.except.Catch_Two01
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "java.lang.ArithmeticException"
			runString = "(1)";
			if (!"java.lang.ArithmeticException".equals(jtt.except.Catch_Two01
					.test(1))) {
				fail(runString);
				return;
			}
			// (3) == "none"
			runString = "(3)";
			if (!"none".equals(jtt.except.Catch_Two01.test(3))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_Two02() {
		begin("jtt.except.Catch_Two02");
		String runString = null;
		try {
			// (0) == "java.lang.NullPointerException"
			runString = "(0)";
			if (!"java.lang.NullPointerException".equals(jtt.except.Catch_Two02
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "java.lang.ArithmeticException"
			runString = "(1)";
			if (!"java.lang.ArithmeticException".equals(jtt.except.Catch_Two02
					.test(1))) {
				fail(runString);
				return;
			}
			// (3) == "none13"
			runString = "(3)";
			if (!"none13".equals(jtt.except.Catch_Two02.test(3))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Catch_Two03() {
		begin("jtt.except.Catch_Two03");
		String runString = null;
		try {
			// (0) == "none4"
			runString = "(0)";
			if (!"none4".equals(jtt.except.Catch_Two03.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "none4"
			runString = "(1)";
			if (!"none4".equals(jtt.except.Catch_Two03.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "java.lang.NullPointerException3"
			runString = "(2)";
			if (!"java.lang.NullPointerException3"
					.equals(jtt.except.Catch_Two03.test(2))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Except_Synchronized01() {
		begin("jtt.except.Except_Synchronized01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Except_Synchronized01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Except_Synchronized01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Except_Synchronized02() {
		begin("jtt.except.Except_Synchronized02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Except_Synchronized02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Except_Synchronized02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Except_Synchronized03() {
		begin("jtt.except.Except_Synchronized03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Except_Synchronized03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Except_Synchronized03.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Except_Synchronized04() {
		begin("jtt.except.Except_Synchronized04");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Except_Synchronized04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Except_Synchronized04.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Except_Synchronized05() {
		begin("jtt.except.Except_Synchronized05");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.Except_Synchronized05.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Except_Synchronized05.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Finally01() {
		begin("jtt.except.Finally01");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.Finally01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.Finally01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Finally02() {
		begin("jtt.except.Finally02");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.Finally02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.except.Finally02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_AIOOBE_00() {
		begin("jtt.except.StackTrace_AIOOBE_00");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.StackTrace_AIOOBE_00.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.except.StackTrace_AIOOBE_00.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.StackTrace_AIOOBE_00.test(-2)) {
				fail(runString);
				return;
			}
			// (3) == -1
			runString = "(3)";
			if (-1 != jtt.except.StackTrace_AIOOBE_00.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_CCE_00() {
		begin("jtt.except.StackTrace_CCE_00");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.StackTrace_CCE_00.test(0)) {
				fail(runString);
				return;
			}
			// (2) == -100
			runString = "(2)";
			if (-100 != jtt.except.StackTrace_CCE_00.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -100
			runString = "(3)";
			if (-100 != jtt.except.StackTrace_CCE_00.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.except.StackTrace_CCE_00.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_NPE_00() {
		begin("jtt.except.StackTrace_NPE_00");
		String runString = null;
		try {
			// (-3) == -1
			runString = "(-3)";
			if (-1 != jtt.except.StackTrace_NPE_00.test(-3)) {
				fail(runString);
				return;
			}
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.except.StackTrace_NPE_00.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.except.StackTrace_NPE_00.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 3
			runString = "(2)";
			if (3 != jtt.except.StackTrace_NPE_00.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_NPE_01() {
		begin("jtt.except.StackTrace_NPE_01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.StackTrace_NPE_01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.except.StackTrace_NPE_01.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.StackTrace_NPE_01.test(-2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_NPE_02() {
		begin("jtt.except.StackTrace_NPE_02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.StackTrace_NPE_02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.except.StackTrace_NPE_02.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.StackTrace_NPE_02.test(-2)) {
				fail(runString);
				return;
			}
			// (3) == 0
			runString = "(3)";
			if (0 != jtt.except.StackTrace_NPE_02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_StackTrace_NPE_03() {
		begin("jtt.except.StackTrace_NPE_03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.except.StackTrace_NPE_03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.except.StackTrace_NPE_03.test(1)) {
				fail(runString);
				return;
			}
			// (-2) == -1
			runString = "(-2)";
			if (-1 != jtt.except.StackTrace_NPE_03.test(-2)) {
				fail(runString);
				return;
			}
			// (3) == 0
			runString = "(3)";
			if (0 != jtt.except.StackTrace_NPE_03.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_InCatch01() {
		begin("jtt.except.Throw_InCatch01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_InCatch01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_InCatch01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_InCatch02() {
		begin("jtt.except.Throw_InCatch02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_InCatch02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_InCatch02.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_InCatch03() {
		begin("jtt.except.Throw_InCatch03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_InCatch03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_InCatch03.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_NPE_01() {
		begin("jtt.except.Throw_NPE_01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.except.Throw_NPE_01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if (2 != jtt.except.Throw_NPE_01.test(1)) {
				fail(runString);
				return;
			}
			// (-1) == !java.lang.NullPointerException
			try {
				runString = "(-1)";
				jtt.except.Throw_NPE_01.test(-1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_Synchronized01() {
		begin("jtt.except.Throw_Synchronized01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_Synchronized01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_Synchronized01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_Synchronized02() {
		begin("jtt.except.Throw_Synchronized02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_Synchronized02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_Synchronized02.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_Synchronized03() {
		begin("jtt.except.Throw_Synchronized03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_Synchronized03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_Synchronized03.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_Synchronized04() {
		begin("jtt.except.Throw_Synchronized04");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_Synchronized04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_Synchronized04.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_except_Throw_Synchronized05() {
		begin("jtt.except.Throw_Synchronized05");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.except.Throw_Synchronized05.test(0)) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.Exception
			try {
				runString = "(1)";
				jtt.except.Throw_Synchronized05.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Boxed_TYPE_01() {
		begin("jtt.lang.Boxed_TYPE_01");
		String runString = null;
		try {
			// (0) == "boolean"
			runString = "(0)";
			if (!"boolean".equals(jtt.lang.Boxed_TYPE_01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "byte"
			runString = "(1)";
			if (!"byte".equals(jtt.lang.Boxed_TYPE_01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "char"
			runString = "(2)";
			if (!"char".equals(jtt.lang.Boxed_TYPE_01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == "double"
			runString = "(3)";
			if (!"double".equals(jtt.lang.Boxed_TYPE_01.test(3))) {
				fail(runString);
				return;
			}
			// (4) == "float"
			runString = "(4)";
			if (!"float".equals(jtt.lang.Boxed_TYPE_01.test(4))) {
				fail(runString);
				return;
			}
			// (5) == "int"
			runString = "(5)";
			if (!"int".equals(jtt.lang.Boxed_TYPE_01.test(5))) {
				fail(runString);
				return;
			}
			// (6) == "long"
			runString = "(6)";
			if (!"long".equals(jtt.lang.Boxed_TYPE_01.test(6))) {
				fail(runString);
				return;
			}
			// (7) == "short"
			runString = "(7)";
			if (!"short".equals(jtt.lang.Boxed_TYPE_01.test(7))) {
				fail(runString);
				return;
			}
			// (8) == "void"
			runString = "(8)";
			if (!"void".equals(jtt.lang.Boxed_TYPE_01.test(8))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Bridge_method01() {
		begin("jtt.lang.Bridge_method01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.lang.Bridge_method01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.lang.Bridge_method01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_ClassLoader_loadClass01() {
		begin("jtt.lang.ClassLoader_loadClass01");
		String runString = null;
		try {
			// (0) == "class java.lang.String"
			runString = "(0)";
			if (!"class java.lang.String"
					.equals(jtt.lang.ClassLoader_loadClass01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == !java.lang.ClassNotFoundException
			try {
				runString = "(1)";
				jtt.lang.ClassLoader_loadClass01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (2) == !java.lang.ClassNotFoundException
			try {
				runString = "(2)";
				jtt.lang.ClassLoader_loadClass01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_Literal01() {
		begin("jtt.lang.Class_Literal01");
		String runString = null;
		try {
			// (0) == "class java.lang.Object"
			runString = "(0)";
			if (!"class java.lang.Object".equals(jtt.lang.Class_Literal01
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "class java.lang.String"
			runString = "(1)";
			if (!"class java.lang.String".equals(jtt.lang.Class_Literal01
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "class java.lang.Class"
			runString = "(2)";
			if (!"class java.lang.Class".equals(jtt.lang.Class_Literal01
					.test(2))) {
				fail(runString);
				return;
			}
			// (3) == "class jtt.lang.Class_Literal01"
			runString = "(3)";
			if (!"class jtt.lang.Class_Literal01"
					.equals(jtt.lang.Class_Literal01.test(3))) {
				fail(runString);
				return;
			}
			// (4) == null
			runString = "(4)";
			if (null != jtt.lang.Class_Literal01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_asSubclass01() {
		begin("jtt.lang.Class_asSubclass01");
		String runString = null;
		try {
			// (0) == !java.lang.ClassCastException
			try {
				runString = "(0)";
				jtt.lang.Class_asSubclass01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.lang.Class_asSubclass01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassCastException
			try {
				runString = "(2)";
				jtt.lang.Class_asSubclass01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.lang.Class_asSubclass01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.lang.Class_asSubclass01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_cast01() {
		begin("jtt.lang.Class_cast01");
		String runString = null;
		try {
			// (1) == !java.lang.ClassCastException
			try {
				runString = "(1)";
				jtt.lang.Class_cast01.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.lang.Class_cast01.test(0)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ClassCastException
			try {
				runString = "(3)";
				jtt.lang.Class_cast01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassCastException.class) {
					fail(runString, e);
					return;
				}
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.lang.Class_cast01.test(2)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.lang.Class_cast01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_cast02() {
		begin("jtt.lang.Class_cast02");
		String runString = null;
		try {
			// (0) == -1
			runString = "(0)";
			if (-1 != jtt.lang.Class_cast02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == -1
			runString = "(1)";
			if (-1 != jtt.lang.Class_cast02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == -1
			runString = "(2)";
			if (-1 != jtt.lang.Class_cast02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -1
			runString = "(3)";
			if (-1 != jtt.lang.Class_cast02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 4
			runString = "(4)";
			if (4 != jtt.lang.Class_cast02.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_forName01() {
		begin("jtt.lang.Class_forName01");
		String runString = null;
		try {
			// (0) == "class java.lang.Object"
			runString = "(0)";
			if (!"class java.lang.Object".equals(jtt.lang.Class_forName01
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "class java.lang.String"
			runString = "(1)";
			if (!"class java.lang.String".equals(jtt.lang.Class_forName01
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "class jtt.lang.Class_forName01"
			runString = "(2)";
			if (!"class jtt.lang.Class_forName01"
					.equals(jtt.lang.Class_forName01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ClassNotFoundException
			try {
				runString = "(3)";
				jtt.lang.Class_forName01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_forName02() {
		begin("jtt.lang.Class_forName02");
		String runString = null;
		try {
			// (0) == "class java.lang.Object"
			runString = "(0)";
			if (!"class java.lang.Object".equals(jtt.lang.Class_forName02
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "class java.lang.String"
			runString = "(1)";
			if (!"class java.lang.String".equals(jtt.lang.Class_forName02
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "class jtt.lang.Class_forName02"
			runString = "(2)";
			if (!"class jtt.lang.Class_forName02"
					.equals(jtt.lang.Class_forName02.test(2))) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ClassNotFoundException
			try {
				runString = "(3)";
				jtt.lang.Class_forName02.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_forName03() {
		begin("jtt.lang.Class_forName03");
		String runString = null;
		try {
			// (0) == !java.lang.ClassNotFoundException
			try {
				runString = "(0)";
				jtt.lang.Class_forName03.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == "class [Ljava.lang.String;"
			runString = "(1)";
			if (!"class [Ljava.lang.String;".equals(jtt.lang.Class_forName03
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassNotFoundException
			try {
				runString = "(2)";
				jtt.lang.Class_forName03.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == "class [I"
			runString = "(3)";
			if (!"class [I".equals(jtt.lang.Class_forName03.test(3))) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ClassNotFoundException
			try {
				runString = "(4)";
				jtt.lang.Class_forName03.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (5) == null
			runString = "(5)";
			if (null != jtt.lang.Class_forName03.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_forName04() {
		begin("jtt.lang.Class_forName04");
		String runString = null;
		try {
			// (0) == !java.lang.ClassNotFoundException
			try {
				runString = "(0)";
				jtt.lang.Class_forName04.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == "class [Ljava.lang.String;"
			runString = "(1)";
			if (!"class [Ljava.lang.String;".equals(jtt.lang.Class_forName04
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.ClassNotFoundException
			try {
				runString = "(2)";
				jtt.lang.Class_forName04.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == "class [I"
			runString = "(3)";
			if (!"class [I".equals(jtt.lang.Class_forName04.test(3))) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.ClassNotFoundException
			try {
				runString = "(4)";
				jtt.lang.Class_forName04.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ClassNotFoundException.class) {
					fail(runString, e);
					return;
				}
			}
			// (5) == null
			runString = "(5)";
			if (null != jtt.lang.Class_forName04.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_forName05() {
		begin("jtt.lang.Class_forName05");
		String runString = null;
		try {
			// (0) == "class java.lang.String"
			runString = "(0)";
			if (!"class java.lang.String".equals(jtt.lang.Class_forName05
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "class [Ljava.lang.String;"
			runString = "(1)";
			if (!"class [Ljava.lang.String;".equals(jtt.lang.Class_forName05
					.test(1))) {
				fail(runString);
				return;
			}
			// (5) == null
			runString = "(5)";
			if (null != jtt.lang.Class_forName05.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getComponentType01() {
		begin("jtt.lang.Class_getComponentType01");
		String runString = null;
		try {
			// (0) == null
			runString = "(0)";
			if (null != jtt.lang.Class_getComponentType01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == "int"
			runString = "(1)";
			if (!"int".equals(jtt.lang.Class_getComponentType01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == null
			runString = "(2)";
			if (null != jtt.lang.Class_getComponentType01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == "java.lang.Object"
			runString = "(3)";
			if (!"java.lang.Object".equals(jtt.lang.Class_getComponentType01
					.test(3))) {
				fail(runString);
				return;
			}
			// (4) == null
			runString = "(4)";
			if (null != jtt.lang.Class_getComponentType01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == null
			runString = "(5)";
			if (null != jtt.lang.Class_getComponentType01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == "[Ljava.lang.Object;"
			runString = "(6)";
			if (!"[Ljava.lang.Object;".equals(jtt.lang.Class_getComponentType01
					.test(6))) {
				fail(runString);
				return;
			}
			// (7) == null
			runString = "(7)";
			if (null != jtt.lang.Class_getComponentType01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == null
			runString = "(8)";
			if (null != jtt.lang.Class_getComponentType01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getInterfaces01() {
		begin("jtt.lang.Class_getInterfaces01");
		String runString = null;
		try {
			// (0) == ""
			runString = "(0)";
			if (!"".equals(jtt.lang.Class_getInterfaces01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "jtt.lang.Class_getInterfaces01$I1"
			runString = "(1)";
			if (!"jtt.lang.Class_getInterfaces01$I1"
					.equals(jtt.lang.Class_getInterfaces01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "jtt.lang.Class_getInterfaces01$I1"
			runString = "(2)";
			if (!"jtt.lang.Class_getInterfaces01$I1"
					.equals(jtt.lang.Class_getInterfaces01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == "jtt.lang.Class_getInterfaces01$I2"
			runString = "(3)";
			if (!"jtt.lang.Class_getInterfaces01$I2"
					.equals(jtt.lang.Class_getInterfaces01.test(3))) {
				fail(runString);
				return;
			}
			// (4) ==
			// "jtt.lang.Class_getInterfaces01$I1 jtt.lang.Class_getInterfaces01$I2"
			runString = "(4)";
			if (!"jtt.lang.Class_getInterfaces01$I1 jtt.lang.Class_getInterfaces01$I2"
					.equals(jtt.lang.Class_getInterfaces01.test(4))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getName01() {
		begin("jtt.lang.Class_getName01");
		String runString = null;
		try {
			// (0) == "java.lang.Object"
			runString = "(0)";
			if (!"java.lang.Object".equals(jtt.lang.Class_getName01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "java.lang.Class"
			runString = "(1)";
			if (!"java.lang.Class".equals(jtt.lang.Class_getName01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "jtt.lang.Class_getName01"
			runString = "(2)";
			if (!"jtt.lang.Class_getName01".equals(jtt.lang.Class_getName01
					.test(2))) {
				fail(runString);
				return;
			}
			// (3) == "true"
			runString = "(3)";
			if (!"true".equals(jtt.lang.Class_getName01.test(3))) {
				fail(runString);
				return;
			}
			// (4) == null
			runString = "(4)";
			if (null != jtt.lang.Class_getName01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getName02() {
		begin("jtt.lang.Class_getName02");
		String runString = null;
		try {
			// (0) == "int"
			runString = "(0)";
			if (!"int".equals(jtt.lang.Class_getName02.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "[I"
			runString = "(1)";
			if (!"[I".equals(jtt.lang.Class_getName02.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "[[Ljava.lang.Object;"
			runString = "(2)";
			if (!"[[Ljava.lang.Object;"
					.equals(jtt.lang.Class_getName02.test(2))) {
				fail(runString);
				return;
			}
			// (3) == null
			runString = "(3)";
			if (null != jtt.lang.Class_getName02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getSimpleName01() {
		begin("jtt.lang.Class_getSimpleName01");
		String runString = null;
		try {
			// (0) == "Object"
			runString = "(0)";
			if (!"Object".equals(jtt.lang.Class_getSimpleName01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "Class"
			runString = "(1)";
			if (!"Class".equals(jtt.lang.Class_getSimpleName01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "Class_getSimpleName01"
			runString = "(2)";
			if (!"Class_getSimpleName01".equals(jtt.lang.Class_getSimpleName01
					.test(2))) {
				fail(runString);
				return;
			}
			// (3) == null
			runString = "(3)";
			if (null != jtt.lang.Class_getSimpleName01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getSimpleName02() {
		begin("jtt.lang.Class_getSimpleName02");
		String runString = null;
		try {
			// (0) == "int"
			runString = "(0)";
			if (!"int".equals(jtt.lang.Class_getSimpleName02.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "int[]"
			runString = "(1)";
			if (!"int[]".equals(jtt.lang.Class_getSimpleName02.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "Object[][]"
			runString = "(2)";
			if (!"Object[][]".equals(jtt.lang.Class_getSimpleName02.test(2))) {
				fail(runString);
				return;
			}
			// (3) == null
			runString = "(3)";
			if (null != jtt.lang.Class_getSimpleName02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_getSuperClass01() {
		begin("jtt.lang.Class_getSuperClass01");
		String runString = null;
		try {
			// (0) == null
			runString = "(0)";
			if (null != jtt.lang.Class_getSuperClass01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == null
			runString = "(1)";
			if (null != jtt.lang.Class_getSuperClass01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == "java.lang.Object"
			runString = "(2)";
			if (!"java.lang.Object".equals(jtt.lang.Class_getSuperClass01
					.test(2))) {
				fail(runString);
				return;
			}
			// (3) == null
			runString = "(3)";
			if (null != jtt.lang.Class_getSuperClass01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == "java.lang.Number"
			runString = "(4)";
			if (!"java.lang.Number".equals(jtt.lang.Class_getSuperClass01
					.test(4))) {
				fail(runString);
				return;
			}
			// (5) == "java.lang.Object"
			runString = "(5)";
			if (!"java.lang.Object".equals(jtt.lang.Class_getSuperClass01
					.test(5))) {
				fail(runString);
				return;
			}
			// (6) == "java.lang.Object"
			runString = "(6)";
			if (!"java.lang.Object".equals(jtt.lang.Class_getSuperClass01
					.test(6))) {
				fail(runString);
				return;
			}
			// (7) == null
			runString = "(7)";
			if (null != jtt.lang.Class_getSuperClass01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isArray01() {
		begin("jtt.lang.Class_isArray01");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isArray01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Class_isArray01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isArray01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.lang.Class_isArray01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isArray01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Class_isArray01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Class_isArray01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.lang.Class_isArray01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.lang.Class_isArray01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isAssignableFrom01() {
		begin("jtt.lang.Class_isAssignableFrom01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Class_isAssignableFrom01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.lang.Class_isAssignableFrom01.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isAssignableFrom02() {
		begin("jtt.lang.Class_isAssignableFrom02");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isAssignableFrom02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Class_isAssignableFrom02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isAssignableFrom02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isAssignableFrom02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Class_isAssignableFrom02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Class_isAssignableFrom02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Class_isAssignableFrom02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.lang.Class_isAssignableFrom02.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isAssignableFrom03() {
		begin("jtt.lang.Class_isAssignableFrom03");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isAssignableFrom03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Class_isAssignableFrom03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isAssignableFrom03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.lang.Class_isAssignableFrom03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isAssignableFrom03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Class_isAssignableFrom03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Class_isAssignableFrom03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.lang.Class_isAssignableFrom03.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance01() {
		begin("jtt.lang.Class_isInstance01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Class_isInstance01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Class_isInstance01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Class_isInstance01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInstance01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance02() {
		begin("jtt.lang.Class_isInstance02");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInstance02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Class_isInstance02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isInstance02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInstance02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance03() {
		begin("jtt.lang.Class_isInstance03");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInstance03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isInstance03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Class_isInstance03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInstance03.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance04() {
		begin("jtt.lang.Class_isInstance04");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInstance04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isInstance04.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Class_isInstance04.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInstance04.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance05() {
		begin("jtt.lang.Class_isInstance05");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInstance05.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isInstance05.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Class_isInstance05.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInstance05.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInstance06() {
		begin("jtt.lang.Class_isInstance06");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInstance06.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isInstance06.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Class_isInstance06.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.lang.Class_isInstance06.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isInstance06.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isInterface01() {
		begin("jtt.lang.Class_isInterface01");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Class_isInterface01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isInterface01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isInterface01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isInterface01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isInterface01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Class_isInterface01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Class_isInterface01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.lang.Class_isInterface01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.lang.Class_isInterface01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Class_isPrimitive01() {
		begin("jtt.lang.Class_isPrimitive01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Class_isPrimitive01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Class_isPrimitive01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Class_isPrimitive01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.Class_isPrimitive01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Class_isPrimitive01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Class_isPrimitive01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Class_isPrimitive01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.lang.Class_isPrimitive01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.lang.Class_isPrimitive01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Double_toString() {
		begin("jtt.lang.Double_toString");
		String runString = null;
		try {
			// (0) == "9.834050399508132E-4"
			runString = "(0)";
			if (!"9.834050399508132E-4"
					.equals(jtt.lang.Double_toString.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Float_01() {
		begin("jtt.lang.Float_01");
		String runString = null;
		try {
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.lang.Float_01.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == false
			runString = "(2.0)";
			if (false != jtt.lang.Float_01.test(2.0f)) {
				fail(runString);
				return;
			}
			// (0.5) == false
			runString = "(0.5)";
			if (false != jtt.lang.Float_01.test(0.5f)) {
				fail(runString);
				return;
			}
			// (java.lang.Float.NaN) == true
			runString = "(java.lang.Float.NaN)";
			if (true != jtt.lang.Float_01.test(java.lang.Float.NaN)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Float_02() {
		begin("jtt.lang.Float_02");
		String runString = null;
		try {
			// (1.0) == false
			runString = "(1.0)";
			if (false != jtt.lang.Float_02.test(1.0f)) {
				fail(runString);
				return;
			}
			// (2.0) == true
			runString = "(2.0)";
			if (true != jtt.lang.Float_02.test(2.0f)) {
				fail(runString);
				return;
			}
			// (0.5) == true
			runString = "(0.5)";
			if (true != jtt.lang.Float_02.test(0.5f)) {
				fail(runString);
				return;
			}
			// (java.lang.Float.NaN) == true
			runString = "(java.lang.Float.NaN)";
			if (true != jtt.lang.Float_02.test(java.lang.Float.NaN)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greater01() {
		begin("jtt.lang.Int_greater01");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greater01.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Int_greater01.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_greater01.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_greater01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Int_greater01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Int_greater01.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greater01.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greater02() {
		begin("jtt.lang.Int_greater02");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greater02.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Int_greater02.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_greater02.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_greater02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_greater02.test(1)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Int_greater02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Int_greater02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Int_greater02.test(6)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greater02.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greater03() {
		begin("jtt.lang.Int_greater03");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greater03.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-6) == false
			runString = "(-6)";
			if (false != jtt.lang.Int_greater03.test(-6)) {
				fail(runString);
				return;
			}
			// (-5) == false
			runString = "(-5)";
			if (false != jtt.lang.Int_greater03.test(-5)) {
				fail(runString);
				return;
			}
			// (-4) == true
			runString = "(-4)";
			if (true != jtt.lang.Int_greater03.test(-4)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_greater03.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_greater03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Int_greater03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Int_greater03.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greater03.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greaterEqual01() {
		begin("jtt.lang.Int_greaterEqual01");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greaterEqual01.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Int_greaterEqual01.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_greaterEqual01.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_greaterEqual01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Int_greaterEqual01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Int_greaterEqual01.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greaterEqual01.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greaterEqual02() {
		begin("jtt.lang.Int_greaterEqual02");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greaterEqual02.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Int_greaterEqual02.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_greaterEqual02.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_greaterEqual02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_greaterEqual02.test(1)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Int_greaterEqual02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Int_greaterEqual02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Int_greaterEqual02.test(6)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greaterEqual02.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_greaterEqual03() {
		begin("jtt.lang.Int_greaterEqual03");
		String runString = null;
		try {
			// (-2147483648) == false
			runString = "(-2147483648)";
			if (false != jtt.lang.Int_greaterEqual03.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-6) == false
			runString = "(-6)";
			if (false != jtt.lang.Int_greaterEqual03.test(-6)) {
				fail(runString);
				return;
			}
			// (-5) == true
			runString = "(-5)";
			if (true != jtt.lang.Int_greaterEqual03.test(-5)) {
				fail(runString);
				return;
			}
			// (-4) == true
			runString = "(-4)";
			if (true != jtt.lang.Int_greaterEqual03.test(-4)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_greaterEqual03.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_greaterEqual03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Int_greaterEqual03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Int_greaterEqual03.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == true
			runString = "(2147483647)";
			if (true != jtt.lang.Int_greaterEqual03.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_less01() {
		begin("jtt.lang.Int_less01");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_less01.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Int_less01.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_less01.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_less01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_less01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Int_less01.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_less01.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_less02() {
		begin("jtt.lang.Int_less02");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_less02.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Int_less02.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_less02.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_less02.test(0)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Int_less02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Int_less02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Int_less02.test(6)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_less02.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_less03() {
		begin("jtt.lang.Int_less03");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_less03.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-6) == true
			runString = "(-6)";
			if (true != jtt.lang.Int_less03.test(-6)) {
				fail(runString);
				return;
			}
			// (-5) == false
			runString = "(-5)";
			if (false != jtt.lang.Int_less03.test(-5)) {
				fail(runString);
				return;
			}
			// (-4) == false
			runString = "(-4)";
			if (false != jtt.lang.Int_less03.test(-4)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_less03.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_less03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_less03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Int_less03.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_less03.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_lessEqual01() {
		begin("jtt.lang.Int_lessEqual01");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_lessEqual01.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Int_lessEqual01.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_lessEqual01.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_lessEqual01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_lessEqual01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Int_lessEqual01.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_lessEqual01.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_lessEqual02() {
		begin("jtt.lang.Int_lessEqual02");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_lessEqual02.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Int_lessEqual02.test(-2)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Int_lessEqual02.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Int_lessEqual02.test(0)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Int_lessEqual02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Int_lessEqual02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Int_lessEqual02.test(6)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_lessEqual02.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Int_lessEqual03() {
		begin("jtt.lang.Int_lessEqual03");
		String runString = null;
		try {
			// (-2147483648) == true
			runString = "(-2147483648)";
			if (true != jtt.lang.Int_lessEqual03.test(-2147483648)) {
				fail(runString);
				return;
			}
			// (-6) == true
			runString = "(-6)";
			if (true != jtt.lang.Int_lessEqual03.test(-6)) {
				fail(runString);
				return;
			}
			// (-5) == true
			runString = "(-5)";
			if (true != jtt.lang.Int_lessEqual03.test(-5)) {
				fail(runString);
				return;
			}
			// (-4) == false
			runString = "(-4)";
			if (false != jtt.lang.Int_lessEqual03.test(-4)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Int_lessEqual03.test(-1)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Int_lessEqual03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Int_lessEqual03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Int_lessEqual03.test(2)) {
				fail(runString);
				return;
			}
			// (2147483647) == false
			runString = "(2147483647)";
			if (false != jtt.lang.Int_lessEqual03.test(2147483647)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_JDK_ClassLoaders01() {
		begin("jtt.lang.JDK_ClassLoaders01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.JDK_ClassLoaders01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.JDK_ClassLoaders01.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_JDK_ClassLoaders02() {
		begin("jtt.lang.JDK_ClassLoaders02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.JDK_ClassLoaders02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greater01() {
		begin("jtt.lang.Long_greater01");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greater01.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Long_greater01.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_greater01.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_greater01.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Long_greater01.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Long_greater01.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greater01.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greater02() {
		begin("jtt.lang.Long_greater02");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greater02.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Long_greater02.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_greater02.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_greater02.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_greater02.test(1L)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Long_greater02.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Long_greater02.test(5L)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Long_greater02.test(6L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greater02.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greater03() {
		begin("jtt.lang.Long_greater03");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greater03.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-6) == false
			runString = "(-6)";
			if (false != jtt.lang.Long_greater03.test(-6L)) {
				fail(runString);
				return;
			}
			// (-5) == false
			runString = "(-5)";
			if (false != jtt.lang.Long_greater03.test(-5L)) {
				fail(runString);
				return;
			}
			// (-4) == true
			runString = "(-4)";
			if (true != jtt.lang.Long_greater03.test(-4L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_greater03.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_greater03.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Long_greater03.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Long_greater03.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greater03.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greaterEqual01() {
		begin("jtt.lang.Long_greaterEqual01");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greaterEqual01
					.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Long_greaterEqual01.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_greaterEqual01.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_greaterEqual01.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Long_greaterEqual01.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Long_greaterEqual01.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greaterEqual01.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greaterEqual02() {
		begin("jtt.lang.Long_greaterEqual02");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greaterEqual02
					.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == false
			runString = "(-2)";
			if (false != jtt.lang.Long_greaterEqual02.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_greaterEqual02.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_greaterEqual02.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_greaterEqual02.test(1L)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.lang.Long_greaterEqual02.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Long_greaterEqual02.test(5L)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Long_greaterEqual02.test(6L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greaterEqual02.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_greaterEqual03() {
		begin("jtt.lang.Long_greaterEqual03");
		String runString = null;
		try {
			// (-9223372036854775808) == false
			runString = "(-9223372036854775808)";
			if (false != jtt.lang.Long_greaterEqual03
					.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-6) == false
			runString = "(-6)";
			if (false != jtt.lang.Long_greaterEqual03.test(-6L)) {
				fail(runString);
				return;
			}
			// (-5) == true
			runString = "(-5)";
			if (true != jtt.lang.Long_greaterEqual03.test(-5L)) {
				fail(runString);
				return;
			}
			// (-4) == true
			runString = "(-4)";
			if (true != jtt.lang.Long_greaterEqual03.test(-4L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_greaterEqual03.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_greaterEqual03.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Long_greaterEqual03.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.Long_greaterEqual03.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == true
			runString = "(9223372036854775807)";
			if (true != jtt.lang.Long_greaterEqual03.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_less01() {
		begin("jtt.lang.Long_less01");
		String runString = null;
		try {
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_less01.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Long_less01.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_less01.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_less01.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_less01.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Long_less01.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_less01.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_less02() {
		begin("jtt.lang.Long_less02");
		String runString = null;
		try {
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_less02.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Long_less02.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_less02.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_less02.test(0L)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Long_less02.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Long_less02.test(5L)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Long_less02.test(6L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_less02.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_less03() {
		begin("jtt.lang.Long_less03");
		String runString = null;
		try {
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_less03.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-6) == true
			runString = "(-6)";
			if (true != jtt.lang.Long_less03.test(-6L)) {
				fail(runString);
				return;
			}
			// (-5) == false
			runString = "(-5)";
			if (false != jtt.lang.Long_less03.test(-5L)) {
				fail(runString);
				return;
			}
			// (-4) == false
			runString = "(-4)";
			if (false != jtt.lang.Long_less03.test(-4L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_less03.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_less03.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_less03.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Long_less03.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_less03.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_lessEqual01() {
		begin("jtt.lang.Long_lessEqual01");
		String runString = null;
		try {
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Long_lessEqual01.test(-2L)) {
				fail(runString);
				return;
			}
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_lessEqual01.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Long_lessEqual01.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_lessEqual01.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_lessEqual01.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_lessEqual01.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Long_lessEqual01.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_lessEqual01.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_lessEqual02() {
		begin("jtt.lang.Long_lessEqual02");
		String runString = null;
		try {
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_lessEqual02.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-2) == true
			runString = "(-2)";
			if (true != jtt.lang.Long_lessEqual02.test(-2L)) {
				fail(runString);
				return;
			}
			// (-1) == true
			runString = "(-1)";
			if (true != jtt.lang.Long_lessEqual02.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Long_lessEqual02.test(0L)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Long_lessEqual02.test(4L)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.lang.Long_lessEqual02.test(5L)) {
				fail(runString);
				return;
			}
			// (6) == false
			runString = "(6)";
			if (false != jtt.lang.Long_lessEqual02.test(6L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_lessEqual02.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_lessEqual03() {
		begin("jtt.lang.Long_lessEqual03");
		String runString = null;
		try {
			// (-9223372036854775808) == true
			runString = "(-9223372036854775808)";
			if (true != jtt.lang.Long_lessEqual03.test(-9223372036854775808L)) {
				fail(runString);
				return;
			}
			// (-6) == true
			runString = "(-6)";
			if (true != jtt.lang.Long_lessEqual03.test(-6L)) {
				fail(runString);
				return;
			}
			// (-5) == true
			runString = "(-5)";
			if (true != jtt.lang.Long_lessEqual03.test(-5L)) {
				fail(runString);
				return;
			}
			// (-4) == false
			runString = "(-4)";
			if (false != jtt.lang.Long_lessEqual03.test(-4L)) {
				fail(runString);
				return;
			}
			// (-1) == false
			runString = "(-1)";
			if (false != jtt.lang.Long_lessEqual03.test(-1L)) {
				fail(runString);
				return;
			}
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Long_lessEqual03.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Long_lessEqual03.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Long_lessEqual03.test(2L)) {
				fail(runString);
				return;
			}
			// (9223372036854775807) == false
			runString = "(9223372036854775807)";
			if (false != jtt.lang.Long_lessEqual03.test(9223372036854775807L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_reverseBytes01() {
		begin("jtt.lang.Long_reverseBytes01");
		String runString = null;
		try {
			// (1234605616436508424) == 610068790934446609
			runString = "(1234605616436508424)";
			if (610068790934446609L != jtt.lang.Long_reverseBytes01
					.test(1234605616436508424L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Long_reverseBytes02() {
		begin("jtt.lang.Long_reverseBytes02");
		String runString = null;
		try {
			// (1234605616436508424) == 610068790934446609
			runString = "(1234605616436508424)";
			if (610068790934446609L != jtt.lang.Long_reverseBytes02
					.test(1234605616436508424L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Math_pow() {
		begin("jtt.lang.Math_pow");
		String runString = null;
		try {
			// (2.0) == 4.0
			runString = "(2.0)";
			if (4.0 != jtt.lang.Math_pow.test(2.0)) {
				fail(runString);
				return;
			}
			// (3.1) == 8.574187700290345
			runString = "(3.1)";
			if (8.574187700290345 != jtt.lang.Math_pow.test(3.1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_clone01() {
		begin("jtt.lang.Object_clone01");
		String runString = null;
		try {
			// (0) == !java.lang.CloneNotSupportedException
			try {
				runString = "(0)";
				jtt.lang.Object_clone01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.CloneNotSupportedException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_clone02() {
		begin("jtt.lang.Object_clone02");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Object_clone02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_equals01() {
		begin("jtt.lang.Object_equals01");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.lang.Object_equals01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.lang.Object_equals01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Object_equals01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.lang.Object_equals01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.lang.Object_equals01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == false
			runString = "(5)";
			if (false != jtt.lang.Object_equals01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.lang.Object_equals01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == false
			runString = "(7)";
			if (false != jtt.lang.Object_equals01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.lang.Object_equals01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_getClass01() {
		begin("jtt.lang.Object_getClass01");
		String runString = null;
		try {
			// (0) == "class java.lang.Object"
			runString = "(0)";
			if (!"class java.lang.Object".equals(jtt.lang.Object_getClass01
					.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "class java.lang.String"
			runString = "(1)";
			if (!"class java.lang.String".equals(jtt.lang.Object_getClass01
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "class jtt.lang.Object_getClass01"
			runString = "(2)";
			if (!"class jtt.lang.Object_getClass01"
					.equals(jtt.lang.Object_getClass01.test(2))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_hashCode01() {
		begin("jtt.lang.Object_hashCode01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_hashCode01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_notify01() {
		begin("jtt.lang.Object_notify01");
		String runString = null;
		try {
			// (0) == !java.lang.IllegalMonitorStateException
			try {
				runString = "(0)";
				jtt.lang.Object_notify01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalMonitorStateException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_notify02() {
		begin("jtt.lang.Object_notify02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_notify02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_notifyAll01() {
		begin("jtt.lang.Object_notifyAll01");
		String runString = null;
		try {
			// (0) == !java.lang.IllegalMonitorStateException
			try {
				runString = "(0)";
				jtt.lang.Object_notifyAll01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalMonitorStateException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_notifyAll02() {
		begin("jtt.lang.Object_notifyAll02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_notifyAll02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_toString01() {
		begin("jtt.lang.Object_toString01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_toString01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.Object_toString01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == false
			runString = "(2)";
			if (false != jtt.lang.Object_toString01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_toString02() {
		begin("jtt.lang.Object_toString02");
		String runString = null;
		try {
			// (0) == "XYZ"
			runString = "(0)";
			if (!"XYZ".equals(jtt.lang.Object_toString02.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "string"
			runString = "(1)";
			if (!"string".equals(jtt.lang.Object_toString02.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "class java.lang.String"
			runString = "(2)";
			if (!"class java.lang.String".equals(jtt.lang.Object_toString02
					.test(2))) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.lang.Object_toString02.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_wait01() {
		begin("jtt.lang.Object_wait01");
		String runString = null;
		try {
			// (0) == !java.lang.IllegalMonitorStateException
			try {
				runString = "(0)";
				jtt.lang.Object_wait01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalMonitorStateException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_wait02() {
		begin("jtt.lang.Object_wait02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_wait02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_Object_wait03() {
		begin("jtt.lang.Object_wait03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.Object_wait03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_ProcessEnvironment_init() {
		begin("jtt.lang.ProcessEnvironment_init");
		String runString = null;
		try {
			// (7) == 7
			runString = "(7)";
			if (7 != jtt.lang.ProcessEnvironment_init.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_StringCoding_Scale() {
		begin("jtt.lang.StringCoding_Scale");
		String runString = null;
		try {
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.lang.StringCoding_Scale.test(2)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.lang.StringCoding_Scale.test(1)) {
				fail(runString);
				return;
			}
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.lang.StringCoding_Scale.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_String_intern01() {
		begin("jtt.lang.String_intern01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.String_intern01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_String_intern02() {
		begin("jtt.lang.String_intern02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.String_intern02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.String_intern02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.String_intern02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_String_intern03() {
		begin("jtt.lang.String_intern03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.String_intern03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.String_intern03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.String_intern03.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_String_valueOf01() {
		begin("jtt.lang.String_valueOf01");
		String runString = null;
		try {
			// (0) == "null"
			runString = "(0)";
			if (!"null".equals(jtt.lang.String_valueOf01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "string"
			runString = "(1)";
			if (!"string".equals(jtt.lang.String_valueOf01.test(1))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_lang_System_identityHashCode01() {
		begin("jtt.lang.System_identityHashCode01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.lang.System_identityHashCode01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.lang.System_identityHashCode01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.lang.System_identityHashCode01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.lang.System_identityHashCode01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_ArrayCompare01() {
		begin("jtt.micro.ArrayCompare01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.micro.ArrayCompare01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.micro.ArrayCompare01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_ArrayCompare02() {
		begin("jtt.micro.ArrayCompare02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.micro.ArrayCompare02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.micro.ArrayCompare02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.micro.ArrayCompare02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.micro.ArrayCompare02.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BC_invokevirtual2() {
		begin("jtt.micro.BC_invokevirtual2");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.micro.BC_invokevirtual2.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.micro.BC_invokevirtual2.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.micro.BC_invokevirtual2.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 3
			runString = "(3)";
			if (3 != jtt.micro.BC_invokevirtual2.test(3)) {
				fail(runString);
				return;
			}
			// (-4) == -4
			runString = "(-4)";
			if (-4 != jtt.micro.BC_invokevirtual2.test(-4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigByteParams01() {
		begin("jtt.micro.BigByteParams01");
		String runString = null;
		try {
			// (0) == 45
			runString = "(0)";
			if (45 != jtt.micro.BigByteParams01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 45
			runString = "(1)";
			if (45 != jtt.micro.BigByteParams01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45
			runString = "(2)";
			if (45 != jtt.micro.BigByteParams01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 45
			runString = "(3)";
			if (45 != jtt.micro.BigByteParams01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.micro.BigByteParams01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigDoubleParams02() {
		begin("jtt.micro.BigDoubleParams02");
		String runString = null;
		try {
			// (0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 1.0
			runString = "(0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (1.0 != jtt.micro.BigDoubleParams02.test(0, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (1,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 2.0
			runString = "(1,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (2.0 != jtt.micro.BigDoubleParams02.test(1, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (2,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 3.0
			runString = "(2,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (3.0 != jtt.micro.BigDoubleParams02.test(2, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (3,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 4.0
			runString = "(3,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (4.0 != jtt.micro.BigDoubleParams02.test(3, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (4,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 5.0
			runString = "(4,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (5.0 != jtt.micro.BigDoubleParams02.test(4, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (5,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 6.0
			runString = "(5,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (6.0 != jtt.micro.BigDoubleParams02.test(5, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (6,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 7.0
			runString = "(6,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (7.0 != jtt.micro.BigDoubleParams02.test(6, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (7,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 8.0
			runString = "(7,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (8.0 != jtt.micro.BigDoubleParams02.test(7, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (8,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 9.0
			runString = "(8,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (9.0 != jtt.micro.BigDoubleParams02.test(8, 1.0, 2.0, 3.0, 4.0,
					5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigFloatParams01() {
		begin("jtt.micro.BigFloatParams01");
		String runString = null;
		try {
			// (0) == 45.0
			runString = "(0)";
			if (45.0 != jtt.micro.BigFloatParams01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 45.0
			runString = "(1)";
			if (45.0 != jtt.micro.BigFloatParams01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45.0
			runString = "(2)";
			if (45.0 != jtt.micro.BigFloatParams01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 45.0
			runString = "(3)";
			if (45.0 != jtt.micro.BigFloatParams01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0.0
			runString = "(4)";
			if (0.0 != jtt.micro.BigFloatParams01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigFloatParams02() {
		begin("jtt.micro.BigFloatParams02");
		String runString = null;
		try {
			// (0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 1.0
			runString = "(0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (1.0f != jtt.micro.BigFloatParams02.test(0, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (1,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 2.0
			runString = "(1,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (2.0f != jtt.micro.BigFloatParams02.test(1, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (2,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 3.0
			runString = "(2,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (3.0f != jtt.micro.BigFloatParams02.test(2, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (3,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 4.0
			runString = "(3,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (4.0f != jtt.micro.BigFloatParams02.test(3, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (4,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 5.0
			runString = "(4,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (5.0f != jtt.micro.BigFloatParams02.test(4, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (5,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 6.0
			runString = "(5,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (6.0f != jtt.micro.BigFloatParams02.test(5, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (6,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 7.0
			runString = "(6,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (7.0f != jtt.micro.BigFloatParams02.test(6, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (7,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 8.0
			runString = "(7,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (8.0f != jtt.micro.BigFloatParams02.test(7, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
			// (8,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0) == 9.0
			runString = "(8,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)";
			if (9.0f != jtt.micro.BigFloatParams02.test(8, 1.0f, 2.0f, 3.0f,
					4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigIntParams01() {
		begin("jtt.micro.BigIntParams01");
		String runString = null;
		try {
			// (0) == 45
			runString = "(0)";
			if (45 != jtt.micro.BigIntParams01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 45
			runString = "(1)";
			if (45 != jtt.micro.BigIntParams01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45
			runString = "(2)";
			if (45 != jtt.micro.BigIntParams01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 45
			runString = "(3)";
			if (45 != jtt.micro.BigIntParams01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.micro.BigIntParams01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigIntParams02() {
		begin("jtt.micro.BigIntParams02");
		String runString = null;
		try {
			// (0,1,2,3,4,5,6,7,-8,-9) == 1
			runString = "(0,1,2,3,4,5,6,7,-8,-9)";
			if (1 != jtt.micro.BigIntParams02.test(0, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (1,1,2,3,4,5,6,7,-8,-9) == 2
			runString = "(1,1,2,3,4,5,6,7,-8,-9)";
			if (2 != jtt.micro.BigIntParams02.test(1, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (2,1,2,3,4,5,6,7,-8,-9) == 3
			runString = "(2,1,2,3,4,5,6,7,-8,-9)";
			if (3 != jtt.micro.BigIntParams02.test(2, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (3,1,2,3,4,5,6,7,-8,-9) == 4
			runString = "(3,1,2,3,4,5,6,7,-8,-9)";
			if (4 != jtt.micro.BigIntParams02.test(3, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (4,1,2,3,4,5,6,7,-8,-9) == 5
			runString = "(4,1,2,3,4,5,6,7,-8,-9)";
			if (5 != jtt.micro.BigIntParams02.test(4, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (5,1,2,3,4,5,6,7,-8,-9) == 6
			runString = "(5,1,2,3,4,5,6,7,-8,-9)";
			if (6 != jtt.micro.BigIntParams02.test(5, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (6,1,2,3,4,5,6,7,-8,-9) == 7
			runString = "(6,1,2,3,4,5,6,7,-8,-9)";
			if (7 != jtt.micro.BigIntParams02.test(6, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (7,1,2,3,4,5,6,7,-8,-9) == -8
			runString = "(7,1,2,3,4,5,6,7,-8,-9)";
			if (-8 != jtt.micro.BigIntParams02.test(7, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
			// (8,1,2,3,4,5,6,7,-8,-9) == -9
			runString = "(8,1,2,3,4,5,6,7,-8,-9)";
			if (-9 != jtt.micro.BigIntParams02.test(8, 1, 2, 3, 4, 5, 6, 7, -8,
					-9)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigInterfaceParams01() {
		begin("jtt.micro.BigInterfaceParams01");
		String runString = null;
		try {
			// (true,"0","1","2","3","4","5","6","7","8","9") == "A0123456789"
			runString = "(true,\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"A0123456789".equals(jtt.micro.BigInterfaceParams01.test(true,
					"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
			// (false,"0","1","2","3","4","5","6","7","8","9") == "B0123456789"
			runString = "(false,\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"B0123456789".equals(jtt.micro.BigInterfaceParams01.test(
					false, "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigLongParams02() {
		begin("jtt.micro.BigLongParams02");
		String runString = null;
		try {
			// (0,1,2,3,4,5,6,7,-8,-9) == 1
			runString = "(0,1,2,3,4,5,6,7,-8,-9)";
			if (1L != jtt.micro.BigLongParams02.test(0, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (1,1,2,3,4,5,6,7,-8,-9) == 2
			runString = "(1,1,2,3,4,5,6,7,-8,-9)";
			if (2L != jtt.micro.BigLongParams02.test(1, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (2,1,2,3,4,5,6,7,-8,-9) == 3
			runString = "(2,1,2,3,4,5,6,7,-8,-9)";
			if (3L != jtt.micro.BigLongParams02.test(2, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (3,1,2,3,4,5,6,7,-8,-9) == 4
			runString = "(3,1,2,3,4,5,6,7,-8,-9)";
			if (4L != jtt.micro.BigLongParams02.test(3, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (4,1,2,3,4,5,6,7,-8,-9) == 5
			runString = "(4,1,2,3,4,5,6,7,-8,-9)";
			if (5L != jtt.micro.BigLongParams02.test(4, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (5,1,2,3,4,5,6,7,-8,-9) == 6
			runString = "(5,1,2,3,4,5,6,7,-8,-9)";
			if (6L != jtt.micro.BigLongParams02.test(5, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (6,1,2,3,4,5,6,7,-8,-9) == 7
			runString = "(6,1,2,3,4,5,6,7,-8,-9)";
			if (7L != jtt.micro.BigLongParams02.test(6, 1L, 2L, 3L, 4L, 5L, 6L,
					7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (7,1,2,3,4,5,6,7,-8,-9) == -8
			runString = "(7,1,2,3,4,5,6,7,-8,-9)";
			if (-8L != jtt.micro.BigLongParams02.test(7, 1L, 2L, 3L, 4L, 5L,
					6L, 7L, -8L, -9L)) {
				fail(runString);
				return;
			}
			// (8,1,2,3,4,5,6,7,-8,-9) == -9
			runString = "(8,1,2,3,4,5,6,7,-8,-9)";
			if (-9L != jtt.micro.BigLongParams02.test(8, 1L, 2L, 3L, 4L, 5L,
					6L, 7L, -8L, -9L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigMixedParams01() {
		begin("jtt.micro.BigMixedParams01");
		String runString = null;
		try {
			// (0) == 45.0
			runString = "(0)";
			if (45.0 != jtt.micro.BigMixedParams01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 45.0
			runString = "(1)";
			if (45.0 != jtt.micro.BigMixedParams01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45.0
			runString = "(2)";
			if (45.0 != jtt.micro.BigMixedParams01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 45.0
			runString = "(3)";
			if (45.0 != jtt.micro.BigMixedParams01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0.0
			runString = "(4)";
			if (0.0 != jtt.micro.BigMixedParams01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigMixedParams02() {
		begin("jtt.micro.BigMixedParams02");
		String runString = null;
		try {
			// (0,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 1.0
			runString = "(0,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (1.0f != jtt.micro.BigMixedParams02.test(0, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (1,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 2.0
			runString = "(1,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (2.0f != jtt.micro.BigMixedParams02.test(1, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (2,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 3.0
			runString = "(2,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (3.0f != jtt.micro.BigMixedParams02.test(2, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (3,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 4.0
			runString = "(3,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (4.0f != jtt.micro.BigMixedParams02.test(3, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (4,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 5.0
			runString = "(4,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (5.0f != jtt.micro.BigMixedParams02.test(4, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (5,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 6.0
			runString = "(5,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (6.0f != jtt.micro.BigMixedParams02.test(5, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (6,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 7.0
			runString = "(6,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (7.0f != jtt.micro.BigMixedParams02.test(6, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (7,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 8.0
			runString = "(7,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (8.0f != jtt.micro.BigMixedParams02.test(7, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
			// (8,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 9.0
			runString = "(8,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (9.0f != jtt.micro.BigMixedParams02.test(8, -1, -1, -1, -1,
					1.0f, 2.0f, 3.0f, 4.0f, -1, -1, 5.0f, 6.0f, 7.0f, 8.0f,
					9.0f)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigMixedParams03() {
		begin("jtt.micro.BigMixedParams03");
		String runString = null;
		try {
			// (0,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 1.0
			runString = "(0,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (1.0 != jtt.micro.BigMixedParams03.test(0, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (1,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 2.0
			runString = "(1,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (2.0 != jtt.micro.BigMixedParams03.test(1, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (2,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 3.0
			runString = "(2,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (3.0 != jtt.micro.BigMixedParams03.test(2, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (3,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 4.0
			runString = "(3,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (4.0 != jtt.micro.BigMixedParams03.test(3, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (4,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 5.0
			runString = "(4,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (5.0 != jtt.micro.BigMixedParams03.test(4, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (5,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 6.0
			runString = "(5,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (6.0 != jtt.micro.BigMixedParams03.test(5, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (6,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 7.0
			runString = "(6,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (7.0 != jtt.micro.BigMixedParams03.test(6, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (7,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 8.0
			runString = "(7,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (8.0 != jtt.micro.BigMixedParams03.test(7, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
			// (8,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0) == 9.0
			runString = "(8,-1,-1,-1,-1,1.0,2.0,3.0,4.0,-1,-1,5.0,6.0,7.0,8.0,9.0)";
			if (9.0 != jtt.micro.BigMixedParams03.test(8, -1, -1, -1, -1, 1.0,
					2.0, 3.0, 4.0, -1, -1, 5.0, 6.0, 7.0, 8.0, 9.0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigObjectParams01() {
		begin("jtt.micro.BigObjectParams01");
		String runString = null;
		try {
			// ("0","1","2","3","4","5","6","7","8","9") == "0"
			runString = "(\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"0".equals(jtt.micro.BigObjectParams01.test("0", "1", "2",
					"3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
			// ("a",null,null,null,null,null,null,null,null,null) == "a"
			runString = "(\"a\",null,null,null,null,null,null,null,null,null)";
			if (!"a".equals(jtt.micro.BigObjectParams01.test("a", null, null,
					null, null, null, null, null, null, null))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigObjectParams02() {
		begin("jtt.micro.BigObjectParams02");
		String runString = null;
		try {
			// ("0","1","2","3","4","5","6","7","8","9") == "0123456789"
			runString = "(\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"0123456789".equals(jtt.micro.BigObjectParams02.test("0", "1",
					"2", "3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigParamsAlignment() {
		begin("jtt.micro.BigParamsAlignment");
		String runString = null;
		try {
			// (0) == 45
			runString = "(0)";
			if (45 != jtt.micro.BigParamsAlignment.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 55
			runString = "(1)";
			if (55 != jtt.micro.BigParamsAlignment.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45
			runString = "(2)";
			if (45 != jtt.micro.BigParamsAlignment.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 55
			runString = "(3)";
			if (55 != jtt.micro.BigParamsAlignment.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 66
			runString = "(4)";
			if (66 != jtt.micro.BigParamsAlignment.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 78
			runString = "(5)";
			if (78 != jtt.micro.BigParamsAlignment.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 0
			runString = "(6)";
			if (0 != jtt.micro.BigParamsAlignment.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigShortParams01() {
		begin("jtt.micro.BigShortParams01");
		String runString = null;
		try {
			// (0) == 45
			runString = "(0)";
			if (45 != jtt.micro.BigShortParams01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 45
			runString = "(1)";
			if (45 != jtt.micro.BigShortParams01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 45
			runString = "(2)";
			if (45 != jtt.micro.BigShortParams01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 45
			runString = "(3)";
			if (45 != jtt.micro.BigShortParams01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 0
			runString = "(4)";
			if (0 != jtt.micro.BigShortParams01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_BigVirtualParams01() {
		begin("jtt.micro.BigVirtualParams01");
		String runString = null;
		try {
			// (true,"0","1","2","3","4","5","6","7","8","9") == "A0123456789"
			runString = "(true,\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"A0123456789".equals(jtt.micro.BigVirtualParams01.test(true,
					"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
			// (false,"0","1","2","3","4","5","6","7","8","9") == "B0123456789"
			runString = "(false,\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\")";
			if (!"B0123456789".equals(jtt.micro.BigVirtualParams01.test(false,
					"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_Bubblesort() {
		begin("jtt.micro.Bubblesort");
		String runString = null;
		try {
			// (0) == -9
			runString = "(0)";
			if (-9 != jtt.micro.Bubblesort.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 0
			runString = "(1)";
			if (0 != jtt.micro.Bubblesort.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 0
			runString = "(2)";
			if (0 != jtt.micro.Bubblesort.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 1
			runString = "(3)";
			if (1 != jtt.micro.Bubblesort.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 5
			runString = "(4)";
			if (5 != jtt.micro.Bubblesort.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 8
			runString = "(5)";
			if (8 != jtt.micro.Bubblesort.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 23
			runString = "(6)";
			if (23 != jtt.micro.Bubblesort.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 882
			runString = "(7)";
			if (882 != jtt.micro.Bubblesort.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_Fibonacci() {
		begin("jtt.micro.Fibonacci");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.micro.Fibonacci.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.micro.Fibonacci.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 1
			runString = "(2)";
			if (1 != jtt.micro.Fibonacci.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 2
			runString = "(3)";
			if (2 != jtt.micro.Fibonacci.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 3
			runString = "(4)";
			if (3 != jtt.micro.Fibonacci.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 5
			runString = "(5)";
			if (5 != jtt.micro.Fibonacci.test(5)) {
				fail(runString);
				return;
			}
			// (6) == 8
			runString = "(6)";
			if (8 != jtt.micro.Fibonacci.test(6)) {
				fail(runString);
				return;
			}
			// (7) == 13
			runString = "(7)";
			if (13 != jtt.micro.Fibonacci.test(7)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_InvokeVirtual_01() {
		begin("jtt.micro.InvokeVirtual_01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.micro.InvokeVirtual_01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11 != jtt.micro.InvokeVirtual_01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 22
			runString = "(2)";
			if (22 != jtt.micro.InvokeVirtual_01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 42
			runString = "(3)";
			if (42 != jtt.micro.InvokeVirtual_01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_InvokeVirtual_02() {
		begin("jtt.micro.InvokeVirtual_02");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.micro.InvokeVirtual_02.test(0L)) {
				fail(runString);
				return;
			}
			// (1) == 11
			runString = "(1)";
			if (11L != jtt.micro.InvokeVirtual_02.test(1L)) {
				fail(runString);
				return;
			}
			// (2) == 22
			runString = "(2)";
			if (22L != jtt.micro.InvokeVirtual_02.test(2L)) {
				fail(runString);
				return;
			}
			// (3) == 42
			runString = "(3)";
			if (42L != jtt.micro.InvokeVirtual_02.test(3L)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_Matrix01() {
		begin("jtt.micro.Matrix01");
		String runString = null;
		try {
			// (0) == 8
			runString = "(0)";
			if (8 != jtt.micro.Matrix01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 34
			runString = "(1)";
			if (34 != jtt.micro.Matrix01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 152
			runString = "(2)";
			if (152 != jtt.micro.Matrix01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 204
			runString = "(3)";
			if (204 != jtt.micro.Matrix01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == 1547
			runString = "(4)";
			if (1547 != jtt.micro.Matrix01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == 42
			runString = "(5)";
			if (42 != jtt.micro.Matrix01.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_StrangeFrames() {
		begin("jtt.micro.StrangeFrames");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.micro.StrangeFrames.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_String_format01() {
		begin("jtt.micro.String_format01");
		String runString = null;
		try {
			// ("World") == "Hello World"
			runString = "(\"World\")";
			if (!"Hello World".equals(jtt.micro.String_format01.test("World"))) {
				fail(runString);
				return;
			}
			// ("New World Order") == "Hello New World Order"
			runString = "(\"New World Order\")";
			if (!"Hello New World Order".equals(jtt.micro.String_format01
					.test("New World Order"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_String_format02() {
		begin("jtt.micro.String_format02");
		String runString = null;
		try {
			// (0) == "Hello 0"
			runString = "(0)";
			if (!"Hello 0".equals(jtt.micro.String_format02.test(0))) {
				fail(runString);
				return;
			}
			// (-11) == "Hello -11"
			runString = "(-11)";
			if (!"Hello -11".equals(jtt.micro.String_format02.test(-11))) {
				fail(runString);
				return;
			}
			// (-2147483648) == "Hello -2147483648"
			runString = "(-2147483648)";
			if (!"Hello -2147483648".equals(jtt.micro.String_format02
					.test(-2147483648))) {
				fail(runString);
				return;
			}
			// (2147483647) == "Hello 2147483647"
			runString = "(2147483647)";
			if (!"Hello 2147483647".equals(jtt.micro.String_format02
					.test(2147483647))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_String01() {
		begin("jtt.micro.VarArgs_String01");
		String runString = null;
		try {
			// (0) == "a"
			runString = "(0)";
			if (!"a".equals(jtt.micro.VarArgs_String01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == null
			runString = "(1)";
			if (null != jtt.micro.VarArgs_String01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == "test"
			runString = "(2)";
			if (!"test".equals(jtt.micro.VarArgs_String01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_String01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_String01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_boolean01() {
		begin("jtt.micro.VarArgs_boolean01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.micro.VarArgs_boolean01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.micro.VarArgs_boolean01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.micro.VarArgs_boolean01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_boolean01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_boolean01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_byte01() {
		begin("jtt.micro.VarArgs_byte01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if ((byte) 1 != jtt.micro.VarArgs_byte01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 2
			runString = "(1)";
			if ((byte) 2 != jtt.micro.VarArgs_byte01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 3
			runString = "(2)";
			if ((byte) 3 != jtt.micro.VarArgs_byte01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_byte01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_byte01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_char01() {
		begin("jtt.micro.VarArgs_char01");
		String runString = null;
		try {
			// (0) == 'a'
			runString = "(0)";
			if ((char) 97 != jtt.micro.VarArgs_char01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 'b'
			runString = "(1)";
			if ((char) 98 != jtt.micro.VarArgs_char01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 'c'
			runString = "(2)";
			if ((char) 99 != jtt.micro.VarArgs_char01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_char01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_char01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_double01() {
		begin("jtt.micro.VarArgs_double01");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0 != jtt.micro.VarArgs_double01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0 != jtt.micro.VarArgs_double01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2.0
			runString = "(2)";
			if (2.0 != jtt.micro.VarArgs_double01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_double01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_double01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_float01() {
		begin("jtt.micro.VarArgs_float01");
		String runString = null;
		try {
			// (0) == 0.0
			runString = "(0)";
			if (0.0f != jtt.micro.VarArgs_float01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1.0
			runString = "(1)";
			if (1.0f != jtt.micro.VarArgs_float01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2.0
			runString = "(2)";
			if (2.0f != jtt.micro.VarArgs_float01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_float01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_float01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_int01() {
		begin("jtt.micro.VarArgs_int01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.micro.VarArgs_int01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.micro.VarArgs_int01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.micro.VarArgs_int01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_int01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_int01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_long01() {
		begin("jtt.micro.VarArgs_long01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0L != jtt.micro.VarArgs_long01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1L != jtt.micro.VarArgs_long01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2L != jtt.micro.VarArgs_long01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_long01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_long01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_micro_VarArgs_short01() {
		begin("jtt.micro.VarArgs_short01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if ((short) 0 != jtt.micro.VarArgs_short01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if ((short) 1 != jtt.micro.VarArgs_short01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if ((short) 2 != jtt.micro.VarArgs_short01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.micro.VarArgs_short01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(4)";
				jtt.micro.VarArgs_short01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_get01() {
		begin("jtt.reflect.Array_get01");
		String runString = null;
		try {
			// (0) == "0"
			runString = "(0)";
			if (!"0".equals(jtt.reflect.Array_get01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "1"
			runString = "(1)";
			if (!"1".equals(jtt.reflect.Array_get01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "2"
			runString = "(2)";
			if (!"2".equals(jtt.reflect.Array_get01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_get01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_get02() {
		begin("jtt.reflect.Array_get02");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.reflect.Array_get02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if (21 != jtt.reflect.Array_get02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if (42 != jtt.reflect.Array_get02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_get02.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_get03() {
		begin("jtt.reflect.Array_get03");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if ((byte) 11 != jtt.reflect.Array_get03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if ((byte) 21 != jtt.reflect.Array_get03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if ((byte) 42 != jtt.reflect.Array_get03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_get03.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getBoolean01() {
		begin("jtt.reflect.Array_getBoolean01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Array_getBoolean01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.reflect.Array_getBoolean01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Array_getBoolean01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getBoolean01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getByte01() {
		begin("jtt.reflect.Array_getByte01");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if ((byte) 11 != jtt.reflect.Array_getByte01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if ((byte) 21 != jtt.reflect.Array_getByte01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if ((byte) 42 != jtt.reflect.Array_getByte01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getByte01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getChar01() {
		begin("jtt.reflect.Array_getChar01");
		String runString = null;
		try {
			// (0) == '\13'
			runString = "(0)";
			if ((char) 11 != jtt.reflect.Array_getChar01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == '\25'
			runString = "(1)";
			if ((char) 21 != jtt.reflect.Array_getChar01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == '*'
			runString = "(2)";
			if ((char) 42 != jtt.reflect.Array_getChar01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getChar01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getDouble01() {
		begin("jtt.reflect.Array_getDouble01");
		String runString = null;
		try {
			// (0) == 11.1
			runString = "(0)";
			if (11.1 != jtt.reflect.Array_getDouble01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21.1
			runString = "(1)";
			if (21.1 != jtt.reflect.Array_getDouble01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42.1
			runString = "(2)";
			if (42.1 != jtt.reflect.Array_getDouble01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getDouble01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getFloat01() {
		begin("jtt.reflect.Array_getFloat01");
		String runString = null;
		try {
			// (0) == 11.1
			runString = "(0)";
			if (11.1f != jtt.reflect.Array_getFloat01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21.1
			runString = "(1)";
			if (21.1f != jtt.reflect.Array_getFloat01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42.1
			runString = "(2)";
			if (42.1f != jtt.reflect.Array_getFloat01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getFloat01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getInt01() {
		begin("jtt.reflect.Array_getInt01");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11 != jtt.reflect.Array_getInt01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if (21 != jtt.reflect.Array_getInt01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if (42 != jtt.reflect.Array_getInt01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getInt01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getLength01() {
		begin("jtt.reflect.Array_getLength01");
		String runString = null;
		try {
			// (0) == 3
			runString = "(0)";
			if (3 != jtt.reflect.Array_getLength01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 4
			runString = "(1)";
			if (4 != jtt.reflect.Array_getLength01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 1
			runString = "(2)";
			if (1 != jtt.reflect.Array_getLength01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.NullPointerException
			try {
				runString = "(3)";
				jtt.reflect.Array_getLength01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getLong01() {
		begin("jtt.reflect.Array_getLong01");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if (11L != jtt.reflect.Array_getLong01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if (21L != jtt.reflect.Array_getLong01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if (42L != jtt.reflect.Array_getLong01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getLong01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_getShort01() {
		begin("jtt.reflect.Array_getShort01");
		String runString = null;
		try {
			// (0) == 11
			runString = "(0)";
			if ((short) 11 != jtt.reflect.Array_getShort01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 21
			runString = "(1)";
			if ((short) 21 != jtt.reflect.Array_getShort01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 42
			runString = "(2)";
			if ((short) 42 != jtt.reflect.Array_getShort01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3)";
				jtt.reflect.Array_getShort01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance01() {
		begin("jtt.reflect.Array_newInstance01");
		String runString = null;
		try {
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Array_newInstance01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance02() {
		begin("jtt.reflect.Array_newInstance02");
		String runString = null;
		try {
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Array_newInstance02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance03() {
		begin("jtt.reflect.Array_newInstance03");
		String runString = null;
		try {
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Array_newInstance03.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance04() {
		begin("jtt.reflect.Array_newInstance04");
		String runString = null;
		try {
			// (1,0) == true
			runString = "(1,0)";
			if (true != jtt.reflect.Array_newInstance04.test(1, 0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance05() {
		begin("jtt.reflect.Array_newInstance05");
		String runString = null;
		try {
			// (1,3) == true
			runString = "(1,3)";
			if (true != jtt.reflect.Array_newInstance05.test(1, 3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_newInstance06() {
		begin("jtt.reflect.Array_newInstance06");
		String runString = null;
		try {
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Array_newInstance06.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_set01() {
		begin("jtt.reflect.Array_set01");
		String runString = null;
		try {
			// (0,"1") == "1"
			runString = "(0,\"1\")";
			if (!"1".equals(jtt.reflect.Array_set01.test(0, "1"))) {
				fail(runString);
				return;
			}
			// (1,"2") == "2"
			runString = "(1,\"2\")";
			if (!"2".equals(jtt.reflect.Array_set01.test(1, "2"))) {
				fail(runString);
				return;
			}
			// (0,"XXd") == "XXd"
			runString = "(0,\"XXd\")";
			if (!"XXd".equals(jtt.reflect.Array_set01.test(0, "XXd"))) {
				fail(runString);
				return;
			}
			// (3,"--") == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,\"--\")";
				jtt.reflect.Array_set01.test(3, "--");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_set02() {
		begin("jtt.reflect.Array_set02");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if (11 != jtt.reflect.Array_set02.test(0, 11)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if (21 != jtt.reflect.Array_set02.test(1, 21)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if (42 != jtt.reflect.Array_set02.test(0, 42)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_set02.test(3, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_set03() {
		begin("jtt.reflect.Array_set03");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if ((byte) 11 != jtt.reflect.Array_set03.test(0, (byte) 11)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if ((byte) 21 != jtt.reflect.Array_set03.test(1, (byte) 21)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if ((byte) 42 != jtt.reflect.Array_set03.test(0, (byte) 42)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_set03.test(3, (byte) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setBoolean01() {
		begin("jtt.reflect.Array_setBoolean01");
		String runString = null;
		try {
			// (0,true) == true
			runString = "(0,true)";
			if (true != jtt.reflect.Array_setBoolean01.test(0, true)) {
				fail(runString);
				return;
			}
			// (1,false) == false
			runString = "(1,false)";
			if (false != jtt.reflect.Array_setBoolean01.test(1, false)) {
				fail(runString);
				return;
			}
			// (2,true) == true
			runString = "(2,true)";
			if (true != jtt.reflect.Array_setBoolean01.test(2, true)) {
				fail(runString);
				return;
			}
			// (3,false) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,false)";
				jtt.reflect.Array_setBoolean01.test(3, false);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setByte01() {
		begin("jtt.reflect.Array_setByte01");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if ((byte) 11 != jtt.reflect.Array_setByte01.test(0, (byte) 11)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if ((byte) 21 != jtt.reflect.Array_setByte01.test(1, (byte) 21)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if ((byte) 42 != jtt.reflect.Array_setByte01.test(0, (byte) 42)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_setByte01.test(3, (byte) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setChar01() {
		begin("jtt.reflect.Array_setChar01");
		String runString = null;
		try {
			// (0,'\13') == '\13'
			runString = "(0,'\13')";
			if ((char) 11 != jtt.reflect.Array_setChar01.test(0, (char) 11)) {
				fail(runString);
				return;
			}
			// (1,'\25') == '\25'
			runString = "(1,'\25')";
			if ((char) 21 != jtt.reflect.Array_setChar01.test(1, (char) 21)) {
				fail(runString);
				return;
			}
			// (0,'*') == '*'
			runString = "(0,'*')";
			if ((char) 42 != jtt.reflect.Array_setChar01.test(0, (char) 42)) {
				fail(runString);
				return;
			}
			// (3,'\0') == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,'\0')";
				jtt.reflect.Array_setChar01.test(3, (char) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setDouble01() {
		begin("jtt.reflect.Array_setDouble01");
		String runString = null;
		try {
			// (0,11.1) == 11.1
			runString = "(0,11.1)";
			if (11.1 != jtt.reflect.Array_setDouble01.test(0, 11.1)) {
				fail(runString);
				return;
			}
			// (1,21.1) == 21.1
			runString = "(1,21.1)";
			if (21.1 != jtt.reflect.Array_setDouble01.test(1, 21.1)) {
				fail(runString);
				return;
			}
			// (0,42.1) == 42.1
			runString = "(0,42.1)";
			if (42.1 != jtt.reflect.Array_setDouble01.test(0, 42.1)) {
				fail(runString);
				return;
			}
			// (3,0.1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0.1)";
				jtt.reflect.Array_setDouble01.test(3, 0.1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setFloat01() {
		begin("jtt.reflect.Array_setFloat01");
		String runString = null;
		try {
			// (0,11.1) == 11.1
			runString = "(0,11.1)";
			if (11.1f != jtt.reflect.Array_setFloat01.test(0, 11.1f)) {
				fail(runString);
				return;
			}
			// (1,21.1) == 21.1
			runString = "(1,21.1)";
			if (21.1f != jtt.reflect.Array_setFloat01.test(1, 21.1f)) {
				fail(runString);
				return;
			}
			// (0,42.1) == 42.1
			runString = "(0,42.1)";
			if (42.1f != jtt.reflect.Array_setFloat01.test(0, 42.1f)) {
				fail(runString);
				return;
			}
			// (3,0.1) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0.1)";
				jtt.reflect.Array_setFloat01.test(3, 0.1f);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setInt01() {
		begin("jtt.reflect.Array_setInt01");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if (11 != jtt.reflect.Array_setInt01.test(0, 11)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if (21 != jtt.reflect.Array_setInt01.test(1, 21)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if (42 != jtt.reflect.Array_setInt01.test(0, 42)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_setInt01.test(3, 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setLong01() {
		begin("jtt.reflect.Array_setLong01");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if (11L != jtt.reflect.Array_setLong01.test(0, 11L)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if (21L != jtt.reflect.Array_setLong01.test(1, 21L)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if (42L != jtt.reflect.Array_setLong01.test(0, 42L)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_setLong01.test(3, 0L);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Array_setShort01() {
		begin("jtt.reflect.Array_setShort01");
		String runString = null;
		try {
			// (0,11) == 11
			runString = "(0,11)";
			if ((short) 11 != jtt.reflect.Array_setShort01.test(0, (short) 11)) {
				fail(runString);
				return;
			}
			// (1,21) == 21
			runString = "(1,21)";
			if ((short) 21 != jtt.reflect.Array_setShort01.test(1, (short) 21)) {
				fail(runString);
				return;
			}
			// (0,42) == 42
			runString = "(0,42)";
			if ((short) 42 != jtt.reflect.Array_setShort01.test(0, (short) 42)) {
				fail(runString);
				return;
			}
			// (3,0) == !java.lang.ArrayIndexOutOfBoundsException
			try {
				runString = "(3,0)";
				jtt.reflect.Array_setShort01.test(3, (short) 0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.ArrayIndexOutOfBoundsException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getDeclaredField01() {
		begin("jtt.reflect.Class_getDeclaredField01");
		String runString = null;
		try {
			// ("test") == !java.lang.NoSuchFieldException
			try {
				runString = "(\"test\")";
				jtt.reflect.Class_getDeclaredField01.test("test");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchFieldException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("field") == "field"
			runString = "(\"field\")";
			if (!"field".equals(jtt.reflect.Class_getDeclaredField01
					.test("field"))) {
				fail(runString);
				return;
			}
			// ("f2") == "f2"
			runString = "(\"f2\")";
			if (!"f2".equals(jtt.reflect.Class_getDeclaredField01.test("f2"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getDeclaredMethod01() {
		begin("jtt.reflect.Class_getDeclaredMethod01");
		String runString = null;
		try {
			// ("test") == !java.lang.NoSuchMethodException
			try {
				runString = "(\"test\")";
				jtt.reflect.Class_getDeclaredMethod01.test("test");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("main") == "main"
			runString = "(\"main\")";
			if (!"main".equals(jtt.reflect.Class_getDeclaredMethod01
					.test("main"))) {
				fail(runString);
				return;
			}
			// ("xx") == !java.lang.NoSuchMethodException
			try {
				runString = "(\"xx\")";
				jtt.reflect.Class_getDeclaredMethod01.test("xx");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getField01() {
		begin("jtt.reflect.Class_getField01");
		String runString = null;
		try {
			// ("test") == !java.lang.NoSuchFieldException
			try {
				runString = "(\"test\")";
				jtt.reflect.Class_getField01.test("test");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchFieldException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("field") == "field"
			runString = "(\"field\")";
			if (!"field".equals(jtt.reflect.Class_getField01.test("field"))) {
				fail(runString);
				return;
			}
			// ("field2") == "field2"
			runString = "(\"field2\")";
			if (!"field2".equals(jtt.reflect.Class_getField01.test("field2"))) {
				fail(runString);
				return;
			}
			// ("field3") == !java.lang.NoSuchFieldException
			try {
				runString = "(\"field3\")";
				jtt.reflect.Class_getField01.test("field3");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchFieldException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getField02() {
		begin("jtt.reflect.Class_getField02");
		String runString = null;
		try {
			// ("test") == !java.lang.NoSuchFieldException
			try {
				runString = "(\"test\")";
				jtt.reflect.Class_getField02.test("test");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchFieldException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("field") == "field"
			runString = "(\"field\")";
			if (!"field".equals(jtt.reflect.Class_getField02.test("field"))) {
				fail(runString);
				return;
			}
			// ("field2") == "field2"
			runString = "(\"field2\")";
			if (!"field2".equals(jtt.reflect.Class_getField02.test("field2"))) {
				fail(runString);
				return;
			}
			// ("field3") == !java.lang.NoSuchFieldException
			try {
				runString = "(\"field3\")";
				jtt.reflect.Class_getField02.test("field3");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchFieldException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("field4") == "field4"
			runString = "(\"field4\")";
			if (!"field4".equals(jtt.reflect.Class_getField02.test("field4"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getMethod01() {
		begin("jtt.reflect.Class_getMethod01");
		String runString = null;
		try {
			// ("test") == !java.lang.NoSuchMethodException
			try {
				runString = "(\"test\")";
				jtt.reflect.Class_getMethod01.test("test");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// ("main") == "main"
			runString = "(\"main\")";
			if (!"main".equals(jtt.reflect.Class_getMethod01.test("main"))) {
				fail(runString);
				return;
			}
			// ("xx") == !java.lang.NoSuchMethodException
			try {
				runString = "(\"xx\")";
				jtt.reflect.Class_getMethod01.test("xx");
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_getMethod02() {
		begin("jtt.reflect.Class_getMethod02");
		String runString = null;
		try {
			// (0) == !java.lang.NoSuchMethodException
			try {
				runString = "(0)";
				jtt.reflect.Class_getMethod02.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == "test"
			runString = "(1)";
			if (!"test".equals(jtt.reflect.Class_getMethod02.test(1))) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NoSuchMethodException
			try {
				runString = "(2)";
				jtt.reflect.Class_getMethod02.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == "main"
			runString = "(3)";
			if (!"main".equals(jtt.reflect.Class_getMethod02.test(3))) {
				fail(runString);
				return;
			}
			// (4) == !java.lang.NoSuchMethodException
			try {
				runString = "(4)";
				jtt.reflect.Class_getMethod02.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// (5) == !java.lang.NoSuchMethodException
			try {
				runString = "(5)";
				jtt.reflect.Class_getMethod02.test(5);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NoSuchMethodException.class) {
					fail(runString, e);
					return;
				}
			}
			// (6) == null
			runString = "(6)";
			if (null != jtt.reflect.Class_getMethod02.test(6)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_newInstance01() {
		begin("jtt.reflect.Class_newInstance01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Class_newInstance01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.reflect.Class_newInstance01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_newInstance02() {
		begin("jtt.reflect.Class_newInstance02");
		String runString = null;
		try {
			// (0) == !java.lang.IllegalAccessException
			try {
				runString = "(0)";
				jtt.reflect.Class_newInstance02.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalAccessException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.reflect.Class_newInstance02.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_newInstance03() {
		begin("jtt.reflect.Class_newInstance03");
		String runString = null;
		try {
			// (0) == !java.lang.InstantiationException
			try {
				runString = "(0)";
				jtt.reflect.Class_newInstance03.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.InstantiationException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == !java.lang.InstantiationException
			try {
				runString = "(1)";
				jtt.reflect.Class_newInstance03.test(1);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.InstantiationException.class) {
					fail(runString, e);
					return;
				}
			}
			// (2) == !java.lang.InstantiationException
			try {
				runString = "(2)";
				jtt.reflect.Class_newInstance03.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.InstantiationException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.InstantiationException
			try {
				runString = "(3)";
				jtt.reflect.Class_newInstance03.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.InstantiationException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.reflect.Class_newInstance03.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_newInstance06() {
		begin("jtt.reflect.Class_newInstance06");
		String runString = null;
		try {
			// (0) == !java.lang.InstantiationException
			try {
				runString = "(0)";
				jtt.reflect.Class_newInstance06.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.InstantiationException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.reflect.Class_newInstance06.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Class_newInstance07() {
		begin("jtt.reflect.Class_newInstance07");
		String runString = null;
		try {
			// (0) == !java.lang.Exception
			try {
				runString = "(0)";
				jtt.reflect.Class_newInstance07.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.Exception.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.reflect.Class_newInstance07.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_get01() {
		begin("jtt.reflect.Field_get01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_get01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_get01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_get01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_get01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_get01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_get01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_get01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_get01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_get01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_get02() {
		begin("jtt.reflect.Field_get02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_get02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_get02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_get02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_get02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_get02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_get02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_get02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_get02.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_get02.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_get03() {
		begin("jtt.reflect.Field_get03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_get03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_get03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_get03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_get03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_get03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_get03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_get03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_get03.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_get03.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_get04() {
		begin("jtt.reflect.Field_get04");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_get04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_get04.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_get04.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_get04.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_get04.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_get04.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_get04.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_get04.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_get04.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_getType01() {
		begin("jtt.reflect.Field_getType01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_getType01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_getType01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_getType01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_getType01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_getType01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_getType01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_getType01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_getType01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_getType01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_set01() {
		begin("jtt.reflect.Field_set01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_set01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_set01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_set01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_set01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_set01.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_set01.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_set01.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_set01.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_set01.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_set02() {
		begin("jtt.reflect.Field_set02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_set02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_set02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_set02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_set02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_set02.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_set02.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_set02.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_set02.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_set02.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Field_set03() {
		begin("jtt.reflect.Field_set03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.reflect.Field_set03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.reflect.Field_set03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.reflect.Field_set03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.reflect.Field_set03.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.reflect.Field_set03.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.reflect.Field_set03.test(5)) {
				fail(runString);
				return;
			}
			// (6) == true
			runString = "(6)";
			if (true != jtt.reflect.Field_set03.test(6)) {
				fail(runString);
				return;
			}
			// (7) == true
			runString = "(7)";
			if (true != jtt.reflect.Field_set03.test(7)) {
				fail(runString);
				return;
			}
			// (8) == false
			runString = "(8)";
			if (false != jtt.reflect.Field_set03.test(8)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Invoke_except01() {
		begin("jtt.reflect.Invoke_except01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.reflect.Invoke_except01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 3
			runString = "(1)";
			if (3 != jtt.reflect.Invoke_except01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.reflect.InvocationTargetException
			try {
				runString = "(2)";
				jtt.reflect.Invoke_except01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.reflect.InvocationTargetException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == !java.lang.IllegalArgumentException
			try {
				runString = "(3)";
				jtt.reflect.Invoke_except01.test(3);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalArgumentException.class) {
					fail(runString, e);
					return;
				}
			}
			// (4) == !java.lang.IllegalArgumentException
			try {
				runString = "(4)";
				jtt.reflect.Invoke_except01.test(4);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalArgumentException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Invoke_main01() {
		begin("jtt.reflect.Invoke_main01");
		String runString = null;
		try {
			// ("test1") == "test1"
			runString = "(\"test1\")";
			if (!"test1".equals(jtt.reflect.Invoke_main01.test("test1"))) {
				fail(runString);
				return;
			}
			// ("test2") == "test2"
			runString = "(\"test2\")";
			if (!"test2".equals(jtt.reflect.Invoke_main01.test("test2"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Invoke_main02() {
		begin("jtt.reflect.Invoke_main02");
		String runString = null;
		try {
			// ("test1") == "test1"
			runString = "(\"test1\")";
			if (!"test1".equals(jtt.reflect.Invoke_main02.test("test1"))) {
				fail(runString);
				return;
			}
			// ("test2") == "test2"
			runString = "(\"test2\")";
			if (!"test2".equals(jtt.reflect.Invoke_main02.test("test2"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Invoke_main03() {
		begin("jtt.reflect.Invoke_main03");
		String runString = null;
		try {
			// ("test1") == "test1"
			runString = "(\"test1\")";
			if (!"test1".equals(jtt.reflect.Invoke_main03.test("test1"))) {
				fail(runString);
				return;
			}
			// ("test2") == "test2"
			runString = "(\"test2\")";
			if (!"test2".equals(jtt.reflect.Invoke_main03.test("test2"))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Invoke_virtual01() {
		begin("jtt.reflect.Invoke_virtual01");
		String runString = null;
		try {
			// (1) == 55
			runString = "(1)";
			if (55 != jtt.reflect.Invoke_virtual01.test(1)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Method_getParameterTypes01() {
		begin("jtt.reflect.Method_getParameterTypes01");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.reflect.Method_getParameterTypes01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 1
			runString = "(1)";
			if (1 != jtt.reflect.Method_getParameterTypes01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 2
			runString = "(2)";
			if (2 != jtt.reflect.Method_getParameterTypes01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == -1
			runString = "(3)";
			if (-1 != jtt.reflect.Method_getParameterTypes01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Method_getReturnType01() {
		begin("jtt.reflect.Method_getReturnType01");
		String runString = null;
		try {
			// (0) == "int"
			runString = "(0)";
			if (!"int".equals(jtt.reflect.Method_getReturnType01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "java.lang.String"
			runString = "(1)";
			if (!"java.lang.String".equals(jtt.reflect.Method_getReturnType01
					.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "void"
			runString = "(2)";
			if (!"void".equals(jtt.reflect.Method_getReturnType01.test(2))) {
				fail(runString);
				return;
			}
			// (3) == null
			runString = "(3)";
			if (null != jtt.reflect.Method_getReturnType01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_reflect_Reflection_getCallerClass01() {
		begin("jtt.reflect.Reflection_getCallerClass01");
		String runString = null;
		try {
			// (0) == "sun.reflect.Reflection"
			runString = "(0)";
			if (!"sun.reflect.Reflection"
					.equals(jtt.reflect.Reflection_getCallerClass01.test(0))) {
				fail(runString);
				return;
			}
			// (1) == "jtt.reflect.Reflection_getCallerClass01$Caller1"
			runString = "(1)";
			if (!"jtt.reflect.Reflection_getCallerClass01$Caller1"
					.equals(jtt.reflect.Reflection_getCallerClass01.test(1))) {
				fail(runString);
				return;
			}
			// (2) == "jtt.reflect.Reflection_getCallerClass01$Caller2"
			runString = "(2)";
			if (!"jtt.reflect.Reflection_getCallerClass01$Caller2"
					.equals(jtt.reflect.Reflection_getCallerClass01.test(2))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Monitor_contended01() {
		begin("jtt.threads.Monitor_contended01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Monitor_contended01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Monitor_notowner01() {
		begin("jtt.threads.Monitor_notowner01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Monitor_notowner01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Monitorenter01() {
		begin("jtt.threads.Monitorenter01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Monitorenter01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Monitorenter02() {
		begin("jtt.threads.Monitorenter02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Monitorenter02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Object_wait01() {
		begin("jtt.threads.Object_wait01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Object_wait01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Object_wait01.test(1)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.threads.Object_wait01.test(3)) {
				fail(runString);
				return;
			}
			// (15) == true
			runString = "(15)";
			if (true != jtt.threads.Object_wait01.test(15)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Object_wait02() {
		begin("jtt.threads.Object_wait02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Object_wait02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Object_wait02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.threads.Object_wait02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Object_wait03() {
		begin("jtt.threads.Object_wait03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Object_wait03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Object_wait03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.threads.Object_wait03.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Object_wait04() {
		begin("jtt.threads.Object_wait04");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Object_wait04.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Object_wait04.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.threads.Object_wait04.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.threads.Object_wait04.test(3)) {
				fail(runString);
				return;
			}
			// (4) == true
			runString = "(4)";
			if (true != jtt.threads.Object_wait04.test(4)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.threads.Object_wait04.test(5)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_ThreadLocal01() {
		begin("jtt.threads.ThreadLocal01");
		String runString = null;
		try {
			// (0) == 5
			runString = "(0)";
			if (5 != jtt.threads.ThreadLocal01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 6
			runString = "(1)";
			if (6 != jtt.threads.ThreadLocal01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 7
			runString = "(2)";
			if (7 != jtt.threads.ThreadLocal01.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_ThreadLocal02() {
		begin("jtt.threads.ThreadLocal02");
		String runString = null;
		try {
			// (0) == 5
			runString = "(0)";
			if (5 != jtt.threads.ThreadLocal02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 6
			runString = "(1)";
			if (6 != jtt.threads.ThreadLocal02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 7
			runString = "(2)";
			if (7 != jtt.threads.ThreadLocal02.test(2)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_ThreadLocal03() {
		begin("jtt.threads.ThreadLocal03");
		String runString = null;
		try {
			// (0) == 0
			runString = "(0)";
			if (0 != jtt.threads.ThreadLocal03.test(0)) {
				fail(runString);
				return;
			}
			// (1) == 15
			runString = "(1)";
			if (15 != jtt.threads.ThreadLocal03.test(1)) {
				fail(runString);
				return;
			}
			// (2) == 31
			runString = "(2)";
			if (31 != jtt.threads.ThreadLocal03.test(2)) {
				fail(runString);
				return;
			}
			// (3) == 48
			runString = "(3)";
			if (48 != jtt.threads.ThreadLocal03.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_currentThread01() {
		begin("jtt.threads.Thread_currentThread01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_currentThread01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_getState01() {
		begin("jtt.threads.Thread_getState01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_getState01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_getState02() {
		begin("jtt.threads.Thread_getState02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_getState02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_holdsLock01() {
		begin("jtt.threads.Thread_holdsLock01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_holdsLock01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == false
			runString = "(1)";
			if (false != jtt.threads.Thread_holdsLock01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == !java.lang.NullPointerException
			try {
				runString = "(2)";
				jtt.threads.Thread_holdsLock01.test(2);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.NullPointerException.class) {
					fail(runString, e);
					return;
				}
			}
			// (3) == false
			runString = "(3)";
			if (false != jtt.threads.Thread_holdsLock01.test(3)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isAlive01() {
		begin("jtt.threads.Thread_isAlive01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_isAlive01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isInterrupted01() {
		begin("jtt.threads.Thread_isInterrupted01");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.threads.Thread_isInterrupted01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isInterrupted02() {
		begin("jtt.threads.Thread_isInterrupted02");
		String runString = null;
		try {
			// (0,0) == true
			runString = "(0,0)";
			if (true != jtt.threads.Thread_isInterrupted02.test(0, 0)) {
				fail(runString);
				return;
			}
			// (1,500) == true
			runString = "(1,500)";
			if (true != jtt.threads.Thread_isInterrupted02.test(1, 500)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isInterrupted03() {
		begin("jtt.threads.Thread_isInterrupted03");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_isInterrupted03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isInterrupted04() {
		begin("jtt.threads.Thread_isInterrupted04");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_isInterrupted04.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_isInterrupted05() {
		begin("jtt.threads.Thread_isInterrupted05");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_isInterrupted05.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_join01() {
		begin("jtt.threads.Thread_join01");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.threads.Thread_join01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_join02() {
		begin("jtt.threads.Thread_join02");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.threads.Thread_join02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_join03() {
		begin("jtt.threads.Thread_join03");
		String runString = null;
		try {
			// (0) == false
			runString = "(0)";
			if (false != jtt.threads.Thread_join03.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_new01() {
		begin("jtt.threads.Thread_new01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_new01.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Thread_new01.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.threads.Thread_new01.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.threads.Thread_new01.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.threads.Thread_new01.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_new02() {
		begin("jtt.threads.Thread_new02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_new02.test(0)) {
				fail(runString);
				return;
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Thread_new02.test(1)) {
				fail(runString);
				return;
			}
			// (2) == true
			runString = "(2)";
			if (true != jtt.threads.Thread_new02.test(2)) {
				fail(runString);
				return;
			}
			// (3) == true
			runString = "(3)";
			if (true != jtt.threads.Thread_new02.test(3)) {
				fail(runString);
				return;
			}
			// (4) == false
			runString = "(4)";
			if (false != jtt.threads.Thread_new02.test(4)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_setPriority01() {
		begin("jtt.threads.Thread_setPriority01");
		String runString = null;
		try {
			// (0) == !java.lang.IllegalArgumentException
			try {
				runString = "(0)";
				jtt.threads.Thread_setPriority01.test(0);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalArgumentException.class) {
					fail(runString, e);
					return;
				}
			}
			// (1) == true
			runString = "(1)";
			if (true != jtt.threads.Thread_setPriority01.test(1)) {
				fail(runString);
				return;
			}
			// (5) == true
			runString = "(5)";
			if (true != jtt.threads.Thread_setPriority01.test(5)) {
				fail(runString);
				return;
			}
			// (10) == true
			runString = "(10)";
			if (true != jtt.threads.Thread_setPriority01.test(10)) {
				fail(runString);
				return;
			}
			// (11) == !java.lang.IllegalArgumentException
			try {
				runString = "(11)";
				jtt.threads.Thread_setPriority01.test(11);
				fail(runString);
				return;
			} catch (Throwable e) {
				if (e.getClass() != java.lang.IllegalArgumentException.class) {
					fail(runString, e);
					return;
				}
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_sleep01() {
		begin("jtt.threads.Thread_sleep01");
		String runString = null;
		try {
			// (10) == true
			runString = "(10)";
			if (true != jtt.threads.Thread_sleep01.test(10)) {
				fail(runString);
				return;
			}
			// (20) == true
			runString = "(20)";
			if (true != jtt.threads.Thread_sleep01.test(20)) {
				fail(runString);
				return;
			}
			// (100) == true
			runString = "(100)";
			if (true != jtt.threads.Thread_sleep01.test(100)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_start01() {
		begin("jtt.threads.Thread_start01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_start01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_threads_Thread_yield01() {
		begin("jtt.threads.Thread_yield01");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.threads.Thread_yield01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_Class_getName() {
		begin("jtt.jdk.Class_getName");
		String runString = null;
		try {
			// (0) == "java.lang.String"
			runString = "(0)";
			if (!"java.lang.String".equals(jtt.jdk.Class_getName.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_EnumMap01() {
		begin("jtt.jdk.EnumMap01");
		String runString = null;
		try {
			// (0) == "A"
			runString = "(0)";
			if (!"A".equals(jtt.jdk.EnumMap01.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_EnumMap02() {
		begin("jtt.jdk.EnumMap02");
		String runString = null;
		try {
			// (0) == "A"
			runString = "(0)";
			if (!"A".equals(jtt.jdk.EnumMap02.test(0))) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_System_currentTimeMillis01() {
		begin("jtt.jdk.System_currentTimeMillis01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.jdk.System_currentTimeMillis01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_System_currentTimeMillis02() {
		begin("jtt.jdk.System_currentTimeMillis02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.jdk.System_currentTimeMillis02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_System_nanoTime01() {
		begin("jtt.jdk.System_nanoTime01");
		String runString = null;
		try {
			// (0) == 1
			runString = "(0)";
			if (1 != jtt.jdk.System_nanoTime01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_System_nanoTime02() {
		begin("jtt.jdk.System_nanoTime02");
		String runString = null;
		try {
			// (0) == true
			runString = "(0)";
			if (true != jtt.jdk.System_nanoTime02.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}

	static void jtt_jdk_UnsafeAccess01() {
		begin("jtt.jdk.UnsafeAccess01");
		String runString = null;
		try {
			// (0) == 42
			runString = "(0)";
			if (42 != jtt.jdk.UnsafeAccess01.test(0)) {
				fail(runString);
				return;
			}
		} catch (Throwable t) {
			fail(runString, t);
			return;
		}
		pass();
	}
	// END GENERATED TEST RUNS
	// Checkstyle: resume

}
