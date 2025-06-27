public class Main1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(null);

        list.insertEnd(10);
        list.insertEnd(20);


        System.out.println("Original List:");
        list.show();

        list.deleteEnd();
        System.out.println("\n after deleting");
        list.show();

      
    }
}


