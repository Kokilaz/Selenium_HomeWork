import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Base {
    static WebDriver driver = null;
    String url = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../common/driver/chromedriver 2");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void cleanUp() {
        this.driver.quit();
    }

}


