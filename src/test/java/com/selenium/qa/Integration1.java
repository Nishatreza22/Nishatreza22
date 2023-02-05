package com.selenium.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.table.TableRowSorter;

public class Integration1 {

    @Test
    void googleSearchTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","C://Drivers//geckodriver-v0.32.0-win-aarch64//geckodriver.exe");
        //replace with edge browser
        //System.setProperty("webdriver.edge.driver", "C://Drivers//edgedriver_win64//msedgedriver.exe");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
        Thread.sleep(5000);
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("Bangladesh");
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div/div/div[1]/div/a/h3")).click();
        Thread.sleep(5000);
        driver.get("https://www.britannica.com/place/Bangladesh/images-videos#Images/");
    }
}
