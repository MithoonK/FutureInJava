package EagerSingletonPackage;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.reflections.Reflections;

import java.util.Set;

public class Test extends AbstractModule {
    private static First first;


    public Test() {
    }

    @Override
    protected void configure() {
        Reflections reflections = new Reflections("EagerSingletonPackage");
        Set<Class<?>> eagerSingletonClasses = reflections.getTypesAnnotatedWith(customEagerSingletonAnnotation.class);
        eagerSingletonClasses.forEach((class1)->{
            System.out.println("sdfdf" + class1);
            bind(class1).asEagerSingleton();
        });
    }
}
