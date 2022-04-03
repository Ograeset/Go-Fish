import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumTestNasir {

        public static void main(String[] args) throws InterruptedException {
            SeleniumTestNasir seleniumTest = new SeleniumTestNasir();
            seleniumTest.nasirTest();

        }

       public void nasirTest() throws InterruptedException {

            WebDriverManager.chromedriver().setup();

            WebDriver webDriver = new ChromeDriver();

            webDriver.get("https://www.wikipedia.org/");

            webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
            Thread.sleep(4*1000);

            String siteName = webDriver.getTitle();
            System.out.println(siteName);

            WebElement searchBox = webDriver.findElement(By.id("searchInput"));
            WebElement searchButton = webDriver.findElement(By.id("searchButton"));// Drivern kan ej hitta elementen som efterfrågas.

            searchBox.sendKeys("Enhetstest");
            searchButton.click();

            String title = webDriver.findElement(By.className("result_text")).getAttribute("href");

        }

    }

