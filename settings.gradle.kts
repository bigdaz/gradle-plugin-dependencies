pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "gradle-plugin-dependencies"

// Include each directory under plugins
file("plugins").list().forEach { dir ->
    include(":plugins:${dir}")
}
