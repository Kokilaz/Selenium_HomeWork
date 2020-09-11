import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Base{

    static String homepageUrl = "https://www.bathandbodyworks.com/";

    public static void testUserCanNavigateToHomePage() {
        String homepageTitle = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.navigate().to(homepageUrl);
        driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")).click();
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), homepageTitle);
    }
}