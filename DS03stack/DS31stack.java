package DS03stack;




class stackdemo1{
   
        int top =0;
        int stack[]=  new int[5];
    
  public void push(int data){
        stack[top] = data;
        top++;

    }
  public  int pop(){
    int data ;
    data = stack[top];
    top--;
    stack[top]=0;
    
    return data;
  }
public  int peek(){
    int data ;
   data = stack[top-1];
    return data;
  }


  public void show(){
            System.out.print("push :");

    for(int n :stack){
        System.out.print(n+" ");
    }
}


}
public class DS31stack {
    public static void main(String[] args) {
        stackdemo list = new stackdemo();
        //push -> add
        
       
        list.push(15);
        list.push(14);
        list.push(18);
        // list.pop();
        
        

        //pop -> delete
        System.out.println("pop  :"+list.pop());
         list.push(14);
         list.push(16);
         
         


        //peek -> find
        System.out.println("peek :"+list.peek());
          


        list.show();
    }
    
}
