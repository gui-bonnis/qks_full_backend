plugins {
    id("services-dataaccess-conventions")
}

dependencies {
    implementation(project(":services:customer-service:customer-domain:customer-domain-application"))
    implementation(project(":services:customer-service:customer-domain:customer-domain-core"))
}