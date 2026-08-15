import java.util.*;
public class Performance {
public static void main(String[] args) {
  
    String str = "";
    for (int i = 1; i<= 10; i++){
     str = str + i;   // yaha har baar ek nayi string ban rahi hai jiska naam str hai , q ki strigs immutble hote hai. that's why strings ki performance ac nhi hoti hai. ye improve karne ke liye stringbuilder ka use karte hai.
    } 
    System.out.print(str);
}
 
}