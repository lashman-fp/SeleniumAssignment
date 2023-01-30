package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateClient {

    public static void main(String[] args) throws Exception {
        Main login = new Main();

        login.login();

        WebDriver driver = login.webDriver();

        Thread.sleep(5000);
        WebElement drop = driver.findElement(By.xpath("//button[@class = 'btn round ng-star-inserted']"));
        Main.clickOn(driver, drop, 10);

        WebElement admin = driver.findElement(By.xpath("//div[starts-with(text(),'Client')]"));
        Main.clickOn(driver, admin, 10);

        WebElement name = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. Abram Pattrick')]"));
        Main.sendKeys(driver,name,10,"admin test");

        WebElement phone = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. +1(917)720-7465')]"));
        Main.sendKeys(driver,phone,10,"+19876543210");

        WebElement next = driver.findElement(By.xpath("//span[contains(text(), 'Set Email & Password')]"));
        Main.clickOn(driver, next, 10);

        WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder, 'e.g. abram@gmail.com')]"));
        Main.sendKeys(driver,email,10,"admintest@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter password')]"));
        Main.sendKeys(driver,pass,10,"admin@1234");

        WebElement confirmpass = driver.findElement(By.xpath("//input[contains(@placeholder, 'Confirm password')]"));
        Main.sendKeys(driver,confirmpass,10,"admin@1234");

        Thread.sleep(5000);
        WebElement add = driver.findElement(By.xpath("//span[contains(text(), 'Add Info')]"));
        Main.clickOn(driver, add, 10);

        WebElement texas = driver.findElement(By.xpath("//div[@class='school-form mx-auto']/app-school-organization/div/div/div/div/app-school/div/app-select/div/ng-select/div/div/div/input[@role='combobox']"));
        Main.sendKeys(driver,texas,10, "Texas State University");

        Thread.sleep(10000);

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(),'Texas State University')]")));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Click ");
        }

        WebElement org = driver.findElement(By.xpath("//app-organization/div/app-select/div/ng-select[@role='listbox']/div/div/div/input[@role='combobox']"));
        Main.sendKeys(driver,org,10, "2023");

        Thread.sleep(5000);
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[starts-with(text(),'2023')]")));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Click ");
        }

        Thread.sleep(5000);
        WebElement pos = driver.findElement(By.xpath("//input[starts-with(@placeholder,'e.g. Apparel Chair')]"));
        Main.sendKeys(driver,pos,10, "chairman");

        WebElement year = driver.findElement(By.xpath("//div[starts-with(text(),' 2023')]"));
        Main.clickOn(driver,year,10);



    }
}
