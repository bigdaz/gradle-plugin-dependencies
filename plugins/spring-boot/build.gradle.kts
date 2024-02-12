// FIX Dependabot Alert
// Override 'org.apache.commons:commons-compress' to avoid https://github.com/advisories/GHSA-cgwf-w82q-5jrr
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath(libs.commons.compress)
        }
    }
}
// END FIX

plugins {
    alias(libs.plugins.spring.boot) apply(false)
}
