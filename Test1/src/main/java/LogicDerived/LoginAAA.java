package LogicDerived;
import org.Utilises.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginAAA {



    public void loginTest() throws NullPointerException {

        WebDriver driver;
        Properties prop = new Properties();

        try {

            FileInputStream ip = new FileInputStream("/Users/praveengaddam/Test1/src/main/java/org/Utilises/config.properties");
            prop.load(ip);

        }catch (IOException e){

            e.printStackTrace();

        }

        DriverFactory drivers = new DriverFactory();

        driver=drivers.setDriver(prop.getProperty("drivername"));
        System.out.println(prop.getProperty("drivername"));



        driver.get("https://www.autoclubmo.aaa.com/insurance/auto-insurance/blueboxes-mo-src.html?stop=yes&zip=63109?" +
                "pmed=dPM_CVG_2018_AuI_MO_SD_MSN&ctcampaign=548&ctkwd=autoclub%20insurance&ctmatch=b&ctcreative=15872859517");

        driver.findElement(By.id("user-login")).click();
        driver.findElement(By.id("UserName")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


   // public void

}
