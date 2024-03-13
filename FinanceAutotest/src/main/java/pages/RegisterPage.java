package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class RegisterPage extends BasePage{


    public RegisterPage() {
        driver.get(config.urlAutotestFinance());
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "[type = \"email\"]")
    private WebElement emailInput;

@FindBy(css = "[type = \"password\"]")
    private WebElement passwordInput;
@FindBy(css = ".button__content")

private WebElement enterRegister;

@FindBy(css = ".typography.typography--type-heading")
private WebElement enterText;


    public void clickOnInputEmail() throws InterruptedException {
        sleep(1000);
        emailInput.click();
    }

    public void clickOnInputPassword() throws InterruptedException {
        sleep(1000);
        passwordInput.click();
    }

    public void inputStringValueOfEmail(String stringValue) throws InterruptedException {
        sleep(1000);
        emailInput.sendKeys(stringValue);
    }
    public void inputStringValueOfPassword(String stringValue) throws InterruptedException {
        sleep(1000);
        passwordInput.sendKeys(stringValue);
    }

    public void clickOnRegister() throws InterruptedException {
        sleep(1000);
        enterRegister.click();
    }

    public void assertCorrectTextDisplay(String stringValue) throws InterruptedException {
        sleep(1000);
        assertEquals("Проверка пройдена ли авторизация", stringValue, enterText.getText());

    }
    }
