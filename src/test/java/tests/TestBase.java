package tests;

import manager.ApplicationManager;
import manager.HelperBase;
import manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase implements HelperUser {

    WebDriver wd;

    @BeforeSuite
public void setup(){
        init();
    }

    @AfterSuite
    public void stop(){
       pause(5000);
        tearDown();
    }
//    public void tearDown(){
//        pause(3000);
//        wd.quit();
//    }
//
//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void openLoginForm(){
//      wd.findElement((By.xpath("//div[@class='header']//a[contains(text(),'Log in')]"))).click();
//      //click(By.xpath("//*[.=' Log in ']"));
//    }


//    public void fillLoginForm(String email, String password){
////        WebElement email = wd.findElement(By.id("email"));
////        email.click();
////        email.clear();
////        email.sendKeys("myemail5@mail.com");
////
////        WebElement password = wd.findElement(By.id("password"));
////        password.click();
////        password.clear();
////        password.sendKeys("Tt123456$");
//
//        type(By.id("email"), email);
//        type(By.id("password"), password);
//
//    }

//    public void submitLogin(){
//        WebElement btnYalla = wd.findElement(By.cssSelector("button[type='submit']"));
//        btnYalla.click();
////        pause(3000);
////        wd.findElement(By.cssSelector("button[type='button']")).click();
//    }
//
//    public boolean isLoggedSuccess(){
//        return isElementPresent(By.xpath("//h2[contains(text(),'success')]"));
//    }
//
//    public void logout(){
//        wd.findElement (By.xpath("//*[.=' Logout ']")).click();
//    }
//
//    public void clickOkButton(){
//        wd.findElement(By.xpath("//button[@type='button']")).click();
//    }


//    public boolean isElementPresent(By locator){
//
//        return wd.findElements(locator).size() > 0;
//    }

//    public void type(By locator, String text){
//        WebElement element = wd.findElement(locator);
//        element.click();
//        element.clear(); // очищаем форму логина
//        element.sendKeys(text); // вставляем адрес
//    }








}
