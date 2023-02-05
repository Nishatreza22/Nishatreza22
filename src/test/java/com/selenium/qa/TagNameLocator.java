package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.freshworks.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String header = driver.findElement(By.tagName("h1")).getText();
        System.out.println(header);
        if(header.contains("Love your software")){
            System.out.println("h1 header is correct");
        } else {
            System.out.println("h1 header is incorrect, need another locator");
        }




    }
}
