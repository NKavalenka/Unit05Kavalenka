package by.epam.unit05.main;

import java.util.Random;
//Написать метод(методы) для нахождения наибольшего общего делителя и
//наименьшего общего кратного двух натуральных чисел
public class Task01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        System.out.println("NOK = " + nok(a, b));
        System.out.println("NOD = " + nod(a, b));
    }

    public static int nod(int a, int b) {
        int min;
        int nod_ab = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                nod_ab = i;
            }
        }
        return nod_ab;
    }

    public static int nok(int a, int b) {
        int nok_ab = (a * b) / nod(a, b);
        return nok_ab;
    }
}
