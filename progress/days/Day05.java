// recursion apna college class 1 (one shot)

// learned base case 
// understood call stack 
// understoon stack overflow


// public class Day05 {
//     public static void printNums(int n) {
//         if(n>5){
//             return;
//         }
//         System.out.println(n);
//         printNums(n+1);
//     }
//     public static void main(String[] args) {
//         printNums(1);
//     }
// }



// public class Day05 {
//     public static void naturalSum(int i, int n, int sum) {
//         if(i>n){
//             System.out.println(sum);
//             return;
//         }

//         sum += i;
//         naturalSum(i+1, n, sum);
       
//     }
//     public static void main(String[] args) {
//         naturalSum(1, 2, 0);
//     }
// }


// factorial but stupid version
// public class Day05 {
//     public static void factorial(int n, int fact) {

//         if(n==0){
//             System.out.println(fact);
//             return;
//         }
//         fact *= n;
//         factorial(n-1, fact);
       
//     }
//     public static void main(String[] args) {
//         factorial(3, 1);
//     }
// }



// factorial but better version
// public class Day05 {
//     public static int factorial(int n) {

//         if(n==0){
//             return 1;

//         }
//         return n * factorial(n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(3));
//     }
// }


//fibonacci series
// public class Day05 {
//     public static int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }

//         return fib(n-1)+fib(n-2);
//     }
//     public static void main(String[] args) {
        
//         for(int i=0; i<=5; i++){
//              System.out.print(fib(i)+" ");
//         }
//     }
// }


//did two pointers of #344 reverse string problem to understand the logic 
//same almost done by myself

// class Solution {
//     public void reverseString(char[] s) {
//         int low=0;
//         int high=s.length-1;

//         while(low<high){
//             char temp = s[low];
//             s[low] = s[high];
//             s[high]= temp;
//             low++;
//             high--;
//         }

//     }
// }



//leetcode 344 (reverse string) (alsmost full donr by myself)
// class Solution {
//     public void rev(int low, int high, char[] s){
//         if(low>=high){
//             return;
//         }
//         char temp = s[low];
//         s[low] = s[high];
//         s[high]= temp;
//         rev(low+1, high-1,s);
//     }
//     public void reverseString(char[] s) {
//         rev(0, s.length-1, s);
//     }
// }




