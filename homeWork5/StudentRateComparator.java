package homeWork5;

import java.util.Comparator;

public class StudentRateComparator implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return ((Double)o1.getRate()).compareTo(o2.getRate());
    }
}
