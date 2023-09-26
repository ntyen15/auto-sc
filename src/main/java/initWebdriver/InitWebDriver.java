package initWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InitWebDriver {


    WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    @BeforeTest
    public void setUp() { //ulatroi lopws con chi nhan access modifier = protected  vaf public
        System.out.println("Mo trinh duyet...");
        //System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://misast.mshopkeeper.vn/");
        this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void signInTest(){

    }
    @AfterTest
    public void closePage() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

}
