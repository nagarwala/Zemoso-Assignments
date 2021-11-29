package Assignment10;

public class SListIterator<T> {
    Node <T> head;

    SListIterator(Node head)
    {
        this.head = head;
    }

    public void add(int data){
        Node<T> newNode = new Node(data);
        newNode.next = null;

        if(head == null)
            head = newNode;
        else{
            Node <T> temp = head;
            while(temp.next!=null)
                temp = temp.next;

            temp.next = newNode;
        }

    }

    public void remove(){

        if(head.next != null)
            head = head.next;
        else
            head = null;
    }

    public void printList(){
        Node<T> temp = head;
        System.out.println("The linked List formed: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
