package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WishlistPage extends BasePage {

    public static By yourListConfirm = By.xpath("//a[@href='/-/en/hz/wishlist/ls/ref=cm_wl_your_lists']");
    public static By deleteButton = By.xpath("//input[@name='submit.deleteItem']");
    public static By deleteConfirm = By.xpath("//div[contains(text(),'Deleted')]");
    public static By undoDeleteLink = By.xpath("(//a[normalize-space()='Undo'])[1]");
    public static By productTitle = By.xpath("(//a[normalize-space()='Men Classic Shirt from White Eagle'])[1]");

    public static boolean isWishlistPageVisible() {
        return driver.findElement(yourListConfirm).isDisplayed();
    }

    public static boolean isProductDeleted() {
        return driver.findElement(deleteConfirm).isDisplayed();
    }

    public static boolean isProductInList() {
        return driver.findElement(productTitle).isDisplayed();
    }

    public static void deleteProduct() {
        click(deleteButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(deleteConfirm));

    }

    public static void undoDeleteProduct() {
        click(undoDeleteLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(productTitle));
    }

}
