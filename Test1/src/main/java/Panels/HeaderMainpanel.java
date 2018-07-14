package Panels;

import org.Utilises.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMainpanel extends DriverFactory {


    @FindBy(xpath="//a[contains(text(),'Home')]")
    WebElement Homelink;

    @FindBy(xpath="//a[contains(text(),'Calendar')]")
    WebElement Calendarlink;

    @FindBy(xpath="//a[contains(text(),'Companies')]")
    WebElement Companiesslink;

    @FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement Contactslink;

    @FindBy(xpath="//a[text()='Deals']")
    WebElement dealslink;


    public HeaderMainpanel(){

        PageFactory.initElements(driver,this);

    }

    public  WebElement getHomelink() {
        return Homelink;
    }

    public  WebElement getCalendarlink() { return Calendarlink; }
    public  WebElement getCompaniesslink() {
        return Companiesslink;
    }
    public  WebElement getContactslink() {
        return Contactslink;
    }



    public  WebElement getdealslink() {  return dealslink; }


}
