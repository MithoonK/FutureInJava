package newPack;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface1;

    @Inject
    public Utility(TestInterface testInterface2) {
        this.testInterface1 = testInterface2;
    }

    public void callMethod() {
        testInterface1.print();
    }
}
