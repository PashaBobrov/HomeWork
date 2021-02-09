package HomeWork2.Sort;

class Sorting {

    public static void bubbleSort(int[] container) {
        for (int j = 1; j < container.length; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < container.length - j; i++) {
                if (container[i] > container[i + 1]) {
                    int buffer = container[i];
                    container[i] = container[i + 1];
                    container[i + 1] = buffer;
                    flagEnd = false;
                }
            }
            if (flagEnd) {
               // break;
            }

        }
    }

    public static void shakerSort(int[] container) {

        for (int leftDirection = 0, rightDirection = container.length - 1;
             leftDirection < rightDirection; leftDirection++, rightDirection--) {

            int buffer;
            for (int i = leftDirection; i < rightDirection; i++) {
                if (container[i] > container[i + 1]) {
                    buffer = container[i];
                    container[i] = container[i + 1];
                    container[i + 1] = buffer;
                }
            }
            for (int i = rightDirection; i > leftDirection; i--) {
                if (container[i] < container[i - 1]) {
                    buffer = container[i];
                    container[i] = container[i - 1];
                    container[i - 1] = buffer;
                }
            }
        }
    }
}
