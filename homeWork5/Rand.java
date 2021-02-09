package homeWork5;

import HomeWork4.DataContainer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * ����� ��������� ��������� �������� ������ ����� Rand. ��������� ��������� {@link IRandom}
 * @autor ����� ������
 * @version 1.1
 */
public class Rand implements IRandom {

    /**
     * ���������� ������� int � �������� ���������
     * @param min ����������� ��������
     * @param max ������������ ��������
     * @return ��������� ��������
     */
    @Override
    public int randInt(int min, int max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextInt(min,max+1);
    }

    /**
     * ���������� ������ double � �������� ���������
     * @param min ����������� ��������
     * @param max ������������ ��������
     * @return ��������� ��������
     */
    @Override
    public double randDouble(double min, double max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        double result = rand.nextDouble(min,max);
        return rand.nextDouble(min,max);
    }

    /**
     * ���������� ������ String ������������ �������� ������� � �������� ���������
     * @param min ����������� ���������� ����������
     * @param max ������������ ���������� ��������
     * @return ��������� ������
     */
    @Override
    public String randString(int min, int max) {
        int countSymbols = randInt(min,max);
        int minASCII = (int)'�';
        int maxASCII = (int)'�';
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < countSymbols; i++) {
            char ch = (char) (randInt(minASCII, minASCII));
            builder.append(ch);
        }

        return builder.toString();
    }

    /**
     * ���������� ������ boolean
     * @return ��������� ��������
     */
    @Override
    public boolean randBoolean() {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextBoolean();
    }
}
