package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-label='Registruj se']")
    WebElement registrujSeButton;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='password_first']")
    WebElement firstPasswordField;

    @FindBy(xpath = "//input[@id='password_second']")
    WebElement secondPasswordField;

    @FindBy(xpath = "//input[@id='tos']")
    WebElement acceptCheckBox;

    @FindBy(xpath = "//label[@for='verifiedVia_0']")
    WebElement emailConfirmButton;

    @FindBy(xpath = "//label[@for='verifiedVia_1']")
    WebElement telefonConfirmButton;

    public void pressRegistrationButton(){
        clickElement(registrujSeButton, " registration button is pressed");
    }

    public String randomEmail() {
        Faker fakerData = new Faker();
        int number = fakerData.number().numberBetween(1, 500);
        String randomEmail = "polovnjaci" + number + "@yup.com";
        System.out.println("Random email exactly after generate is :" + randomEmail);
        return randomEmail;
    }

    public void enterEmail(String randomEmailYesNo, String email){
        if (randomEmailYesNo.equalsIgnoreCase("yes")) {
            typeText(emailField, randomEmail(), " random email is entered after generating");
        } else {
            typeText(emailField, email, " known email is entered");
        }
    }

    public void enterPassword(String Firstpassword, String Secondpassword){
        typeText(firstPasswordField, Firstpassword, " first password is entered");
        typeText(secondPasswordField, Secondpassword, " second password is entered");
}

    public void checkPrihvatam(){
        checkCheckbox(acceptCheckBox, " Prihvatam checkbox is checked");
}

    public void confirmAccountOverEmailaTelefona(String color, String attributeType){
        clickElement(emailConfirmButton, " email orange button is pressed");
        getCssValue(emailConfirmButton, color, attributeType);
    }
}

