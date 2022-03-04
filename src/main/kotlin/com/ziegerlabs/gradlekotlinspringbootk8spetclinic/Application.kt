package com.ziegerlabs.gradlekotlinspringbootk8spetclinic.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Application {
    @GetMapping("/")
    fun home(): String {
        return "Hello World";
    }
}
