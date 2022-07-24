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
        
    def deleteAtStart(self):
        self.head=self.head.next
    
    def delete(self):
        if self.head.next is None:
            self.deleteAtStart()
        else:
            node=self.head
            c=0
            while node.next is not None:
                node=node.next
                c+=1
            self.deleteAtpos(c)
                
    def deleteAtpos(self, pos):
        if pos==0:
            self.deleteAtStart()
        else:
            node=self.head
            n=Node()
            while pos-1 is not 0:
                node=node.next
                pos-=1
            n=node.next
            node.next=n.next
            n=None
                

    def show(self):
        node=self.head
        print("The current linked list is as follows")
        while node.next is not None:
            print(node.data,end=" ")
            node=node.next
        print(node.data)
        

def main():
    ll=LinkedList_implementation()
    choice=-1
    while True:
        print("\t\tMenu")
        print("1. Insert elements in list")
        print("2. Insert element at start of list")
        print("3. Insert element at a position in list")
        print("4. Delete element at start of list")
        print("5. Delete element at end of list")
        print("6. Delete element at a position in list")
        print("7. Display list")
        print("0. Enter 0 to Exit")
        choice=int(input("\nEnter choice"))
        if choice is 1:
            n=int(input("Enter number of elements in linked list: "))
            print("Enter list elements\n")
            for i in range(n):
                ll.insert(int(input()))
        elif choice is 2:
            ll.insertAtbeg(int(input("Enter element to be inserted at beginning of list: ")))
        elif choice is 3:
            ll.insertAt(int(input("Enter position where element is to be inserted.")),int(input("Enter element to be inserted.")))
        elif choice is 4:
            ll.deleteAtStart()
        elif choice is 5:
            ll.delete()
        elif choice is 6:
            ll.deleteAtpos(int(input("Enter position in list where element is to be deleted: ")))
        elif choice is 7:
            ll.show()
        elif choice is 0:
            break
        else:
            print("Wrong choice entered. \nPlease try again!")

if __name__=="__main__":
    main()