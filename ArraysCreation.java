import java.util.*;

public class ArraysCreation {
  
public static int linearsearch(int numbers[],int key){

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]== key) {
        return  i;
      }  
    }
return -1;
}
    public static void main(String[] args) {
        // int arr[]= new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     Scanner sc = new Scanner(System.in) ;
        //     arr[i] = sc.nextInt();
        //    }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

     int numbers[]={1,2,3,4,5,6,7,8};
     int key = 9;
      int index = linearsearch(numbers, key);

      if (index==-1) {
        System.out.println("Not found");
      }
      else{
        System.out.println(index);
      }


    }
}
