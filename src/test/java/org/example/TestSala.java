package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSala {
    private Sala b;
    @BeforeAll
    void beforeAll() {

        b = new Sala();
    }

    @BeforeEach
    void beforeEach() {

    }

    @Test
    void testClass() {
        assertEquals(Sala.class, b.getClass());
    }

    @AfterEach
    void afterEach() {

    }

    @AfterAll
    void afterAll() {

    }
}
