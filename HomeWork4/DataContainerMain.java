package HomeWork4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer <Integer> container = new DataContainer <> (new Integer[5]);
        container.add(777);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(7);
        container.add(6);
        container.add(0);
        container.add(1);
        container.add(1);
        container.add(1);
        System.out.println(container.toString());

        container.delete(1);
        container.delete(1);
        container.delete(1);
        container.add(200);
        System.out.println(container.toString());

        container.delete(Integer.valueOf(1));
        container.delete(Integer.valueOf(1));
        container.delete(Integer.valueOf(1));
        System.out.println(container.toString());

        container.sort(Comparator.reverseOrder());
        System.out.println(container.toString());

        DataContainer.sort(container);
        System.out.println(container.toString());

        DataContainer.sort(container,Comparator.reverseOrder());
        System.out.println(container.toString());

         while (container.hasNext()) {
             System.out.println(container.next());
         }

    }
}
