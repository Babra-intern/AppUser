package HashTable;

public class Hashtable {

    private static final int SIZE = 10;
    private Node[] hash_table;

    public Hashtable(){
        hash_table = new Node[SIZE];
    }


   public int hash(String key){
        int hash = 0;
        for(int i = 0 ; i < key.length(); i++){
            hash += key.charAt(i);
        }
        return hash % SIZE; 
    }


    public void insert(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        newNode.next = hash_table[index];
        hash_table[index] = newNode;

    }


    public Integer search(String key){

        int index = hash(key);

        Node current = hash_table[index];

        while(current != null){
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    

    public void remove(String key) {
        int index = hash(key);
        Node current = hash_table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    hash_table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Removed key: " + key);
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Key not found: " + key);
    }
    
    
}
