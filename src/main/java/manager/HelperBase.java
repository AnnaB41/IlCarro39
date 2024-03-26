package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface HelperBase extends ApplicationManager{

    default void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    default void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear(); // очищаем форму логина
        element.sendKeys(text); // вставляем адрес
    }

   default void click(By locator){
        wd.findElement(locator).click();
    }

    default boolean isElementPresent(By locator){

      return wd.findElements(locator).size() > 0;
   }
    default boolean isAlertPresent(){
        Alert alert = new WebDriverWait(wd, Duration.ofSeconds(3))
                .until(ExpectedConditions.alertIsPresent()); //ждем, присутствует ли окошко Алерта на браузере
        if(alert == null) return false;
        wd.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        return true;
    }
}
