package ru.teachmeskills.lesson_2;

/**
 * 5) Напишите программу печати таблицы перевода расстояний из дюймов в
 * сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

public class prog_5 {
    public static void main(String[] args) {
        int inch = 1;
        final double cm = 2.54;
        double resultCm;

        for (inch = 1; inch < 21; inch++) {
            resultCm = cm * inch;
            System.out.println(inch + " inch = " + resultCm + " cm");
        }
    }

}

