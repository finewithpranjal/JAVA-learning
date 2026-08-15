import java.util.*;

public class splitarray {

    static int sumOfArray(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalsumpartition(int arr[], int size) {
        int totalsum = sumOfArray(arr, size);
        int prefsum = 0;
        for (int i = 0; i < size; i++) {
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum;
            if (prefsum == suffixsum) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.printf("Equal sum partition possible : " + equalsumpartition(arr, size));
    }
}
