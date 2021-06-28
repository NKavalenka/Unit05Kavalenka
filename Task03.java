package by.epam.unit05.main;

import java.util.Random;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10000);
        int b = rand.nextInt(10000);

        String result = countDigit(a, b);
        System.out.println("Number A: " + a);
        System.out.println("Number B: " + b);
        System.out.println(result);
    }

    public static String countDigit(int a, int b) {
        int lenghtA = Integer.toString(a).length();
        int lengthB = Integer.toString(b).length();
        String result;

        if (lenghtA == lengthB) {
            result = "Number A has the same amount of digits as number B";
        } else {
            if (lenghtA > lengthB) {
                result = "Number A has more digits than number B";
            } else {
                result = "Number B has more digits than number A";
            }
        }
        return result;
    }
}
