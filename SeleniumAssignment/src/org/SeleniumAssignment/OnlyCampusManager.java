package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class OnlyCampusManager {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        WebElement cm = driver.findElement(By.xpath("//div[starts-with(text(), ' Campus Manager') and starts-with(@class, 'tabs')]"));
        Main.clickOn(driver, cm, 10);

    }
}



