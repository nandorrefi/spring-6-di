package guru.springframework.springdi.controller.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class DatasourceControllerProdTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void getDatasource() {
        System.out.println(datasourceController.getDatasource());
    }
}
