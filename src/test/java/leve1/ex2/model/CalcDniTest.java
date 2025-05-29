package leve1.ex2.model;

import level1.ex2.model.CalcDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "0, T",
            "1, R",
            "2, W",
            "3, A",
            "98765432, M",
            "11111111, H",
            "22222222, J",
            "39443765, F",
            "33333, Y"
    })

void givenValidDniNumber_whenCalculatingLetter_thenReturnsCorrectLetter (int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, CalcDni.calcLetter(dniNumber));
    }


}
