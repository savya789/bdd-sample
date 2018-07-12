package StepDefinition;
import LogicDerived.LoginAAA;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.Utilises.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginStepdefinition {


    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {

        LoginAAA login = new LoginAAA();
        login.loginTest();

    }

    @When("^Get the title of the login page$")
    public void get_the_title_of_the_login_page() throws Throwable {

    }


    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {

    }

    @Then("^user clicks login button$")
    public void user_clicks_login_button() throws Throwable {

    }

    @Then("^Get the title of the Home page$")
    public void get_the_title_of_the_Home_page() throws Throwable {

    }



}
