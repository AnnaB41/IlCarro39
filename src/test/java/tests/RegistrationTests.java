package tests;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @Test
    public void registrationPositive(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;

//        User user = new User(
//                "John",
//                "Silver",
//                "john_" + i + "@mail.com",
//                "$1234Qwer"
//        );

        User user = new User().withName("John").withLastName("Silver")
                .withEmail("john_" + i + "@ail.com").withPassword("$1234Qwer");
        openRegistrationForm();
        filRegistrationForm(user);
        submitRegistration();
    }

}
