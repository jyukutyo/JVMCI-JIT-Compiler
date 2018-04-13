package com.sakatakoichi.jvmcisample;

import jdk.vm.ci.runtime.JVMCICompilerFactory;
import jdk.vm.ci.services.JVMCIServiceLocator;

public class SampleJVMCIServiceLocator extends JVMCIServiceLocator {

    @Override
    protected <S> S getProvider(Class<S> service) {

        if (service == JVMCICompilerFactory.class) {
            return service.cast(new SampleJVMCICompilerFactory());
        }
        return null;
    }
}
