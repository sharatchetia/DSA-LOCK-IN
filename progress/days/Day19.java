// leet 707 medium


class MyLinkedList {
    Node head;
    int size;
    public class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        Node currNode = head;
        if(head == null){
            return -1;
        }
        if(index >= size || index < 0){
            return -1;
        }
        for(int i=0; i<index; i++){
            currNode = currNode.next;
        }
        return currNode.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode; 
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node currNode = head;
        Node newNode = new Node(val);
        if(head == null){
            addAtHead(val);
            return;
        }
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index>size){
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node currNode = head;
        Node newNode = new Node(val);
        for(int i=0; i<index-1; i++){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        Node currNode = head;
        if(head == null){
            return;
        }
        if(index >= size || index < 0){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        for(int i=0; i<index-1; i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
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





//slacked off today. was supposed to complete stack today but didnt 


// so to make it up just did a leetcode by myself. just some little help of gpt though for edge cases
