package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Logout {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement log = driver.findElement(By.xpath("//a[@id='dropdownBasic2']"));
        Main.clickOn(driver, log, 10);

        WebElement logout = driver.findElement(By.xpath("//a[@class='dropdown-item']"));
        Main.clickOn(driver, logout, 20);
    }
}
