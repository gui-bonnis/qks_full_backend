plugins {
    id("services-messaging-conventions")
}

dependencies {
    implementation(project(":services:customer-service:customer-domain:customer-domain-application"))
    implementation(project(":services:customer-service:customer-domain:customer-domain-core"))
}


