plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.phonefinder"
    compileSdk = 36
namespace = "com.example.phonefinder"
    compileSdk = 36

    defaultConfig {
    
applicationId = "com.example.phonefinder"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}


dependencies {
   implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.activity:activity-ktx:1.11.0")

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.activity:activity-ktx:1.11.0")
}

