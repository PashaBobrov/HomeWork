package HomeWork1;

/**7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное
 * представление числа. В методе можно использовать обычную математику которая описана в теории.
 * Теория https://planetcalc.ru/747. Если число отрицательное то выдавать дополнительный код. Пример:
 7.1 Вводим: 42.  Возвращает: 00101010
 7.2 Вводим: 15.  Возвращает: 00001111
 7.3 Вводим: -42. Возвращает: 11010110
 7.4 Вводим: -15. Возвращает: 11110001
 */

public class Task7 {
   /* public static void main(String[] args) {
        for (String arg: args){
            System.out.println(toBinaryString((byte) Integer.parseInt(arg)));
        }

    } */
    public String toBinaryString(byte number){
        //String result = Long.toBinaryString(number); // Не интересно
        String result = "";
        int bit;

        for(int i = 0; i < 8; i++) {
            bit = Math.abs((number >> i) % 2);
            result = bit + result;
        }
        return result;
    }
}
