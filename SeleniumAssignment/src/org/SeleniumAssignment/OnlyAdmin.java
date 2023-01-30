package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class OnlyAdmin {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        Main.isPresent("//div[starts-with(text(), ' Admin') and starts-with(@class, 'tabs')]");

        WebElement admin = driver.findElement(By.xpath("//div[starts-with(text(), ' Admin') and starts-with(@class, 'tabs')]"));
        Main.clickOn(driver, admin, 10);

    }
}



