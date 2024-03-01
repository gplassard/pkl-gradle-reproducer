plugins {
    id("java")
    id("org.pkl-lang") version "0.25.2"
}

repositories {
    mavenCentral()
}

pkl {
    evaluators {
        register("evalPkl") {
            sourceModules.add(file("src/sample.pkl"))
            outputFile.set(layout.buildDirectory.file("sample.yaml"))
            outputFormat.set("yaml")
        }
    }
}
