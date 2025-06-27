package HashTable;

public class Main {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();

 
        table.insert("One", 25);
        table.insert("Two", 42);


        System.out.println( "\nkey : One  Value :" + table.search("One"));

        table.remove("One");
        System.out.println( "\nkey : One  Value :" + table.search("One"));

 
    }

   
}