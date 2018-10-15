#
# Copyright (c) 2018, APT Group, School of Computer Science,
# The University of Manchester. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# under the terms of the GNU General Public License version 2 only, as
# published by the Free Software Foundation.
#
# This code is distributed in the hope that it will be useful, but WITHOUT
# ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
# FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
# version 2 for more details (a copy is included in the LICENSE file that
# accompanied this code).
#
# You should have received a copy of the GNU General Public License version
# 2 along with this work; if not, write to the Free Software Foundation,
# Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
#

suite = {
    "mxversion": "5.110.4",
    "name": "Maxine-Graal",
    "sourceinprojectwhitelist": [],
    "url": "https://github.com/beehive-lab/Maxine-Graal",
    "scm": {
        "url": "https://github.com/beehive-lab/Maxine-Graal",
        "read": "https://github.com/beehive-lab/Maxine-Graal.git",
        "write": "git@github.com:beehive-lab/Maxine-Graal.git",
    },
    "outputRoot": "./",
    "javac.lint.overrides": "none",

    "licenses": {
        "GPLv2": {
            "name": "GNU General Public License, version 2",
            "url": "https://www.gnu.org/licenses/gpl-2.0.html"
        },
    },

    "defaultLicense": "GPLv2",

    # ------------- JDK Libraries -------------
    "jdklibraries": {
        "JDK_TOOLS": {
            "path": 'lib/tools.jar',
            "jdkStandardizedSince": "999",
        },
    },

    # ------------- Libraries -------------
    "libraries": {

        "DACAPO": {
            "urls": ["https://downloads.sourceforge.net/project/dacapobench/archive/9.12-bach/dacapo-9.12-bach.jar"],
            "path": "lib/dacapo-9.12-bach.jar",
            "sha1": "2626a9546df09009f6da0df854e6dc1113ef7dd4",
        },

        "DACAPO_SCALA": {
            "urls": [
                "http://repo.scalabench.org/snapshots/org/scalabench/benchmarks/scala-benchmark-suite/0.1.0-SNAPSHOT/scala-benchmark-suite-0.1.0-20120216.103539-3.jar"],
            "path": "lib/dacapo-scala-0.1.0-20120216.jar",
            "sha1": "59b64c974662b5cf9dbd3cf9045d293853dd7a51",
        },

        "OKRA": {
            "urls": ["http://cr.openjdk.java.net/~tdeneau/okra-1.9.jar"],
            "path": "lib/okra-1.9.jar",
            "sha1": "df450b04882e6b5a365299e2cbf1622038ae880e",
        },

    },

    "distributions": {

        "GRAAL": {
            "dependencies": [
                "com.oracle.graal.hotspot.amd64",
                "com.oracle.graal.truffle",
                "com.oracle.graal.truffle.printer",
                "com.oracle.graal.hotspot.sparc",
                "com.oracle.graal.hotspot",
                "com.oracle.graal.compiler.hsail"
            ]
        },

        "GRAAL_MAXINE": {
            "dependencies": [
                "com.oracle.graal.api.meta",
                "com.oracle.graal.api.code",
                "com.oracle.graal.amd64",
                "com.oracle.graal.compiler",
                "com.oracle.graal.compiler.amd64",
                "com.oracle.graal.printer",
                "com.oracle.graal.replacements",
                "com.oracle.graal.replacements.amd64",
            ]
        },

        "ServiceProcessor": {
            "dependencies": ["com.oracle.graal.service.processor"]
        },

        "DSLProcessor": {
            "dependencies": ["com.oracle.truffle.dsl.processor"]
        },

        "ReplacementVerifier": {
            "dependencies": ["com.oracle.graal.replacements.verifier"]
        },

        "Options": {
            "dependencies": ["com.oracle.graal.options"]
        },

    },

    "projects": {

        "com.oracle.graal.api.runtime": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal",
        },

        "com.oracle.graal.api.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["mx:JUNIT", "com.oracle.graal.api.runtime"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal,Test",
        },

        "com.oracle.graal.api.meta": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal",
        },

        "com.oracle.graal.api.meta.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["mx:JUNIT", "com.oracle.graal.api.meta", "com.oracle.graal.api.runtime"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal,Test",
        },

        "com.oracle.graal.api.code": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.meta"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal",
        },

        "com.oracle.graal.api.replacements": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.meta"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal,Replacements",
        },

        "com.oracle.graal.service.processor": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.runtime"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Codegen,HotSpot",
        },

        "com.oracle.graal.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,AMD64",
        },

        "com.oracle.graal.ptx": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,PTX",
        },

        "com.oracle.graal.sparc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,SPARC",
        },

        "com.oracle.graal.hotspot": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.replacements", "com.oracle.graal.printer"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["ReplacementVerifier", "ServiceProcessor"],
            "workingSets": "Graal,HotSpot",
        },

        "com.oracle.graal.hotspot.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.hotspot", "com.oracle.graal.compiler.amd64",
                             "com.oracle.graal.replacements.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["ServiceProcessor"],
            "workingSets": "Graal,HotSpot,AMD64",
        },

        "com.oracle.graal.hotspot.sparc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.sparc"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,HotSpot,SPARC",
        },

        "com.oracle.graal.hotspot.server": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.hotspot"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,HotSpot",
        },

        "com.oracle.graal.hotspot.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.replacements.test", "com.oracle.graal.hotspot"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,HotSpot,Test",
        },

        "com.oracle.graal.hotspot.jdk8.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.8",
            "workingSets": "Graal,HotSpot,Test",
        },

        "com.oracle.graal.hotspot.amd64.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm.amd64", "com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,HotSpot,AMD64,Test",
        },

        "com.oracle.graal.options": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Codegen",
        },

        "com.oracle.graal.graph": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Graph",
        },

        "com.oracle.graal.graph.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "dependencies": ["mx:JUNIT", "com.oracle.graal.graph"],
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Graph,Test",
        },

        "com.oracle.graal.debug": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Debug",
        },

        "com.oracle.graal.debug.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["mx:JUNIT", "com.oracle.graal.debug"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Debug,Test",
        },

        "com.oracle.graal.lir": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm", "com.oracle.graal.nodes"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,LIR",
        },

        "com.oracle.graal.lir.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.lir", "com.oracle.graal.asm.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,LIR,AMD64",
        },

        "com.oracle.graal.lir.ptx": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm.ptx", "com.oracle.graal.lir"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,LIR,PTX",
        },

        "com.oracle.graal.lir.sparc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm.sparc"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,LIR,SPARC",
        },

        "com.oracle.graal.alloc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.nodes"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal",
        },

        "com.oracle.graal.word": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.phases"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Graal",
        },

        "com.oracle.graal.replacements": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler", "com.oracle.graal.java", "com.oracle.graal.word"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["ReplacementVerifier", "ServiceProcessor"],
            "workingSets": "Graal,Replacements",
        },

        "com.oracle.graal.replacements.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.replacements"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Replacements,AMD64",
        },

        "com.oracle.graal.replacements.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test", "com.oracle.graal.replacements"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Replacements,Test",
        },

        "com.oracle.graal.replacements.verifier": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.replacements"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Replacements",
        },

        "com.oracle.graal.nodes": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code", "com.oracle.graal.graph", "com.oracle.graal.debug",
                             "com.oracle.graal.api.replacements"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Graph",
        },

        "com.oracle.graal.nodes.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Graph",
        },

        "com.oracle.graal.phases": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.nodes", "com.oracle.graal.options"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["Options"],
            "workingSets": "Graal,Phases",
        },

        "com.oracle.graal.phases.common": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.phases"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["Options"],
            "workingSets": "Graal,Phases",
        },

        "com.oracle.graal.virtual": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.phases.common"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["Options"],
            "workingSets": "Graal,Phases",
        },

        "com.oracle.graal.loop": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.phases.common"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Phases",
        },

        "com.oracle.graal.compiler": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.runtime", "com.oracle.graal.virtual", "com.oracle.graal.loop",
                             "com.oracle.graal.alloc", "com.oracle.graal.lir"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["ServiceProcessor", "Options"],
            "workingSets": "Graal",
        },

        "com.oracle.graal.compiler.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler", "com.oracle.graal.lir.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,AMD64",
        },

        "com.oracle.graal.compiler.amd64.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,AMD64,Test",
        },

        "com.oracle.graal.compiler.ptx": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.lir.ptx", "com.oracle.graal.hotspot"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,PTX",
        },

        "com.oracle.graal.compiler.ptx.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.ptx", "com.oracle.graal.compiler.test", "com.oracle.graal.ptx"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,PTX,Test",
        },

        "com.oracle.graal.compiler.sparc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.lir.sparc"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,SPARC",
        },

        "com.oracle.graal.compiler.sparc.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,SPARC,Test",
        },

        "com.oracle.graal.bytecode": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Java",
        },

        "com.oracle.graal.java": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.phases", "com.oracle.graal.bytecode"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Java",
        },

        "com.oracle.graal.java.decompiler": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.java"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal",
        },

        "com.oracle.graal.java.decompiler.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.printer"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Test",
        },

        "com.oracle.graal.printer": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.java.decompiler", "com.oracle.graal.compiler"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Graph",
        },

        "com.oracle.graal.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["mx:JUNIT"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Test",
        },

        "com.oracle.graal.compiler.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.test", "com.oracle.graal.printer"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Test",
        },

        "com.oracle.graal.jtt": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Test",
        },

        "com.oracle.graal.asm": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler",
        },

        "com.oracle.graal.asm.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.runtime", "com.oracle.graal.test", "com.oracle.graal.asm"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler,Test",
        },

        "com.oracle.graal.asm.amd64": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm", "com.oracle.graal.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler,AMD64",
        },

        "com.oracle.graal.asm.amd64.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm.test", "com.oracle.graal.asm.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler,AMD64,Test",
        },

        "com.oracle.graal.hsail": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.api.code", "com.oracle.graal.graph"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
        },

        "com.oracle.graal.lir.hsail": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.lir", "com.oracle.graal.asm.hsail"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
        },

        "com.oracle.graal.compiler.hsail": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.lir.hsail", "com.oracle.graal.hotspot.amd64"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
        },

        "com.oracle.graal.compiler.hsail.test.infra": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.hsail", "mx:JUNIT"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
        },

        "com.oracle.graal.compiler.hsail.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.compiler.hsail.test.infra", "com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",

        },

        "com.oracle.graal.asm.hsail": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.hsail", "OKRA", "com.oracle.graal.asm"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
        },

        "com.oracle.graal.asm.ptx": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.asm"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler,PTX",
        },

        "com.oracle.graal.asm.sparc": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.hotspot", "com.oracle.graal.sparc"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Assembler,SPARC",
        },

        "com.oracle.truffle.api": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "javaCompliance": "1.7+",
            "workingSets": "API,Truffle",
        },

        "com.oracle.truffle.api.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api", "mx:JUNIT"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "API,Truffle,Test",
        },

        "com.oracle.truffle.api.dsl": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api"],
            "checkstyle": "com.oracle.truffle.api",
            "javaCompliance": "1.7+",
            "workingSets": "API,Truffle,Codegen",
        },

        "com.oracle.truffle.api.dsl.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api.dsl", "mx:JUNIT"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["DSLProcessor"],
            "workingSets": "API,Truffle,Codegen,Test",
        },

        "com.oracle.truffle.dsl.processor": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api.dsl"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Truffle,Codegen",
        },

        "com.oracle.truffle.sl": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api.dsl"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "annotationProcessors": ["DSLProcessor"],
            "workingSets": "Truffle,SimpleLanguage",
        },

        "com.oracle.truffle.sl.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.sl", "mx:JUNIT"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Truffle,SimpleLanguage,Test",
        },

        "com.oracle.graal.truffle": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.truffle.api", "com.oracle.graal.truffle.printer", "com.oracle.graal.hotspot"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Truffle",
        },

        "com.oracle.graal.truffle.test": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.truffle", "com.oracle.graal.compiler.test"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Truffle,Test",
        },

        "com.oracle.graal.truffle.printer": {
            "subDir": "graal",
            "sourceDirs": ["src"],
            "dependencies": ["com.oracle.graal.nodes"],
            "checkstyle": "com.oracle.graal.graph",
            "javaCompliance": "1.7+",
            "workingSets": "Graal,Truffle",
        },

    },

}
