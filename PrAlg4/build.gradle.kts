plugins {
    id("java")
}

group = "dev.ua.ikeepcalm"
version = ""

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<Jar> {
    archiveBaseName.set("pralg4")
    manifest {
        attributes["Main-Class"] = "dev.ua.ikeepcalm.Main"
    }
}