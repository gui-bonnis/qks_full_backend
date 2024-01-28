plugins {
    id("services-application-conventions")
}

dependencies {
    implementation(project(":services:customer-service:customer-domain:customer-domain-application"))
    implementation(project(":services:customer-service:customer-domain:customer-domain-core"))

    integrationTestImplementation(libs.junit.api)
    integrationTestRuntimeOnly(libs.junit.eng)
}