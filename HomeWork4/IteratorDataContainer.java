package HomeWork4;

import java.util.Iterator;

class IteratorDataContainer<T> implements Iterator {
    /**
     * Текущий инденкс массива при использовании итератора
     */
    private int currentIndexData = 0;
    private T[] data;

    /**
     * Функция проверяет существует ли следующий элемент коллекции
     * Переопределения метода интерфейса{@link Iterator}
     *
     * @return возвращает true, если элемент существует
     */

    public IteratorDataContainer(T[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if (currentIndexData < data.length) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Функция возвращает следующий элемент коллекции.
     * Переопределения метода интерфейса{@link Iterator}
     * если достигнут конец счетчик  {@link IteratorDataContainer#currentIndexData} сбрасывается и возвращается null
     *
     * @return возвращате T ссылку
     */
    @Override
    public T next() {
        if (hasNext()) {
            return data[currentIndexData++];
        } else {
            currentIndexData = 0; //перевернем страницу ))
            return null;
        }
    }

}
