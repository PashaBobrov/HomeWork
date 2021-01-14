package HomeWork2.Loops;
/**
 * 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 * 		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double value1 = scanner.nextDouble();
        System.out.println("Введите степень:");
        int value2 = scanner.nextInt();

        System.out.print(value1 + " ^ " + value2);
        double result = 1; // Число в степени 0
        for (int i = 1; i <= value2; i++) {
            result *= value1;
        }
        System.out.println(" = " + result);


    }

}
