package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Integration2 {


    @Test
    void firefoxSearchTest() throws InterruptedException {

        //PC - Configuration
        //System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");

        //WebDriverManager - Bonigarcia
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();


        //WebDriver driver = new ChromeDriver();
        Thread.sleep(500);
        driver.get("https://www.sas.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#login > div.par.parsys > div > div > ul > li > button")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#profile_login > div.par.parsys > div:nth-child(4) > div > div.par.parsys > div:nth-child(3) > div > p > small > a > span")).click();
        Thread.sleep(500);
        Select language = new Select(driver.findElement(By.id("language")));
        language.selectByVisibleText("English");
        Thread.sleep(500);
        driver.findElement(By.name("firstName")).sendKeys("Nishat");
        Thread.sleep(500);
        driver.findElement(By.name("lastName")).sendKeys("Reza");
        Thread.sleep(500);
        driver.findElement(By.name("emailAddress")).sendKeys("nishatrahman16@yahoo.com");
        Thread.sleep(500);
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States");
        Thread.sleep(500);
        Select state = new Select(driver.findElement(By.id("state")));
        state.selectByVisibleText("New York");
        Thread.sleep(500);
        Select affiliation = new Select(driver.findElement(By.id("affiliation")));
        affiliation.selectByVisibleText("Just Browsing");
        Thread.sleep(500);
        driver.findElement(By.name("company")).sendKeys("Ascent Pharmaceuticals Inc");
        Thread.sleep(500);
        driver.findElement(By.id("emailContactPreference")).click();
        Thread.sleep(500);
        driver.findElement(By.id("agreeTC")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#submitButton > span")).click();

    }
}
