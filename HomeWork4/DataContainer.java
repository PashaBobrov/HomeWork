package HomeWork4;

/**
 * Задача на умение работать с: Массивами, Дженериками, интерфейс Comparable (jdk), интерфейс Comparator (jdk).
 *
 * !!! Запрещено использовать коллекции, stream api, а также методы которые возвращают коллекции !!!
 *
 * DataContainer:
 * Суть задания: Создать класс который может сохранять в себе почти любое количество данных обобщённого типа и при этом внешне, благодаря инкапусляции, не будет иметь недостатков массива:
 * 	1. Данный класс умеет добавлять в себя данные обобщённого типа.
 * 	2. Данный класс умеет удалять данные из себя двумя способами: по индексу и конкретный элемент.
 * 	3. Данный класс умеет сортировать в себе данные. Но учитывайте что в данном функционале есть проблема. Как написать универсальный код сортировки и объяснить что один объект больше другого?
 * 		3.1 Короткий ответ: подсказывать нашему методу как сравнивать объекты сохранённые в нём.
 * 		3.2 Полный ответ: Для того чтобы написать более универсальный код, а также не гадать какого типа передадут данные и не придумывать способы сравнения этих данных, мы, при вызове сортировки, заставим передать реализацию сравнения (реализацию интерфейса Comparator) к которой нам нужно будет обращаться каждый раз когда нам нужно будет сравнить два объекта и которая скажет какой объект больше, а какой меньше или они равны.
 * Задание:
 * 1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например T. Данный класс как раз и будет решать задачу поставленную перед нами: хранить неограниченное количество передаваемых объектов обобщённого типа. В данном классе обязательно будет присутствовать как минимум один конструктор и с учётом особенностей дженериков в java. Есть три варианта как написать конструктор данного класса.
 * 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых объектов.
 * 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data.
 * 	4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
 * 		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
 * 		4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null]. Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
 * 		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
 * 	4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
 * 		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
 * 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
 * 	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
 * 	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
 * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
 * 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
 * 	7.1 Метод возвращает true если у нас получилось удалить данные.
 * 		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 	7.2 Метод возвращает false если нет такого индекса.
 * 		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
 * 		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
 * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
 * 	8.1 Метод возвращает true если у нас получилось удалить данные.
 * 		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 	8.2 Метод возвращает false если нет такого элемента.
 * 		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 	8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
 * 		8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
 * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
 * 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
 * 11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container) который будет принимать объект DataContainer с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
 * 12.* В данном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container, Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объект`а интерфейса Comparator.
 * 13.** Реализовать в DataContainer интерфейс Iterable
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;


/**
 * Класс данных обобщенного типа.
 * @autor Павел Бобров
 * @version 1.1
 */
public class DataContainer <T> implements Iterator {
    /**  Массив - хранилище значений*/
    private T[] data;
    /**Текущий инденкс массива при использовании итератора */
    private int currentIndexData = 0;

    /**
     * Конструктор - создание нового объекта с массивом из вне
     * @param data - массив обобщенного типа
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Функция получения значения элемент массива {@link DataContainer#data}
     * @return возвращает элемент
     */
    public T get(int index) {
        return data[index];
    }

    /**
     * Функция проверяет существует ли следующий элемент коллекции
     * Переопределения метода интерфейса{@link Iterator}
     * @return возвращает true, если элемент существует
     */
    @Override
    public boolean hasNext() {
        if (currentIndexData < data.length) {
            return true;
        } else  {
            return false;
        }
    }

    /**
     * Функция возвращает следующий элемент коллекции.
     * Переопределения метода интерфейса{@link Iterator}
     * если достигнут конец счетчик  {@link DataContainer#currentIndexData} сбрасывается и возвращается null
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

    /**
     * Процедура сортирует коллекцию - входящий параметр
     * @param container - коллекция для сортировки
     */
    public static <T extends Comparable> void sort(DataContainer <T> container) {
        for (int j = 1; j < container.data.length; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < container.data.length - j; i++) {
                if (container.data[i].compareTo(container.data[i + 1]) > 0) {
                    T tmpItem = container.data[i];
                    container.data[i] = container.data[i + 1];
                    container.data[i + 1] = tmpItem;
                    flagEnd = false;
                }
            }
            if (flagEnd) {
                break;
            }

        }
    }

    /**
     * Процедура сортирует коллекцию - входящий параметр с помощью внешнеого компоратора
     * @param container - коллекция для сортировки
     * @param comparator - компоратор
     */
    public static <T> void sort(DataContainer <T> container,Comparator <T> comparator) {
        for (int j = 1; j < container.data.length; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < container.data.length - j; i++) {
                if (comparator.compare(container.data[i],container.data[i + 1]) > 0) {
                    T tmpItem = container.data[i];
                    container.data[i] = container.data[i + 1];
                    container.data[i + 1] = tmpItem;
                    flagEnd = false;
                }
            }
            if (flagEnd) {
                break;
            }

        }
    }

    /**
     * Функция преобразует элементы коллекции в строку
     * @return возвращает строку элементов
     */
    @Override
    public String toString() {
        StringBuilder buider = new StringBuilder();
        for (T item: data) {
            if (item != null) {
                buider.append("{"+ item.toString() + "}");
            }
        }
        return buider.toString();
    }

    /**
     * Функция удаления элемента коллекции по индексу
     * @param index - индекс удаляемого элемента
     * @return в случае успешного удаления возвращает true
     */
    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        }
        T[] newData = Arrays.copyOf(data,data.length - 1);
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                newData[j] = data[i];
                j++;
            }
        }
        data = newData;
        return true;
    }

    /**
     * Функция удаления элемента коллекции по значению
     * @param item - значение удаляемого элемента
     * @return в случае успешного удаления возвращает true
     */
    public boolean delete(T item) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Функция добавления элемента коллекцию
     * @param item - новый элемент
     * @return в случае успешного добавления возвращает индекс нового элемента
     */
    public int add(T item) {

        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        //overflow
        data = Arrays.copyOf(data,data.length + 1);
        data[data.length-1] = item;
        return data.length-1;
    }

    /**
     * Процедура сортирует коллекцию {@link DataContainer#data}
     * с помощью  компоратора - входящий параметр
     * @param comparator - компоратор
     */
    public void sort(Comparator <T> comparator) {

        for (int j = 1; j < data.length; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < data.length - j; i++) {
                if (comparator.compare(data[i],data[i + 1]) > 0) {
                    T buffer = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = buffer;
                    flagEnd = false;
                }
            }
            if (flagEnd) {
                break;
            }

        }
    }

}
