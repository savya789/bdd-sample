package LogicDerived;
import org.Utilises.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loginpage {

    // public static Properties prop ;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginbutton;

    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;


   public Loginpage(WebDriver driver){

       //used to initalize all variables
       PageFactory.initElements(driver,this);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();

//       try {
//
//        FileInputStream ip = new FileInputStream("/Users/praveengaddam/bdd-sample/Test1/src/main/java/org/Utilises/config.properties");
//           System.out.println("In constructor");
//
//           prop.load(ip);
//
//      }catch (Exception e){
//
//        e.printStackTrace();
//
//    }

    }

    public static void Launchurl(WebDriver driver){

        driver.get("https://www.freecrm.com/index.html");
    }



    public String gettitle(WebDriver driver){

        String title = driver.getTitle();


        return title;
    }


    public void entercredentials()throws NullPointerException{


        username.sendKeys("savyamaddineni");
        password.sendKeys("Welcome@1");


    }
//
    public void clickonlogin()throws NullPointerException{
        loginbutton.click();
    }
//
//
//
    public String gethomepagetitle(WebDriver driver){

        String title = driver.getTitle();


        return title;
    }

}
