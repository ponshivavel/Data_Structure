import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,9,0,65,4,4,3,2,3,5,7,8,7,65,56,6,5,54,45};
        for(int i =0;i<arr.length-1;i++){
           
            int ind =i;
             for(int j =i+1;j<arr.length;j++){
                
                if(arr[ind]>arr[j]){  ind =j;          }
            }
            int t = arr[ind];
            arr[ind]=arr[i];
             arr[i]=t;
        }
        System.out.print(Arrays.toString(arr));
    }  
}
