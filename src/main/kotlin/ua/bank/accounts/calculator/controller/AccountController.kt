package ua.bank.accounts.calculator.controller

import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController {

    @PostMapping("/token")
    @ResponseStatus(CREATED)
    fun storeToken() {
    }

    @GetMapping("/token")
    fun retrieveToken(): String {
        return ""
    }
}