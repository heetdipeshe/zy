import java.util.*;

class LinkedL
{
  Node head;

  class Node
  {
    int data;
    Node next;

      Node (int x)
    {
      data = x;
      next = null;
    }
  }
  public void searchNode (int data)
  {
    Node current = head;
    int i = 1;
    int flag = 0;


    if (head == null)
      {
System.out.println ("List is empty");
      }
    else
      {
while (current != null)
 {
   if (current.data == data)
     {
flag = 1;
break;
     }
   i++;
   current = current.next;
 }
      }
    if (flag==1)
      System.out.println ("Element is present in the list at the position : " + i);
    else
      System.out.println ("Element is not present in the list");
  }

   public void inserte(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node a = head;

        while(a.next != null){
            a = a.next;
        }
        a.next = newNode;
    }
}
public class Main
{
  public static void main (String args[])
  {
    LinkedL ll = new LinkedL();

      ll.inserte(1);
      ll.inserte (5);
      ll.inserte(7);
      ll.inserte(3);
      ll.inserte(8);
      ll.inserte(2);
      ll.inserte(3);
      ll.searchNode(5);
  }
}