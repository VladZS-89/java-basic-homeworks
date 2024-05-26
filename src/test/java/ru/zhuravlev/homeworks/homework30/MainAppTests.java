package ru.zhuravlev.homeworks.homework30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainAppTests {
    private int[] arr;

    @BeforeEach
    void setup() {
        arr = new int[]{1, 2, 1, 2, 2, 2, 2};
    }

    @Test
    void afterUnitTest() {
        Assertions.assertArrayEquals(new int[]{2, 2, 2, 2}, MainApp.afterUnit(arr));
    }

    @Test
    void afterUnitTest_Exception() {
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.afterUnit(new int[] {2,2,2}));
    }
}
