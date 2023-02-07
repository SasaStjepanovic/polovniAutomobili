package steps;

import excel.ExcelSupport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Reporter;
import pages.BasePage;
import pages.GeneralPage;
import tests.BaseTest;

import java.io.IOException;
import java.util.Map;

public class BaseSteps extends BaseTest {

    Map<String, String> data;

    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String env = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("env");
    String wait = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("wait");

    @Before
    public void setup() throws Exception {
        init(browser, wait);
        openMagnetoApp(env);
    }

    @After
    public void tearDown() throws IOException {
        quit();
    }

    @Given("a user reads test data from {string} {string} by id {string}")
    public void aUserReadsTestDataFromById(String fileName, String sheetName, String id) throws Exception {
        data = new ExcelSupport().getDataByID(fileName, sheetName, id);
    }
    @Then("user should verify that url page is opened")
    public void userShouldVerifyThatUrlPageIsOpened() {
        new BasePage(driver).checkUrlPage(data.get("urlPage"));
    }

    @And("user clicks header menu item")
    public void userClicksHeaderMenuItem() throws InterruptedException {
        new GeneralPage(driver).clickHoverHeaderMenuItem(data.get("headerItemIa"));
    }

    @Then("user should be verify I sub menu item")
    public void userShouldBeVerifyISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemI"));
    }

    @Then("user should be verify header menu item")
    public void userShouldBeVerifyHeaderMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderMenuItem(data.get("headerItemIa"),data.get("headerItemIb"));
    }

    @And("user clicks I sub menu item")
    public void userClicksISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemI"), data.get("numMenuItem"));
    }

    @And("user clicks II sub menu item")
    public void userClicksIISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemII"), data.get("numMenuItem"));
    }

    @Then("user should be verify II sub menu item")
    public void userShouldBeVerifyIISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemII"));
    }

    @And("user clicks III sub menu item")
    public void userClicksIIISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemIII"), data.get("numMenuItem"));
    }

    @Then("user should be verify III sub menu item")
    public void userShouldBeVerifyIIISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemIII"));
    }

    @And("user clicks IV sub menu item")
    public void userClicksIVSubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemIV"), data.get("numMenuItem"));
    }

    @Then("user should be verify IV sub menu item")
    public void userShouldBeVerifyIVSubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemIV"));
    }

    @And("user clicks V sub menu item")
    public void userClicksVSubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemV"), data.get("numMenuItem"));
    }

    @Then("user should be verify V sub menu item")
    public void userShouldBeVerifyVSubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemV"));
    }

    @And("user clicks VI sub menu item")
    public void userClicksVISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemVI"), data.get("numMenuItem"));
    }

    @Then("user should be verify VI sub menu item")
    public void userShouldBeVerifyVISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemVI"));
    }

    @And("user clicks VII sub menu item")
    public void userClicksVIISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemVII"), data.get("numMenuItem"));
    }

    @Then("user should be verify VII sub menu item")
    public void userShouldBeVerifyVIISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemVII"));
    }

    @And("user clicks VIII sub menu item")
    public void userClicksVIIISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemVIII"), data.get("numMenuItem"));
    }

    @Then("user should be verify VIII sub menu item")
    public void userShouldBeVerifyVIIISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemVIII"));
    }

    @And("user clicks IX sub menu item")
    public void userClicksIXSubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemIX"), data.get("numMenuItem"));

    }

    @Then("user should be verify IX sub menu item")
    public void userShouldBeVerifyIXSubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemIX"));
    }

    @And("user clicks X sub menu item")
    public void userClicksXSubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemX"), data.get("numMenuItem"));
    }

    @Then("user should be verify X sub menu item")
    public void userShouldBeVerifyXSubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemX"));
    }

    @And("user clicks XI sub menu item")
    public void userClicksXISubMenuItem() throws Exception {
        new GeneralPage(driver).clickHoverHeaderSubMenuItem(data.get("subHeaderItemXI"), data.get("numMenuItem"));
    }

    @Then("user should be verify XI sub menu item")
    public void userShouldBeVerifyXISubMenuItem() throws InterruptedException {
        new GeneralPage(driver).verifyHeaderSubMenuItem(data.get("subHeaderItemXI"));
    }

    @Then("user should be verify I sub menu item over attribute")
    public void userShouldBeVerifyISubMenuItemOverAttribute() {
        new GeneralPage(driver).gettingTextOverAttribute(data.get("subHeaderItemI"), data.get("attributeType"));
    }
}

