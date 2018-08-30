package com.lair.sinkstudy

import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create().start(8080)
    app.get("/") { ctx -> ctx.result("Hello World") }
}

