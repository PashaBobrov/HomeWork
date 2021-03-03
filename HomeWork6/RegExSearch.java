package HomeWork6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    private int flags = 0;

    public void setFlags(int flags) {
        this.flags = flags;
    }

    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile("[^Р-пр-џЈИ]" + word + "[^Р-пр-џЈИ]",flags);
        Matcher matcher = pattern.matcher(text);
        int result = 0;
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
