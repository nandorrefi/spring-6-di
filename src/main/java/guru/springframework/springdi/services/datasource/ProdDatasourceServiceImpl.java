package guru.springframework.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDatasourceServiceImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "prod datasource";
    }
}
