package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public interface HelperUser extends HelperBase{
    default void openLoginForm(){
        click(By.xpath("//*[.=' Log in ']"));
    }
    default void openRegistrationForm(){
        click(By.xpath("//*[.=' Sign up ']"));
    }

    default void fillLoginForm(String email, String password){
       type(By.id("email"), email);
       type(By.id("password"), password);

    }
    default void filRegistrationForm(User user){
        type(By.id("name"), user.getName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
        clickCheckbox();

    }

    default void clickCheckbox(){
        // var 1
        //click(By.cssSelector("label[for='terms-of-use']"));
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");

    }

    default void submitLogin(){
        click(By.cssSelector("button[type='submit']"));
    }

    default void submitRegistration(){
        click(By.cssSelector("button[type='submit']"));
    }

    default boolean isLoggedSuccess(){
        return isElementPresent(By.xpath("//h2[contains(text(),'success')]"));
    }
    default boolean isLogged(){
        return isElementPresent(By.xpath("//*[.=' Logout ']"));
    }

    default void logout(){
       click(By.xpath("//*[.=' Logout ']"));
    }

    default void clickOkButton(){
        click(By.xpath("//button[@type='button']"));
    }

}
