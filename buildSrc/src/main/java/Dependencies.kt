import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val GRADLE_ANDROID_TOOLS =
        "com.android.tools.build:gradle:${Versions.Gradle.GRADLE_ANDROID}"
    const val GRADLE_FIREBASE_CRASHLYTICS =
        "com.google.firebase:firebase-crashlytics-gradle:${Versions.Gradle.FIREBASE_CRASHLYTICS}"
    const val GRADLE_FIREBASE_PERFORMANCE_PLUGIN =
        "com.google.firebase:perf-plugin:${Versions.Gradle.FIREBASE_PERFORMANCE_PLUGIN}"
    const val GRADLE_GOOGLE_SERVICES =
        "com.google.gms:google-services:${Versions.Gradle.GOOGLE_SERVICES}"
    const val GRADLE_KOTLIN_PLUGIN =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Gradle.KOTLIN}"
    const val GRADLE_KOTLIN_SERIALIZATION =
        "org.jetbrains.kotlin:kotlin-serialization:${Versions.Gradle.KOTLIN}"
    const val GRADLE_MAVEN_PLUGIN =
        "com.github.dcendents:android-maven-gradle-plugin:${Versions.Gradle.MAVEN_PLUGIN}"
    const val GRADLE_REMAL_PLUGIN = "name.remal:gradle-plugins:${Versions.Gradle.REMAL_PLUGIN}"

    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.JDK}"

    const val ANDROID_APP_COMPAT =
        "androidx.appcompat:appcompat:${Versions.Google.Androidx.APP_COMPAT}"
    const val ANDROID_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.Google.Androidx.CONSTRAINT_LAYOUT}"
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.Google.Androidx.CORE_KTX}"
    const val ANDROID_JUNIT_EXT = "androidx.test.ext:junit:${Versions.Google.Androidx.JUNIT_EXT}"
    const val ANDROID_ESPRESSO_CORE =
        "androidx.test.espresso:espresso-core:${Versions.Google.Androidx.ESPRESSO}"
    const val ANDROID_LIFECYCLE_EXTENSIONS =
        "androidx.lifecycle:lifecycle-extensions:${Versions.Google.Androidx.LIFECYCLE}"
    const val ANDROID_LIFECYCLE_LIVEDATA_KTX =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Google.Androidx.LIFECYCLE}"
    const val ANDROID_MATERIAL =
        "com.google.android.material:material:${Versions.Google.Material.DESIGN}"
    const val ANDROID_NAVIGATION_FRAGMENT =
        "androidx.navigation:navigation-fragment:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_NAVIGATION_RUNTIME =
        "androidx.navigation:navigation-runtime:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_NAVIGATION_RUNTIME_KTX =
        "androidx.navigation:navigation-runtime-ktx:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_NAVIGATION_UI =
        "androidx.navigation:navigation-ui:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${Versions.Google.Androidx.NAVIGATION}"
    const val ANDROID_RECYCLERVIEW =
        "androidx.recyclerview:recyclerview:${Versions.Google.Androidx.RECYCLERVIEW}"
    const val ANDROID_ROOM_COMPILER = "androidx.room:room-compiler:${Versions.Google.Androidx.ROOM}"
    const val ANDROID_ROOM_KTX = "androidx.room:room-ktx:${Versions.Google.Androidx.ROOM}"
    const val ANDROID_ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.Google.Androidx.ROOM}"
    const val ANDROID_WORK_MANAGER =
        "androidx.work:work-runtime-ktx:${Versions.Google.Androidx.WORK_MANAGER}"

    const val FIREBASE_ANALYTICS =
        "com.google.firebase:firebase-analytics-ktx:${Versions.Google.Firebase.ANALYTICS}"
    const val FIREBASE_CRASHLYTICS =
        "com.google.firebase:firebase-crashlytics:${Versions.Google.Firebase.CRASHLYTICS}"
    const val FIREBASE_PERFORMANCE =
        "com.google.firebase:firebase-perf:${Versions.Google.Firebase.PERFORMANCE}"

    const val SQUARE_MOSHI = "com.squareup.moshi:moshi:${Versions.Square.MOSHI}"
    const val SQUARE_MOSHI_CODEGEN =
        "com.squareup.moshi:moshi-kotlin-codegen:${Versions.Square.MOSHI}"
    const val SQUARE_MOSHI_KOTLIN =
        "com.squareup.moshi:moshi-kotlin:${Versions.Square.MOSHI}"
    const val SQUARE_OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.Square.OK_HTTP}"
    const val SQUARE_OK_HTTP_LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.Square.OK_HTTP}"
    const val SQUARE_RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Square.RETROFIT}"
    const val SQUARE_RETROFIT_CONVERTER_MOSHI =
        "com.squareup.retrofit2:converter-moshi:${Versions.Square.RETROFIT_CONVERTER_MOSHI}"

    const val KOIN = "org.koin:koin-android:${Versions.Koin.KOIN}"
    const val KOIN_CORE = "org.koin:koin-core:${Versions.Koin.KOIN}"
    const val KOIN_SCOPE = "org.koin:koin-android-scope:${Versions.Koin.KOIN}"
    const val KOIN_VIEWMODEL = "org.koin:koin-android-viewmodel:${Versions.Koin.KOIN}"

    const val TEST_JUNIT = "junit:junit:${Versions.Test.JUNIT}"

    const val DETEKT = Versions.Detekt.DETEKT
    const val DETEKT_PLUGIN = "io.gitlab.arturbosch.detekt"
    const val DETEKT_FORMATTING =
        "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.Detekt.DETEKT}"

    const val ARROW_CORE = "io.arrow-kt:arrow-core-data:${Versions.Arrow.ARROW}"
    const val ARROW_FX = "io.arrow-kt:arrow-fx:${Versions.Arrow.ARROW}"
    const val ARROW_FX_COROUTINES =
        "io.arrow-kt:arrow-fx-kotlinx-coroutines:${Versions.Arrow.ARROW}"

    const val OTHER_AIRBNB_LOTTIE = "com.airbnb.android:lottie:${Versions.Other.AIRBNB_LOTTIE}"
    const val OTHER_CHART = "com.github.PhilJay:MPAndroidChart:${Versions.Other.CHART}"
    const val OTHER_EMOJI = "com.vdurmont:emoji-java:${Versions.Other.EMOJI}"
}

