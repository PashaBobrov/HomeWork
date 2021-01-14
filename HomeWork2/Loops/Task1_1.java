package HomeWork2.Loops;

/**
 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой
 программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 1.1.1. Используя только цикл
 1.1.2.* Используя рекурсию
 */
public class Task1_1 {
    static int maxValue;

    public static void main(String[] args) {
        maxValue = Integer.parseInt(args[0]);

        //1.1.1
        long result = 1;
        for (int i = 1; i <= maxValue; i++) {
            result *= i;
            if(i != 1) {
                System.out.print(" * ");
            }
            System.out.print(i);
        }
        System.out.println(" = " + result);

        //1.1.2
        result = 1;
        for (int i = 1; i <= maxValue; i++) {
            if(i != 1) {
                System.out.print(" * ");
            }
            System.out.print(i);
        }
        result = recursion(1);
        System.out.println(" = " + result);
    }

    public static long recursion1(int value, long result){
        if(value == maxValue){
            return result;
        }else {
            value++;
            result *= value;
            return recursion1(value, result);
        }

    }

    public static long recursion(int value){
        if(value == maxValue){
            return value;
        }else {
            value++;
            return  (value - 1) * recursion(value);
        }

    }
}
