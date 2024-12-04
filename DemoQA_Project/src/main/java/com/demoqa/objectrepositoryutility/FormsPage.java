package com.demoqa.objectrepositoryutility;

import com.demoqa.webdriverutility.browserutility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormsPage extends browserutility {

    public FormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Forms']")
    private WebElement formsText;

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormText;

    @FindBy(id = "firstName")
    private WebElement firstNameText;

    @FindBy(id = "lastName")
    private WebElement lastNameText;

    @FindBy(id = "userEmail")
    private WebElement userEmailText;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    private WebElement genderRadioButton;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    private WebElement mobileNumberText;

    @FindBy(id = "dateOfBirthInput")
    private WebElement birthDateText;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    private WebElement monthSelect;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    private WebElement yearSelect;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    private WebElement subjectsInput;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    private WebElement hobbiesCheckbox;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(xpath = "//textarea[@placeholder=\"Current Address\"]")
    private WebElement currentAddress;

    @FindBy(xpath = "//div[@aria-hidden='true' and @class=' css-tlfecz-indicatorContainer']")
    private WebElement stateSelect;

    @FindBy(xpath = "//div[text()='Haryana']")
    private WebElement haryana;

    @FindBy(xpath = "//div[text()='Select City' ]/ancestor::div[@class=' css-yk16xz-control']/descendant::div[@aria-hidden='true']")
    private WebElement citySelect;

    @FindBy(xpath = "//div[text()='Karnal']")
    private WebElement karnal;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public WebElement getFormsText() {
        return formsText;
    }

    public WebElement getPracticeFormText() {
        return practiceFormText;
    }

    public WebElement getFirstNameText() {
        return firstNameText;
    }

    public WebElement getLastNameText() {
        return lastNameText;
    }

    public WebElement getUserEmailText() {
        return userEmailText;
    }

    public WebElement getGenderRadioButton() {
        return genderRadioButton;
    }

    public WebElement getMobileNumberText() {
        return mobileNumberText;
    }

    public WebElement getBirthDateText() {
        return birthDateText;
    }

    public WebElement getMonthSelect() {
        return monthSelect;
    }

    public WebElement getYearSelect() {
        return yearSelect;
    }

    public WebElement getSubjectsInput() {
        return subjectsInput;
    }

    public WebElement getHobbiesCheckbox() {
        return hobbiesCheckbox;
    }

    public WebElement getUploadPicture() {
        return uploadPicture;
    }

    public WebElement getCurrentAddress() {
        return currentAddress;
    }

    public WebElement getStateSelect() {
        return stateSelect;
    }

    public WebElement getHaryana() {
        return haryana;
    }

    public WebElement getCitySelect() {
        return citySelect;
    }

    public WebElement getKarnal() {
        return karnal;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}

