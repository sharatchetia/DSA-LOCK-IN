import java.util.*;

// for linked list (stack implementation)
// public class Day20{
//     Node head;
//     class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     class stack{
//         public boolean isEmpty(){
//             return head == null;
//         }

//         public void push(int data){
//             Node newNode = new Node(data);
//             newNode.next = head;
//             head = newNode;
//         }

//         int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
// }




// for ArrayList (stack implementation)


// public class Day20{
//     public class Stack{
//         ArrayList<Integer> list = new ArrayList<>();
//         public boolean isEmpty(){
//             return list.size()==0;
//         }
//         public void push(int data){
//             list.add(data);
//         }
//         public int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.remove(list.size()-1);
//             return top;
//         }
//         public int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String[] args) {
        
//     }
// }



// doing push at bottom and reverse using stack 


public class Day20{
    public static void pushAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);

        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        reverse(stack);
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        
    }
}





// will do leet questions tommorrow