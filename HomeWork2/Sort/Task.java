package HomeWork2.Sort;

/**
 * 4.* Выполнить сортировку массива с числами. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться и не должен находиться в main. Дублирование кода сортировок приведёт к провалу выполнения данного задания. Итогом выполнения данного задания будет 1 класс который содержит методы с сортировками, и 1 класс из которого вызываются данные методы:
 * 	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
 * 	4.2. Пишем следующие алгоритмы:
 * 		4.2.1. Пузырьковая сортировка
 * 		4.2.2. Шейкерная сортировка
 * 	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
 * 		4.3.1. {1,2,3,4,5,6}
 * 		4.3.2. {1,1,1,1}
 * 		4.3.3. {9,1,5,99,9,9}
 * 		4.3.4. {}
 * 	4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами. Отсортировать.
 * 	4.5. После рандома написать код который будет создавать массив руками через консоль. Отсортировать.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int[] container1 = {1,2,3,4,5,6};
        int[] container2 = {1,1,1,1};
        int[] container3 = {9,1,5,99,9,9};
        int[] container4 = {};

        //Пузырьковая
        System.out.print(Arrays.toString(container1));
        Sorting.bubbleSort(container1);
        System.out.println(" --> " + Arrays.toString(container1));

        System.out.print(Arrays.toString(container2));
        Sorting.bubbleSort(container2);
        System.out.println(" --> " + Arrays.toString(container2));

        System.out.print(Arrays.toString(container3));
        Sorting.bubbleSort(container3);
        System.out.println(" --> " + Arrays.toString(container3));

        System.out.print(Arrays.toString(container4));
        Sorting.bubbleSort(container4);
        System.out.println(" --> " + Arrays.toString(container4));

        //Шейкерная
        container1 = new int[]{1,2,3,4,5,6};
        container2 = new int[]{1,1,1,1};
        container3 = new int[]{9,1,5,99,9,9};
        container4 = new int[]{};

        System.out.print(Arrays.toString(container1));
        Sorting.shakerSort(container1);
        System.out.println(" --> " + Arrays.toString(container1));

        System.out.print(Arrays.toString(container2));
        Sorting.shakerSort(container2);
        System.out.println(" --> " + Arrays.toString(container2));

        System.out.print(Arrays.toString(container3));
        Sorting.shakerSort(container3);
        System.out.println(" --> " + Arrays.toString(container3));

        System.out.print(Arrays.toString(container4));
        Sorting.shakerSort(container4);
        System.out.println(" --> " + Arrays.toString(container4));

        //После тестов написать код который будет создавать массив рандомной длинны,
        // заполнять массив рандомными числами. Отсортировать.
        Random rand = new Random();
        int[] containerRand =  new int[rand.nextInt(6)];
        for (int i = 0; i < containerRand.length; i++) {
            containerRand[i] = rand.nextInt();
        }
        System.out.print(Arrays.toString(containerRand));
        Sorting.shakerSort(containerRand);
        System.out.println(" --> " + Arrays.toString(containerRand));

        //код который будет создавать массив руками через консоль. Отсортировать.
        int[] containerFromConsole = arrayFromConsole();
        System.out.print(Arrays.toString(containerFromConsole));
        Sorting.shakerSort(containerFromConsole);
        System.out.println(" --> " + Arrays.toString(containerFromConsole));

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
}

