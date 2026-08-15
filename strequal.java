public class strequal {
   public static void main(String[] args) {
   String s1 = "hello";
   String s2 = "hello";
   String s3 = new String ("hello");
   System.out.println(s1==s2);
   // Here s1==s2 gives true , why ? because "==" cheaks the address of the string , here s1 and s2 both are pointing to the same string "hello", hello is single so its address is also the same for s1 and s2, thats why the answer is true! and in the same way s1==s3 give false why? because s3 pointing to the "hello" which hac same string name but this time address is different form s1 and s2 due to 'new' keyword.
  System.out.println( s1.equals(s3));; 
   // This gives the answer true why? because the str.equals (str 2) cheaks the address first if the address is smae it will give true if not it cheaks the string character by character, here s1 = hello and s3 = hello both values are same so thats why it gives true!
   } 
   
}
