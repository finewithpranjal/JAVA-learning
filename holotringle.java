import java.util.Scanner;
class holotringle {
    public static void main(String[] args) {
    int n;
    Scanner s= new Scanner (System.in);
    System.out.print("Enter a number : ");
    n=s.nextInt();
    int i=0;
    while (i<n){
       // for printing spaces!
       int j=0;
       while (j<n-i-1){
        System.out.print(" ");
        j++;
       }
       System.out.print("*");
       if (i!=0){
        int k=0;
        while (k<(2*i)-1){
            System.out.print(" ");
            k++;
        }
        System.out.print("*");
       }
       i++;
       System.out.println();
    }

    for (int l = 0; l < n-1; l++) {
        // Print leading spaces
        for (int j = 0; j <=l; j++) {
            System.out.print(" ");
        }
    
        // Print first star
        System.out.print("*");
    
        // Print spaces in between the stars (for hollow pattern)
        if (l != n - 2) {
            for (int j = 0; j < 2 * (n - 2 - l) - 1; j++) {
                System.out.print(" ");
            }
            // Print second star
            System.out.print("*");
        }
    
        // Move to next line
        System.out.println();
    }
        s.close();
    }
    
    }
    /*int n = 5; // You can set this to any number
for (int i = 0; i < n; i++) {
    // Print leading spaces
    for (int j = 0; j < i; j++) {
        System.out.print(" ");
    }

    // Print first star
    System.out.print("*");

    // Print spaces in between the stars (for hollow pattern)
    if (i != n - 1) {
        for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
            System.out.print(" ");
        }
        // Print second star
        System.out.print("*");
    }

    // Move to next line
    System.out.println();
}
 */

