package homeWork5;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return  ((Integer) o1.getAge()).compareTo(o2.getAge());
    }
}
