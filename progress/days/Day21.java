public class Day21 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size - 1){
                System.out.println("Queue full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear ++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int frontValue  = arr[front];

            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }

            rear --;

            if(rear == -1){
                front = -1;
            }

            return frontValue;
        }

        public static int peek(){
            if( isEmpty() ){
                System.out.println("queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    static class circularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        circularQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){

     
            if(isFull()){
                System.out.println("queue is fill");
                return;
            }
            
            if(front == -1){
            front = 0;
            }

            rear = (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];

            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front+1)%size;
            }

            return result;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    static class LinkedListQueue {

        static Node front;
        static Node rear;

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        public static boolean isEmpty(){
            return front == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front= rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = front.data;
            if(front.next == null){
                front = null;
                rear = null;
                return result;
            }
            
            front = front.next;
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return front.data;
        }


    }
    
}
