package homeWork5;

import homeWork5.Student;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class StudentSupplier implements Supplier <Student> {

    private AtomicInteger count;
    private IRandom rnd;
    @Override
    public Student get() {
        Student student = new Student();
        student.setNumber(count.incrementAndGet());
        student.setAge(rnd.randInt(7, 17));
        student.setName(rnd.randString(3, 10));
        student.setRate(rnd.randDouble(0, 10));
        student.setOlympic(rnd.randBoolean());
        return student;
    }

    public StudentSupplier(IRandom rnd, AtomicInteger count) {
        this.count = count;
        this.rnd = rnd;
    }

}
