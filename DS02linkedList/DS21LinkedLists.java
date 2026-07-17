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
        Node node = new Node(); //create the head
        node.data = data;           //data to node
        node.next = null;          // create the null

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

        System.out.print(node.data);
    }
}
                            //main_class

class DS21LinkedLists {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
