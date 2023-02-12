package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'PRIJAVI SE')]")
    WebElement mojProfil;

    @FindBy(xpath = "//a/div[contains(text(),'MOJ PROFIL')]/span")
    WebElement mojProfilVerification;

    @FindBy(xpath = "//input[@id='username_header']/../div[contains(text(),'Ne postoji nalog')]")
    WebElement wrongEmailVerification;

    @FindBy(xpath = "//div[@class='loginPanel effect2 effect2Login']/p")
    WebElement wrongPsswordVerification;

    @FindBy(xpath = "//input[@id='username_header']")
    WebElement email;

    @FindBy(xpath = "//input[@id='password_header']")
    WebElement password;

    @FindBy(xpath = "//button[@id='next-step']")
    WebElement dalje;

    @FindBy(xpath = "//button[@name='login']")
    WebElement prijavise;

    public void clickMojProfil() throws InterruptedException {
        Actions actions = new Actions(driver);
        pause(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('on mouseover');}";
        js.executeScript(mouseOverScript,mojProfil);
    }

    public void clickMojProfiSubItem(String subItem){
        WebElement element = driver.findElement(By.xpath("//ul[@class='uk-nav uk-nav-dropdown']/li/a[contains(text(),'"+subItem+"')]"));
        clickElement(element,subItem);
    }

    public void login (String emailText, String passText, String rightEmailEnteredYesNo){
        typeText(email,emailText, "Email is entered");
        clickElement(dalje, "button dalje is pressed");
        if (rightEmailEnteredYesNo.equalsIgnoreCase("yes")) {
            typeText(password, passText, "Password is entered");
            clickElement(prijavise, " button prijavi se is entered");
        } else {
            System.out.println("Password is not entered");
        }
    }

    public void verifyLoginPage(String verificationType, String expectedText) throws InterruptedException {
        if (verificationType.equalsIgnoreCase("goodCredentials")) {
            compareText(mojProfilVerification, expectedText);
        } else if (verificationType.equalsIgnoreCase("wrongEmail")) {
            compareText(wrongEmailVerification, expectedText);
        }  else if (verificationType.equalsIgnoreCase("wrongPassword")) {
            comparePartOfText(wrongPsswordVerification, expectedText);
        }  else {
                System.out.println("Nothing of expected text for login verification");
            }
    }
}

