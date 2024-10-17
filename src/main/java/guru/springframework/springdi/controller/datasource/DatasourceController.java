package guru.springframework.springdi.controller.datasource;

import guru.springframework.springdi.services.datasource.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {

    private final DatasourceService datasourceService;

    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return datasourceService.getDatasource();
    }
}
