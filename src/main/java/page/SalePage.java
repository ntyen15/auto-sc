package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalePage {
    private WebDriver driver;
    private  By itemSearchInput = By.xpath("//input[@class='q-field__native q-placeholder']");
    private  By selectedButton = By.xpath("//button[@class='q-btn q-btn-item non-selectable no-outline btn btn-action btn-primary q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--wrap']");
    private By PrintOption = By.xpath("//div[@aria-label='In hóa đơn']");
    private By paymentButton = By.xpath("//button[@class='q-btn q-btn-item non-selectable no-outline btn-take-money q-btn--standard q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--wrap active']");
    public SalePage(WebDriver driver){this.driver=driver;}
    public void enterItemSearchKey(String ItemSearchKey){
        WebElement searchItemBox = driver.findElement(itemSearchInput);
        if (searchItemBox.isDisplayed())
            searchItemBox.sendKeys(ItemSearchKey);
    }
    public void clickAddItemButton(){
        WebElement addItem = driver.findElement(selectedButton);
        if (addItem.isDisplayed())
            addItem.click();
    }
    public void offPrintBill(){
        WebElement printBill = driver.findElement(PrintOption);
        if (printBill.isDisplayed())
            printBill.click();
    }
    public void clickPaymentButton(){
        WebElement payment = driver.findElement(paymentButton);
        if (payment.isDisplayed())
            payment.click();
    }
    public void payOrder(String ItemSearchKey) throws Exception {
        enterItemSearchKey(ItemSearchKey);
        clickAddItemButton();
        offPrintBill();
        clickPaymentButton();
        Thread.sleep(9000);
    }
}
