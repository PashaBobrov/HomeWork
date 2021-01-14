package HomeWork2.Loops;
/**
 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */
public class Task1_2 {
    public static void main(String[] args) {
        if (isNumberArr(args[0])){
            char[] container = args[0].toCharArray();
            long result = Character.getNumericValue(container[0]);
            System.out.print(result);
            for (int i = 1; i < container.length; i++) {
                result *= Character.getNumericValue(container[i]);
                System.out.print(" * " + i);
            }
            System.out.println(" = " + result);
        }
    }

    public static boolean isNumberArr(String value){
        boolean result = false;

        if (value.matches("\\d{1,}")){
            result = true;
        }else if (value.matches("\\d{1,}\\.{0,1}\\d+")){
            System.out.println("Ввели не целое число");
        }else {
            System.out.println("Ввели не число");
        }
        return result;
    }
}
