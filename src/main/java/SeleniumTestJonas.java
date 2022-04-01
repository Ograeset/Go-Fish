


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTestJonas {

    public static void main(String[] args) throws InterruptedException {
        SeleniumTestJonas seleniumTest = new SeleniumTestJonas();
        seleniumTest.jonasTest();
    }

    public void jonasTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://sv.wikipedia.org/wiki/Portal:Huvudsida");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5*1000);

        String siteName = webDriver.getTitle();
        System.out.println(siteName);

        WebElement searchBox = webDriver.findElement(By.id("searchInput"));
        WebElement searchButton = webDriver.findElement(By.id("searchButton"));

        searchBox.sendKeys("Sverige");
        searchButton.click();

        String title = webDriver.findElement(By.className("result_text")).getAttribute("href");

    }

}
