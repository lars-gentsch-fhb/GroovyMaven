package fhb.app.login.steps

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import fhb.app.login.LoginController
import fhb.app.login.LoginService
import fhb.app.login.UserNotAuthenticatedException

import static org.assertj.core.api.Assertions.assertThat

class LoginSteps {

    LoginController controller
    LoginService service
    Boolean exceptionWasThrown

    @Given('^a user with name and password$')
    public void theUser() {
        controller = new LoginController()
        service = new LoginService()
        controller.loginService = service
    }

    @When('^the user tries to login with name (.*) and password (.*)$')
    public void tryToLogin(String username, String password) {
        try {
            controller.doLogin(username, password)
        } catch (UserNotAuthenticatedException unaex) {
            exceptionWasThrown = true
        }

    }

    @Then('^the login is successful$')
    public void theLoginIsSuccessful() {
        assertThat(exceptionWasThrown).isEqualTo(null)
    }

    @Then('^the login fails$')
    public void theLoginFails() {
        assertThat(exceptionWasThrown).isEqualTo(true)
    }
}