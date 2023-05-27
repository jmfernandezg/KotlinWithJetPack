package com.jmfg.training.jetpack

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}


fun main(args: Array<String>) {
    println(App().greeting)

    println("Program arguments: ${args.joinToString()}")
}