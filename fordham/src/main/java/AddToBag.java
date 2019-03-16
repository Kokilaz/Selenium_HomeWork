import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AddToBag extends Base {

    public static void Addtobag() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Addtobag = null;
        Addtobag = driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]"));
        wait.until(ExpectedConditions.visibilityOf(Addtobag));
        Addtobag.click();
        driver.navigate().back();
    }
    public static void AddOneMore(){
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Addtobag = null;
        Addtobag = driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]"));
        wait.until(ExpectedConditions.visibilityOf(Addtobag));
        Addtobag.click();
        driver.navigate().back();


    }
}
