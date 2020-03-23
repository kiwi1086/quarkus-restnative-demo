# quarkus-restnative-demo project

Motivation

Idea

## Prerequisites
* Raspberry
    * Raspberry Pi Imageer --> Raspian
    * Create empty ssh file without extensions to activate ssh on boot
    * https://www.raspberrypi.org/documentation/configuration/wireless/wireless-cli.md
        * sudo raspi-config
    * https://phoenixnap.com/kb/docker-on-raspberry-pi
    * https://dev.to/rohansawant/installing-docker-and-docker-compose-on-the-raspberry-pi-in-5-simple-steps-3mgl
    * Install JDK 11 (http://hirt.se/blog/?p=1116)
        * http://download.bell-sw.com/java/14+36/bellsoft-jdk14+36-linux-arm32-vfp-hflt.deb
        * --> http://download.bell-sw.com/java/11/bellsoft-jdk11-linux-arm32-vfp-hflt.deb
        * sudo apt-get install ./bellsoft-jdk11-linux-arm32-vfp-hflt.deb
        * sudo update-alternatives --config javac
        * sudo update-alternatives --config java
    


# Generated Text

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./gradlew quarkusDev
```

## Packaging and running the application

The application can be packaged using `./gradlew quarkusBuild`.
It produces the `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `build` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/lib` directory.

The application is now runnable using `java -jar build/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

If you want to build an _über-jar_, just add the `--uber-jar` option to the command line:
```
./gradlew quarkusBuild --uber-jar
```

## Creating a native executable

You can create a native executable using: `./gradlew buildNative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./gradlew buildNative --docker-build=true`.

You can then execute your native executable with: `./build/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling#building-a-native-executable.