plugins { id("com.android.application") }
android {
    namespace = "com.example.catalogoitalikacrm"
    compileSdk = 34
    defaultConfig { applicationId = "com.example.catalogoitalikacrm"; minSdk = 24; targetSdk = 34; versionCode = 4; versionName = "4.0" }
}
dependencies { implementation("androidx.core:core:1.12.0") }
