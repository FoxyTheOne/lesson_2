package ru.teachmeskills.lesson_2;

/**
 * 8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
 * треугольника
 */

public class prog_8 {
    public static void main(String[] args) {

        // цикл из раздаточных материалов:
        int i;
        int j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        // второй треугольник:
        for (i = 10; i >= 0; i--) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

    }
}
