package ReverseString;

public class ReverseCharArray {
    public static void main(String[] args) {
        String chr = "Priya";
        String rev = " ";

        //Using Character Array

        char a[] = chr.toCharArray();
        int len = a.length;

        for(int i = len - 1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("The reverseOrde is; " + rev);
    }
}
