/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/



import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int size = Integer.parseInt(sc.nextLine());
        LinkedList<Integer> lis = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            lis.add(getRandomNumber());
        }
        System.out.println(lis);
        System.out.println(reverseList(lis, size));
        sc.close();
    }

    static List<Integer> reverseList(List<Integer> list, int size){
        LinkedList<Integer> lisRevers = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            lisRevers.add(((LinkedList<Integer>) list).removeLast());
        }
        return lisRevers;
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
