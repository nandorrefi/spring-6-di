package guru.springframework.springdi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// notice that in the previous commit the other tests are failing because no profile is defined for them so they cannot create beans from the i18n services
// so we need to specify a profile as default
@SpringBootTest // loads spring context
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}