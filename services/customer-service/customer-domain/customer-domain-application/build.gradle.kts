plugins {
    id("services-domain-application-conventions")
}

dependencies {
    implementation(project(":services:customer-service:customer-domain:customer-domain-core"))
}
