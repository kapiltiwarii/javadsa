public class eqals {
    public static void main(String[] args) {
        String s1 = "KAPIL";
        String s2 = "KAPIL";
        String s3 = new String("KAPIL");
        if (s1==s2) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if (s1==s3) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
