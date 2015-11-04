package andmebaasid2.guice.module;

import com.google.inject.AbstractModule;
import andmebaasid2.guice.GuiceInjector.Module;
import andmebaasid2.server.EmbeddedJettyTest;

@Module
public class StaticModule extends AbstractModule {

    @Override
    protected void configure() {
        requestStaticInjection(EmbeddedJettyTest.class);
    }
}
