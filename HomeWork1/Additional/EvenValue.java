package HomeWork1.Additional;

import java.util.Scanner;

public class EvenValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();

        if(isEven(a)) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }

    public static boolean isEven(int variable){
        return variable % 2 != 0;
    }
}
