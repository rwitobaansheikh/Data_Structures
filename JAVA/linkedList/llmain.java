package JAVA.linkedList;
import java.util.*;
public class llmain {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        LinkedList_imp ll=new LinkedList_imp();

        int choice=-1;
        while(choice != 0){
            System.out.println("\n\t\tMenu");
            System.out.println("1. Insert elements in list");
            System.out.println("2. Insert element at start of list");
            System.out.println("3. Insert element at a position in list");
            System.out.println("4. Delete element at start of list");
            System.out.println("5. Delete element at end of list");
            System.out.println("6. Delete element at a position in list");
            System.out.println("7. Display list");
            System.out.println("0. Enter 0 to Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1: System.out.println("Enter number of elements to be inserted.");
                        int n=sc.nextInt(); //taking in number of elements to be inserted 
                        System.out.println("Enter elements");
                        for(int i=0;i<n;i++){       //Inserting data in linkedlist
                            ll.insert(sc.nextInt());
                        }
                        break;
                case 2: System.out.println("\n\nEnter element to be entered at beginning.");
                        ll.insertAtstart(sc.nextInt());
                        break;
                case 3: System.out.println("\nEnter postion where element is to be entered and the element respectively.");
                        ll.insert(sc.nextInt(),sc.nextInt());
                        break;
                case 4: ll.deleteAtStart();
                        break;
                case 5: ll.delete();
                        break;
                case 6: System.out.println("\nEnter Position where element is to be deleted.");
                        ll.delete(sc.nextInt());
                        break;
                case 7: ll.show();
                        break;
                case 0: break;
                default: System.out.println("Wrong choice. \nTry again!");
            }
        }

        sc.close();
    }
    
}
