plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.2")
}

group = "dev.jacobandersen.libraw4j"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":libraw4j-native-api"))
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("org.tinylog:tinylog-api:2.4.1")
    implementation("org.tinylog:tinylog-impl:2.4.1")

    compileOnly("org.jetbrains:annotations:22.0.0")
}