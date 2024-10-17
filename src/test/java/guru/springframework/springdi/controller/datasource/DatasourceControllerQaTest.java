package guru.springframework.springdi.controller.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class DatasourceControllerQaTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void getDatasource() {
        System.out.println(datasourceController.getDatasource());
    }
}