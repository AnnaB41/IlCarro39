package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().window().maximize();
        // ожидание алерта пока под вопросом
    }

    @AfterMethod
    public void tearDown(){
        pause(3000);
        wd.quit();
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openLoginForm(){
        wd.findElement((By.xpath("//div[@class='header']//a[contains(text(),'Log in')]")))
                .click();
    }


    public void fillLoginForm(String email, String password){
//        WebElement email = wd.findElement(By.id("email"));
//        email.click();
//        email.clear();
//        email.sendKeys("myemail5@mail.com");
//
//        WebElement password = wd.findElement(By.id("password"));
//        password.click();
//        password.clear();
//        password.sendKeys("Tt123456$");

        type(By.id("email"), email);
        type(By.id("password"), password);

    }

    public void submitLogin(){
        WebElement btnYalla = wd.findElement(By.cssSelector("button[type='submit']"));
        btnYalla.click();
        pause(3000);
        wd.findElement(By.cssSelector("button[type='button']")).click();
    }



    public boolean isElementPresent(){
        if(wd.findElements(By.xpath("//a[contains(text(),'Logout')]")).size() > 0)
            return true;
        else
            return false;
    }

    public void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear(); // очищаем форму логина
        element.sendKeys(text); // вставляем адрес
    }








}
