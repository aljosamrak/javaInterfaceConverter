plugins {
    application
    java
    `kotlin-dsl`
    kotlin("jvm") version "1.3.50" apply false
    antlr
}

repositories {
    jcenter()
    mavenCentral()
}

application {
    mainClassName = "com.pinko.J2Swift"
}

sourceSets {
    main {
        java.srcDir("src/main/java")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.generateGrammarSource {
    outputDirectory = file("src/main/java/com/pinko/parser")
}

dependencies {
    antlr("org.antlr:antlr4:4.5") // use ANTLR version 4

    compile(kotlin("stdlib"))
    compile("org.antlr:antlr4-runtime:4.5")
    compile("com.github.ajalt:clikt:2.3.0")
}