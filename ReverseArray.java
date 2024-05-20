public class ReverseArray {
    public static void Reversearray(int numbers[]){
       int j = numbers.length;


        for (int i = 0; i <j; i++) {
            numbers[j-1]=numbers[i];
             j=j-1;
        }
      
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,7,8,10};
         Reversearray(numbers);

    }
}
