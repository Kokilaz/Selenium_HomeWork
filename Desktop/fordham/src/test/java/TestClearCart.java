import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class TestClearCart extends ClearCart {

    @Test

    public static void ClearCart() {
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();
        SingleWickCandle.SWCButton();
        EucalyptusSpearmint.ESCandle();
        AddToBag.Addtobag();
        EucalyptusSpearmint.RVCandle();
        AddToBag.AddOneMore();
        CartPage.viewCartItems();
        ClearCart.Clearcart();
        ClearCart.ClearOneMore();
        HomeFragrance.HFTab();
    }
}

