package ru.teachmeskills.lesson_2;
/**
 *3) Вычислить: 1+2+4+8+…+256
 */

public class prog_3 {

    public static void main(String[] args) {
        int a;
        int sum = 0;

        for (a = 1; a <= 256; a = a * 2) {
            sum = sum + a;
            //System.out.println("sum равно " + sum);
        }

        System.out.println("Ответ " + sum);
    }

}
