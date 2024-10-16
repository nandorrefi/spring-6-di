package guru.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService") // bean's default name can be overwritten
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!";
    }
}
