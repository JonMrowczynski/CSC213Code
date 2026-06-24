plugins {
    idea
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories.mavenCentral()

java.toolchain.languageVersion.set(JavaLanguageVersion.of(25))

application.mainClass = "JavaFXExamples"

javafx {
    version = "25"
    modules("javafx.controls", "javafx.fxml")
}