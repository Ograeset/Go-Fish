import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
       SeleniumTest seleniumTest = new SeleniumTest();
               seleniumTest.andreasTest();
    }

    public void andreasTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.imdb.com/");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5*1000);

        String siteName = webDriver.getTitle();
        System.out.println(siteName);

        WebElement searchBox = webDriver.findElement(By.id("suggestion-search"));
        WebElement searchButton = webDriver.findElement(By.id("suggestion-search-button"));

        searchBox.sendKeys("Tillbaka till framtiden");
        searchButton.click();

    }

}
