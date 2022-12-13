// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list1 = fillArray();
        System.out.print(list1);
        System.out.println();
        System.out.println("Max = " + max(list1));
        System.out.println("Min = " + min(list1));
        System.out.println("Average = " + avarage(list1));
    }

    public static List<Integer> fillArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 10);
            list.add(random);
        }
        return list;
    }

    public static int max(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        return max;
    }

    public static int min(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }

        }
        return min;
    }

    public static double avarage(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (double) sum / list.size();
    }
}
