package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SortByDescendingName {

    public static void main(String[] args) throws Exception {
        Main login = new Main();

        login.login();

        Thread.sleep(5000);

        SortByAscendingName sortByAscendingName = new SortByAscendingName();
        sortByAscendingName.ascend();
        WebDriver driver = Main.webDriver();

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[@class='sort-btn datatable-icon-up sort-asc']")));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Click ");
        }


    }
}



