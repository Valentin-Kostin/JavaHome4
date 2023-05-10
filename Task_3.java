/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int size = Integer.parseInt(sc.nextLine());
        sc.close();
        LinkedList<Integer> lis = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            lis.add(getRandomNumber());
        }
        System.out.println(lis);
        int sum = 0;
        Iterator<Integer> itr = lis.listIterator();
        while (itr.hasNext()){
            Object i = itr.next();
            sum += (Integer)i;
        }
        System.out.println(sum);
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
