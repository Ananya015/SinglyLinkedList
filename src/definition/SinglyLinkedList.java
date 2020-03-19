package definition;

public class SinglyLinkedList<E> {

private static class Node<E>{
    private E data;
    private Node<E> next;

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }
}



}
