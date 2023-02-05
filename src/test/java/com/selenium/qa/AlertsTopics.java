package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTopics {

    @Test
    void alertPopUpHandle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.id("alertBox")).click();
        //Alert alert = driver.switchTo().alert();
        //For printing the alert
        //String text = alert.getText();
        //System.out.println(text);
        //alert.accept();


        //driver.findElement(By.id("confirmBox")).click();
        //Alert alert = driver.switchTo().alert();
        //Thread.sleep(3000);
        //alert.dismiss();

        driver.findElement(By.id("promptBox")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("Hi. I'm learning Selenium");
        Thread.sleep(3000);
        alert.accept();


    }





}
