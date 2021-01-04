package HomeWork1;

import java.util.Arrays;

/**
 * Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main,
 * данный метод будет принимает один параметр и будет возвращать строку в отформатированном виде.
 * В метод будет передаваться массив из 10 цифр (от 0 до 9).
 * Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
 * Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат:
 * (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
 * В задании нельзя использовать колекции, стрима.
 */
public class Task6 {
    public static void main(String[] args) {
        char[] arrNumbers;
        if (args.length > 0) {
            arrNumbers = args[0].toCharArray();
        } else {
            return;
        }
        System.out.println(createPhoneNumber(arrNumbers));
    }
    public static String createPhoneNumber(char[] arrNumbers){
        String result;
        String[] arrNumbersString;

        if (arrNumbers.length <10){
            return  "Не правильные входные параметры";
        }

        // Перевод arrNumbers  в массив String т.к. String.format не работает с массивом char
        arrNumbersString = new String[arrNumbers.length];
        for (int i = 0; i < arrNumbers.length; i++){
            arrNumbersString[i] = String.valueOf(arrNumbers[i]);
        }
        result = String.format("(%s%s%s) %s%s%s-%s%s%s%s", arrNumbersString);

        return result;
    }
}
