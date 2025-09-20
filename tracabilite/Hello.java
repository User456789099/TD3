package fr.uha.iut;

import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testHelloNoParam() {
        assertEquals("Hello World!", Hello.hello());
    }

    public void testHelloWithParam() {
        assertEquals("Alice", Hello.hello("Alice"));
    }
}

