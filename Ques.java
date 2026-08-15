import java.util.*;
public class Ques {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of your array : ");
    int size= sc.nextInt();
    int Arrays[]=new int[size];
    for (int i=0;i<size ; i++){
        Arrays[i]=sc.nextInt();
    }
    boolean accending= true;
    for (int i=0; i<=size-1; i++){
        if (Arrays[i]> Arrays[i+1]){
            accending=false;

        }
        if (accending){
            System.out.println("Array list is in accending order : ");
            break;
            }
            else {
                System.out.println("Array list is not in accending order");
                break;
            }
       
    }
        
    sc.close();
    }
}
