// FIX Dependabot Alert
// Override 'com.squareup.okhttp3:okhttp' to avoid https://github.com/advisories/GHSA-w33c-445m-f8w7
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath("com.squareup.okhttp3:okhttp:4.12.0")
        }
    }
}
// END FIX

plugins {
    alias(libs.plugins.github.release) apply(false)
}
