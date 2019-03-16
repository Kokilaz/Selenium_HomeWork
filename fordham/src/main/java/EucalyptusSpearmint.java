import com.google.common.escape.Escaper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EucalyptusSpearmint extends Base {

    public static void ESCandle(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement ESCandle = null;
        ESCandle = driver.findElement(By.xpath("//*[@id=\"7437fea71005be2be3701a2f4c\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(ESCandle));
        ESCandle.click();

    }

    public static void RVCandle(){

        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement RVCandle = null;
        RVCandle = driver.findElement(By.xpath("//*[@id=\"17b5693350b6e14fc309ca06b4\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(RVCandle));
        RVCandle.click();
    }
}
