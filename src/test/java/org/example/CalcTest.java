package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Прверка суммирования")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Tag("param")
    void summTest(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int resultSumm = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, resultSumm, "Результат суммирования неверный");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @DisplayName("Прверка разности")
    @CsvSource({"1, 1, 0", "0, -1, 1", "-1, -1, 0"})
    @Tag("param")
    void diffTest(int c, int d, int expectedResult2) {
        Calc calc = new Calc();
        int resultDiff = calc.diff(c, d);
        Assertions.assertEquals(expectedResult2, resultDiff, "Результат разности неверный");
    }
}