// reverse linked list 



public class Day17 {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList{
        Node head;

        // reversing linked list the normal iterative way
        void reverseList(){
            Node prevNode = head;
            Node currNode = head.next;

            if(head == null || head.next == null){
                return;
            }
            
            while(currNode != null){
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                // update the pointer values
                prevNode = currNode;
                currNode = nextNode;
            }
            // to remove the double arrow from the first element
            head.next = null;
            head = prevNode;
        }

        // recursive approach for reversing a string
        Node recursiveReverse(Node head){
            if(head == null || head.next == null){
                return head;
            }

            Node newHead = recursiveReverse(head.next);

            head.next.next = head;
            head.next = null;

            return newHead;
        }
    }
}



// did leetcode 206 problem as well 
