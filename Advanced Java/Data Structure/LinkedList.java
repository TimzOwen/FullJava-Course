
#Represent a node of the singly linked list  
class Node:  
    def __init__(self,data):  
        self.data = data;  
        self.next = None;  
          
class SinglyLinkedList:  
    #Represent the head and tail of the singly linked list  
    def __init__(self):  
        self.head = None;  
        self.tail = None;  
          
    #addNode() will add a new node to the list  
    def addNode(self, data):  
        #Create a new node  
        newNode = Node(data);  
          
//         #Checks if the list is empty  
//         if(self.head == None):  
//             #If list is empty, both head and tail will point to new node  
//             self.head = newNode;  
//             self.tail = newNode;  
        else:  
            #newNode will be added after tail such that tail's next will point to newNode  
            self.tail.next = newNode;  
            #newNode will become new tail of the list  
            self.tail = newNode;  
              
    #display() will display all the nodes present in the list  
    def display(self):  
        #Node current will point to head  
        current = self.head;  
          
        if(self.head == None):  
            print("List is empty");  
            return;  
        print("Nodes of singly linked list: ");  
        while(current != None):  
            #Prints each node by incrementing pointer  
            print(current.data),  
            current = current.next;  
   
sList = SinglyLinkedList();  
          
#Add nodes to the list  
sList.addNode(1);  
sList.addNode(2);  
sList.addNode(3);  
sList.addNode(4);  
   
#Displays the nodes present in the list  
sList.display();  
Output:

 Nodes of singly linked list: 
1 2 3 4
C
#include <stdio.h>  
#include <stdlib.h>  
//Represent a node of singly linked list  
struct node{  
    int data;  
    struct node *next;  
};      
   
//Represent the head and tail of the singly linked list  
struct node *head, *tail = NULL;  
   
//addNode() will add a new node to the list  
void addNode(int data) {  
    //Create a new node  
    struct node *newNode = (struct node*)malloc(sizeof(struct node));  
    newNode->data = data;  
    newNode->next = NULL;  
      
    //Checks if the list is empty  
    if(head == NULL) {  
        //If list is empty, both head and tail will point to new node  
        head = newNode;  
        tail = newNode;  
    }  
    else {  
        //newNode will be added after tail such that tail's next will point to newNode  
        tail->next = newNode;  
        //newNode will become new tail of the list  
        tail = newNode;  
    }  
}  
   
//display() will display all the nodes present in the list  
void display() {  
    //Node current will point to head  
    struct node *current = head;  
      
    if(head == NULL) {  
        printf("List is empty\n");  
        return;  
    }  
    printf("Nodes of singly linked list: \n");  
    while(current != NULL) {  
        //Prints each node by incrementing pointer  
        printf("%d ", current->data);  
        current = current->next;  
    }  
    printf("\n");  
}  
      
int main()  
{  
    //Add nodes to the list  
    addNode(1);  
    addNode(2);  
    addNode(3);  
    addNode(4);  
      
    //Displays the nodes present in the list  
    display();  
   
    return 0;  
}  
Output:

Nodes of singly linked list: 
1 2 3 4
JAVA
public class SinglyLinkedList {  
      
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
   
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
      
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
          
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    }  
      
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
          
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of singly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        SinglyLinkedList sList = new SinglyLinkedList();  
          
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
          
        //Displays the nodes present in the list  
        sList.display();  
    }  
}  
Output:

Nodes of singly linked list: 
1 2 3 4
C#
 using System;  
                      
public class CreateList  
{  
    //Represent a node of the singly linked list  
    public class Node<T>{  
        public T data;  
        public Node<T> next;  
          
        public Node(T value) {  
            data = value;  
            next = null;  
        }  
    }  
          
    public class SinglyLinkedList<T>{  
        //Represent the head and tail of the singly linked list  
        public Node<T> head = null;               
         public Node<T> tail = null;  
      
        //addNode() will add a new node to the list  
        public void addNode(T data) {  
            //Create a new node  
            Node<T> newNode = new Node<T>(data);  
   
            //Checks if the list is empty  
            if(head == null) {  
                //If list is empty, both head and tail will point to new node  
                head = newNode;  
                tail = newNode;  
            }  
            else {  
                //newNode will be added after tail such that tail's next will point to newNode  
                tail.next = newNode;  
                //newNode will become new tail of the list  
                tail = newNode;  
            }  
        }  
   
        //display() will display all the nodes present in the list  
        public void display() {  
            //Node current will point to head  
            Node<T> current = head;  
              
            if(head == null) {  
                Console.WriteLine("List is empty");  
                return;  
            }  
            Console.WriteLine("Nodes of singly linked list: ");  
            while(current != null) {  
                //Prints each node by incrementing pointer  
                Console.Write(current.data + " ");  
                current = current.next;  
            }  
            Console.WriteLine();  
        }  
    }  
      
    public static void Main()  
    {  
        SinglyLinkedList<int> sList = new SinglyLinkedList<int>();  
          
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
          
        //Displays the nodes present in the list  
        sList.display();      
    }  
}  
