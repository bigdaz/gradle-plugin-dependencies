// Upgrade transitive dependencies in plugin classpath
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

plugins {
    alias(libs.plugins.spring.boot) apply(false)
}
