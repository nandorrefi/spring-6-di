package guru.springframework.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaDatasourceServiceImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "QA datasource";
    }
}
