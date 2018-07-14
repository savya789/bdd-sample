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


    WebDriver driver;

    public static WebDriver setDriver(String drivername) {

        WebDriver driver;


        if (drivername.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/chromedriver");
            return new ChromeDriver();

        } else if (drivername.equalsIgnoreCase("FF")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/gecodriver");
            return new FirefoxDriver();


        } else if (drivername.equalsIgnoreCase("IE")) {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/InternetExplorer");
            return new InternetExplorerDriver();
        } else {

            System.setProperty("webdriver.chrome.driver", "/Users/praveengaddam/Downloads/chromedriver");
            return new ChromeDriver();
        }
    }


}
