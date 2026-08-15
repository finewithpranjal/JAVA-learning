public class max {
    public static void main(String[] args) {
        int arr[]= {1 ,3, 5, 7, 9};
        System.out.println(max(arr));
    }
    public static int  max (int arr[]){
        int Max_value = arr[0];
        for (int i=1; i<arr.length ; i++){
            if (Max_value<arr[i]){
                Max_value = arr[i];

            }
           
        }
        return Max_value;

    }
        
    }

