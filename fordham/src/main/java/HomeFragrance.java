import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeFragrance extends Base {
    public static void HFTab() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement HFTab = driver.findElement(By.cssSelector("#home-fragrance-dropdown > a"));
        wait.until(ExpectedConditions.visibilityOf(HFTab));
        HFTab.click();
    }
}
