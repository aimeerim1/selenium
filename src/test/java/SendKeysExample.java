import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class SendKeysExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        String param = element.getCssValue("display");
        System.out.println(param);
        element.click();
        element.sendKeys("JavaScript React", Keys.ENTER);
    }

}