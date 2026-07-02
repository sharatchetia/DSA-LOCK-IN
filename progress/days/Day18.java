// linked list important questions. 


//leet #19 almost fully done by myself. got confused and made silly mistaked like making nodes and for loop 

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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int count = 0; 
//         ListNode currNode = head;
//         while(currNode != null){
//             count++;
//             currNode = currNode.next;
//         }
//         currNode = head;
//         int delIndex = count - n;

//         if(delIndex==0){
//             return head.next;
//         }

//         for(int i=0; i<delIndex-1; i++){
//             currNode = currNode.next;
//         }
        
//         currNode.next = currNode.next.next;
//         return head;
//     }
// }




// leetcode 234. almost done myself but took help of gpt. (this algo is mine so not optimal though. will learn the optimal later)

// class Solution {
//     public int size(ListNode head){
//         ListNode currNode = head;
//         int count = 0;

//         while(currNode != null){
//             count++;
//             currNode = currNode.next;
//         }

//         return count;
//     }

//     public ListNode middle(ListNode head){
//         int half = size(head) / 2;
//         ListNode currNode = head;

//         for(int i = 0; i < half; i++){
//             currNode = currNode.next;
//         }

//         return currNode;
//     }

//     public ListNode reverse(ListNode head){

//         if(head == null || head.next == null){
//             return head;
//         }

//         ListNode prevNode = head;
//         ListNode currNode = head.next;

//         while(currNode != null){
//             ListNode nextNode = currNode.next;
//             currNode.next = prevNode;

//             prevNode = currNode;
//             currNode = nextNode;
//         }

//         head.next = null;

//         return prevNode;
//     }

//     public boolean isPalindrome(ListNode head) {

//         if(head == null || head.next == null){
//             return true;
//         }

//         int len = size(head);

//         ListNode mid = middle(head);

//         ListNode firstHalf = head;
//         ListNode secondHalf;

//         if(len % 2 == 0){
//             secondHalf = reverse(mid);
//         }
//         else{
//             secondHalf = reverse(mid.next);
//         }

//         while(secondHalf != null){

//             if(firstHalf.val != secondHalf.val){
//                 return false;
//             }

//             firstHalf = firstHalf.next;
//             secondHalf = secondHalf.next;
//         }

//         return true;
//     }
// }