// Day 1: Array introduction revision

import java.util.*;

// public class day1{
//     public static void main(String args[]){

//         int marks[] = {10,20,30};

//         for (int i = 0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


//using scanner 

// public class day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int marks[] =  new int[3];
//         for( int i = 0; i<3; i++){
//             marks[i] = sc.nextInt();
//         }

//         for( int i = 0; i<3; i++){
//             System.out.println(marks[i]);
//         }

//         sc.close();
//     }
    
// }



// linear search first time. find the index of a number in an array



// public class day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[] = new int[size];

//         for (int i=0; i<size; i++){
//             marks[i]= sc.nextInt();
//         }

//         int number = sc.nextInt();

//         for (int i = 0; i<marks.length; i++){
//             if(marks[i]==number){
//                 System.out.println(i);
//             }
//         }

//         sc.close();
//     }
    
// }



// 2d array question: find a number index from a matrix of 2d array

// public class day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         for( int i=0; i<rows; i++){
//             for (int j = 0; j<cols; j++){
//                 numbers[i][j]= sc.nextInt();
//             }
//         }

//         int find = sc.nextInt();

//         for( int i=0; i<rows; i++){
//             for (int j = 0; j<cols; j++){
//                 if(numbers[i][j] == find){
//                     System.out.println(i +" "+ j);
//                 }
//             }
//         }
//         sc.close();
//     }
// }




// string reversal


// public class day1{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");

//         for (int i = 0; i<sb.length()/2; i++){
//             int front = i;
//             int back = sb.length()-1-i;

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);
//     }
// }



//leetcode


//contains duplicate question (did not submit as time exceeded)

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for (int i = 0; i<nums.length; i++){
//             for (int j = i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             } 
//         }
//         return false;
//     }
// }


//two sum (brute force approach)

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(target == nums[i]+nums[j]){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }


// also did the array reversal 

//valid anagram was not done as all these questions required hashmap but not learned yet and will do on day 2.
//rotate array not done as i m not confident. understood the working
//Day 1

// Solved:
// - Reverse String
// - Two Sum (brute force)
// - Contains Duplicate (brute force)

// Partially Understood:
// - Rotate Array

// Need To Revisit:
// - Valid Anagram
// - HashMap
// - HashSet

// Key Learning:
// Brute force solutions are useful but many array/string problems are optimized using HashMap or HashSet.
