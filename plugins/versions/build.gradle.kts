// FIX Dependabot Alert
// Override 'com.squareup.okio:okio' to avoid https://github.com/advisories/GHSA-w33c-445m-f8w7
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath("com.squareup.okio:okio:3.4.0")
        }
    }
}
// END FIX

plugins {
    alias(libs.plugins.versions) apply(false)
}
