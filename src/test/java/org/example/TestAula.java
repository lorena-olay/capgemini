package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestAula {
    private Aula a;
    @BeforeAll
    void beforeAll() {

        a = new Aula();
    }

    @BeforeEach
    void beforeEach() {

    }

    @Test
    void getProfesorAsignatura() {
        assertEquals("asign",a.getProfesorAsignatura() );
    }


    @AfterEach
    void afterEach() {

    }

    @AfterAll
    void afterAll() {

    }
}
