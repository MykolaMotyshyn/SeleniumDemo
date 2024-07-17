package Driver;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

/**
 * #Summary:
 * #Author: Mykola Motyshyn
 * #Author's Email:
 * #Created: 16/06/2024 - 21:04
 * #Comments:
 */
@Getter
public class DriverInit {
    // ThreadLocal used to manage the driver
    private static WebDriver driver;
    public static final String BASE_URL = "https://www.youtube.com";

    // Private constructor to prevent the creation of new instances of Driver
    private DriverInit() {
    }

    // Public method to access the driver instance (uses lazy instantiation)
    @BeforeTest
    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(BASE_URL);
        }
        return driver;
    }

    @AfterTest
    public static void quit() {
        driver.close();
        driver.quit();
    }
}


