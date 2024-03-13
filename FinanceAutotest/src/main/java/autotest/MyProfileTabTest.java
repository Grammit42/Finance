package autotest;

import org.junit.Test;
import pages.MyProfileTabPage;

public class MyProfileTabTest extends BaseTest{


@Test
public void tapToProfile(){

    MyProfileTabPage myProfileTabPage = new MyProfileTabPage();

    registerTest();

    myProfileTabPage.clickToMyProfile();

}

}
