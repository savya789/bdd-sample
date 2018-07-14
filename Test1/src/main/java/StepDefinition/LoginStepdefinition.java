package StepDefinition;
import LogicDerived.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Utilises.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStepdefinition {

    WebDriver driver = DriverFactory.setDriver("chrome");
    Loginpage login = new Loginpage(driver);


    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {

        System.out.println("In login ");
        Loginpage.Launchurl(driver);

    }

    @When("^Get the title of the login page$")
    public void get_the_title_of_the_login_page() throws Throwable {
        try {

            System.out.println("login title ");
            Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", login.gettitle(driver));
        } catch (NullPointerException e) {

            e.printStackTrace();

        }
    }


    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        try {

            System.out.println("enter username passd ");

            login.entercredentials();
        } catch (NullPointerException e) {

            e.printStackTrace();

        }
    }

    @Then("^user clicks login button$")
    public void user_clicks_login_button() throws Throwable {

            System.out.println("In login button ");


            login.clickonlogin();

    }

    @Then("^Get the title of the Home page$")
    public void get_the_title_of_the_Home_page() throws Throwable {

            System.out.println("title of home page");

            Assert.assertEquals("CRMPRO", login.gethomepagetitle(driver));
            driver.close();

    }


    }

