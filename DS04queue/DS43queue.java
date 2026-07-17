package DS04queue;



//          circlurlar
class queuedemo{
    int que[] =  new int[5];
int size;
int rear;
int front;

         // the enqueue  is like insert 
 public void enqueue(int data){
    if(size ==5) {
       System.out.print("it is filled"); 
    return; }

  que[rear]= data;
  rear =(rear+1)%5;
  size++;
 }
         // the dequeue  is like insert 
 public int dequeue(){
     if(size ==0) {
       System.out.print("it is empty"); 
    return -1; }
  int data = que[front];
  front =(front+1)%5;
  size--;
  return data;

 }
 public boolean isempty(){
    if(size<=0 ) return true;
 return false;
 }


 public int getsize(){
    return size;
 }

    
           //show
 public void show(){        
         System.out.println("Elements");

    for(int a=0;a<size;a++){
        System.out.print(que[(front+a)%5]+" ");
    }

 }

}
public class DS43queue {
    public static void main(String[] args) {
            queuedemo qu = new queuedemo();
            qu.enqueue(18);
             qu.enqueue(12);
              qu.enqueue(14);
                 qu.enqueue(18);
                 
                qu.dequeue();
            qu.enqueue(19);
             qu.enqueue(18);
              qu.enqueue(18);
            System.out.println("size : "+qu.getsize());
            System.out.println("isempty :"+qu.isempty());
            qu.show();
    }
    
}
