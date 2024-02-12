// Upgrade transitive dependencies in plugin classpath
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath(libs.okio)
        }
    }
}

plugins {
    alias(libs.plugins.github.release) apply(false)
}
