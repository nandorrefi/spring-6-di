package guru.springframework.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatDatasourceServiceImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "UAT datasource";
    }
}
