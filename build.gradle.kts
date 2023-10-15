plugins {
    java
    application
    alias(libs.plugins.style)
    alias(libs.plugins.jagr.gradle)
}

version = file("version").readLines().first()

jagr {
    assignmentId.set("h02")
    submissions {
        val main by creating {
            // ACHTUNG!
            // Setzen Sie im folgenden Bereich Ihre TU-ID (NICHT Ihre Matrikelnummer!), Ihren Nachnamen und Ihren Vornamen
            // in Anführungszeichen (z.B. "ab12cdef" für Ihre TU-ID) ein!
            // studentId.set("")
            // firstName.set("")
            // lastName.set("")
        }
    }
}

dependencies {
    implementation(libs.annotations)
    implementation(libs.algoutils.student)
    testImplementation(libs.junit.core)
}

application {
    mainClass.set("h02.Main")
}

tasks {
    val runDir = File("build/run")
    withType<JavaExec> {
        doFirst {
            runDir.mkdirs()
        }
        workingDir = runDir
    }
    test {
        doFirst {
            runDir.mkdirs()
        }
        workingDir = runDir
        useJUnitPlatform()
    }
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
}
