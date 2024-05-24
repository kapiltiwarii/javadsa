public class SubArrays {
    public static void Subarrays(int ar[]){
      int ts=0;
      for (int i = 0; i < ar.length; i++) {
        int start = i;
        for(int j=i;j<ar.length;j++){
          int end=j;
          for (int k = start; k <= end; k++) {
            System.out.print(ar[k]+" ");
          }
          ts++;
       System.out.println();
        }
       System.out.println();
      }
      System.out.println("Total sub arrays ="+ts);
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
         Subarrays(arr);
    }
}
