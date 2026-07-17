package DS02linkedList;
                             //create the node
class Node {
    int data;
    Node next;
}
                          //create the linkedlist
class linkedlist {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }                        
                   // show how to insert  element

    public void insert_first(int data) {
        Node newnode = new Node();
        newnode.data = data;
    
    }

    public void insert_at(int ind, int data) {
        if (ind == 0) {
            insert_first(data);
            return;
        }

        Node node = new Node();
        node.data = data;
        // node.next = head; # mistake 
        // head = node;

        Node n = head;
        for (int i = 0; i < ind - 1; i++) {
            n = n.next;
        }

        node.next = n.next;
        n.next = node;
    }

    public void insert_last(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;

        if (head == null) {
            head = newnode;
            return;
        }

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newnode;
    }
            // how to print it 

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
                            // main class
class DS22LinkedLists {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        for (int i = 1; i <= 11; i++) {
            list.add(i);
        }

        list.insert_first(0);
        list.insert_at(6, 3);
        list.insert_last(13);
        list.show();
    }
}
