package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class AboutMeePageObject {
    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(id = "sex-0")
    private WebElement male;

    @FindBy(id = "exp-0")
    private WebElement oneYearOfExperience;

    private WebElement datepicker;

    @FindBy(id = "profession-1")
    private WebElement automationTesterProfession;

    @FindBy(id = "tool-0")
    private WebElement automationToolUFT;

    @FindBy(id = "tool-2")
    private WebElement automationToolSeleniumWebDriver;

    private WebElement continents;
    private WebElement selenium_commands;

    @FindBy(xpath = "//input[@id='photo']")
    private WebElement photo;

    @FindBy(xpath = "//a[contains(text(),'Click here to Download File')]")
    private WebElement downloadFile;
    private WebElement submit;

    public void enterFirstName(String fName){
        firstname.clear();
        firstname.sendKeys(fName);
    }

    public void enterLastName(String lName){
        lastname.clear();
        lastname.sendKeys(lName);
    }

    public void selectGender(){
        male.click();
    }

    public void selectYearsOfExperience(){
        oneYearOfExperience.click();
    }

    public void enterDate(String date){
        datepicker.clear();
        datepicker.sendKeys(date);
    }

    public void selectProfession(){
        automationTesterProfession.click();
    }

    public void selectAutomationTools(){
        automationToolUFT.click();
        automationToolSeleniumWebDriver.click();
    }

    public void selectContinent(String clientContinent){
        Select continentDropDown = new Select(continents);
        continentDropDown.selectByVisibleText(clientContinent);
    }

    public void selectSeleniumCommand(String seleniumCommand){
        Select seleniumCommandDropDown = new Select(selenium_commands);
        seleniumCommandDropDown.selectByVisibleText(seleniumCommand);
    }

    public void uploadimage(String filePath){
  //      photo.click();
        photo.sendKeys(filePath);
    }

    public String selectDownloadFile(){
       return downloadFile.getText();
    }

    public void clickSubmitButton(){
        submit.click();
    }
}
