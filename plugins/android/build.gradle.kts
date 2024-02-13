// FIX Dependabot Alert
// Override 'io.grpc:grpc-*' (which updates 'com.google.protobuf:protobuf-java' & 'io.netty:netty-codec-http') to avoid:
//      https://github.com/advisories/GHSA-h4h5-3hr4-j3g2
//      https://github.com/advisories/GHSA-g5ww-5jh7-63cx
//      https://github.com/advisories/GHSA-4gg5-vx3j-xwc7
//      https://github.com/advisories/GHSA-6628-q6j9-w8vg
//      https://github.com/advisories/GHSA-cfgp-2977-2fmm
//      https://github.com/advisories/GHSA-9hxf-ppjv-w6rq
//      https://github.com/advisories/GHSA-269q-hmxg-m83q
// Override 'org.bitbucket.b_c:jose4j' to avoid:
//      https://github.com/advisories/GHSA-7g24-qg88-p43q
//      https://github.com/advisories/GHSA-jgvc-jfgh-rjvv
// Override 'xerces:xercesImpl' to avoid:
//      https://github.com/advisories/GHSA-h65f-jvqw-m9fj
// Override 'commons-io:commons-io' to avoid:
//      https://github.com/advisories/GHSA-gwrp-pvrq-jmwv
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath(platform(libs.grpc.bom))
        constraints {
            classpath(libs.jose4j)
            classpath(libs.xerces)
            classpath(libs.commons.io)
        }
    }
}
// END FIX

// Based on nowinandroid
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.test) apply false
    /*
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
