import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginMisastSc {
    public LoginMisastSc() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://misast.mshopkeeper.vn/");
        WebElement usernameInput = driver.findElement(By.name("UserName"));
        usernameInput.sendKeys("ntyen");
        WebElement passwordInput = driver.findElement(By.name("Password"));
        passwordInput.sendKeys("12345678@Abc");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement goToSc = driver.findElement(By.id("MISAPanel-1083-innerCt"));
        goToSc.click();

    }
}
