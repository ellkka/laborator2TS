package com.company;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import java.util.List;


public class Main {

    @Test
    public void startWebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\univer\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.zap.md/");
        //driver.findElement(By.name("keys")).sendKeys("iphone");
        //driver.findElement(By.name("keys")).sendKeys(Keys.ENTER);
        driver.get("http://www.refurb.md/ro/search/?query=lenovo");
        List<WebElement> objects = driver.findElements(By.className("price"));
            for (WebElement objcurrent : objects){
              String text = objcurrent.getText();
              System.out.println(text);
            }

            Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}
