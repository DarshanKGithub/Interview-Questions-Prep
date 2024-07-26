package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        //1.Using + operator (String concatenation)

        String chr = "DARSHAN";
        int len = chr.length();
        String rev = " ";

        for (int i = len - 1; i >=0;i--){
            rev = rev + chr.charAt(i);
        }
        System.out.println("The reverOrder is: "+rev);
    }
}
