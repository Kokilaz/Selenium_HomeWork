import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClearCart extends Base {


    public static void Clearcart() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Clearcart = null;
        Clearcart = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(1) > td.item-remove > div > button > svg"));
        wait.until(ExpectedConditions.visibilityOf(Clearcart));
        Clearcart.click();
        driver.navigate().back();
    }

    public static void ClearOneMore() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Clearonemore = null;
        Clearonemore = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(1) > td.item-remove > div > button > svg"));
        wait.until(ExpectedConditions.visibilityOf(Clearonemore));
        Clearonemore.click();
        driver.navigate().back();


    }
}