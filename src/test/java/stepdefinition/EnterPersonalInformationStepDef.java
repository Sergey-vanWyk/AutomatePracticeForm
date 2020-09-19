package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.AboutMeePageObject;

import java.util.Set;

public class EnterPersonalInformationStepDef {

    WebDriver driver;
    String websitePath = "https://www.techlistic.com/p/selenium-practice-form.html";
    String firstName = "Peter"
            ,lastName = "Parker"
            ,date = "10 August 2001"
            ,continent = "Africa"
            ,seleniumCommand = "WebElement Commands"
            ,filePathe = "C:\\Users\\vanwy\\Desktop\\Test.txt";



    @Given("i am on the home page")
    public void i_am_on_the_home_page() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(websitePath);
        System.out.println(driver.getTitle());
    }

    @When("i want to insert personal information")
    public void i_want_to_insert_personal_information() {
        AboutMeePageObject aboutMePO = PageFactory.initElements(driver, AboutMeePageObject.class);
        aboutMePO.enterFirstName(firstName);
        aboutMePO.enterLastName(lastName);
        aboutMePO.selectGender();
        aboutMePO.selectYearsOfExperience();
        aboutMePO.enterDate(date);
        aboutMePO.selectProfession();
        aboutMePO.selectAutomationTools();
        aboutMePO.selectContinent(continent);
        aboutMePO.selectSeleniumCommand(seleniumCommand);

    }

    @When("upload files")
    public void upload_files() {
        AboutMeePageObject aboutMePO = PageFactory.initElements(driver, AboutMeePageObject.class);
        aboutMePO.uploadimage(filePathe);
        System.out.println(aboutMePO.selectDownloadFile());

    }

    @Then("should be able to press the select button")
    public void should_be_able_to_press_the_select_button() {
        AboutMeePageObject aboutMePO = PageFactory.initElements(driver, AboutMeePageObject.class);
        aboutMePO.clickSubmitButton();

    }
}
