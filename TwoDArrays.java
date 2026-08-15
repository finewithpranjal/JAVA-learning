import java.util.Scanner;
public class TwoDArrays{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter number of rows : ");
    int r = sc.nextInt();
    System.out.print("Enter number of columns : ");
    int c = sc.nextInt();
    int [][] numbers = new int [r][c];
   
    for (int i=0; i<r; i++){
        for (int j=0; j<c; j++){
                  numbers[i][j]= sc.nextInt();
             }
    }
    System.out.print("Enter the number you wnat to find in the Matrix : ");
    int x =  sc. nextInt();

    for (int i=0; i<r; i++){
        for (int j=0; j<c; j++){
           if (x==numbers[i][j]){
            System.out.println("Number is found! at : "+"( " + i +","+j+ " )");
           }
            // System.out.print(numbers[i][j] + " ");
        }
        // System.out.println();
    }
    sc.close();  
    }
}