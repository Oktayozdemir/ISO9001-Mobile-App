plugins {
    kotlin("multiplatform") version "1.6.10"
    id("com.android.application") version "7.2.0"
    id("kotlin-kapt")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.example.iso9001mobileapp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.compose.ui:ui:1.1.0")
    implementation("androidx.compose.material:material:1.1.0")
    implementation("androidx.compose.ui:ui-tooling:1.1.0")
    implementation("androidx.room:room-runtime:2.4.1")
    kapt("androidx.room:room-compiler:2.4.1")
    // Add other dependencies as necessary
}
