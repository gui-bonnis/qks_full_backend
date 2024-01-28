
rootProject.name = "poc"

//dependencyResolutionManagement {
//    versionCatalogs {
//        create("libs") {
//            // versions
//            version("springboot","1.1.1")
//            version("v_javaformat","0.0.35")
//
//            library("javaformat", "io.spring.javaformat", "spring-javaformat-gradle-plugin").versionRef("v_javaformat")
//
//        }
//    }
//}

//dependencyResolutionManagement {
//    versionCatalogs {
//        create("libs") {
//            from(files("gradle/libs.versions.toml"))
//        }
//    }
//}


include("common")
include("infra")
include("present")
include("services")
include("services:customer-service")
include("services:customer-service:customer-application")
include("services:customer-service:customer-container")
include("services:customer-service:customer-dataaccess")
include("services:customer-service:customer-domain")
include("services:customer-service:customer-domain:customer-domain-application")
include("services:customer-service:customer-domain:customer-domain-core")
include("services:customer-service:customer-messaging")
include("tools")
