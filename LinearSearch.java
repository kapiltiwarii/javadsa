public class LinearSearch {
    public static int linearsearch(int numbers[],int key){
           for(int i=0;i<numbers.length;i++){
               if (numbers[i]==key) {
                return i;
               }
               
           }
           return -1;
    }
    public static void main(Strings[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 5;
       int index=  linearsearch(numbers, key);
    
       if (index == -1) {
        System.out.println("Not found ");
       }
       else
       System.out.println("Index is "+ index);
    }
}
