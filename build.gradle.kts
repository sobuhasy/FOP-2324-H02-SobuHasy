import org.sourcegrade.jagr.gradle.task.grader.GraderRunTask

plugins {
    alias(libs.plugins.algomate)
}

exercise {
    assignmentId.set("h02")
}

submission {
    // ACHTUNG!
    // Setzen Sie im folgenden Bereich Ihre TU-ID (NICHT Ihre Matrikelnummer!), Ihren Nachnamen und Ihren Vornamen
    // in Anführungszeichen (z.B. "ab12cdef" für Ihre TU-ID) ein!
    studentId = null
    firstName = null
    lastName = null

    // Optionally require own tests for mainBuildSubmission task. Default is false
    requireTests = false
}

dependencies {
    // libs.fopbot method generated from ./gradle/libs.versions.toml
    implementation(libs.fopbot)
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.11:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.11:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.10:0.0.1")
    implementation("com.bryghts.ftypes-string:ftypes-string_sjs0.6_2.11:0.0.1")
    implementation("edu.gatech.gtri.string-metric:string-metric:1.0")
    implementation("org.webjars.npm:string:3.3.3")
    implementation("com.github.fascalsj:string-manipulation:0.0.1")
    implementation("com.github.fascalsj:string-manipulation:0.0.1")
    implementation("com.github.fascalsj:string-manipulator:1.0.2")
    implementation("de.mklinger.micro:strings:1.0")
    implementation("com.github.GG-A:string-interpolator:0.0.2")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
    implementation("org.eolang:eo-strings:0.4.0")
}

tasks {
    withType<GraderRunTask> {
        doFirst {
            throw GradleException("No public tests are provided for this exercise! For more information go to https://moodle.informatik.tu-darmstadt.de/mod/page/view.php?id=60388")
        }
    }
}
