package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class SignInPage extends AbstractPage {
    By emailAddressInputBox = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
    By passwordInputBox = By.id("passwd");
    By signInButton = By.id("SubmitLogin");
    
    By emailText = By.name("email_create");
    By createAccountButton = By.xpath("//*[@id=\"SubmitCreate\"]");
    By Username = By.xpath("//*[@id=\"email\"]");
    By Password = By.xpath("//*[@id=\"passwd\"]");
    By SignInEnterButton = By.xpath("//*[@id=\"SubmitLogin\"]");


    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }


    public SignInPage navigateToSignIn() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        return this;
    }

    public void login() {
        webDriver.findElement(emailAddressInputBox).sendKeys("fedf@fd.com");
        webDriver.findElement(passwordInputBox).sendKeys("Password1");
        webDriver.findElement(signInButton).click();
    }

    public SignInPage enterEmailAddress(String email) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(emailText).sendKeys(email);
        webDriver.findElement(createAccountButton).click();
        return this;
    }

    public SignInPage enterSignInFields() throws InterruptedException {
        Thread.sleep(1000);


        webDriver.findElement(Username).sendKeys("fedf@fd.com");
        webDriver.findElement(Password).sendKeys("Password1");
        webDriver.findElement(SignInEnterButton).click();
        return (new SignInPage(webDriver));

    }
}
