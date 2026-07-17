package DS03stack;
// in this we can see how see the size amd isempty



class stackdemo{
   
        int top =0;
        int stack[]=  new int[5];
    
  public void push(int data){

    if(top==5){
        System.out.println("it filled"); return;
    }
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
  

  public int size(){             //size
    return top;
  }

  public boolean isempty(){     //empty check
    if(top<=0){
        return true;
    }
    return false;

  }


  public void show(){
            System.out.print("push :");

    for(int n :stack){
        System.out.print(n+" ");
    }
}


}
public class DS32stack {
    public static void main(String[] args) {
        stackdemo list = new stackdemo();
        //push -> add
        
       
        list.push(15);
        list.push(14);
        list.push(18);
        list.push(15);
       
      

        //pop -> delete
        System.out.println("pop  :"+list.pop());
      list.push(12);
      list.push(13);
      list.push(11 );

        //peek -> find
        System.out.println("peek :"+list.peek());
          
        System.out.println("size :"+list.size());
        
        System.out.println("is Empty :"+list.isempty());

        list.show();
    }
    
}
