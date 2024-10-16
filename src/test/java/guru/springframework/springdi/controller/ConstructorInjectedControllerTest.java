package guru.springframework.springdi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // loads spring context
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}