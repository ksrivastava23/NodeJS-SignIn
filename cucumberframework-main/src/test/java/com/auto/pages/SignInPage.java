package com.auto.pages;

import com.auto.utility.Base;
import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private Base base;
    SelfHealingDriver driver;

    public SignInPage(SelfHealingDriver driver, Base base) {
        this.base = base;
        PageFactory.initElements(base.getDriver(),this);
    }

    @FindBy(how= How.XPATH, using = "//input[@placeholder=\"Name\"]")
    public WebElement txtNameXPath;

    @FindBy(how= How.XPATH, using = "//input[@placeholder=\"Password\"]")
    public WebElement txtPasswordXPath;

    @FindBy(how= How.XPATH, using = "//input[@placeholder=\"Email\"]")
    public WebElement txtEmailXPath;

    @FindBy(how= How.ID, using = "nameBtn")
    public WebElement txtNameID;

    @FindBy(how= How.ID, using = "passwordBtn")
    public WebElement txtPasswordID;

    @FindBy(how= How.ID, using = "emailBtn")
    public WebElement txtEmailID;

    @FindBy(how= How.ID, using = "registerBtn")
    public WebElement btnSignUp;

    @FindBy(how= How.ID, using = "signUpBtn")
    public WebElement btnSignIn;

    public void clickSignIn(){
        btnSignIn.click();
    }
    public void enterLoginCredentialsByXpath(String name, String password, String email)
    {
        txtNameXPath.sendKeys(name);
        txtEmailXPath.sendKeys(email);
        txtPasswordXPath.sendKeys(password);
    }

    public void enterLoginCredentialsByID(String name, String password, String email)
    {
        txtNameID.sendKeys(name);
        txtEmailID.sendKeys(email);
        txtPasswordID.sendKeys(password);
    }

    public void clickSignUp(){
        btnSignUp.submit();
    }


}
