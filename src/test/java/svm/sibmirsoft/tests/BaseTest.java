package svm.sibmirsoft.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected final String BASE_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        getDriver().get(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

    protected WebDriver getDriver() {
        return driver.get();
    }
}