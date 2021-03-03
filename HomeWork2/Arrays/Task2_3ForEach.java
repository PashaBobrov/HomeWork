package HomeWork2.Arrays;

import java.util.Scanner;

public class Task2_3ForEach implements IArraysOperation {

    public int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'элементов':");
        int n = scanner.nextInt();
        int[] result = new int[n];
        int i = 0;
        for (int res : result) {
            System.out.println("Введите элемент № " + (i+1) + ":");
            result[i] = scanner.nextInt();
            i++;
        }
        return  result;
    }

    public int[] printEachSecondFromArray(int[] container) {
        int[] result = new int[container.length/2];
        int j = 0;
        int i = 0;
        for (int cont : container) {
            if (i == 1) {
                result[j++] = cont;
                i = 0;
            } else {
                i++;
            }
        }
        return result;
    }

    public int[] printReversArray(int[] container) {
        int[] result = new int[container.length];
        //for(int i = container.length - 1; i >= 0; i--) {
        int i = container.length - 1;
        for (int cont : container) {
            result[i--] = cont;
        };
        return result;
    }

}
