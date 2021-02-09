package homeWork5;
/**
 * 1. ������� ����� Student � ������
 * 	1.1 ���������� ����� (int)
 * 	1.2 ��� (������ �������� �� 3 �� 10 ������� ��������)
 * 	1.3 ������� (7-17)
 * 	1.4 ������(0.0-10.0)
 * 	1.5 ������� ������� � ���������� (bool).
 * 2. ������� 10_000 �������� ����� Student � ��������� � ���������. ������ ����������� ��������. ������������ ������� ��� ����� � jdk ����.
 * 	2.1 ��������� ��� ���������� �������� ���������
 * 	2.2* ��������� ��� ���������� ��������� �������
 * 	2.3** ��������� ��� ���������� ��������� ������� ������������ �� �����.
 * 3. ������������� ��������� �� ���������� ���������. �� �������� (��� ���� 12 � ����), �� ������ (���� 8). ��������������� ��������� ��������� � ��������� ������. ������ ������ ����� �������� ����������.
 * 4. ������������� ��������������� ��������� �� �����, �� �������� � ��������. ������ ��� 10
 * 5. ������������� ��������������� ��������� �� ������, �� �������� � ��������. ������ ��� 10
 * 6. ������������� ��������������� ��������� �� �������� � ������ ������������. ������� ��� 10 � ������ ��������.
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

        /**2. ������� 10_000 �������� ����� Student � ��������� � ���������.
        ������ ����������� ��������. ������������ ������� ��� ����� � jdk ����.
         2.1 ��������� ��� ���������� �������� ���������
        */
        IRandom rnd = new Rand();
        Supplier<Student> studentSupplier = new StudentSupplier(rnd,count);
        /**	2.2* ��������� ��� ���������� ��������� �������
         */
        IRandom rndNames = new RandStringNames();
        Supplier<Student> studentSupplierNames = new StudentSupplier(rndNames,count);
        /** 	2.3** ��������� ��� ���������� ��������� ������� ������������ �� �����.
         */
        IRandom rndNamesFromFile = new RandNamesFromFile(Paths.get("names.txt"));
        Supplier<Student> studentSupplierNamesFromFile = new StudentSupplier(rndNamesFromFile,count);

        do {
            //data.add(studentSupplier.get());
            //data.add(studentSupplierNames.get());
            data.add(studentSupplierNamesFromFile.get());
        } while (data.size() < 10_000);

        /** 3. ������������� ��������� �� ���������� ���������.
         * �� �������� (��� ���� 12 � ����), �� ������ (���� 8).
         * ��������������� ��������� ��������� � ��������� ������.
         * ������ ������ ����� �������� ����������.
         */
        Predicate <Student> predicateAge = new PredicateAge(12);
        Predicate <Student> predicateRate = new PredicateRate(8);
        List<Student> filteredData = SortAndFilter.getFilteredList(data,predicateAge.and(predicateRate));

        /**
         * 4. ������������� ��������������� ��������� �� �����, �� �������� � ��������. ������ ��� 10
         */
        System.out.println("������������� ��������� �� �����");
        SortAndFilter.shakerSort(filteredData,new StudentNameComparator());
        printTopList(filteredData, 10);

        /**
         * 5. ������������� ��������������� ��������� �� ������, �� �������� � ��������. ������ ��� 10
         */
        System.out.println("������������� ��������� �� ������");
        SortAndFilter.shakerSort(filteredData,new StudentRateComparator());
        printTopList(filteredData, 10);

        /**
         * 6. ������������� ��������������� ��������� �� �������� � ������ ������������.
         * ������� ��� 10 � ������ ��������.
         */
        System.out.println("������������� ��������� �� �������� � ������ ������������. ������� ��� 10 � ������ ��������.");
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


