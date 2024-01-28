plugins {
    id("java")
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(versionCatalog.findLibrary("spring-javaformat").get())

    testImplementation(versionCatalog.findLibrary("junit-api").get())
    testRuntimeOnly(versionCatalog.findLibrary("junit-eng").get())
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = 4
}


