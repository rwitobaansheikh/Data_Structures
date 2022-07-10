class Node:
    def __init__(self,data=None):
        self.data=data
        self.next=None

class LinkedList_implementation:
    def __init__(self):
        self.head=None
        
    def insert(self,data):
        node=Node()
        node.data=data
        node.next=None
        if self.head==None:
            self.head=node
        else:
            new_node=self.head
            while new_node.next is not None:
                new_node=new_node.next
            new_node.next=node
            
    def insertAt(self,pos,data):
        if(pos==0):
            self.insertAtbeg(data)
        else:
            node=Node()
            node.data=data
            new_node=self.head
            c=pos-1
            while c>0:
                new_node=new_node.next
                c-=1
            node.next=new_node.next
            new_node.next=node
            
    def insertAtbeg(self,data):
        node=Node()
        node.data=data
        node.next=self.head
        self.head=node
                

    def show(self):
        node=self.head
        print("The current linked list is as follows")
        while node.next is not None:
            print(node.data,end=" ")
            node=node.next
        print(node.data)
        

def main():
    ll=LinkedList_implementation()
    n=int(input("Enter number of elements in linked list: "))
    print("Enter list elements\n")
    for i in range(n):
        ll.insert(int(input()))
        
    ll.show()
    
    ll.insertAtbeg(int(input("Enter element to be inserted at beginning of list: ")))
    
    ll.show()
    
    ll.insertAt(int(input("Enter position where element is to be inserted.")),int(input("Enter element to be inserted.")))
    
    ll.show()

if __name__=="__main__":
    main()