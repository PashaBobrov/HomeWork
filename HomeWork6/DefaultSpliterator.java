package HomeWork6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        Pattern p = Pattern.compile("[Р-пр-џЈИ]+");
        Matcher m = p.matcher(text);

        int i = 0;
        while (m.find()) {
            i++;
        }
        String[] result = new String[i];
        m.reset();
        i = 0;
        while (m.find()) {
            result[i++] = m.group();
        }

       return result;
    }
}
