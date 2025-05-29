package level1.ex3.model;

public class ArrayExceptionClass {

    public static int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Índex out of bounds.");
        }
        return array[index];
    }

}
