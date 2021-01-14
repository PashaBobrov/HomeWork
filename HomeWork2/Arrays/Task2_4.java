package HomeWork2.Arrays;

/**
 * 2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
 * Все задачи в одном классе, в отдельных методах.
 * 		2.4.1 Сумма четных положительных элементов массива
 * 		2.4.2 Максимальный из элементов массива с четными индексами
 * 		2.4.3 Элементы массива, которые меньше среднего арифметического
 * 		2.4.4 Найти два наименьших (минимальных) элемента массива
 * 		2.4.5 Сжать массив, удалив элементы, принадлежащие интервалу
 * 		2.4.6 Сумма цифр массива
 */

public class Task2_4
{
    public static void main(String[] args) {
        int[] container = Task2.arrayFromConsole();

        System.out.println("Сумма четных положительных элементов: "
                + getSumEvenPositivElementsArray(container));

        System.out.println("Максимальный из элементов с четными индексами: "
                + getMaxElementArrayWithEvenIndex(container));

        System.out.print("Элементы, которые меньше среднего арифметического: ");
        printElementsLessAverageArifmetics(container);

        System.out.print("Сжать массив, удалив элементы, принадлежащие интервалу: ");
        Task2.printArray(getCompressArray(container,40,50));

        System.out.println("Сумма цифр массива: "
                + getSumNumbersArray(container));

    }

    public static void printElementsLessAverageArifmetics(int[] container){
        double averageArifmetics = 0;
        for (int value : container){
            averageArifmetics += value;
        }
        averageArifmetics = averageArifmetics / container.length;
        System.out.print("{");
        for (int value : container){
            if (value < averageArifmetics) {
                System.out.print(value + " ");
            }
        }
        System.out.println("}");
    }

    public static int getSumNumbersArray(int[] container){
        int result = 0;
        for (int value : container){
            char[] charNumbersArray = String.valueOf(value).toCharArray();
            for (char charNumber: charNumbersArray) {
                result += Character.getNumericValue(charNumber);
            }
        }
        return result;
    }

    public static int getSumEvenPositivElementsArray(int[] container){
        int result = 0;
        for (int value : container){
            if ((value > 0) && (value % 2 == 0)) {
                result += value;
            }
        }
        return result;
    }
    public static int getMaxElementArrayWithEvenIndex(int[] container){
        int result = 0;
        for (int i = 2; i < container.length; i += 2) {
            result = Math.max(result,container[i]);
        }
        return result;
    }

    public static int[] getCompressArray(int[] container,int intervalMin, int intervalMax){

        int n = 0;
        for (int value : container){
            if (value < intervalMin || value > intervalMax) {
                n++;
            }
        }
        int[] result = new int[n];
        int i = 0;
        for (int value : container){
            if (value < intervalMin || value > intervalMax) {
                result[i] = value;
                i++;
            }
        }
        return result;
    }


}
