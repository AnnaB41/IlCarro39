package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

  @Test
  public void loginPositiveTest(){

    openLoginForm();
    fillLoginForm("myemail5@mail.com", "Tt123456$" );
    submitLogin();
    Assert.assertTrue(isElementPresent());
    }


  }




