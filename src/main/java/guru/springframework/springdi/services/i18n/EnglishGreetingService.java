package guru.springframework.springdi.services.i18n;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"}) // context will only load this bean when it is set to EN profile, we also set this as the default profile
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there";
    }
}
