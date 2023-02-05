package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {


    @Test
    void keyBoardActionTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.google.com");
        //driver.manage().window().maximize();
        //Thread.sleep(3000);
       // driver.findElement(By.name("q")).sendKeys("IntelliJ" + Keys.ENTER);


        driver.get("http://www.costco.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();





    }
}
