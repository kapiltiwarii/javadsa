import java.util.*;
public class BubbleSort {
    public static void Bubblesort(int arr[]){
        for(int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void view(int arr[]){
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,2,5,3,4,1};
        Bubblesort(arr);
        view(arr);
    }
}
