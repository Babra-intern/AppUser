public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert(int data) {
        Node current = new Node(data);

        if (head == null) {
            head = current;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = current;
        }
    }

    public void insertAfter(int Afterdata, int data) {
        Node current = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {

            while (current.next != null) {
                if (current.data == Afterdata) {

                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }

        }
    }

    public void insertEnd(int dataEnd) {

        Node newNode = new Node(dataEnd);

        if (head == null) {
            head = newNode;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

public Node delete(int data) {
    if (head == null) return null;

    if (head.data == data) {
        Node todelete = head;
        head = head.next;
        return todelete;
    }

    Node current = head;
    while (current.next != null) {
        if (current.next.data == data) {
            Node deleted = current.next;
            current.next = current.next.next;
            return deleted;
        }
        current = current.next;
    }

    return null;
}


    public Node deleteStart() {

        if (head != null) {
            Node nodeDelete = head;
            head = head.next;
            return nodeDelete;

        }
        return null;

    }

    public Node deleteEnd() {
        Node current = head;

        if (head == null) {
            head = null;

        }

        if (head.next == null) {
            Node todelete = head;
            head = null;
            return todelete;
        }

        while (current.next.next != null) {
            current = current.next;
        }
        Node todelete = current.next;
        current.next = null;

        return todelete;

    }



    public void show() {
        Node temp = head;

        if (temp == null) {
            System.out.println("The linkedlist is empty.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }

    }


}
