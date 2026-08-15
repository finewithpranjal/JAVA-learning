// import java.util.Arrays;
// public class Reverce {
//    public static void main(String[] args) {
//     int arr[]= {1,4,3,5,7,9};
//     System.out.println(Arrays.toString(arr));
//     int start = 0 , end = arr.length-1;
    
//     while (start<end){
//     int temp = arr[start];
//     arr[start]=arr[end];
//     arr[end]=temp;
   
//         start++;
//         end--;
//     }
//     System.out.println(Arrays.toString(arr));
//    } 
// }
import java.util.Arrays;
import java.util.Scanner;
public class Reverce {
static void areverce( int[] arr){
    int start = 0 , end = arr.length-1;
    
    while (start<end){
    int temp = arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
   
        start++;
        end--;
    }
    System.out.println(Arrays.toString(arr));
   } 


public static void main(String[] args) {
// int arr[] = {7,4,8,9,0,7,2,1,8,2};
Scanner s =new Scanner (System.in);
System.out.print("Enter Size of your Array : ");
int size= s.nextInt();
int arr[]=new int [size];
// For the input
for (int i=0; i<size ; i++){  // arr.length=size
 arr [i]=s.nextInt();
}
System.out.println("The Orignal Array is : "+Arrays.toString(arr));
System.out.print("The Reverce of the Array is : ");
areverce(arr);
}
    
}