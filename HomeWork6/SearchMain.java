package HomeWork6;
/**
 * ������ �� ������ �������� �: ��������, Set, Map, ���������� ���������*, ������ � �������**.
 * � ������ ��������� ������������ stream
 *
 * ������, ���������, ����� �����, ��������, �������� � ������ �������� ������ - �� ���� ��������! ������ �� ������� ��� ��� ��� ��������� �����, ������� ��� ��������� ��������� ������ �� �����.
 * �������� ������� ����� ����������, ������� � �������� ����� - ��� �� �����. ������� � ������ ����� ��������.
 *
 * �� ��������� �������� �� ��������� ���������� ��������� �������� ������� � ���������� ��������� �� �����:
 * 	1. "������, ��� ����!" - ��� ��� ����� "������", "���", "����";
 * 	2. "������,�������!" - ��� ��� ����� "������", "�������";
 * 	3. "������;�������!" - ��� ��� ����� "������", "�������";
 * 	4. "��� ����!.��� �������?"- ��� ������ ����� "���", "����", "���", "�������";
 * 	5. "������-������" - ��� ���� ����� "������-������";
 * 	6. "������ -������" - ��� ��� ����� "������", "������";
 * 	7. "4-�" - ��� ���� ����� "4-�";
 * 	8. "���� � 1" - ��� ��� ����� "����", "�", "1"
 * 	9. "������� ������� �������" - ��� ��� ����� "�������", "�������", "�������"
 *
 * ����� �� ���������� ������� ��. ������� ��������������� "�������" �������� ��������� �� �����. �������� ������������ �� ��������. ��������� ������� ����, ������������� �� � ��������� ��� � ����� �� ��������� ��������. � ����� ��� ���������� ����������� ������� ��������� � ����������� � ��������� ����������� ����. ��� �� ����� �������� ������������ ��� ����� �� ���������� ������� �������.
 *
 * ����� � ���:
 * 1. ������� ����� "����� � ���" https://www.dropbox.com/s/8mstiwnx9o9btw4/%D0%B2%D0%BE%D0%B9%D0%BD%D0%B0%20%D0%B8%20%D0%BC%D0%B8%D1%80_%D0%BA%D0%BD%D0%B8%D0%B3%D0%B0.txt?dl=0 �� ���������. ��� ������ ������� ����� ����� ��������������� ������� https://howtodoinjava.com/java/io/java-read-file-to-string-examples/ . ��������� 1 � 3, ������ ������ ������������ ���������.
 * 2. ������ � �����������:
 * 	2.1 ����� � ������ ��� �������������� ����� � ��������� �� � ��������� Set.
 * 		����� ��������� �������� ������, ��� ��������� ���� � ����: ��� ������� ������ ������ ���������� ��������� ��������� ���� � ��������� ����� �� ������� ���������� ����� � ������. ����� ������ ������ ���������� ���������� ����� ������� ����� �� �� ����� ���� �� ��������� �����. ����� ������ ���������� ����� ��������� � Set. ��������� ������������ Set'�� � ����� �� ������� ��������� ���������� ����� ���� ������� ��� ����������� ��� ��������� ������� ������. � ����� ������� � ������� ���������� �������������� ����.
 * 	2.2 ����� � ������ ��� N (������������� ��������) ���� � ������� ���������� ���� ���� ��������� Map � List. ������������� �� ����������. ����������� � �������.
 * 		������: ����� - 200 ���, ��� - 100 ��� � ��� �����. ����� ����������, ������� � �������� ����� - ��� �� �����.
 * 		����� ��������� �������� ������, ��� ��������� ���� � ����: ��� ������� ������ ������ ���������� ��������� ��������� ����  � ��������� ����� �� ������� ���������� ����� � ������.  ����� ������ ������ ���������� ���������� ����� ������� ����� �� �� ����� ���� �� ��������� �����. ����� ������ ���������� ����� ��������� ��� ���� � Map, � ���������� ���������� � ������ ������� ��� ��������. ��� ���� ����� ��� �������� ��� ���������� ��������� ��������� ������� ����� � Map, � ���� ������ ��� ���� ��� ����������� � ����� ��������� �� �� ������ ��������� ��� ��������� �������� � ��������� �� �������. ����� ���������� ������ ��������� �� ������� ����� ���� � �� ���������� � ������. ����� ��� ����� ��������� ��� ������������� ������������ ��������� �� � ��������� ��������������� ��� ��������� ������������� �� ���������, ������� ��������� ��� ����� List � ��������� ���� Entry �� Map. � ����� �� ������������� ���������������� ������ ������ ������� ������ N �������.
 * 3. �������� ��������� ISearchEngine. ��� ����� ��������� � ������� ����� ������:
 * 	3.1 long search(String text, String word) - ����� ���������� ���������� � ���������� ��� ������� ����������� ����� � ������. ������ �������� ����� � ������� ����, ������ �������� ��� ���� � ������.
 * 4. ����������� ��������� ISearchEngine:
 * 	4.1 �������� ����� EasySearch. ����������� ����� ��������� ����� indexOf �� ������ String. � ������ ���������� ��������� ������������ ���������� ��������� � ����� ����, ��� ����� �����. ������ ����� ���� ����� � ������ ��������.
 * 	4.2* �������� ����� RegExSearch ����������� ��������� ISearchEngine. ����������� ����� ��� ������ ������ Matcher. ������ ����� ���� ����� � ������ ��������.
 * 	4.3* �������� ��������� SearchEnginePunctuationNormalizer ��� ISearchEngine ������� ����� ������� ������������� �������. ����� ����� ����������, ������ ������� � �������� �������� �����.
 * 	4.4* �������� ��������� ��� ISearchEngine ������� ����� ��������� ������ ������ ��� ����� ��������.
 * 		����� ��������� �������� ������, ��� ��������� ���� � ����:  ��� ����� ����� �� ��������, ������ ����� ����� ������ ��������� ���� ����� � ������������ ����� � ������� �������� �� ��� ��������� ������ ��� ������ ����� ����� ������ ��� RegExSearch. ����� RegExSearch � ����� ���������� ���������� ���������� ��������� � � ������ � ����������� ����������� ���� ����������� ������� �������� CASE_INSENSITIVE ��� ��������� � ��� � ��� ������ �� ������������� � ��������. ��� ���� ����� ��� ���-�� �������������� ����� ��������������� ���������� instanceof � ��������� ���� ������ ������ ��� �������� ������ ISearchEngine. ������ �������� �������� ������������� �� ��� ���� � ��������� ������� ����� �����������.
 * 	4.5** �������� ��������� SearchEngineCaseNormalizer ��� ISearchEngine ������� ����� �������� ��� ����� � ������� ������. ��� �������� ��������� �� ��� ���������� �����. �������� ����� ������ ������� ������ ����� "������� ������� �������" ��� ����� ��������: "������� - 3". ����� ����� ��������� ��� ������ ������������.
 * 5. ��������� ���������� ���������� ISearchEngine ������� ���������� ��� ����� ����������� ����� "�����", "�" (��� ����), "���" ��� ����������� �� ��������.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class SearchMain {
    public static  void main(String[] args) throws IOException {
        Scanner scanner =  new Scanner(System.in);
        String text = new String(Files.readAllBytes(Path.of("wp.txt")));//, Charset.forName("windows-1251"));

        ITextSpliterator spliterator = new DefaultSpliterator();
        String[] strings = spliterator.split(text);
        //2.1
        Set<String> uniqWords = new HashSet<>();
        for (String str : strings) {
            uniqWords.add(str);
        }
        System.out.println(uniqWords);
        System.out.println("���������� �������������� ���� " + uniqWords.size());

        //2.2
        Map<String,Integer> topWordsMap = new HashMap<>();
        for (String str : strings) {
            if (topWordsMap.containsKey(str)) {
                topWordsMap.put(str,topWordsMap.get(str) + 1);
            } else {
                topWordsMap.put(str,1);
            }
        }
        List <Entry> topWordsList = new ArrayList<>();
        Set <String> keys = topWordsMap.keySet();
        for (String key: keys) {
            topWordsList.add(new Entry(key,topWordsMap.get(key)));
        }

        System.out.print("Enter count TOP ");
        int TOP = scanner.nextInt();
        topWordsList.sort(Comparator.reverseOrder());
        for (int i = 0; i < TOP; i++) {
            System.out.println(topWordsList.get(i));
        }

        //4.1
        ISearchEngine searchEngine = new EasySearch();
        System.out.println("����� " + searchEngine.search(text,"�����"));
        System.out.println("�     " + searchEngine.search(text,"�"));
        System.out.println("���   " + searchEngine.search(text,"���"));

        //4.2
        ISearchEngine searchEngineRegEx = new RegExSearch();
        System.out.println("����� " + searchEngineRegEx.search(text,"�����"));
        System.out.println("�     " + searchEngineRegEx.search(text,"�"));
        System.out.println("���   " + searchEngineRegEx.search(text,"���"));

        //4.3
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(searchEngineRegEx);
        System.out.println("����� " + searchEnginePunctuationNormalizer.search(text,"�����"));
        System.out.println("�     " + searchEnginePunctuationNormalizer.search(text,"�"));
        System.out.println("���   " + searchEnginePunctuationNormalizer.search(text,"���"));

        //4.4
        ISearchEngine searchEngineIgnoreCase = new SearchEngineIngoreCase(searchEngineRegEx);
        System.out.println("����� " + searchEngineIgnoreCase.search(text,"�����"));
        System.out.println("�     " + searchEngineIgnoreCase.search(text,"�"));
        System.out.println("���   " + searchEngineIgnoreCase.search(text,"���"));

        //4.5
        ISearchEngine searchEngineCaseNormalizer = new SearchEngineCaseNormalizer(searchEngineIgnoreCase,"�����");
        System.out.println("����� " + searchEngineCaseNormalizer.search(text,"�����"));
        System.out.println("�     " + searchEngineCaseNormalizer.search(text,"�"));
        System.out.println("���   " + searchEngineCaseNormalizer.search(text,"���"));

    }
    
}
