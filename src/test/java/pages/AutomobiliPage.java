package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomobiliPage extends BasePage {

    public AutomobiliPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    WebElement seacrh;

    @FindBy(xpath = "//h1[@class='home-title uk-text-center-small']")
    WebElement title;

    public void verifyTitle(String expectedTitle) throws InterruptedException {
        comparePartOfText(title, expectedTitle);
    }

    public void selectMarka(String marka){
        WebElement element = driver.findElement(By.xpath("//select[@id='brand']"));
        dropDownList(element, marka);
    }

}

