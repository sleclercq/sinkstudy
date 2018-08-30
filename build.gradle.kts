plugins {
    application
    kotlin("jvm") version "1.2.61"
}

application {
    mainClassName = "com.lair.sinkstudy.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
    compile("io.javalin:javalin:2.1.0")
    compile("org.slf4j:slf4j-simple:1.7.25")
    testCompile("io.kotlintest:kotlintest:2.0.7")
}

repositories {
    jcenter()
}

