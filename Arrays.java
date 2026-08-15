import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // // int [] marks = new int[3];
        // int marks[]=new int[3];   
        // marks [0]=97; // phy
        // marks [1]=98; // chem
        // marks [2]=87; // maths
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // int i=0;
        // while (i<3){
        //     System.out.println(marks[i]);
        //     i++;
        // }
        Scanner s=new Scanner (System.in);
        System.out.println("Enter size of your array : ");
        int size= s.nextInt();
       int numbers[]=new int [size];
       // For the input
       for (int i=0; i<size ; i++){  // numbers.length=size
        numbers [i]=s.nextInt();
       }
      System.out.print("Enter the number you want to find in the array : ");
       int x=s.nextInt();
       // For the output.
       for(int i=0;i<size ; i++){
        // System.out.print(" "+numbers[i]);
        if (x==numbers[i]) {
            System.out.println("Number is found! at postion : "+i);
           
        }
       }
       s.close();

    }
}
 