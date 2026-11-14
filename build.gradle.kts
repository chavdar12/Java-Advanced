subprojects {
    apply(plugin = "java")

    repositories { mavenCentral() }

    // Plain IntelliJ-style modules: sources directly under src/, tests under test/
    configure<SourceSetContainer> {
        named("main") { java.setSrcDirs(listOf("src")) }
        // test-support holds the shared stdin/stdout harness used by every module's tests
        named("test") { java.setSrcDirs(listOf("test", rootProject.file("test-support"))) }
    }

    tasks.withType<JavaCompile>().configureEach {
        options.release = 25
        options.encoding = "UTF-8"
    }

    dependencies {
        "testImplementation"(platform("org.junit:junit-bom:6.1.3"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test>().configureEach { useJUnitPlatform() }
}
