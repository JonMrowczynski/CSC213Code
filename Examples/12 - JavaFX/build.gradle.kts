plugins {
    idea
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories.mavenCentral()

java.toolchain.languageVersion.set(JavaLanguageVersion.of(21))

application.mainClass = "JavaFXExamples"

javafx {
    version = "21.0.2"
    modules("javafx.controls", "javafx.fxml")
}