package JAVA.linkedList;
import java.util.*;
public class llmain {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        LinkedList_imp ll=new LinkedList_imp();
        System.out.println("Enter number of elements to be inserted.");
        int n=sc.nextInt(); //taking in number of elements to be inserted 

        System.out.println("Enter elements");
        for(int i=0;i<n;i++){       //Inserting data in linkedlist
            ll.insert(sc.nextInt());
        }

        System.out.println();
        ll.show(); //Printing the list formed.

        System.out.println("\n\nEnter element to be entered at beginning.");
        ll.insertAtstart(sc.nextInt());

        System.out.println();
        ll.show(); //Printing the list formed.

        System.out.println("\nEnter postion where element is to be entered and the element respectively.");
        ll.insert(sc.nextInt(),sc.nextInt());

        System.out.println();
        ll.show(); //Printing the list formed.

        System.out.println("\nEnter Position where element is to be deleted.");
        ll.delete(sc.nextInt());

        System.out.println();
        ll.show(); //Printing the list formed.

        sc.close();
    }
    
}
