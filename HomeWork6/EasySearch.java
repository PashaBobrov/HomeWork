package HomeWork6;

public class EasySearch implements ISearchEngine{

    @Override
    public long search(String text, String word) {
        long result = 0;
        int currentIndex = 0;
        do {
            currentIndex = text.indexOf(" " + word + " ",currentIndex);
            if (currentIndex!= -1) {
                result++;
                currentIndex++;
            }
        }
        while (currentIndex!= -1);

        return result;
    }
}
