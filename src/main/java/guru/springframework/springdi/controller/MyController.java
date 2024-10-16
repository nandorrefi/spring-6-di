package guru.springframework.springdi.controller;

import org.springframework.stereotype.Controller;

@Controller // Spring creates a bean from this class and stores it in the context during startup
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the controller");

        return "Hello Everyone!!!";
    }
}
