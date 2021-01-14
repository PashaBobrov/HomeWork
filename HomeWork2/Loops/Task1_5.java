package HomeWork2.Loops;

/**
 * 1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

public class Task1_5 {
    public static void main(String[] args) {
        writeTable(2, 5);
        writeTable(6, 9);
    }
    public static void writeTable(int start, int end){
        System.out.println("--------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = start; j <= end; j++) {
                System.out.print("|" + String.format("%1$2d",j) +
                        " * " + String.format("%1$2d",i) +
                        " = " +  String.format("%1$2d",i*j) + "|");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
    }
}

