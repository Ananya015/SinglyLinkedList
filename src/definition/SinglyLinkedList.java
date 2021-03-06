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

    public void addAfter(Node preNode,E item){
       Node new_node=new Node ( item,preNode.next );
       new_node.next=preNode.next;
       preNode.next=new_node;
       size++;
    }

    public Node<E> getNode(int index){
        Node<E> response=head;
        for(int i=0;i<index;i++){
            response=response.getNext ();
        }
      return response;
    }
    public void add(int index,E item){
        if(index<0 || index>size) {
            throw new IndexOutOfBoundsException ( Integer.toString ( index ) );
        }
        else if(index==0){
            addFirst ( item );
        }
        else {
            Node<E> temp=getNode ( index-1 );
            addAfter ( temp,item );
        }

    }

    private E removeFirst(){
        Node<E> temp=head;
        E response=null;
        if(head!=null){
            head=head.getNext ();
        }
        if(temp!=null){
            size--;
            response=temp.getData ();
        }
        return response;
    }

    private E removeAfter(Node<E> afterNode){
        Node<E> temp = afterNode.getNext();
        if (temp != null) {
            afterNode.next = temp.getNext();
            size--;
        }
        E respone = temp.getData();
        return respone;
    }

    public E remove(int index){
        E response=null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
            response = removeAfter(previousNode);
        }
        return response;
    }

   public void printList(){
        Node<E> pnode=head;
        while(pnode!=null){
            System.out.println (pnode.data+" ");
            pnode=pnode.next;
        }
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
