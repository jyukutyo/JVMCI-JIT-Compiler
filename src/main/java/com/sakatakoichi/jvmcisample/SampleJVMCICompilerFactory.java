package com.sakatakoichi.jvmcisample;

import jdk.vm.ci.runtime.JVMCICompiler;
import jdk.vm.ci.runtime.JVMCICompilerFactory;
import jdk.vm.ci.runtime.JVMCIRuntime;

public class SampleJVMCICompilerFactory implements JVMCICompilerFactory {

    @Override
    public String getCompilerName() {
        return "jyukutyo-jit";
    }

    @Override
    public JVMCICompiler createCompiler(JVMCIRuntime runtime) {
        return new SampleJVMCICompiler();
    }
}
