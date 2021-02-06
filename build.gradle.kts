import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val jda_version: String by project
val jdautilities_version: String by project
val lavaplayer_version: String by project

plugins {
    application
    kotlin("jvm") version "1.4.10"
}

group = "me.nekoya3"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenLocal()
    jcenter()
    maven { url = uri("https://kotlin.bintray.com/ktor") }
}

dependencies {
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("net.dv8tion:JDA:$jda_version")
    implementation("com.jagrosh:jda-utilities:$jdautilities_version")
    implementation("com.jagrosh:jda-utilities-command:$jdautilities_version")
    implementation("com.sedmelluq:lavaplayer:$lavaplayer_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
}