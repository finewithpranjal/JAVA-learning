import java.util.*;
import java.util.Arrays;
public class ar {
   public static void main(String [] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of the array -");
    int size = sc.nextInt();
    int ary[]=new int [size];
    for (int i=0; i<size  ; i++){
           ary[i] =sc.nextInt();
    }
   //   System.out.println(Arrays.toString(ary));
   for (int num : ary){
      System.out.print(num+" ");
   }
     sc.close();
   }
    
}
