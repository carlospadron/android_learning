package org.example.project

class Greeting {
    private val platform = getPlatform()

    fun greet(name: String): String {
        return "Hello, $name!"
    }
}