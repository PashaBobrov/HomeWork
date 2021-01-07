package HomeWork1.Additional;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        //ax2 + bx + c = 0
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        a = scanner.nextInt();
        System.out.println("Введите число b:");
        b = scanner.nextInt();
        System.out.println("Введите число c:");
        c = scanner.nextInt();

        double[] x = getArrX(a,b,c);
        System.out.println("Корень1:" + x[0]);
        System.out.println("Корень2:" + x[1]);
    }

    //D=b^{2}-4ac.
    public static double[] getArrX(int a, int b ,int c){
        double result1 = 0;
        double result2 = 0;
        int D = b * b - 4 * a * c;
        if(D > 0){
            result1 = (-b + Math.sqrt(D)) / (2 * a);
            result2 = (-b - Math.sqrt(D)) / (2 * a);
        }else if (D == 0) {
            result1 = result2 = -(b / (2 * a));
        }else {
            result1 = 0;
            result2 = 0;
        }

        double[] result = {result1,result2};

        return result;
    }
}
