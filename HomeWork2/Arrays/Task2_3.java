package HomeWork2.Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * 2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
 * Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим
 * получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
 * Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
 * размером 5 с числами от 0 до 99
 * (использовать класс Random) и сохранён в переменную container.
 */

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 'элементов':");
        int size = scanner.nextInt();
        System.out.println("Введите максимальный  число диапозона:");
        int maxValueExclusion = scanner.nextInt();

        int[] container = arrayRandom(size,maxValueExclusion);
        Task2.printArray(container);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            container[i] = rnd.nextInt(maxValueExclusion);
        }
        return container;
    }

}
