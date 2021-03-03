package HomeWork2.Arrays;

import java.util.Scanner;

public class Task2_3For implements IArraysOperation {

    public int[] arrayFromConsole() {
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

    public int[] printEachSecondFromArray(int[] container) {
        int[] result = new int[container.length/2];
        int j = 0;
        for (int i = 2;i <= container.length; i += 2){
            result[j++] = container[i-1];
        }
        return result;
    }

    public int[] printReversArray(int[] container) {
        int[] result = new int[container.length];
        for(int i = container.length - 1; i >= 0; i--) {
            result[result.length - i - 1] = container[i];
        };
        return result;
    }

}
