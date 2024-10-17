This is a Kotlin Multiplatform project targeting Android, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

# Carlos comments:
docs for compose multiplatform: https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#set-up-an-environment
install the Kotlin Multiplatform plugin for Android Studio.
create project via wizard: https://kmp.jetbrains.com/?_gl=1*1viuzxb*_gcl_au*MTE1NTMwNzIxNy4xNzI0MjQzOTU5*_ga*MTEwNzQzOTA3Mi4xNzI0MjQzOTU4*_ga_9J976DJZ68*MTcyOTE1ODQwMC43LjEuMTcyOTE1ODYxNi42MC4wLjA.
follow instructions to run web: https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#run-your-web-application
Be sure you use folder composeapp and graddle project