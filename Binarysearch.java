// public class Binarysearch {
//     public static int binarysearch(int numbers[],int key){
//         int start=0, end =numbers.length-1;

//         while(start<=end){
//             int mid = (start+end)/2;
//             if (numbers[mid]==key) {
//                 return mid;

//             }
//             else if(numbers[mid]<key){
//                 start = mid+1;
//             }
//             else{
//                 end= mid-1;
//             }
//         }
//         return -1;
        

//     }
//     public static void main(String []args){
//         int numbers[]={2,4,6,10,14,3,1};
//         int key = 6;
//         int index = binarysearch(numbers, key);
//         if (index==-1) {
//             System.out.println("NOT FOUND"); 

//         }
//         else{
//             System.out.println(index);
//         }

       
//     }
// }


public class Binarysearch{

    public static int binarysearch(int numbers[],int key){
        int start=0; int end= numbers.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (numbers[mid]==key) {
                return mid;
            }
            if (numbers[mid]<key) {
                start= mid+1;

            }
            else{
                end = end-1;

            }
        }
        return-1;
    }
    public static void main(Strings[] args) {
        int numbers[]={2,4,6,8,10,12,14,20};
        int key=6;
        int index=binarysearch(numbers, key);
        if (index==-1) {
            System.out.println("not found");
        }
        else
        System.out.println(index);
    }

}