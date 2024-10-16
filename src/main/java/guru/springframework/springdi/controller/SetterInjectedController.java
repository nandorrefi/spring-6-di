package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // Spring doesn't know what we want to autowire, we have to specify it
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setter called on SetterInjectedController");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

