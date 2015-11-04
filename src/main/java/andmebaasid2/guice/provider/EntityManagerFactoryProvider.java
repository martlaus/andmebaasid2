package andmebaasid2.guice.provider;

import andmebaasid2.utils.ConfigurationProperties;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

/**
 * Guice provider of Entity Manager Factory.
 */
@Singleton
public class EntityManagerFactoryProvider implements Provider<EntityManagerFactory> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    private Configuration configuration;

    private EntityManagerFactory emf;

    @Override
    public synchronized EntityManagerFactory get() {

        if (emf == null) {
            Map<String, String> properties = getDatabaseProperties();
            logger.info(String.format("Initializing EntityManagerFactory properties [%s]", properties));

            try {
                emf = Persistence.createEntityManagerFactory("andmebaasid2", properties);
            } catch (Exception e) {
                throw new RuntimeException(format("Unable to initialize EntityManagerFactory [%s]!", properties), e);
            }
        }

        return emf;
    }

    protected Map<String, String> getDatabaseProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

        properties.put("hibernate.show_sql", "true");
        //properties.put("hibernate.hbm2ddl.auto", "update"); //las ta olla siin väljakommenteeritud, et hoida meeles mu valu selle sitaga

        properties.put("hibernate.c3p0.min_size", "1");
        properties.put("hibernate.c3p0.max_size", "100");
        properties.put("hibernate.c3p0.initialpoolsize", "1");
        properties.put("hibernate.c3p0.acquire_increment", "1");
        properties.put("hibernate.c3p0.timeout", "300");
        properties.put("hibernate.c3p0.max_statements", "50");
        properties.put("hibernate.c3p0.idle_test_period", "400");
        properties.put("hibernate.c3p0.testConnectionOnCheckin", "true");
        properties.put("hibernate.c3p0.preferredTestQuery", "SELECT 1");

        // Configurable options
        properties.put("hibernate.connection.url", configuration.getString(ConfigurationProperties.DATABASE_URL));
        properties.put("hibernate.connection.username", configuration.getString(ConfigurationProperties.DATABASE_USERNAME));
        properties.put("hibernate.connection.password", configuration.getString(ConfigurationProperties.DATABASE_PASSWORD));

        return properties;
    }
}
