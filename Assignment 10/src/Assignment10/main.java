package Assignment10;

public class main {
    public static void main(String[] args) {
        SList<Integer>  list = new SList<>();
         SListIterator <Integer> listIterator = list.iterator();
         listIterator.add(12);
         listIterator.add(15);
         listIterator.add(45);
         listIterator.add(24);
         listIterator.add(35);
         listIterator.add(40);

         listIterator.remove();

         listIterator.printList();
    }
}
