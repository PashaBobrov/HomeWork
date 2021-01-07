package HomeWork1.Additional;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a:");
        a = scanner.nextInt();
        System.out.println("Введите сторону b:");
        b = scanner.nextInt();
        System.out.println("Введите сторону c:");
        c = scanner.nextInt();

        if (isTriangle(a,b,c)){
            if(a == b && b == c) {
                System.out.println("Это равносторонний треугольник");
            } else if (a == b || a == c || b == c){
                System.out.println("Это равнобедренный треугольник");
            } else {
                System.out.println("Это треугольник");
            }
        } else {
            System.out.println("Это не треугольник ((");
        }
    }

    public static boolean isTriangle(int a, int b ,int c){
        return  (a + b > c) && (a + c > b) && (b + c > a);
    }
}
