package com.amazon.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    static private By nameField = By.cssSelector("#ap_customer_name");
    static private By passField = By.xpath("//input[@id='ap_password']");
    static private By rePassField = By.xpath("//input[@id='ap_password_check']");
    static private By verifyButton = By.xpath("//input[@id='continue']");
    static private By phone = By.cssSelector("#ap_phone_number");
    static private By createText = By.xpath("//h1[normalize-space()='Create Account']");
    static private By conditionsOfUseLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]");
    static private By privacyLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]");
    static private By input = By.cssSelector("input[name=\"departments\"");



    public static boolean isVerify(){return driver.findElement(verifyButton).isDisplayed();};
    public static boolean isCreate_atHead(){return driver.findElement(createText).isDisplayed();};
    public static boolean isConditionsLink(){return driver.findElement(conditionsOfUseLink).isDisplayed();};
    public static boolean isPrivacyLink(){return driver.findElement(privacyLink).isDisplayed();};


    public static void addInputs(String number,String firstName, String pass){
        set(phone, number);
        set(nameField, firstName);
        set(passField,pass);
        set(rePassField,pass);
        set(rePassField,pass);
        click(verifyButton);
    }
    public static void clickInput(){
        click(input);
    }
}
