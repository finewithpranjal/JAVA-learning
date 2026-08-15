import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class arylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        // Add elements --> list.add(Element);
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(7);

        System.out.println(list);

        // Get elements --> list.get(index);
        int element  = list.get(1);
        System.out.println(element);

        //add element between list ---> list.add(Index , elelment);
        list.add(0,9);
        System.out.println(list);

        // Set element : This , add an element on the index, and remove the element which was exist on that index before. ---> list.set(index , element);

        list.set(0,12);
        System.out.println(list);

        // Delet/ Remove ---> remove.list(Index);
        list.remove(3);
        System.out.println(list);
     
        // Size ---> list.size();
       
        System.out.println( list.size());

        
    // Sorting of the list , it has sort function in colllection class, use "import java.util.Collection;" For use this sort function ---> Collections.sort(list);
      Collections.sort(list);
      System.out.println(list);

    }

     

    
     
}
