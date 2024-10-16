package guru.springframework.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary    // this bean is preferred during autowiring
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the primary BEAN!!!";
    }
}
