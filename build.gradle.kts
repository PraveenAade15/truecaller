// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
}

buildscript {
//    ext.kotlin_version = "1.5.20"
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io")
        }
        // END: Required for wayfinder
        flatDir {
            dirs("libs")
        }
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.7.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
        classpath ("com.google.gms:google-services:4.4.2")
        classpath ("com.google.firebase:firebase-crashlytics-gradle:3.0.2")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        classpath ("com.github.dcendents:android-maven-gradle-plugin:2.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

}


tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}