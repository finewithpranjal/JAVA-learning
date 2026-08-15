
import java.util.Arrays;

public class variablesargs {

    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 6, 7, 8 ,9, 10, 13, 12, 15 );
        multiple(5, 05,"Raghav", "Krishna", "Ram");

    }
    // static void fun(int ...v){
    //     System.out.println(Arrays.toString(v));
    // }
    static void multiple(int a , int b, String...v){
        System.out.println(Arrays.toString(v));
    }
}