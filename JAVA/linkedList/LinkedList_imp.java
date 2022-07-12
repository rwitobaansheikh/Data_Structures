package JAVA.linkedList;

public class LinkedList_imp {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data= data;
        //node.next=null;

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

    public void insertAtstart(int data){
        Node node= new Node();
        node.data=data;
        node.next=head;
        head=node;
    }

    public void insert(int pos, int data){

        if(pos==0){
            insertAtstart(data);
        }
        else{
            Node node = new Node();
            node.data=data;
            Node new_node=head;
            int c=pos-1;
            while(c!=0){
                new_node=new_node.next;
                c--;
            }
            node.next=new_node.next;
            new_node.next=node;
            
        }
    }

    public void deleteAtStart(){
        head=head.next;
    }

    public void delete(int pos){
        if(pos==0)
            deleteAtStart();
        else{
            Node node=head;
            Node n=new Node();
            while(pos-1!=0){
                node=node.next;
                pos--;
            }
            n=node.next;
            node.next=n.next;
            n=null;
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
