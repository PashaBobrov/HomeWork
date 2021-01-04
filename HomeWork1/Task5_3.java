package HomeWork1;

public class Task5_3 {
    public static void main(String[] args) {
        String name = "";

        if (args.length > 0) {
            name = args[0];
        }

        switch (name){
            case "Вася":
                System.out.println("Привет\n" + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
