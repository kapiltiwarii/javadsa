public class Strings {
public static void Printletter(String str){
   for (int i = 0; i < str.length(); i++) {

    System.out.print(str.charAt(i)+" ");
   }
   System.out.println();
}
    public static void main(String[] args) {
        String firstName = "KAPIL";
        String LastName= "TIWARI";
        String fullName= firstName +" "+ LastName;
     
        // System.out.println(fullName);
        Printletter(fullName);
    }
}
