import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleWickCandle extends Base {
    public static void SWCButton(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement SWCButton = null;
        SWCButton = driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(3) > a"));
        wait.until(ExpectedConditions.visibilityOf(SWCButton));
        SWCButton.click();

    }
}
