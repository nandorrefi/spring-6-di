package guru.springframework.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevDatasourceServiceImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "developer datasource";
    }
}
