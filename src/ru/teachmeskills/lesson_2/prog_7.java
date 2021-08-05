package ru.teachmeskills.lesson_2;

/**
 * 7) Напишите программу, определяющую сумму всех нечетных чисел от 1
 * до 99
 */

public class prog_7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i = i + 2) { // Считаем числа через один, начиная с 1 и суммируем их
            sum = sum + i;
        }

        System.out.println(sum);

        // Можно ли решать эту задачу так, или следует сделать аналогично предыдущей?

    }
}
