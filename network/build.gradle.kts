plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)
}

android {
    namespace = "com.sirketismi.network"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":entities"))

    implementation(Libs.Hilt.hilt)
    kapt(Libs.Hilt.hiltKapt)

    implementation(Libs.Api.retrofit)
    implementation(Libs.Api.retrofitGson)
    implementation(Libs.Api.okhttp)
    implementation(Libs.Api.okhttpLogging)
    implementation(Libs.Api.gson)

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}