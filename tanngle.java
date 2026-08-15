// import java.util.Scanner;

// class tanngle {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             // spaces
//             for (int j = 0; j < (n - i) - 1; j++) {
//                 System.out.print(" ");
//             }
//             // number set : 1 i+1 times
//             for (int j = 1; j <=i+1; j++) {
//                 System.out.print(j);
//             }
//             // number set 2 : i to 1 Backward  
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             // for next line.
//             System.out.println();
//         }
//         sc.close();
//     }

// }

import java.util.Scanner;                                      

class tanngle {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
              int num1=1;
            while (num1 <= i) {
                System.out.print(num1);
                num1++;
            }
            int r = i;
            while (r > 1) {
                System.out.print(r - 1);
                r--;
            }
            System.out.print("\n");
            i++;
        }
        s.close();
    }
}
//  import java.util.Scanner;
// class Tanngle {
//     public static void main(String[] args) {
//         int n;
//         System.out.print("Enter a number: ");
//         Scanner s = new Scanner(System.in);
//         n = s.nextInt();

//         int i = 1;
//         while (i <= n) {
//             // print spaces
//             int space = 1;
//             while (space <= n - i) {
//                 System.out.print(" ");
//                 space++;
//             }

//             // print increasing numbers from 1 to i
//             int num = 1;
//             while (num <= i) {
//                 System.out.print(num);
//                 num++;
//             }

//             // print decreasing numbers from i-1 to 1
//             int r = i - 1;
//             while (r >= 1) {
//                 System.out.print(r);
//                 r--;
//             }

//             System.out.println();
//             i++;
//         }

//         s.close();
//     }
// }
