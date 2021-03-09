package util;

public class ListUtils {

    public static ListElement insert(ListElement first, int x, int y) {    // Добавление элемента в конец списка
        if (first == null) {
            return new ListElement(x, y);
        } else {
            ListElement p = first;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement(x, y));
            return first;
        }
    }

    public static ListElement filter(ListElement first) {    // Метод фильтрации
        ListElement p = null;
        while (first != null) {
            if ((first.getX() >= 0) && (first.getY() >= 0)) p = insert(p, first.getX(), first.getY());
            first = first.getNext();
        }
        return p;
    }

    static double sum;
    public static double reduce(ListElement first) {   // Метод аккумулирования

        if (first.getNext() != null){
            sum += Math.sqrt(Math.pow((first.getX() - first.getNext().getX()), 2) +
                             Math.pow((first.getY() - first.getNext().getY()), 2));      // Расстояние между X и Y

            reduce(first.getNext());
        }

        return sum;
    }
}