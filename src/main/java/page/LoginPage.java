package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By usernameInput = By.name("UserName");
    private  By passwordInput = By.name("Password");
    private By loginButton = By.id("btnLogin");
    private  By scLinkInput = By.id("MISAPanel-1083-innerCt");
    private By branchCombobox = By.xpath("//*[contains(@class, 'misa-div branch-name')]");
    private By searchBranchBox = By.xpath("//*[contains(@placeholder, 'Tìm kiếm chi nhánh')]");
    private By firsBranch = By.xpath("//html/body/div[4]/div/div/div/div[1]");
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
    public void enterUsername(String username){
        WebElement usernameBox = driver.findElement(usernameInput);
        if (usernameBox.isDisplayed())
            usernameBox.sendKeys(username);
    }
    public void enterPassword (String password){
        WebElement passwordBox = driver.findElement(passwordInput);
        if (passwordBox.isDisplayed())
            passwordBox.sendKeys(password);
    }
    public void clickLoginButton(){
        WebElement signin = driver.findElement(loginButton);
        if (signin.isDisplayed())
            signin.click();
    }
    public void clickScLink(){
        WebElement scLink = driver.findElement(scLinkInput);
        if (scLink.isDisplayed())
            scLink.click();
    }
    public void enterBanchName(String branchName){
        WebElement branchNameBox = driver.findElement(branchCombobox);
        branchNameBox.sendKeys(branchName);
    }
    public void selectBranch(){
        WebElement branchResult = driver.findElement(firsBranch);
        branchResult.click();
    }
    // Hàm lấy ra tên trang login
    public String getTitel(){
        String pageTitlePage = driver.getTitle();
        return pageTitlePage;
    }
    // Hàm check trang đăng nhập đã mở ra hay chưa
    public boolean verifySigninPageTitle(){
        String expectedSigninTitle = "MISA eShop - Đăng nhập";
        return getTitel().equals(expectedSigninTitle);
    }
    // Hàm thực hiện login
    public void signIn(String username, String password) throws Exception {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        Thread.sleep(1000);
        clickScLink();
        Thread.sleep(9000);
    }
    // Hàm kiểm tra đã login thành công hay chưa
    public boolean verifyHomePageTitel(){
        String expectedHomePageTitle = "MISA eShop";
        return getTitel().contains(expectedHomePageTitle);
    }
    // Hàm chọn chi nhánh
    public void chooseBranch(){
        String branchName = "ntyen";

    }

}
