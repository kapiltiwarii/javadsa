public class PairsInArray {
    public static void PairsinArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr.length; index++) {
                System.out.print("("+arr[i]+","+arr[index]+")"+",");
            }
        }
    }
    public static void main(Strings[] args) {
        int arr[] = {1,2,3};
       PairsinArray(arr);
    }
}
