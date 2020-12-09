package ua.bank.accounts.calculator.controller

import io.cucumber.java.PendingException
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.junit.platform.engine.Cucumber
import io.cucumber.spring.CucumberContextConfiguration
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@Cucumber
@CucumberContextConfiguration
@WebMvcTest(AccountController::class)
class ReceivePersonalApiTokenTest {

    companion object {
        private const val TOKEN = "secret-token"
    }

    @Autowired
    private lateinit var mockMvc: MockMvc

    @When("the Customer sends personal API token")
    @Test
    fun theCustomerSendsPersonalAPIToken() {
        mockMvc.perform(post("/token")).andExpect(status().isCreated)
    }

    @Then("personal API token is stored and OK response returned")
    fun personalAPITokenIsStoredAndOKResponseReturned() {
        mockMvc.perform(get("/token")).andExpect(status().isOk).andExpect(content().string(TOKEN))
    }
}