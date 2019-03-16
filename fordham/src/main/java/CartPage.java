import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class CartPage extends Base {
    public static void viewCartItems() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement cartItem1 = null;
        driver.findElement(By.cssSelector("#mini-cart > div.mini-cart-total > a > span.minicart-quantity")).click();
        String cartName1 = null;
        System.out.println("Items in Preethi's cart are:");
        cartItem1 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(1) > td.item-details > div > div.name > a"));
        cartName1 = cartItem1.getText();
        System.out.println(cartName1);
        WebElement cartItem2 = null;
        String cartName2 = null;
        cartItem2 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(2) > td.item-details > div > div.name > a"));
        cartName2 = cartItem2.getText();
        System.out.println(cartName2);
    }
}
