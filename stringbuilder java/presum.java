import java.util.*;

public class presum {
    static int prefixsum(int arr[], int size) {
        int n = size;
        
        // int pref[] = new int[n];
        // pref[0] = arr[0];
        // for (int i = 1; i < n; i++) {
        //     pref[i] = pref[i - 1] + arr[i];
        // }
        // System.out.println(Arrays.toString(pref));
        // return 0;
        for (int i = 1; i<n; i++){
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("The prefix sum of the arry is : ");
        prefixsum(arr, size);
        sc.close();
    }
}