package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfileTabPage extends BasePage {

    public MyProfileTabPage() {
        driver.get(config.urlAutotestFinance());
        PageFactory.initElements(driver, this);
    }

@FindBy(css = ".userInfo__name")
    private WebElement tapToProfile;

    public MyProfileTabPage clickToMyProfile(){
        tapToProfile.click();
        return this;
    }

}
