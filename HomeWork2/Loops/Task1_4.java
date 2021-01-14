package HomeWork2.Loops;

import java.util.Scanner;

/**
 * 1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
 *     	1.4.1. 3
 *     	1.4.2. 188
 *     	1.4.3. -19
 *     	1.4.4. Да и вообще на любое целочисленное
 */
public class Task1_4 {
    public static void main(String[] args) {
        long a = 1;
        long before_a = a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число множитель:");
        int b = scanner.nextInt();

        do {
            before_a = a;
            a *= b;
        } while (Math.abs(before_a) < Math.abs(Long.MAX_VALUE / b));
        System.out.println(before_a);
        System.out.println(a);
    }

}
