plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "com.jmfg.training.jetpack"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.jmfg.training.jetpack.MainKt")
}