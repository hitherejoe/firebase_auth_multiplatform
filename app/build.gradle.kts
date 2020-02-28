import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
}

kotlin {
    val iOSTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iOSTarget("ios") {
        binaries {
            framework {
                baseName = "FirebaseAuthentication"
            }
        }
    }

    jvm("android")

    sourceSets["commonMain"].dependencies {
        implementation(Deps.kotlin)
        implementation(Deps.kotlin_common)

        implementation(Deps.ktor_client_core)
        implementation(Deps.ktor_client_json)
        implementation(Deps.ktor_client_serialization)

        implementation(Deps.kotlin_serialization)
    }

    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))

        implementation(Deps.ktor_mock_jvm)
        implementation(Deps.ktor_mock_native)
        implementation(Deps.ktor_mock_client)

        implementation(Deps.junit)
        implementation(Deps.coroutines_core)
        implementation(Deps.coroutines_test)
    }

    sourceSets["androidMain"].dependencies {
        implementation(Deps.kotlin_serialization_runtime)

        implementation(Deps.ktor_client_android)
        implementation(Deps.ktor_json_jvm)
        implementation(Deps.ktor_serialization_jvm)
        implementation(Deps.ktor_client_okhttp)
    }

    sourceSets["iosMain"].dependencies {
        implementation(Deps.kotlin_serialization_runtime_native)

        implementation(Deps.ktor_client_ios)
        implementation(Deps.ktor_client_json_native)
        implementation(Deps.ktor_client_core_native)
        implementation(Deps.ktor_client_serialization_native)

        implementation(Deps.kotlin_serialization_runtime_native)

        implementation(Deps.ktor_client_ios)
        implementation(Deps.ktor_client_json_native)
        implementation(Deps.ktor_client_serialization_x64)
    }
}