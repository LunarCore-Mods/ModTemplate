pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.toString() == "io.github.lunarcoremods.gradlerunner") {
                useModule("com.github.LunarCore-Mods:GradleRunner:${requested.version}")
            }
        }
    }
    repositories {
        maven(url = "https://jitpack.io")
        gradlePluginPortal()
    }
}
