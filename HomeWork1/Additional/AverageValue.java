package HomeWork1.Additional;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        a = scanner.nextInt();
        System.out.println("Введите число 2:");
        b = scanner.nextInt();
        System.out.println("Введите число 3:");
        c = scanner.nextInt();

        System.out.println("Среднее число:" + getAverageValue(a,b,c));
    }

    public static int getAverageValue(int value1, int value2 ,int value3){
        int result;
        if (value1 > value2){
            if (value1 < value3){
                result = value1;
            } else if (value3 > value2) {
                result = value3;
            } else {
                result = value2;
            }
        } else {
            if (value2 < value3){
                result = value2;
            } else if (value3 > value1) {
                result = value3;
            } else {
                result = value1;
            }
        }
        return result;
    }
}
