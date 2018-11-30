package newPack;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
    public static void main(String[] args) {
       Injector injector = Guice.createInjector(new BinderModule());
//        newPack.Utility utility = injector.getInstance(newPack.Utility.class);
//        utility.callMethod();
        System.out.println("kya bhai");

    }
}
