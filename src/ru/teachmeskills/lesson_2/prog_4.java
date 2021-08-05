package ru.teachmeskills.lesson_2;

/**
 * 4) Составьте программу, вычисляющую A*B, не пользуясь операцией
 * умножения.
 */

public class prog_4 {
    public static void main(String[] args) {
        int a = 111;
        int b = 2;
        int multiplyUsingSum = 0;

        // Если нужно a*b, значит нужно суммировать число "a" с самим собой "b" раз

        for (int i = 0; i < b; i++) {
            multiplyUsingSum = multiplyUsingSum + a;
        }

        System.out.println(multiplyUsingSum);

    }
}
