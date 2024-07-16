package ru.zhuravlev.homeworks.homework30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainAppTests {
    private int[] arr;

    @BeforeEach
    void setup() {
        arr = new int[]{1, 2, 1, 2, 3, 4, 5};
    }

    @Test
    void afterUnitTest() {
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5}, MainApp.afterUnit(arr));
    }

    @Test
    void afterUnitTest_Exception() {
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.afterUnit(new int[]{2, 2, 2}));
    }

    @Test
    void checkArrTest() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(MainApp.checkArr(new int[]{1, 2})),
                () -> Assertions.assertTrue(MainApp.checkArr(new int[]{1, 2, 2, 1})),
                () -> Assertions.assertFalse(MainApp.checkArr(new int[]{1, 1})),
                () -> Assertions.assertFalse(MainApp.checkArr(new int[]{1, 3}))
        );
    }
}
