import java.util.*;
public class SelectionSort {
    public static void Selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int Min=i;
            for(int j=i+1;j<arr.length;j++){
                
                if (arr[j]< arr[Min]) 
                    Min=j;
                  
                    int temp=arr[Min];
                    arr[Min]=arr[i];
                    arr[i]=temp;

            }
        }
    }
    public static void Printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(Strings[] args) {
        int arr[]={6,3,5,4,2,1};
        Selectionsort(arr);
         Printarr(arr);
    }
}
