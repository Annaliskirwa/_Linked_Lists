/**
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
**/

class MyLinkedList {
//     create the node class
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(-1);
        size = 0;
        
    }
    
    public int get(int index) {
       if(index >= size || index < 0){
           return -1;
       } 
        int count = 0;
        Node curr = head;
        while(count <= index){
            curr = curr.next;
            count++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if(index < 0) index = 0;
        
        int count = 0;
        Node curr = head;
        while(count < index){
            curr = curr.next;
            count ++;
        }
        Node toAdd = new Node(val);
        toAdd.next = curr.next;
        curr.next = toAdd;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size){
            return;
        }
        int count = 0;
        Node curr = head;
        while(count < index){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
