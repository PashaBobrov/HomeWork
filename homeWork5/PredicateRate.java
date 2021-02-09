package homeWork5;

import java.util.function.Predicate;

public class PredicateRate implements Predicate <Student> {
    int rate;

    public PredicateRate(int rate) {
        this.rate = rate;
    }

    @Override
    public boolean test(Student o) {
        if(o.getRate() >= rate) {
            return true;
        } else {
            return false;
        }
    }
}
