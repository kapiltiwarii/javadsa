public class MaxsumSubarray {
 
        public static void Subarrays(int ar[]){
        int currentsum=0;
        int Maxsum= Integer.MIN_VALUE;
          for (int i = 0; i < ar.length; i++) {
            int start = i;
        
            for(int j=i;j<ar.length;j++){
              int end=j;
              currentsum=0;
              for (int k = start; k <= end; k++) {
                // System.out.print(ar[k]+" ");
                 currentsum+=ar[k];
              }
             System.out.println(currentsum);
             if (Maxsum<currentsum) {
              Maxsum=currentsum;
             }
            }
           System.out.println();
          }
          System.out.println("Maxsum of sub arrays ="+Maxsum);
        }
        public static void main(Strings[] args) {
            int arr[]= {2,4,6,8,10};
             Subarrays(arr);
        }
    }

