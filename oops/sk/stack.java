import java.util.*;
public  class stack {
        int arr[]=new int[10];
         int i =-1;

 
    void puch(int n){
        arr[++i]=n;
    }
    
    void pop(){

if(i==-1)  {System.out.print("Sorry un able");
    return;
}
    arr[i--]=0;

    }
    int peek(){
        int ele =arr[i];
                return ele;
    
}

    public static void main(String []arg){
      
        Scanner in = new Scanner(System.in);
 stack obj = new stack();
 int n = in.nextInt();
       obj.puch(n);
        for(int k =0;k<5;k++){
    obj.puch(k);
 }
        obj.puch(16);
        obj.pop();
        System.out.print(obj.peek());
       System.out.print(Arrays.toString(obj.arr));
             
    in.close();
        
    
    }
    
}
