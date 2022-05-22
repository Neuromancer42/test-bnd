package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {
    @Test
    public void test() {
        Foo f = new Foo();
        Assertions.assertEquals(f.getFoo(), 1);
    }
}
