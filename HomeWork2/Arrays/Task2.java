package HomeWork2.Arrays;

import java.util.Scanner;

/**
 * 2.1 Написать метод public static int[] arrayFromConsole() рядом с main.
 * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 * Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole
 * будет запрошена информация у пользователя, пользователь вводит размер (5) и его элементы
 * по порядку {4, 17, 32}. Соответсвенно
 * будет создан массив размером 5 с элементами {4, 17, 32} и сохранён в переменную container.
 * 2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя метод arrayFromConsole(). Все задачи в одном классе, в отдельных методах.
 * 		2.2.1 Вывести все элементы в консоль.
 * 		2.2.2 Вывести каждый второй элемент массива в консоль.
 * 		2.2.3 Вывести все элементы массива в консоль в обратном порядке.
 */

public class Task2
{
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        printArray(container);
        printEachSecondFromArray(container);
        printReversArray(container);

    }

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'элементов':");
        int n = scanner.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент № " + (i+1) + ":");
            result[i] = scanner.nextInt();
        }
        return  result;
    }

    public static void printArray(int[] container) {
        System.out.print("{");
        for (int val : container) {
            System.out.print(val + " ");
        }
        System.out.println("}");
    }

    public static void printEachSecondFromArray(int[] container) {
        System.out.print("{");
        int i = 2;
        while (i <= container.length){
            System.out.print(container[i-1] + " ");
            i += 2;
        }
        System.out.println("}");
    }

    public static void printReversArray(int[] container) {
        System.out.print("{");
        int i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("}");
    }

}
