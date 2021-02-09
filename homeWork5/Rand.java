package homeWork5;

import HomeWork4.DataContainer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *  ласс генерации рандомных значений разных типов Rand. реализует интерфейс {@link IRandom}
 * @autor ѕавел Ѕобров
 * @version 1.1
 */
public class Rand implements IRandom {

    /**
     * ¬озвращает ранодом int в указаном диапазоне
     * @param min минимальное значение
     * @param max максимальное значение
     * @return рандомное значение
     */
    @Override
    public int randInt(int min, int max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextInt(min,max+1);
    }

    /**
     * ¬озвращает рандом double в указаном диапазоне
     * @param min минимальное значение
     * @param max максимальное значение
     * @return рандомное значение
     */
    @Override
    public double randDouble(double min, double max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        double result = rand.nextDouble(min,max);
        return rand.nextDouble(min,max);
    }

    /**
     * ¬озвращает рандом String кириллческих символов длинной в указаном диапазоне
     * @param min минимальное количество символовом
     * @param max максимальное количество символов
     * @return рандомна€ строка
     */
    @Override
    public String randString(int min, int max) {
        int countSymbols = randInt(min,max);
        int minASCII = (int)'ј';
        int maxASCII = (int)'€';
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < countSymbols; i++) {
            char ch = (char) (randInt(minASCII, minASCII));
            builder.append(ch);
        }

        return builder.toString();
    }

    /**
     * ¬озвращает рандом boolean
     * @return рандомное значение
     */
    @Override
    public boolean randBoolean() {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextBoolean();
    }
}
