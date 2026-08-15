import java.util.*;
class pattern {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  System.out.print("Enter a number : ");
  int n = sc.nextInt();
    for(int i=0; i<n;i++){
        for (int j=0; j<i; j++){
            System.out.print(" ");
            }
        for (int j=0;j<n-i; j++){
            System.out.print(i+1);
        }
        System.out.println();
    }
    sc.close();
  }  
}
