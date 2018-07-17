package org.Utilises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public static WebDriver driver;

    public  static WebDriver setDriver(String drivername) {

        if (drivername.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/chromedriver");
            driver = new ChromeDriver();


        } else if (drivername.equalsIgnoreCase("FF")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/gecodriver");
            driver = new FirefoxDriver();


        } else if (drivername.equalsIgnoreCase("IE")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/InternetExplorer");
            driver = new InternetExplorerDriver();
        } else {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("In cokkied");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){

        return driver;
    }


}
