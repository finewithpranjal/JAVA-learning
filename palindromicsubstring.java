import java.util.*;

public class palindromicsubstring {

    public static boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                if (ispalindrome(s.substring(i, j)) == true) {
                    System.out.printf(s.substring(i, j) + " ");
                    count++;

                }

            }

        }
        System.out.println("\nThe number of palindromic substring in the stirng is : " + count);
    }
}
