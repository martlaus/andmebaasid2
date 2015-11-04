package andmebaasid2.guice.module;

import com.google.inject.AbstractModule;
import andmebaasid2.common.test.ResourceIntegrationTestBase;
import andmebaasid2.guice.GuiceInjector.Module;

@Module()
public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        requestStaticInjection(ResourceIntegrationTestBase.class);
    }
}
