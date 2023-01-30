package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class OnlyClient {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        WebElement client = driver.findElement(By.xpath("//div[starts-with(text(), ' Client') and starts-with(@class, 'tabs')]"));
        Main.clickOn(driver, client, 10);

    }
}



