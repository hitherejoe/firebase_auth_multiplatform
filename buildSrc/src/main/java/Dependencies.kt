object Versions {
    val kotlin = "1.3.61"

    val coroutine_version = "1.3.3"
    val serializer_version = "0.14.0"
    val ktor_version = "1.3.1"
    val junit_version = "4.12"
}

object Deps {
    val coroutines_core_common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutine_version}"
    val coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine_version}"
    val coroutines_native = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.coroutine_version}"

    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val kotlin_common = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"

    val ktor_client_core = "io.ktor:ktor-client-core:${Versions.ktor_version}"
    val ktor_client_json = "io.ktor:ktor-client-json:${Versions.ktor_version}"
    val ktor_client_serialization = "io.ktor:ktor-client-serialization:${Versions.ktor_version}"
    val kotlin_serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serializer_version}"

    val ktor_client_android = "io.ktor:ktor-client-android:${Versions.ktor_version}"
    val ktor_json_jvm = "io.ktor:ktor-client-json-jvm:${Versions.ktor_version}"
    val ktor_serialization_jvm = "io.ktor:ktor-client-serialization-jvm:${Versions.ktor_version}"
    val ktor_client_okhttp = "io.ktor:ktor-client-okhttp:${Versions.ktor_version}"
    val kotlin_serialization_runtime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serializer_version}"

    val ktor_client_ios = "io.ktor:ktor-client-ios:${Versions.ktor_version}"
    val ktor_client_json_native = "io.ktor:ktor-client-json-native:${Versions.ktor_version}"
    val ktor_client_serialization_x64 = "io.ktor:ktor-client-serialization-iosx64:${Versions.ktor_version}"
    val ktor_client_core_native = "io.ktor:ktor-client-core-native:${Versions.ktor_version}"
    val ktor_client_serialization_native = "io.ktor:ktor-client-serialization-native:${Versions.ktor_version}"

    val kotlin_serialization_runtime_native = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serializer_version}"

    val junit = "junit:junit:${Versions.junit_version}"
    val ktor_mock_jvm = "io.ktor:ktor-client-mock-jvm:${Versions.ktor_version}"
    val ktor_mock_native = "io.ktor:ktor-client-mock-native:${Versions.ktor_version}"
    val ktor_mock_client = "io.ktor:ktor-client-mock:${Versions.ktor_version}"
    val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutine_version}"

}