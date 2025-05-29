package level3.ex1.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    void givenTwoIntegers_whenAddition_thenReturnCorrectValue(){
        Calculator calc = new Calculator();
        int result = calc.suma(1,2);

        assertEquals(3, result);
    }

    @Test
    void givenTwoIntegers_whenSubstraccion_thenReturnCorrectValue(){
        Calculator calc = new Calculator();
        int result = calc.substraccion(1,2);

        assertEquals(-1, result);
    }

    @Test
    void givenTwoIntegers_whenMultiplication_thenReturnCorrectValue(){
        Calculator calc = new Calculator();
        int result = calc.multiplication(1,2);

        assertEquals(2, result);
    }

    @Test
    void givenTwoIntegers_whenDivision_thenReturnCorrectValue(){
        Calculator calc = new Calculator();
        int result = calc.division(2,2);

        assertEquals(1, result);
    }






}
