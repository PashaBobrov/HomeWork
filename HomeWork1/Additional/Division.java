package HomeWork1.Additional;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a, b;
        String result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое:");
        a = scanner.nextInt();
        System.out.println("Введите делитель:");
        b = scanner.nextInt();

        int ostatok = a % b;
        int chastnoe = a / b;
        result =  (ostatok == 0) ? "Делится!" : "Не делится! " + " остаток " + ostatok;

        System.out.println(result + " Частное: " + chastnoe);
    }
}
