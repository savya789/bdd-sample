package LogicDerived;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {



    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginbutton;

    @FindBy(xpath="//a[contains(text(),'Deals')]")
    WebElement dealslink;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }



    public void enterusernpwd(String user,String pwd)throws NullPointerException{

        System.out.println("in the mtd"+user);
        System.out.println("in the mtd"+pwd);
        username.sendKeys(user);
        password.sendKeys(pwd);


    }

    public void clickonlogin()throws NullPointerException{
        loginbutton.click();
    }

    public void clickonDeals(WebDriver driver) throws NullPointerException{

        driver.switchTo().frame("leftpanel");
        dealslink.click();

    }
}
