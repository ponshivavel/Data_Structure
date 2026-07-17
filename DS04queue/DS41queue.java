package DS04queue;
class queuedemo1{
    int que[] =  new int[5];
int size;
int rear;
int front;

         // the enqueue  is like insert 
 public void enqueue(int data){
  que[rear]= data;
  rear++;
  size++;
 }
         // the dequeue  is like insert 
 public int dequeue(){
  int data = que[front];
  front++;
  size--;
  return data;

 }

    
           //show
 public void show(){        
         System.out.println("Elements");

    for(int a=0;a<size;a++){
        System.out.print(que[front+a]+" ");
    }

 }

}
public class DS41queue {
    public static void main(String[] args) {
            queuedemo1 qu = new queuedemo1();
            qu.enqueue(18);
             qu.enqueue(12);
              qu.enqueue(14);
               qu.enqueue(17);
                qu.enqueue(18);
                qu.dequeue();
            
           
           /*  //System.out.println(qu.dequeue());                🤔remenber
           // qu.enqueue(18);
           
           error :   "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at DS04queue.queuedemo.enqueue(DS31queue.java:10)
        at DS04queue.DS31queue.main(DS31queue.java:46) */
            
            qu.show();
    }
    
}
