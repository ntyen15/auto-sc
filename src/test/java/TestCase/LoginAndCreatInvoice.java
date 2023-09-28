package TestCase;

import initWebdriver.InitChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.SalePage;

public class LoginAndCreatInvoice extends InitChromeDriver {
    @Test

    @Override
    public void signInTest() {
        LoginPage loginPage = new LoginPage(super.getDriver());
        SalePage salePage = new SalePage(super.getDriver());
        System.out.println("Trạng thái mở trang login: " +loginPage.verifySigninPageTitle()); // in trạng thái check mở trang login
        Assert.assertTrue(loginPage.verifySigninPageTitle(), "Khong mở được trang login"); // Kiểm tra mở trang login thành công hay thất bại
        System.out.println("Mở trang LoginAndCreatInvoice thành công");
        // Thực hiện login

        try {
            loginPage.signIn("ntyen", "12345678@Abc");
             } catch (Exception e) {

                 throw new RuntimeException(e);
             }

        // Kiểm tra login thành công hay thất bại
        System.out.printf(loginPage.getTitel());
        System.out.println("Trạng thái mở trang chủ: " +loginPage.verifyHomePageTitel()); // in trạng thái  mở trang chủ
        System.out.println("Trạng thái login: " +loginPage.verifyHomePageTitel()); // in trạng thái check login
        Assert.assertTrue(loginPage.verifyHomePageTitel(), "LoginAndCreatInvoice thất bại"); // Kiểm tra login thành công hay thất bại
        System.out.println("LoginAndCreatInvoice thành công");
        try {
            salePage.payOrder("DTO01");
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
        System.out.printf("Tạo hóa đơn thành công.");


    }
//    public void createInvoice(){
//        SalePage salePage = new SalePage(super.getDriver());
//        try {
//            salePage.payOrder("DTO01");
//        } catch (Exception e) {
//
//            throw new RuntimeException(e);
//        }
//    }
}
