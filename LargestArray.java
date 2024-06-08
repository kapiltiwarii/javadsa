public class LargestArray {
    public static int GetLargest(int numbers[]){
        int Largest= Integer.MIN_VALUE;
        int Smallest= Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
             Largest = numbers[i]; 
            }
            if (Smallest >numbers[i]) {
                 Smallest = numbers[i]; 
                }
        
        }
        System.out.println("Smalest numbes is:"+Smallest);
        return Largest;
  
    }
    public static void main(Strings[] args) {
        int numbers[]={2,4,5,6,1};
        int x=GetLargest(numbers);
        System.out.println("LARGEST NUMBER IS:"+x);

    }
}



