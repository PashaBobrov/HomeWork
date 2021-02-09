package homeWork5;
/**
 * 1. Создать класс Student с полями
 * 	1.1 Порядковый номер (int)
 * 	1.2 Имя (Строка размером от 3 до 10 русских символов)
 * 	1.3 возраст (7-17)
 * 	1.4 оценка(0.0-10.0)
 * 	1.5 признак участия в олимпиадах (bool).
 * 2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.
 * 	2.1 Заполнять имя рандомными русскими символами
 * 	2.2* Заполнять имя рандомными понятными именами
 * 	2.3** Заполнять имя рандомными понятными именами загруженными из файла.
 * 3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8). Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.
 * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
 * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
 * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        List<Student> data = new ArrayList<>();
        AtomicInteger count = new AtomicInteger(0);

        /**2. Создать 10_000 объектов класс Student и поместить в коллекцию.
        Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.
         2.1 Заполнять имя рандомными русскими символами
        */
        IRandom rnd = new Rand();
        Supplier<Student> studentSupplier = new StudentSupplier(rnd,count);
        /**	2.2* Заполнять имя рандомными понятными именами
         */
        IRandom rndNames = new RandStringNames();
        Supplier<Student> studentSupplierNames = new StudentSupplier(rndNames,count);
        /** 	2.3** Заполнять имя рандомными понятными именами загруженными из файла.
         */
        IRandom rndNamesFromFile = new RandNamesFromFile(Paths.get("names.txt"));
        Supplier<Student> studentSupplierNamesFromFile = new StudentSupplier(rndNamesFromFile,count);

        do {
            //data.add(studentSupplier.get());
            //data.add(studentSupplierNames.get());
            data.add(studentSupplierNamesFromFile.get());
        } while (data.size() < 10_000);

        /** 3. Отфильтровать студентов по нескольким признакам.
         * По возрасту (тем кому 12 и выше), по оценке (выше 8).
         * Отфильтрованных студентов поместить в отдельный список.
         * Старый список дожен остаться неизменным.
         */
        Predicate <Student> predicateAge = new PredicateAge(12);
        Predicate <Student> predicateRate = new PredicateRate(8);
        List<Student> filteredData = SortAndFilter.getFilteredList(data,predicateAge.and(predicateRate));

        /**
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        System.out.println("Отсортировать студентов по имени");
        SortAndFilter.shakerSort(filteredData,new StudentNameComparator());
        printTopList(filteredData, 10);

        /**
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
         */
        System.out.println("Отсортировать студентов по оценке");
        SortAndFilter.shakerSort(filteredData,new StudentRateComparator());
        printTopList(filteredData, 10);

        /**
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно.
         * Вывести топ 10 в каждом возрасте.
         */
        System.out.println("Отсортировать студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.");
        Comparator comparatorByAgeRate = new StudentAgeComparator().thenComparing(new StudentRateComparator());
        SortAndFilter.shakerSort(filteredData, comparatorByAgeRate);

        List <Integer> listAge = new ArrayList<>();
        for (Student val: filteredData) {
            int age = val.getAge();
            if (listAge.indexOf(age) == -1) {
                listAge.add(age);
                printTopList(SortAndFilter.getFilteredList(filteredData,new PredicateEqualAge(age)),10);
            }
        }
    }

    public static void printTopList(List list, int top) {
        int end = list.size();
        int start = Math.max(0,end - top);
        for (int i = start; i < end; i++) {
            System.out.println(list.get(i).toString());
        }
    }



}


