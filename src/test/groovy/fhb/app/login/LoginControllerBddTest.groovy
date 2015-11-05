package fhb.app.login

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(plugin = ["pretty", "html:target/cucumber"],
        features = "classpath:cucumber/a_user_can_login_bdd_test.feature")
class LoginControllerBddTest {

}
