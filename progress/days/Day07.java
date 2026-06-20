// revision day 

// today no new topics or lectures
// practicing leet questions previously done

import java.util.*;

class Solution {
    public int[] runningSum(int[] nums) {
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        return prefix;
    }
}



class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}





class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }else{
                map.put(nums[i],i);
            }
            
        }
        return new int[]{};
    }
}




// for fun
class Solution3 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}



class Solution4 {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int digit = 0;
        while(x>0){
            digit = x%10;
            rev = rev*10+digit;
            x=x/10;
        }
        if(rev==org){
            return true;
        }
        return false;
    }
}




class Solution5 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int n : nums){
            if(map.get(n)>nums.length/2){
                return n;
            }
        }
        return -1; 
    }
}



class Solution6 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)||map.get(ch)==0){
                return ch;
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }
        return 0;
    }
}

class Solution7 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        int temp = 0;
        while(right<nums.length){
            if(nums[right]!=0){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        
    }
}



class Solution8 {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }
        return true;
    }
}



class Solution9 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int arr[] = new int[nums.length];
        int pos = nums.length-1;

        while(left<=right){
            int sqleft = nums[left]*nums[left];
            int sqright = nums[right]*nums[right];

            if(sqleft > sqright){
                arr[pos] = sqleft;
                left++;

            }else{
                arr[pos] = sqright;
                right--;
            }
            pos--;
        }
        return arr;
    }
}




class Solution10 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length()-1;

        while(low<high){
            if(!Character.isLetterOrDigit(s.charAt(low))){
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(high))){
                high--;
                continue;
            }
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}



class Solution11 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]== target){
                return mid;
            }else if(target<nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}

// skipped the other problems of binary search as they are basically the same


class Solution12 {
    public int fibn(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibn(n-1)+fibn(n-2);
    }
    public int fib(int n) {
        return fibn(n);
    }
}


class Solution13 {
    public boolean powerTwo(int n){
        if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        return powerTwo(n/2);
    }
    public boolean isPowerOfTwo(int n) {
        return powerTwo(n);
    }
}



class Solution14 {
    public void rev(char[] s){
        int low = 0;
        int high = s.length-1;
        char temp = 0;

        while(low<high){
            temp = s[low];
            s[low]= s[high];
            s[high]= temp;

            low++;
            high--;
        }
        return;
    }
    public void reverseString(char[] s) {
        rev(s);
    }
}


// ```text
// DAY 7 REVISION COMPLETED

// Topics Revised
// --------------

// Arrays / Prefix Sum
// - Running Sum of 1D Array (#1480)
// - Remembered:
//   prefix[i] = prefix[i-1] + nums[i]
// - prefix[0] must be initialized first.

// HashSet
// -------
// - Contains Duplicate (#217)
// - Pattern:
//   Have I seen this value before?
// - HashSet used when only existence matters.

// HashMap
// -------
// 1. Two Sum (#1)
// - Remembered Number -> Index pattern.
// - req = target - nums[i]
// - Check if required number already exists in map.
// - Return immediately when found.

// 2. Majority Element (#169)
// - Frequency counting pattern.
// - Count frequencies.
// - Return element whose frequency > n/2.

// 3. Find the Difference (#389)
// - Initially considered HashSet.
// - Realized duplicates matter.
// - Used HashMap frequencies.
// - Important insight:
//   Missing character OR exhausted frequency identifies answer.

// 4. Valid Anagram (#242)
// - Count frequencies in s.
// - Traverse t and decrease frequencies.
// - Key condition:
//   if(!map.containsKey(ch) || map.get(ch)==0)
//       return false;
// - Important realization:
//   Frequency 0 means all copies have already been used.

// Two Pointers
// ------------
// 1. Move Zeroes (#283)
// - Re-understood read pointer vs write pointer.
// - right = scanner
// - left = next position for non-zero element
// - Important realization:
//   right++ happens every iteration because it is outside the if block.

// 2. Sorted Squares (#977)
// - Compare squared values at both ends.
// - Larger square goes into arr[pos].
// - Move pointer that produced larger square.
// - Fill result array from back to front.

// String Problems
// ---------------
// 1. Valid Palindrome (#125)
// - Convert to lowercase.
// - Skip non-alphanumeric characters.
// - Compare valid characters using two pointers.
// - Relearned:
//   Character.isLetterOrDigit()
// - Important:
//   continue skips remaining code in current iteration.

// 2. Reverse String (#344)
// - Recalled iterative two-pointer solution.
// - Swap ends and move inward.
// - Minor syntax mistakes only:
//   char temp
//   void methods do not return values.

// Binary Search
// -------------
// 1. Binary Search (#704)
// - Solved from memory.
// - Exact Search pattern:
//   while(low <= high)
// - Remembered safer midpoint:
//   low + (high - low) / 2

// 2. Search Insert Position (#35)
// 3. First Bad Version (#278)
// - Skipped during revision.
// - Core concept already understood:
//   Find first position where a condition becomes true.

// Major Binary Search Insight
// ---------------------------
// Search Insert Position
// Lower Bound
// Upper Bound
// First Bad Version

// are all variations of:

// "Find the first position where a condition becomes true."

// Recursion
// ---------
// 1. Fibonacci (#509)
// - Solved from memory.
// - Recurrence:
//   fib(n) = fib(n-1) + fib(n-2)

// 2. Power of Two (#231)
// - Solved after debugging.
// - Important lesson:
//   Success base cases must come before broader failure cases.

// Correct order:

// if(n == 1) return true;
// if(n <= 0 || n % 2 != 0) return false;

// 3. Reverse String (recursive concept)
// - Understand:
//   Current work = swap ends
//   Smaller problem = reverse middle section

// Recursion Understanding
// ------------------------
// Current Recipe:

// 1. Base Case
// 2. Smaller Problem
// 3. Recursive Call

// Important realization:
// Do not build from the smallest case upward.

// Start from the problem you want.

// Example:

// fib(5)
// =
// fib(4) + fib(3)

// Recursion solves the smaller problems.

// Java / Control Flow Lessons
// ---------------------------
// - return exits the entire function.
// - break exits the current loop.
// - continue skips remaining code in current iteration.

// Many mistakes today were implementation mistakes,
// not algorithm mistakes.

// Backtracking / Subsets
// ----------------------
// - Understand decision tree idea:

//   Take
//   OR
//   Don't Take

// - Not yet comfortable with:
//   add()
//   remove()
//   state undoing
//   backtracking

// Decision:
// Postpone Subsets (#78) until Backtracking Day.

// Need proper backtracking lesson first.

// Overall Assessment
// ------------------
// Strong:
// ✓ HashMap Frequency Pattern
// ✓ HashSet Usage
// ✓ Two Pointers
// ✓ Binary Search
// ✓ Basic Recursion

// Needs More Work:
// ⚠ Backtracking
// ⚠ Subsets
// ⚠ Recursion Trees
// ⚠ State Undoing

// Biggest Progress Observed
// -------------------------
// A month ago:
// - Unsure what data structure to use.

// Now:
// - Usually identify the correct pattern first.
// - Most mistakes are syntax, control flow, or implementation details.
// - HashMap frequency pattern feels much more natural.

// Day 8 Plan
// ----------
// - Merge Sort
// - Quick Sort

// Day 9 Plan
// ----------
// - Learn Backtracking from scratch
// - Revisit Subsets (#78)
// ```

// This is a very solid Day 7 revision. You recalled most core patterns from memory, which is a stronger signal than solving a few new Easy problems.
