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


// public class Day16{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null; 
//         }
//     }

//     static class LinkedList{
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
//         void printList(){
//             Node currNode = head;
//             while(currNode != null){
//                 System.out.println(currNode.data);
//                 currNode = currNode.next;
//             }
//         }

//     }
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.addFirst(10);
//         list.addFirst(20);
//         list.addFirst(30);

//         list.printList();
//     }
// }



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




// this is tommorrow

// learning addLast method


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
            while(currNode!=null){
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }

        void addLast(int data){
            if(head==null){
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            Node currNode = head;
            while(currNode.next != null){
                currNode.next = newNode;
            }
        }

        int size(){
            int count = 0;
            Node currNode = head;
            while(currNode != null){
                count++;
                currNode = currNode.next;
            }
            return count;
        }

        void add(int index, int data){
            if(index == 0){
                addFirst(data);
                return;
            }
            Node currNode = head;
            Node newNode = new Node(data);
            for(int i=0; i<index-1; i++){
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

        void removeFirst(){
            if(head == null){
                return;
            }
            head = head.next;
        }

        void removeLast(){
            if(head == null){
                return;
            }
            if(head.next == null){
                head = null;
                return;
            }
            Node currNode = head;
            while(currNode.next.next == null){
                currNode = currNode.next;
            }
            currNode.next = null;
        }
    }
}



// leet question 876 done by me (grateful to gpt)

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
//     public ListNode middleNode(ListNode head) {
//         ListNode currNode = head;
//         int count = 0;
//         if(currNode.next==null){
//             return currNode;
//         }
//         while(currNode != null){
//             currNode = currNode.next;
//             count++;
//         }
//         int half = count/2;
//         currNode = head;
//         for(int i=0; i<half; i++){
//             currNode = currNode.next;
//         }
//         return currNode;
//     }
// }




/*
===========================
DAY 16 - LINKED LIST NOTES
===========================

1. Linked List Basics
---------------------
- A Linked List is made of Nodes.
- Every Node contains:
    - data
    - next (reference to the next node)
- The last node always points to null.

Node Structure:
class Node{
    int data;
    Node next;
}

----------------------------------------------------

2. Head Pointer
---------------
- head stores the reference to the FIRST node.
- If head == null, the linked list is empty.
- Never move head while traversing the list.

Instead use:
Node currNode = head;

----------------------------------------------------

3. addFirst(data)
-----------------
Steps:
1. Create newNode.
2. If list is empty:
      head = newNode;
3. Otherwise:
      newNode.next = head;
      head = newNode;

Remember:
Always save the old connection first,
then update head.

----------------------------------------------------

4. printList()
--------------
Use a temporary pointer.

Node currNode = head;

while(currNode != null){
    print(currNode.data);
    currNode = currNode.next;
}

Reason:
Moving head destroys access to the list.

----------------------------------------------------

5. addLast(data)
----------------
If list is empty:
    addFirst(data);

Otherwise:
- Traverse until the LAST node.
- Stop when:
      currNode.next == null
- Attach:
      currNode.next = newNode;

----------------------------------------------------

6. size()
---------
Traverse the whole list.

count = 0;

while(currNode != null){
    count++;
    currNode = currNode.next;
}

return count;

----------------------------------------------------

7. add(index, data)
-------------------
Special case:
index == 0
-> addFirst(data)

Otherwise:

Move currNode to (index-1).

IMPORTANT POINTER ORDER:

newNode.next = currNode.next;
currNode.next = newNode;

Always save the old connection first,
then redirect the pointer.

----------------------------------------------------

8. removeFirst()
----------------
If list is empty:
    return;

Otherwise:

head = head.next;

Java's Garbage Collector removes
the old first node automatically.

----------------------------------------------------

9. removeLast()
---------------
Special cases:
- Empty list
- Only one node

Traverse until SECOND LAST node.

Condition:
while(currNode.next.next != null)

Then:

currNode.next = null;

----------------------------------------------------

10. Loop Patterns (VERY IMPORTANT)
----------------------------------

Visit EVERY node:
while(currNode != null)

Examples:
- print
- size
- search
- contains

----------------------------------

Stop at LAST node:
while(currNode.next != null)

Examples:
- addLast

----------------------------------

Stop at SECOND LAST node:
while(currNode.next.next != null)

Examples:
- removeLast

----------------------------------------------------

11. Pointer Difference
----------------------

currNode = currNode.next;

Moves YOUR pointer.
Linked list structure DOES NOT change.

----------------------------------

currNode.next = newNode;

Changes the linked list structure.

----------------------------------------------------

12. Golden Rule of Linked Lists
-------------------------------
Before changing any pointer,
ask yourself:

"Which arrow am I changing?"

Draw the nodes first,
then write the code.

----------------------------------------------------

13. LeetCode Solved
-------------------
1. Convert Binary Number in a Linked List to Integer
   Trick:
   ans = ans * 2 + currNode.val;

2. Middle of the Linked List
   Approach:
   - Count nodes
   - Traverse count/2 steps
   - Return currNode

----------------------------------------------------

14. Biggest Lesson
------------------
Don't memorize code.

Memorize the pointer diagrams.

If the picture is clear,
the Java code becomes easy.
*/



// also did some more learning from gpt instead of the video


/*
Linked List Interview Mindset

1. Draw the nodes.
2. Draw head.
3. Draw currNode/newNode/prev/etc.
4. Move the arrows on paper.
5. Convert the picture into Java.

Pictures first.
Code second.
*/