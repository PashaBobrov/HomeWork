package HomeWork2.Arrays;

import java.util.Scanner;

public class Task2_3DoWhile implements IArraysOperation {

    public int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'элементов':");
        int n = scanner.nextInt();
        int[] result = new int[n];
        int i = 0;
        do{
            System.out.println("Введите элемент № " + (i+1) + ":");
            result[i] = scanner.nextInt();
            i++;
        } while (i<n);
        return  result;
    }

    public int[] printEachSecondFromArray(int[] container) {
        int[] result = new int[container.length/2];
        int i = 2;
        int j = 0;
        do{
            result[j++] = container[i-1];
            i += 2;
        } while (i <= container.length);
        return result;
    }

    public int[] printReversArray(int[] container) {
        int[] result = new int[container.length];
        int i = container.length - 1;
        do {
            result[result.length - i - 1] = container[i];
            i--;
        } while (i >= 0);
        return result;
    }

}
