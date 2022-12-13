import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {
        List<Integer> list1 = fillArray();
        System.out.print(list1);
        System.out.println();
        System.out.print(removeEvenNumbers(list1));

    }

    public static List<Integer> fillArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            list.add(random);
        }
        return list;
    }

    public static List<Integer> removeEvenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }

}