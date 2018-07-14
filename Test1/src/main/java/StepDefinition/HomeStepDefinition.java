package StepDefinition;
import LogicDerived.HomePage;
import LogicDerived.Loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Utilises.DriverFactory;
import org.openqa.selenium.WebDriver;

    public class HomeStepDefinition {

        WebDriver driver ;


        @Given("^userx is on the login page$")
        public void users_is_on_the_login_page() throws Throwable {
            Loginpage login = new Loginpage();
            System.out.println("In login ");
            driver = DriverFactory.setDriver("chrome");
            DriverFactory.getDriver();
            login.Launchurl(driver);

        }

        @When("^users enters \"([^\"]*)\" and \"([^\"]*)\"$")
        public void users_enters_Username_and_password(String user,String pwd) throws Throwable {
            System.out.println(user);
            System.out.println(pwd);
            HomePage homepage = new HomePage();
            homepage.enterusernpwd(user,pwd);

        }

        @Then("^users clicks login button$")
        public void userw_clicks_login_button() throws Throwable {
            HomePage homepage = new HomePage();

            System.out.println("In login button ");
             homepage.clickonlogin();

        }

        @Then("^user clicks on deals$")
        public void user_clicks_on_deals() throws Throwable {
            System.out.println("In deals click");
            HomePage homepage = new HomePage();
            homepage.clickonDeals(driver);

        }





    }



