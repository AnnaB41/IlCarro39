package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public interface ApplicationManager {

    WebDriver wd = new ChromeDriver();



    default void init(){
     //   wd = new ChromeDriver();
        wd.manage().window().maximize();// разворачиваем на полный экран
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //    helperUser = new HelperUser(wd);
    }
    default boolean isElementPresent(By locator){

        return wd.findElements(locator).size() > 0;
    }

    default void tearDown(){

        wd.quit();
    }

}
