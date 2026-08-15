import java.util.*;

public class toggle {
    static void tstr(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // Assuming that letter is Capital.
            char ch = (char) str.charAt(i);
            int asci = (int) ch;
            if (asci >= 97) { // Means the letter is small.
                flag = false;
            }
            if (flag == true) { // Means the letter is Capital
                asci += 32;

                char dh = (char) asci;
                str.setCharAt(i, dh);
            } else { // Means the letter is Small
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }

        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a String here : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("The Current String is : " + str);
        System.out.printf("The Toggeled String is : ");
        tstr(str);  // Function Calling
    }
}
