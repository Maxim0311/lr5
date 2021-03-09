package util;

public class ListElement {

    private final int x;
    private final int y;
    private ListElement next;

    public ListElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ListElement getValue() {
        return this;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

}
