package level1.ex2.model;

public class CalcDni {

    private static final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    public static char calcLetter(int dniNumber) {
        int indexLetter = dniNumber % 23;
        return LETTERS[indexLetter];
    }

}
