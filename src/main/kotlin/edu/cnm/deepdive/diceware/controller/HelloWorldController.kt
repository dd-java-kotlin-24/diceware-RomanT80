package edu.cnm.deepdive.diceware.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello-world")
class HelloWorldController {

    @GetMapping(path = ["/morning"], produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun goodMorning(): String =
        "Good morning, world!"

    @GetMapping(path = ["/afternoon"], produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun goodafternoon(): String =
        "Good afternoon, world!"

    @GetMapping(path = ["/night"], produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun goodnight(): String =
        "Good night, world!"
}


