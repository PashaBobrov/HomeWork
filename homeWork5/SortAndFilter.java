package homeWork5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс сервесных функций сортировки и фильтрации SortAndFilter
 * @autor Павел Бобров
 * @version 1.1
 */
public class SortAndFilter {
    /**
     * Процедура сортирует обобщенную коллекцию - входящий параметр с помощью внешнеого компоратора
     * @param container - коллекция для сортировки
     * @param comparator - компоратор
     */
    public static <T>  void shakerSort(List<T> container, Comparator<T> comparator) {
        int size = container.size();
        for (int leftDirection = 0, rightDirection = size - 1;
             leftDirection < rightDirection; leftDirection++, rightDirection--) {

            for (int i = leftDirection; i < rightDirection; i++) {
                T val2 = container.get(i + 1);
                T val1 = container.get(i);
                if (comparator.compare(val1,val2) > 0) {
                    container.set(i,val2);
                    container.set(i+1,val1);
                }
            }
            for (int i = rightDirection; i > leftDirection; i--) {
                T val1 = container.get(i);
                T val2 = container.get(i - 1);
                if (comparator.compare(val1,val2) < 1) {
                    container.set(i,val2);
                    container.set(i-1,val1);
                }
            }
        }
    }

    /**
     * Функция фильтрует обобщенную коллекцию - входящий параметр с помощью внешнего предиката
     * @param list - коллекция для сортировки
     * @param predicate - предикат
     */
    public static <T> List<T> getFilteredList(List<T> list, Predicate<T>  predicate) {
        List<T> filteredlist = new ArrayList<>();
        for (T value : list) {
            if (predicate.test(value)) {
                filteredlist.add(value);
            }
        }
        return filteredlist;
    }

}
