plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin{
    androidTarget()
    sourceSets{
        all {
            languageSettings {
                optIn("org.jetbrains.compose.resources.ExperimentalResourceApi")
            }
        }
        androidMain.dependencies {
            implementation(libs.androidx.core)
            implementation(libs.android.material)
        }
    }
}


android {
    defaultConfig {
        minSdk = 24
        compileSdk = 34
    }
    namespace = "com.saturndev..theme"
    sourceSets["main"].apply {
        res.srcDirs("src/androidMain/resources")
        resources.srcDirs("src/commonMain/resources")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}