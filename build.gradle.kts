import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("gradle.plugin.org.gretty:gretty:3.0.3")
    }
}

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.gretty") version "3.0.3"
}
group = "me.z003r3s"
version = "1.0-SNAPSHOT"

apply(plugin = "org.gretty")

repositories {
    mavenCentral()
    jcenter()
}
dependencies {
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}