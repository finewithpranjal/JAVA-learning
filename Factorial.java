import java.util.*;
public class Factorial {
 public static void factoralOfNumber (int n){
    int factorial =1;
    for (int i=n; i>=1; i--){
     factorial = factorial*i;
    
    }
    System.out.println(factorial);
    return;
 }
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a number : ");
 int n= sc.nextInt();
 System.out.print("The factorial of a number is : ");
 factoralOfNumber(n);
 sc.close();
 }   
}
