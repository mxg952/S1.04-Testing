package leve1.ex3.model;

import level1.ex3.model.ArrayExceptionClass;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ArrayExceptionTest {

    @Test
    public void givenInvalidIndex_whenAccesArray_thenThrowsArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayExceptionClass.getElementAtIndex(array, 5);
        });
    }

}
