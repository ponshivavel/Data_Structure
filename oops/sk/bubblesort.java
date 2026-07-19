import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,9,0,65,4,4,3,2,3,5,7,8,7,65,56,6,5,54,45};
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int emp = arr[j];
                    arr[j]=arr[j+1];
                     arr[j+1]  = emp;              }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
