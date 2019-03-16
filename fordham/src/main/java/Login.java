import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends Base {
    public static void LoginButton() {
        WebElement loginButton = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        HomePage.testUserCanNavigateToHomePage();
        driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.addOn.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")).click();
        loginButton = driver.findElement((By.cssSelector("#wrapper > header > div.top-banner.addOn.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a:nth-child(1)")));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }


    public static void SigninBox() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement username = driver.findElement(By.cssSelector("#dwfrm_login_username"));
        username.sendKeys("preethikokila1@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#dwfrm_login_password"));
        password.sendKeys("Hijklmn1");
        driver.findElement(By.cssSelector("#dwfrm_login > fieldset > div.form-row.form-row-button > button")).click();
    }
}