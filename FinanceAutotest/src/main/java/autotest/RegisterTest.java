package autotest;

import org.junit.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

@Test
        public void registerTest() throws InterruptedException {

    String emailValue = "admin@admin.ad";
    String passwordValue = " admin";
    String correctText = "Платежи";


    RegisterPage registerPage = new RegisterPage();

    registerPage.clickOnInputEmail();//Заполнение поля Почты
    registerPage.inputStringValueOfEmail(emailValue);

    registerPage.clickOnInputPassword();//Заполнение поля Пароля
    registerPage.inputStringValueOfPassword(passwordValue);

    registerPage.clickOnRegister();

    registerPage.assertCorrectTextDisplay(correctText);












}
}
