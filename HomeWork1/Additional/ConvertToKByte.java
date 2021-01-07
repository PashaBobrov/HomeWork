package HomeWork1.Additional;

import java.util.Scanner;

public class ConvertToKByte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();
        System.out.println("Переводим в байты?(иначе килобайты)");
        boolean typeValueByte = scanner.nextBoolean();

        System.out.println(getValue(value, typeValueByte));

    }

    public static int getValue(int value,boolean typeValueByte){

        if(typeValueByte) {
            return value * 1024;
        }
        else {
            return  value / 1024;
        }
    }
}
