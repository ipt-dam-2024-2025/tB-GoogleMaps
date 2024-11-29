plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.androidSecretsGradlePlugin)
    // id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1"
    // https://developers.google.com/maps/documentation/android-sdk/secrets-gradle-plugin
}

android {
    namespace = "pt.ipt.dam.googlemaps"
    compileSdk = 35

    defaultConfig {
        applicationId = "pt.ipt.dam.googlemaps"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    //  implementation ("com.google.android.gms:play-services-maps:19.0.0")
    implementation (libs.play.services.maps)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}