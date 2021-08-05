package ru.teachmeskills.lesson_2;

/**
 * 6) Напишите программу вывода всех четных чисел от 2 до 100
 * включительно
 */

public class prog_6 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 100) {
            count++;
            if ((count%2 != 0)) continue; // если число не делится на 2 без остатка, то возвращаемся в начало цикла
            System.out.println(count); // если делится, то выводим их на экран
        }
        
        

    }
}
