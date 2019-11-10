plugins {
    application
    java
    `kotlin-dsl`
    kotlin("jvm") version "1.3.50" apply false
    id("antlr")
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

dependencies {
    compile(kotlin("stdlib"))
    compile("org.antlr:antlr4-runtime:4.5")
}