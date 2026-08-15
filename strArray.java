import java . util. *;
import java. util. Arrays;
public class strArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter size of your String Array : ");
        int n = sc.nextInt();
        String arr []= new String [n];
        for (int i =0 ; i< arr.length ; i++){
                arr[i]=  sc.next();
        }
        System.out.println(Arrays. toString(arr));
        sc.close();
    }
}
