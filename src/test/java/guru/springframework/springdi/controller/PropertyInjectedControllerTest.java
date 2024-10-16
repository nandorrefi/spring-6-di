package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl(); // if we don't set property, we'll receive NPE
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}