package DS02linkedList;
class Node{     //node
    int data;
    Node next;
}

//linkedlist

class linkedlist{
    Node head;                      //create the head
 public void add(int data){
    Node node = new Node();
      node.data = data;             //data to node
      node.next =null;               // create the null
    if(head==null){
        head = node;
    }
    else{
        Node n = head;
        while(n.next!=null){
              n = n.next;
        } n.next = node;
    } 
  
    
 }

 //show how to delete it          #01

public void delete_first(int ind){
if(ind == 0) 
return;
head = head.next;
}


public void delete_at(int ind){
    if(head == null) return;
    if(ind ==0){
        delete_first(ind);
        return;
    }

    Node n = head;
    for(int i =0;i<ind-1;i++){
        n = n.next;
    }
    n.next =n.next.next;
}


// //show how to insert it 
public void delete_last(){
    if(head ==  null) return;
   
    Node n = head;
    while(n.next.next!=null){
        n = n.next;
    }
    n.next = null;

}




//show how to print it          #01


 public void show(){
    Node node = head;
    while (node!=null) {
      System.out.print(node.data+" -> ");
         node = node.next;
    }
    System.out.print( "null");
 }



 
}

 //main  
class DS23LinkedLists{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        for(int i =1;i<=11;i++){
        list.add( i   );} 

        list.delete_first(0);
        list.delete_at(2);
        list.delete_last( );
        list.show();
    }
}