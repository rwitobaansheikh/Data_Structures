package linkedList;

public class LinkedList_imp {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data= data;
        node.next=null;

        if(head==null){
            head=node;
        }
        else{
            Node new_node=head;
            while(new_node.next!=null){
                new_node=new_node.next;
            }
            new_node.next=node;
        }
    }
    
    public void show(){
        Node nn=head;
        while(nn.next!=null){
            System.out.print(nn.data+" ");
            nn=nn.next;
        }
        System.out.print(nn.data);
    }
}
