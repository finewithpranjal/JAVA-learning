public class overloading {
  
    // Function Overloading ----> Two or more then two functions with the same name can be exist if and only if there parameters are different,this happens when the program gets compiled.
    public static void main(String[] args) {
        fun("Jai Shree Ram");
        fun(21);
    }
    static void fun(int a){  //parameters are different.
    System.out.println(a);
    }
    static void fun (String s){  //parameters are different.
System.out.println(s);
    }
}
