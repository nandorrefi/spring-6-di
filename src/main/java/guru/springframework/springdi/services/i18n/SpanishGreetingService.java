package guru.springframework.springdi.services.i18n;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")  // context will only load this bean when it is set to ES profile
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo";
    }
}
