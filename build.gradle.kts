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
            sourceModules.add(file("module1.pkl"))
            transitiveModules.from(file("module2.pkl"))
            outputFile.set(layout.buildDirectory.file("module1.yaml"))
            outputFormat.set("yaml")
        }
    }
}
