package com.endava.myshopify.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RentBikePage{

    private static final String baseUrl = "https://webkul-booking-app-demo-2.myshopify.com/collections/frontpage/products/rent-a-hiking-cycle";

    private WebDriver driver;

    private By datePickerStartDate = By.className("datepicker-input");
    private By datePickerEndDate = By.className("datepicker-2-input");
    private By bookNowButton = By.id("#wk_bc_AddToCart");

    public RentBikePage(WebDriver driver) {
        this.driver = driver;
    }

    public void load(){
        driver.get(baseUrl);
    }

    public void setStartDate(String startDate){

        driver.findElement(datePickerStartDate).sendKeys(startDate);

    }

    public void setEndDate(String endDate){

        driver.findElement(datePickerEndDate).sendKeys(endDate);
    }

    public void bookNow(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(bookNowButton)).click();

    }

}
