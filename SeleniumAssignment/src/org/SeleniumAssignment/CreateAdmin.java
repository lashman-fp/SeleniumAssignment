package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class CreateAdmin {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = login.webDriver();
        Thread.sleep(5000);

        WebElement drop = driver.findElement(By.xpath("//button[@class = 'btn round ng-star-inserted']"));
        Main.clickOn(driver, drop, 20);

        WebElement admin = driver.findElement(By.xpath("//div[starts-with(text(),'Admin')]"));
        Main.clickOn(driver, admin, 10);

        WebElement name = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. Abram Pattrick')]"));
        Main.sendKeys(driver,name,10,"admin test");

        WebElement phone = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. +1(917)720-7465')]"));
        Main.sendKeys(driver,phone,10,"+19876543210");

        WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. abram@gmail.com')]"));
        Main.sendKeys(driver,email,10,"admintest@gmail.com");

        WebElement next = driver.findElement(By.xpath("//span[contains(text(), 'Set Password')]"));
        Main.clickOn(driver, next, 10);

        WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter password')]"));
        Main.sendKeys(driver,pass,10,"admin@1234");

        WebElement confirmpass = driver.findElement(By.xpath("//input[contains(@placeholder, 'Confirm password')]"));
        Main.sendKeys(driver,confirmpass,10,"admin@1234");

        WebElement create = driver.findElement(By.xpath("//span[contains(text(), 'Create Account')]"));
        Main.clickOn(driver, create, 10);

    }
}
