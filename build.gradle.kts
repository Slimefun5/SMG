plugins {
    java
    id("com.gradleup.shadow") version "9.3.2"
    id("io.github.intisy.github-gradle") version "1.8.2.1"
}

group = "me.waleks"
description = "SimpleMaterialGenerators is a Slimefun addon that adds simple material generators."

apply(from = "https://raw.githubusercontent.com/Slimefun5/gradle/stable/slimefun-addon.gradle")
