class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }
}


class Linkedl {

    Node head;

    public void insertb(char data){

        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void inserte(char data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node iterate = head;

        while(iterate.next != null){
            iterate = iterate.next;
        }
        iterate.next = newNode;
    }

    public void inserti(char data, int index) {


        if (index == 1) {
            insertb(data);
            return;
        }

        Node temp = head;
        int i = 1;
        Node newNode = new Node(data);

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp.next == null) {
            temp.next = newNode;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void deleteb(){

        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void deletee(){

        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;
    }

    public void deletei(int index) {

        if(head == null) {
            deleteb();
            return;
        }

        Node temp = head;
        int i = 1;

        while(i != index - 1) {
            temp = temp.next;
            i++;
        }

        if(temp.next == null) {
            deletee();
            return;
        }

        temp.next = (temp.next).next;
    }

    public void printLinkedL(){

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

public class Q2 {

    public static void main(String[] args) {

        Linkedl list = new Linkedl();

        list.printLinkedL();

        list.insertb('e');
        list.printLinkedL();

        list.insertb('h');
        list.printLinkedL();

        list.inserte('t');
        list.printLinkedL();

        list.inserti('e', 3);
        list.printLinkedL();

        list.deletei(2);
        list.printLinkedL();

        list.deletee();
        list.printLinkedL();

       
    }
}
