package ru.teachmeskills.lesson_2;
/**
 * 1) Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
 * день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
 * суммарный путь пробежит спортсмен за 7 дней?
 */

public class prog_1 {

    public static void main(String[] args) {
        int day1 = 10;
        int sumPathLength = day1; // 10км за первый день
        int amountOfDays;

        for (amountOfDays = 1; amountOfDays < 7; amountOfDays++) {
            sumPathLength = sumPathLength + sumPathLength*110/100; // Прибавляем остальные дни (6 шт)
        }

        System.out.println("Суммарный путь спортсмена за " + amountOfDays + " дня(ей) - " + sumPathLength + " км");
    }

}
