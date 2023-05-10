
/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int size = Integer.parseInt(sc.nextLine());
        sc.close();
        LinkedList<Integer> lis = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            enqueue(lis, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(lis);

        System.out.println(dequeue(lis)); // удалили первый элемент
        System.out.println(lis);

        System.out.println(first(lis)); // вывели первый элемент
        System.out.println(lis); 
    }

    public static void enqueue(LinkedList<Integer> lis, int num) {// помещает элемент в конец очереди
        lis.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> lis) { // возвращает первый элемент из очереди и удаляет его
        int num = lis.get(0);
        lis.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> lis) { // возвращает первый элемент из очереди, не удаляя
        int num = lis.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
