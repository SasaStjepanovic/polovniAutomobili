package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class GeneralPage extends BasePage {
    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    WebElement seacrh;

    public void searchMain (String text){
        typeText(seacrh, text,  " text is entered in the search field");
    }

    public void clickHoverHeaderMenuItem(String hoverItem) throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//a[text()='"+hoverItem+"']"))).build().perform();
            System.out.println("hover item is pressed, " + hoverItem+ ".");
        }

        public void verifyHeaderMenuItem(String hoverItem, String hoverItem1) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//a[text()='"+hoverItem+"']"));
        comparePartOfText(element, hoverItem1);
        }

    public void clickHoverHeaderSubMenuItem(String hoverSubItem, String NoItem) throws Exception {
        switch (NoItem.toUpperCase()) {
            case "FIRST": {
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//li/a[text()='" + hoverSubItem + "']"))).build().perform();
                System.out.println("hoversub item is pressed, " + hoverSubItem + ".");
            }
            break;
            case "SECOND": {
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//a[text()=\"PONUDA VOZILA \"]/..//li//a[text()='"+hoverSubItem+"']"))).build().perform();
                System.out.println("hover item is pressed, " + hoverSubItem + ".");
            }
            break;
            case "THIRD1": {
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//strong[text()='Auto delovi:']/../../..//div[2]//li//a[text()='"+hoverSubItem+"']"))).build().perform();
                System.out.println("hover item is pressed, " + hoverSubItem + ".");
            }
            break;
            case "THIRD2": {
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//strong[text()='Najtraženije kategorije:']/../../..//div[2]//li//a[text()='"+hoverSubItem+"']"))).build().perform();
                System.out.println("hover item is pressed, " + hoverSubItem + ".");
            }
            break;
            case "FORTH": {
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//a[@id='new-ad-icon']/../../div/a[contains(text(),'"+hoverSubItem+"')]"))).build().perform();
                System.out.println("hover item is pressed, " + hoverSubItem + ".");
            }
            break;
            default:
                throw new Exception("No such field: " + NoItem);
        }
    }

    public void verifyHeaderSubMenuItem(String hoverSubItem) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//li/a[text()='"+hoverSubItem+"']"));
        compareText(element, hoverSubItem);
    }

    public void gettingTextOverAttribute(String hoverSubItem, String attribbuteType){
        WebElement element = driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//li/a[text()='"+hoverSubItem+"']"));
        getAttribute(element,hoverSubItem,attribbuteType);
    }

}

