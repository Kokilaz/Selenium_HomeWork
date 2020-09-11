import org.testng.annotations.Test;

public class TestSingleWickCandle extends SingleWickCandle {

    @Test
    public static void SWCButton(){
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();
        SingleWickCandle.SWCButton();
    }
}
