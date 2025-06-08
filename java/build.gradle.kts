plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("problems"))
            exclude("**/*Test.java")
        }
    }
    test {
        java {
            setSrcDirs(listOf("problems"))
            include("**/*Test.java")
        }
    }
}

tasks.register<Test>("testProblem") {
    val problem = project.findProperty("problem")?.toString()
        ?: throw GradleException("Missing -Pproblem=xxx")

    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath

    useJUnitPlatform()

    filter {
        includeTestsMatching("problems.*${problem}.*Test")
    }
}
