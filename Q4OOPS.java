import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {

    Node head;

    public void inserte(int data){

        Node nNode = new Node(data);

        if(head == null){
            head = nNode;
            return;
        }

        Node iterate = head;

        while(iterate.next != null){
            iterate = iterate.next;
        }
        iterate.next = nNode;
    }

    public void printLinkedList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node iterate = head;
        while(iterate != null){
            System.out.print(iterate.data + " -> ");
            iterate =iterate.next;
        }
        System.out.println("NULL");

    }

}

public class Question4 {
    
    public static void main(String args[]) {
        
    LinkedList list = new LinkedList();
    Random rd = new Random();
    
    for(int i=0; i<100; i++) {
        list.inserte(rd.nextInt(51));
    }
    
    System.out.println("A Linked List of size 100 with range 1-50 is generated");
    list.printLinkedList();
    
    Node a = list.head;
    Node b = null;
    
    while(a != null) 
    {
        
        if(a.data > 25) 
        {
            
            if(b == null) 
            {
                list.head = list.head.next;
                a = list.head;
            }
            
            else 
            {
                b.next = a.next;
                a = a.next;
            }
        }
        
        else 
        {
            b = a;
            a = a.next;
        }
        
    }
    System.out.println("Linked list after deletion of all nodes over 25.");
    list.printLinkedList();
    }
}