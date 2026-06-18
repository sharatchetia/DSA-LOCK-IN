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



// leetcode 70 (climbing stairs) (done by myself but not optimised) and wasnt able to submit
// class Solution {
//     public int climb(int n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return 1;
//         }
//         if(n==2){
//             return 2;
//         }

//         return climb(n-1)+climb(n-2);
        
//     }
//     public int climbStairs(int n) {
//         return climb(n);
//     }
// }



// leetcode 231 (power of two) (done by myself and submitted successfully)
// class Solution {
//     public boolean powerTwo(int n){
//         if(n<=0){
//             return false;
//         }
//         if(n==1){
//             return true;
//         }
//         if(n%2!=0){
//             return false;
//         }
//         return powerTwo(n/2);

//     }
//     public boolean isPowerOfTwo(int n) {
//         return powerTwo(n);
//     }
// }


// DAY 5 RECURSION SUMMARY

// Completed:
// ✅ Natural Sum (recursion)
// ✅ Factorial (parameter version and return version)
// ✅ Fibonacci Number
// ✅ Fibonacci Series (parameter-carrying recursion)
// ✅ Reverse String (iterative)
// ✅ Reverse String (recursive)
// ✅ Climbing Stairs (#70) - derived recursive relation myself
// ✅ Power of Two (#231)

// Major Recursion Lessons Learned:

// 1. Recursion Recipe
// - Find Base Case
// - Find Smaller Problem
// - Make Recursive Call

// 2. Factorial
// factorial(n) = n * factorial(n-1)

// Base Case:
// n == 0 → return 1

// 3. Fibonacci
// fib(n) = fib(n-1) + fib(n-2)

// Base Cases:
// fib(0) = 0
// fib(1) = 1

// Big realization:
// I do NOT need to start from fib(0) and build upward.
// I start from the problem I want and express it using smaller subproblems.

// 4. Return Recursion vs Parameter Recursion

// Return Recursion:
// return fib(n-1) + fib(n-2);

// Parameter Recursion:
// factorial(n, ans)
// printFib(a, b, n)

// I currently understand parameter recursion more naturally.

// 5. Reverse String Recursion

// Pattern:
// Current Work:
// swap(low, high)

// Smaller Problem:
// reverse(low+1, high-1)

// Base Case:
// low >= high

// 6. Climbing Stairs

// Important insight:
// To reach stair n:
// - Last move could come from n-1
// - Last move could come from n-2

// Relation:
// climb(n) = climb(n-1) + climb(n-2)

// Encountered Time Limit Exceeded.

// Learned:
// Correct solution ≠ Efficient solution

// This is my first exposure to why DP/Memoization exists.

// 7. Power of Two

// Important insight:
// Keep dividing by 2.

// Success:
// n == 1

// Failure:
// n <= 0
// or odd number (except 1)

// Relation:
// powerTwo(n/2)

// 8. First Exposure to Backtracking

// Started Subsets (#78).

// Key idea learned:
// For every element:

// Take it
// OR
// Don't take it

// Recursion becomes a choice tree rather than a smaller-number problem.

// Not comfortable with Subsets yet.
// Will revisit on Day 7 revision.

// Plan Changes:

// Day 6:
// - Complete missed String Pattern topics:
//   * Valid Palindrome (#125)
//   * First Unique Character (#387)
//   * Longest Common Prefix (#14)
//   * Longest Substring Without Repeating Characters (#3)
//   * Group Anagrams (#49)
// - Continue remaining recursion lecture if needed

// Day 7:
// - Full recursion revision
// - Re-solve:
//   * Factorial
//   * Fibonacci
//   * Reverse String
//   * Climbing Stairs
//   * Power of Two
// - Revisit Subsets (#78)

// Day 8:
// - Merge Sort
// - Quick Sort

// Current Status:
// Recursion no longer feels like magic.
// I can usually identify:
// 1. Base Case
// 2. Smaller Problem / Choice
// 3. Recursive Call

// Still weak in:
// - Backtracking
// - Subsets
// - Understanding recursion trees quickly
// ```





