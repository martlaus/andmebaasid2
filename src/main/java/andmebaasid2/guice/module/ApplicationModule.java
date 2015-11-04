package andmebaasid2.guice.module;

import com.google.inject.AbstractModule;
import andmebaasid2.ApplicationLauncher;
import andmebaasid2.ApplicationManager;
import andmebaasid2.guice.GuiceInjector;

@GuiceInjector.Module
public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        requestStaticInjection(ApplicationLauncher.class);
        requestStaticInjection(ApplicationManager.class);
    }
}
