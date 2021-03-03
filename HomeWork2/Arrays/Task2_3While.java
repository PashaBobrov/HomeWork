package HomeWork2.Arrays;

import java.util.Scanner;

public class Task2_3While implements IArraysOperation {

    public int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'элементов':");
        int n = scanner.nextInt();
        int[] result = new int[n];
        int i = 0;
        while (i<n){
            System.out.println("Введите элемент № " + (i+1) + ":");
            result[i] = scanner.nextInt();
            i++;
        };
        return  result;
    }

    public int[] printEachSecondFromArray(int[] container) {
        int[] result = new int[container.length/2];
        int i = 2;
        int j = 0;
        while (i <= container.length){
            result[j++] = container[i-1];
            i += 2;
        };
        return result;
    }

    public int[] printReversArray(int[] container) {
        int[] result = new int[container.length];
        int i = container.length - 1;
        while(i >= 0) {
            result[result.length - i - 1] = container[i];
            i--;
        };
        return result;
    }

}
