//Q)Printing the string in bold

public class StringBold {
    public static void main(String[] args) {
        String toBeBold1 = "\033[1mThis to shall pass...\033[0m";
        String toBeBold2 = "\033[1m10/2=5 and 11/2=55\033[0m";
        String toBeBold3 = "\033[1mThis is a difficult to print.Isn't it?\033[0m";
        System.out.println(toBeBold1);
        System.out.println(toBeBold2);
        System.out.println(toBeBold3);

    }
}
