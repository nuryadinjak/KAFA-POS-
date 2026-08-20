plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android { namespace = "com.kafa.pos"; compileSdk = 35
 defaultConfig { applicationId = "com.kafa.pos"; minSdk = 24; targetSdk = 35; versionCode = 12; versionName = "12.0" }
}
dependencies { implementation("androidx.core:core-ktx:1.15.0"); implementation("androidx.appcompat:appcompat:1.7.0"); implementation("com.google.android.material:material:1.12.0") }
