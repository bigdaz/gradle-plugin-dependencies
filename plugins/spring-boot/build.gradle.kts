// FIX Dependabot Alert
// Override 'org.apache.commons:commons-compress' to avoid https://github.com/advisories/GHSA-cgwf-w82q-5jrr
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath("org.apache.commons:commons-compress:1.25.0")
        }
    }
}
// END FIX

plugins {
    alias(libs.plugins.spring.boot) apply(false)
}
