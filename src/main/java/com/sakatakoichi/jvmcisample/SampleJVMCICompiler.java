package com.sakatakoichi.jvmcisample;

import jdk.vm.ci.code.CompilationRequest;
import jdk.vm.ci.code.CompilationRequestResult;
import jdk.vm.ci.hotspot.HotSpotCompilationRequestResult;
import jdk.vm.ci.runtime.JVMCICompiler;

public class SampleJVMCICompiler implements JVMCICompiler {
    @Override
    public CompilationRequestResult compileMethod(CompilationRequest request) {
        System.out.println(request.getEntryBCI());
        System.out.println(request.getMethod());
        return HotSpotCompilationRequestResult.failure("test", false);
    }
}
