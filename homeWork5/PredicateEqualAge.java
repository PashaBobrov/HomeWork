package homeWork5;

import java.util.function.Predicate;

public class PredicateEqualAge implements Predicate <Student> {
    int age;

    public PredicateEqualAge(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student o) {
        if(o.getAge() == age) {
            return true;
        } else {
            return false;
        }
    }
}
