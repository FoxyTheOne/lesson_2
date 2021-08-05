package ru.teachmeskills.lesson_2;
/**
*2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
 * сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class prog_2 {

    public static void main(String[] args) {
        int hours = 0; // Начальные данные
        int cells = 1;

        do {
            hours += 3;
            cells = cells * 2;
            System.out.println("Спустя " + hours + " часа(ов) амеб будет " + cells + " шт.");
        } while (hours < 24);
    }
}
