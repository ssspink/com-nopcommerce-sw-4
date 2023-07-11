package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
create class "TopMenuTest"
1.1 create method with name "selectMenu" it has one parameter name "menu" of type
string
1.2 This method should click on the menu whatever name is passed as parameter.
1.3. create the @Test method name verifyPageNavigat
 */
public class TopMenuPage extends Utility
{
  static String menu;

  public String selectMenu(String menu) {
    this.menu = menu;
    List<WebElement> topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
    try {
      for (WebElement element : topMenuList) {
        if (element.getText().equalsIgnoreCase(menu)) {
          element.click();


        }
      }
    } catch (StaleElementReferenceException e) {
      topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
    }


    return getTextFromElement(By.xpath("//h1[contains(text()," + "'" + menu + "')]"));
  }



}
