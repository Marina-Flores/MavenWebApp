package projetoweb;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ExampleTest {
    
    @Test
    public void testLocalhostTitle() {
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/projetoweb");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertEquals("Hello World!", pageTitle);
        driver.quit();
    }
}
