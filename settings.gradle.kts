pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Gradle Plugin Development"
include(":app")
include(":task:file-tasks-assignment")
include(":task:file-tasks-assignment-done")
include(":script-plugin:local-script-plugin-example")
include(":script-plugin:remote-script-plugin-example")
include(":precompiled-script-plugin:precompiled-script-plugin-assignment-done")
 