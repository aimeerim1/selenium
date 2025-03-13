package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

//        WebElement input = driver.findElement(By.className());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement element = (new WebDriverWait(driver , Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
        driver.get("https://www.avito.ru/rossiya/avtomobili");
        WebElement element = driver.findElement(By.xpath("(//h1[text()='Купить автомобиль'])"));
        String typing = element.getAttribute("offsetHeight");
        System.out.println(typing);


        }
}