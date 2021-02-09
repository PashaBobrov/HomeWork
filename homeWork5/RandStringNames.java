package homeWork5;

/**
 * Класс генерации рандомных строк имен из массиава storageNames. реализует интерфейс {@link IRandom}
 * Расширяет реализацию  {@link Rand}
 * @autor Павел Бобров
 * @version 1.1
 */
public class RandStringNames extends Rand implements IRandom {
    /**  Массив строк - хранилище имен*/
    static protected String[] storageNames = {"Авдотья", "Аврора", "Агата",
            "Агафия", "Агафья", "Агнесса", "Александро", "Ада",
            "Галина", "Гелла", "Гертруда", "Глафира",
            "Бенедикт", "Богдан", "Болеслав", "Борис", "Борислав", "Бронислав",
            "Павел", "Парамон", "Пётр", "Платон", "Потап", "Прохор"};

    /**
     * Возвращает рандомное имя из массива {@link RandStringNames#storageNames}
     * @param min минимальное количество символовом
     * @param max максимальное количество символов
     * @return рандомное имя
     */
    @Override
    public String randString(int min, int max) {
        String result;
        int countSymbols = randInt(min, max);
        do {
            result = storageNames[randInt(0, storageNames.length-1)];
        } while (result.length() != countSymbols);
        return result;
    }
}
