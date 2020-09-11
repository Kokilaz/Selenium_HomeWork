import org.testng.annotations.Test;

public class TestEucalyptusSpearmint extends EucalyptusSpearmint {

    @Test

    public static void ESCandle(){
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();
        SingleWickCandle.SWCButton();
        EucalyptusSpearmint.ESCandle();
    }
}
