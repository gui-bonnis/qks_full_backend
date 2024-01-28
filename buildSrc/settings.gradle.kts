

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

include(":common-conventions")
include(":infra-conventions")
include(":java-conventions")
include(":present-conventions")
include(":services-application-conventions")
include(":services-container-conventions")
include(":services-conventions")
include(":services-dataaccess-conventions")
include(":services-domain-application-conventions")
include(":services-domain-conventions")
include(":services-domain-core-conventions")
include(":services-messaging-conventions")
include(":tools-conventions")
