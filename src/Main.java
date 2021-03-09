import util.ListElement;
import util.ListUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов списка: ");

        int n = scan.nextInt();

        System.out.println("Введите X и Y первого элемента списка: ");
        ListElement elem1 = new ListElement(scan.nextInt(), scan.nextInt());

        for (int i = 2; i <= n; i++){
            System.out.println("Введите " + i + " элемент списка: ");
            ListUtils.insert(elem1, scan.nextInt(), scan.nextInt());
        }

        System.out.println("Список: ");
        print(elem1);

        System.out.println("Список после удаления отрицательных X и Y: ");
        ListElement elem2;    // Второй список
        elem2 = ListUtils.filter(elem1);
        print(elem2);


        System.out.println("Общее расстояние между соседними точками: ");
        System.out.println(ListUtils.reduce(elem2));
    }

    public static void print(ListElement first){    // Вывод списка на экран
        if (first != null){
            System.out.print("(" + first.getX() + ", " + first.getY() + ") ");
            print(first.getNext());
        } else
            System.out.println();
    }
}
