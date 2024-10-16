package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());   // class requires the GreetingService property to be set
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}