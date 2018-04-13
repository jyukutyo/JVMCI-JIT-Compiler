module jdk.internal.vm.compiler {
    requires java.instrument;
    requires java.management;
    requires jdk.internal.vm.ci;
    requires jdk.management;
    requires jdk.unsupported;

    exports com.sakatakoichi.jvmcisample;

    provides jdk.vm.ci.services.JVMCIServiceLocator with com.sakatakoichi.jvmcisample.SampleJVMCIServiceLocator;
}
