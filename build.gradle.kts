import org.gradle.internal.declarativedsl.parsing.main

plugins {
    id("java")
    application
}

group = "com.github.pavelhrdina"
version = "1.0-SNAPSHOT"

application {
    mainClass = "com.github.pavelhrdina.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}