package guru.springframework.springdi.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")   // context will use the EN profile
@SpringBootTest
class Myi18nControllerENTest {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayHello() {
        System.out.println(myi18nController.sayHello());
    }
}