package ComponentScanConnection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentPersonDao {

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentPersonDao(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }

    public ComponentJdbcConnection getJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }

}
