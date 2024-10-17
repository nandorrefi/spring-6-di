package guru.springframework.springdi.controller;

import guru.springframework.springdi.services.GreetingService;
import guru.springframework.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller // Spring creates a bean from this class and stores it in the context during startup
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();   // just an example for dependency with no DI
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
