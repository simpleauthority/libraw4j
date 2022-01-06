plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version ("7.1.2")
}

group = "dev.jacobandersen.libraw4j"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.tinylog:tinylog-api:2.4.1")
    implementation("org.tinylog:tinylog-impl:2.4.1")

    compileOnly("org.jetbrains:annotations:22.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "dev.jacobandersen.libraw4j"
            artifactId = "libraw4j"
            version = "1.0.0-SNAPSHOT"
            from(components["java"])
        }
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}