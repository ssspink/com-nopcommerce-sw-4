package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;
/*
1. create class "TopMenuTest"
1.1 create method with name "selectMenu" it has one parameter name "menu" of type
string
1.2 This method should click on the menu whatever name is passed as parameter.
1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
select the Menu and click on it and

 */


public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();
    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to   select the Menu and click on it and

    // public void selectMenu(String menu){


    // }

    @Test
    public void verifyPageNavigation() {
        topMenuPage.selectMenu("Gift Cards");
    }


}
