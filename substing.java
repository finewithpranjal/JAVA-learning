public class substing {
    public static void main(String[] args) {
    String str = "abcd";
    for (int i = 0 ; i<=3; i++){
        for (int j = i+1; j<=4; j++){
            System.out.printf(str.substring(i,j)+" ");
        }
    }
    }
}
/*
import java .util.*;
public class substing {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str ;
    System.out.println("Enter a String Here ! : ");
    str = sc.nextLine();
    for (int i = 0 ; i<=str.length(); i++){
        for (int j = i+1; j<=str.length(); j++){
            System.out.printf(str.substring(i,j)+" ");
        }
    }
    }
}
*/
