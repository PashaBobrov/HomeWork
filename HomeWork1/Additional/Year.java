package HomeWork1.Additional;

import java.util.Date;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        String result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = scanner.nextInt();

        if (isLeapYear(value)) {
            System.out.println("Высокосный");
        } else {
            System.out.println("Не высокосный");
        }
    }

    public static boolean isLeapYear(int year){
        Date date1 = new Date(year,1,1);
        Date date2 = new Date(year+1,1,1);
        long difference = date2.getTime() - date1.getTime();
        int days =  (int)(difference / (24 * 60 * 60 * 1000));

        return days == 366;
    }
}

