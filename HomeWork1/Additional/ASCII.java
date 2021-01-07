package HomeWork1.Additional;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {

        String result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = scanner.nextInt();

        if (isEnglishSymbolASCII(value)) {
            System.out.println("English");
        } else {
            System.out.println("Other");
        }
    }

    public static boolean isEnglishSymbolASCII(int value){

        int a = (int) 'a';
        int z = (int) 'z';
        int aA = (int) 'A';
        int zZ = (int) 'Z';

        return ((value >= a  && value <= z) || (value >= aA  && value <= zZ));

    }
}

