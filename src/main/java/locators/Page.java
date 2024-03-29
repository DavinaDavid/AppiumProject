package locators;
import core.utils.ConfigUtil;
import locators.android.LoginPage;
import java.util.Properties;
public class Page {
    public static Properties myProp = ConfigUtil.getConfig("config");
    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");

    private final LoginPage loginPage = new LoginPage(this);
    protected LoginPage getHomePage() {
        return loginPage;}
}
