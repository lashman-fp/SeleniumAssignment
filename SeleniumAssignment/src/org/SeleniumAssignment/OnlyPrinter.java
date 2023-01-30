package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class OnlyPrinter {

    public static void main(String[] args) throws InterruptedException {
//        Main login = new Main();

        Main.login();

        WebDriver driver = Main.webDriver();

        Thread.sleep(5000);

        String path = "//div[starts-with(text(), ' Printer') and starts-with(@class, 'tabs')]";

        Main.isPresent(path);

        WebElement printer = driver.findElement(By.xpath(path));
        Main.clickOn(driver, printer, 10);

    }
}



