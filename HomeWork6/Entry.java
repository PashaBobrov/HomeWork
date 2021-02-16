package HomeWork6;

public class Entry implements Comparable <Entry> {
    String word;
    int count;

    public Entry(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(Entry o) {
        return ((Integer) this.count).compareTo(o.count);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
