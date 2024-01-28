plugins {
    id("services-container-conventions")
}

dependencies {
    implementation(project(":services:customer-service:customer-application"))
    implementation(project(":services:customer-service:customer-dataaccess"))
    implementation(project(":services:customer-service:customer-domain:customer-domain-application"))
//    implementation(project(":services:customer-service:customer-domain:customer-domain-core"))
    implementation(project(":services:customer-service:customer-messaging"))
}