import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int n = 10;
        ex1(n);
    }

    static void ex0(int n) {
        /*
        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        System.out.println(list);
        }
    }

    static void ex1 (int n) {
        /*
        2.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
            Collections.max()
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        System.out.println("Минимальное значение коллекции =" + " " + Collections.min(list));
        System.out.println("Максимальное значение коллекции =" + " " + Collections.max(list));
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += i;
        }
        System.out.println("Среднее арифметическое значение коллекции =" + " " + sum/n);
    }
}




