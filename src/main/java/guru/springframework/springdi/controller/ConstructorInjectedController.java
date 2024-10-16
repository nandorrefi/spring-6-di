package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // Spring sees that there is only one constructor with the GreetingService so it will autowire the GreetingService
    // Qualifier can specify the bean we want to use, by default the bean's name is similar to the class name, but first letter is lowercase
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
