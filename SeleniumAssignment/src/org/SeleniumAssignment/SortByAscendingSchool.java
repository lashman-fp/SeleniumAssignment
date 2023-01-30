package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortByAscendingSchool {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        WebElement ascendingName = driver.findElement(By.xpath("//span[starts-with(text(),'School')]"));
        Main.clickOn(driver, ascendingName, 10);

        //div[starts-with(span,'Full name') and span[starts-with(@class,'sort')]]
    }
}



