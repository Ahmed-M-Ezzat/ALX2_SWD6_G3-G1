package com.amazon.pages;

import org.openqa.selenium.By;

public class RegisterPageContinue extends BasePage {
//    test
//    static private By startHereLink = By.cssSelector("#nav-flyout-ya-newCust > a");
    static private By proceedButton = By.xpath("//input[@type='submit']");

    public static boolean isProceed(){return driver.findElement(proceedButton).isDisplayed();}


    public static RegisterPage continueAgain(){
        click(proceedButton);
        return new RegisterPage();
    }


}
