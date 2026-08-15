
public class sbr {
 static void strRev (StringBuilder str){
//   str.setCharAt(0, 'w');
//   str.setCharAt(1, 'o');
//   str.setCharAt(2, 'l');
//   str.setCharAt(3, 'l');
//   str.setCharAt(4, 'e');
//   str.setCharAt(5, 'h');
  str.reverse();
  System.out.println(str);
 }
    public static void main(String[] args) {
  
   StringBuilder str = new StringBuilder("Hellow");
   System.out.println(str);
   System.out.printf("The reverce of the sting is : ");
   strRev (str);
}
}