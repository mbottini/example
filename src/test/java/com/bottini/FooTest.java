package com.bottini;

import org.junit.Test;

public class FooTest {
    @Test
    public void testFooString() {
        assert new Foo(5).toString().equals("Foo 5");
    }
}
