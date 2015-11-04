package andmebaasid2.guice.module;

import com.google.inject.AbstractModule;
import andmebaasid2.guice.GuiceInjector.Module;
import andmebaasid2.guice.provider.ConfigurationProvider;
import andmebaasid2.guice.provider.EntityManagerFactoryProvider;
import andmebaasid2.guice.provider.EntityManagerProvider;
import andmebaasid2.guice.provider.HttpClientProvider;
import org.apache.commons.configuration.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.client.Client;

@Module
public class ProviderModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Configuration.class).toProvider(ConfigurationProvider.class);
        bind(EntityManagerFactory.class).toProvider(EntityManagerFactoryProvider.class);
        bind(EntityManager.class).toProvider(EntityManagerProvider.class);
        bind(Client.class).toProvider(HttpClientProvider.class);
    }
}
