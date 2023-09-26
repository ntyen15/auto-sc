package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;

public class SigninTest extends BaseSetup {
    private WebDriver driver;
    public LoginPage loginPage;
    public SigninTest signinTest;
    @BeforeClass
    public void setUp() {
        // Đã khởi tạo browser hết rồi kể cả wait, phóng to màn hình,...
        driver = getDriver();
    }
    @Test(priority = 1)
    public void signIn() throws Exception {
        System.out.println(driver);
        loginPage = new LoginPage(driver);

        loginPage.signin("ntyen", "12345678@Abc");

    }

}
