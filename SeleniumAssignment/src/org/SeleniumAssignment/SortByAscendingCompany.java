package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SortByAscendingCompany {

    public static void main(String[] args) throws Exception {
        Main login = new Main();

        login.login();

        Thread.sleep(5000);

        ascend();

    }

    public static void ascend() throws Exception {
        WebDriver driver = Main.webDriver();

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[@class='datatable-icon-sort-unset sort-btn']")));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Click ");
        }
    }
}




