package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()); // if we don't set property, we'll receive NPE
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}