import java.util.*;
// linked list 

// making the required linked list stuff like classes 


// public class Day16{
//     static class Node {
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {
//         Node first = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         first.next = second;
//         second.next = third;

//         System.out.println(first.data);
//         System.out.println(first.next.data);
//         System.out.println(first.next.next.data);
//     }
    
// }



// learning addFirst method creation
// public class Day16 {
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;     
//         }
//     }

//     static class LinkedList {
//         Node head;
//         void addFirst(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.addFirst(10);
//         list.addFirst(20);
//         list.addFirst(30);

//         System.out.println(list.head.data);
//     }

// }



// learning print() method


public class Day16{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null; 
        }
    }

    static class LinkedList{
        Node head;
        void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        void printList(){
            Node currNode = head;
            while(currNode != null){
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.printList();
    }
}



// more part left of linked list so will do tommorrow. 

//leetcode 1290 (tried but was not done properly by me)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// class Solution {
//     public int getDecimalValue(ListNode head) {
//         ListNode currNode = head;
//         int ans = 0;

//         while(currNode != null){
//             ans = ans * 2 + currNode.val;
//             currNode = currNode.next;
//         }

//         return ans;
//     }
// }




// no handwritten notes for today atleast. maybe will give tommorrow