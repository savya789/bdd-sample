package LogicDerived;

import Panels.HeaderMainpanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Utilises.DriverFactory;



public class HomePage extends DriverFactory  {



    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@value='Login']")
    WebElement loginbutton;


    public HomePage(){

        PageFactory.initElements(driver,this);

    }

    public void enterusernpwd(String user,String pwd)throws NullPointerException{

        System.out.println("in the mtd"+user);
        System.out.println("in the mtd"+pwd);
        username.sendKeys(user);
        password.sendKeys(pwd);

    }

    public void clickonlogin()throws NullPointerException{
        System.out.println("In login button ");
        loginbutton.click();

    }

    public void clickonDeals(WebDriver driver) throws NullPointerException{
        HeaderMainpanel mainpanel = new HeaderMainpanel();
        driver.switchTo().frame("mainpanel");
        System.out.println("In click on deals mthd");
        mainpanel.getdealslink().click();

    }
}
