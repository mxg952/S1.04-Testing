package level1.ex2;

import level1.ex2.model.CalcDni;

public class Main {

    public static void main(String[] args) {

        CalcDni calcDni = new CalcDni();
        int dni = 39443765;
        int dni2 = 12345678;
        int dni3 = 0;
        int dni4 = 1;
        int dni5 = 2;
        int dni6 = 3;
        int dni7 = 98765432;
        int dni8 = 11111111;
        int dni9 = 22222222;
        int dni10 = 33333;

        System.out.println("The dni complete is: " + dni + calcDni.calcLetter(dni));
        System.out.println("The dni complete is: " + dni2 + calcDni.calcLetter(dni2));
        System.out.println("The dni complete is: " + dni3 + calcDni.calcLetter(dni3));
        System.out.println("The dni complete is: " + dni4 + calcDni.calcLetter(dni4));
        System.out.println("The dni complete is: " + dni5 + calcDni.calcLetter(dni5));
        System.out.println("The dni complete is: " + dni6 + calcDni.calcLetter(dni6));
        System.out.println("The dni complete is: " + dni7 + calcDni.calcLetter(dni7));
        System.out.println("The dni complete is: " + dni8 + calcDni.calcLetter(dni8));
        System.out.println("The dni complete is: " + dni9 + calcDni.calcLetter(dni9));
        System.out.println("The dni complete is: " + dni10 + calcDni.calcLetter(dni10));
    }
}
