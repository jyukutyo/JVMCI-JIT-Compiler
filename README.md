# Sample JIT compiler

This is a JIT comipler for a learning purpose with JVMCI.

## Usage

### Make JAR file

```
mvn package
```

### Run with this JIT comiler

```
java \
--upgrade-module-path=[THIS_PROJECT]/target/JVMCISample-1.0-SNAPSHOT.jar \
-XX:+UnlockExperimentalVMOptions \
-XX:+EnableJVMCI \
-XX:+UseJVMCICompiler \
-XX:-TieredCompilation \
-XX:+PrintCompilation \
-Djvmci.Compiler=jyukutyo-jit \
TARGET_CLASS
```