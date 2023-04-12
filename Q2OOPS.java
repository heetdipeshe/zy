#include<iostream>

using namespace std;

class Node{

    public :
        int data;
        Node *next;

    Node(int data) {
        this->data = data;
        this->next = NULL;
    }

    ~Node() {
        int deletedD = this->data;
        if(this->next != NULL){
            delete next;
            this->next = NULL;
        }
        cout<<"MEMORY FREE"<<endl;
    }
};

void insertBg(Node* &head, int data){

    Node* a = new Node(data);

    a->next = head;
    head = a;
}

void insertEn(Node* &head, int data) {

    Node* a = new Node(data);
    Node* iterate = head;
   
    while(iterate->next != NULL) {
        iterate = iterate->next;
    }

    iterate->next = a;
}

void insertIn(Node* &head, int index, int data){

    if(index == 1){
        insertBg(head,data);
        return;
    }
   
    Node* a = head;
    int c=1;
   
    while(c < index-1){
        a = a->next;
        c++;
    }
   
    if(a->next == NULL){
        insertEn(head,data);
        return;
    }
   
    Node*  newNode = new Node(data);

    newNode->next = a->next;
    a->next = newNode;
   
}

void deleteBg(Node* &head){

Node * a = head;
head = head->next;

a->next = NULL;
delete a;
}

void deleteEn(Node* &head) {
    Node* bd = head;
    Node* ad = head->next;

    while(ad->next != NULL) {
        ad = ad->next;
        bd = bd->next;
    }

    bd->next = NULL;
    delete ad;
}

void deleteIn(Node* &head, int index) {
    Node* a = head;

    int i = 1;

    while(i != index - 1) {
        a = a->next;
        i++;
    }

    Node* Delete = a->next;

    a->next = Delete->next;
   
    Delete->next = NULL;
    delete Delete;
}

void printLinkedList(Node* &head){
    Node* a = head;

    while(a != NULL){
        cout<<a->data<< " -> ";
        a = a->next;
    }
    cout<<"NULL"<<endl;
}

int main() {

    Node* head = NULL;

    printLinkedList(head);

    insertBg(head, 1);
    printLinkedList(head);

    insertBg(head, 0);
    printLinkedList(head);

    insertIn(head, 1, 2);
    printLinkedList(head);
   
   
    insertEn(head, 9);
    printLinkedList(head);
   
    deleteIn(head, 2);
    printLinkedList(head);
   
    deleteEn(head);
    printLinkedList(head);
   
    deleteBg(head);
    printLinkedList(head);


}
