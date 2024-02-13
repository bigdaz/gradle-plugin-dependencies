// FIX Dependabot Alert
// Override 'io.grpc:grpc-protobuf' (which updates 'com.google.protobuf:protobuf-java') to avoid:
//      https://github.com/advisories/GHSA-h4h5-3hr4-j3g2
//      https://github.com/advisories/GHSA-g5ww-5jh7-63cx
//      https://github.com/advisories/GHSA-4gg5-vx3j-xwc7
//      https://github.com/advisories/GHSA-6628-q6j9-w8vg
//      https://github.com/advisories/GHSA-cfgp-2977-2fmm
//      https://github.com/advisories/GHSA-9hxf-ppjv-w6rq
// Override 'org.bitbucket.b_c:jose4j' to avoid:
//      https://github.com/advisories/GHSA-7g24-qg88-p43q
//      https://github.com/advisories/GHSA-jgvc-jfgh-rjvv
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath(libs.gprc.protobuf)
            classpath(libs.jose4j)
        }
    }
}
// END FIX

// Based on nowinandroid
plugins {
    alias(libs.plugins.android.application) apply false
    /*
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.baselineprofile) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.dependencyGuard) apply false
    alias(libs.plugins.firebase.crashlytics) apply false
    alias(libs.plugins.firebase.perf) apply false
    alias(libs.plugins.gms) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.roborazzi) apply false
    alias(libs.plugins.secrets) apply false
    alias(libs.plugins.room) apply false
    */
}
