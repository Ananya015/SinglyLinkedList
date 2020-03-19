package definition;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private int size=0;

    public void addFirst(E item){
       Node new_node=new Node ( item,head );
       new_node.next=head;
       head=new_node;
       size++;
    }


private static class Node<E>{
    private E data;
    private Node<E> next;

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
}



}