fun DependencyHandler.gradle() {
    classpath(Dependencies.GRADLE_ANDROID_TOOLS)
    classpath(Dependencies.GRADLE_FIREBASE_CRASHLYTICS)
    classpath(Dependencies.GRADLE_FIREBASE_PERFORMANCE_PLUGIN)
    classpath(Dependencies.GRADLE_GOOGLE_SERVICES)
    classpath(Dependencies.GRADLE_KOTLIN_PLUGIN)
    classpath(Dependencies.GRADLE_KOTLIN_SERIALIZATION)
    classpath(Dependencies.GRADLE_MAVEN_PLUGIN)
    classpath(Dependencies.GRADLE_REMAL_PLUGIN)
}

fun DependencyHandler.kotlin() {
    implementation(Dependencies.KOTLIN_JDK)
}

fun DependencyHandler.google() {
    implementation(Dependencies.ANDROID_APP_COMPAT)
    implementation(Dependencies.ANDROID_CONSTRAINT_LAYOUT)
    implementation(Dependencies.ANDROID_CORE_KTX)
    implementation(Dependencies.ANDROID_LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.ANDROID_LIFECYCLE_LIVEDATA_KTX)
    implementation(Dependencies.ANDROID_MATERIAL)
    implementation(Dependencies.ANDROID_NAVIGATION_FRAGMENT)
    implementation(Dependencies.ANDROID_NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.ANDROID_NAVIGATION_RUNTIME)
    implementation(Dependencies.ANDROID_NAVIGATION_RUNTIME_KTX)
    implementation(Dependencies.ANDROID_NAVIGATION_UI)
    implementation(Dependencies.ANDROID_NAVIGATION_UI_KTX)
    implementation(Dependencies.ANDROID_RECYCLERVIEW)
    implementation(Dependencies.ANDROID_ROOM_KTX)
    implementation(Dependencies.ANDROID_ROOM_RUNTIME)
    implementation(Dependencies.ANDROID_WORK_MANAGER)

    kapt(Dependencies.ANDROID_ROOM_COMPILER)
}

fun DependencyHandler.firebase() {
    implementation(Dependencies.FIREBASE_ANALYTICS)
    implementation(Dependencies.FIREBASE_CRASHLYTICS)
    implementation(Dependencies.FIREBASE_PERFORMANCE)
}

fun DependencyHandler.square() {
    implementation(Dependencies.SQUARE_MOSHI)
    implementation(Dependencies.SQUARE_MOSHI_KOTLIN)
    implementation(Dependencies.SQUARE_OK_HTTP)
    implementation(Dependencies.SQUARE_OK_HTTP_LOGGING_INTERCEPTOR)
    implementation(Dependencies.SQUARE_RETROFIT)
    implementation(Dependencies.SQUARE_RETROFIT_CONVERTER_MOSHI)

    kapt(Dependencies.SQUARE_MOSHI_CODEGEN)
}

fun DependencyHandler.koin() {
    implementation(Dependencies.KOIN)
    implementation(Dependencies.KOIN_CORE)
    implementation(Dependencies.KOIN_SCOPE)
    implementation(Dependencies.KOIN_VIEWMODEL)
}

fun DependencyHandler.test() {
    androidTestImplementation(Dependencies.ANDROID_JUNIT_EXT)
    androidTestImplementation(Dependencies.ANDROID_ESPRESSO_CORE)

    testImplementation(Dependencies.TEST_JUNIT)
}

fun DependencyHandler.detektFormatting() {
    add("detektPlugins", Dependencies.DETEKT_FORMATTING)
}

fun DependencyHandler.arrow() {
    implementation(Dependencies.ARROW_CORE)
    implementation(Dependencies.ARROW_FX)
    implementation(Dependencies.ARROW_FX_COROUTINES)
}

fun DependencyHandler.others() {
    implementation(Dependencies.OTHER_AIRBNB_LOTTIE)
    implementation(Dependencies.OTHER_CHART)
    implementation(Dependencies.OTHER_EMOJI)
}

private fun DependencyHandler.classpath(depName: String) {
    add("classpath", depName)
}

private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}

private fun DependencyHandler.api(depName: String) {
    add("api", depName)
}

private fun DependencyHandler.id(depName: String) {
    add("id", depName)
}

private fun DependencyHandler.testImplementation(depName: String) {
    add("testImplementation", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}