// before doing binary search i practice HashMap and HashSet
// did the two sum and contains duplicate again myself
// did contains duplicate by hashmap instead of HashSet for some reasons


import java.util.*;

class Solution {
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


class something {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}



class solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}


// binary search algorithm

public class Day04{
    public static int binarySearch(int[] a, int key){
        int l=0, h=a.length-1, mid=0;

        while(l<=h){
            mid = (l+h)/2;
            if(key == a[mid]){
                return mid;
            }else if(key < a[mid]){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3,5,6,8,12,15,16,19,21};
        int key = 13;
        System.out.println(binarySearch(a, key));
    }
}

// tip - if the array is not sorted then use linear search as time complexity is O(n)
// while binary search is quicker as time complecity is O(log n) but if the array is not sorted then sorting takes
// O(n log n) and if we add that up with binary search then it becomes O(n log n + log n) which is not better than O(n)


//leetcode binary search #704 also done 

//leetcode #35 search insert position

class Solution6 {
    public int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length-1, mid=0;

        while(l<=h){
            mid = (l+h)/2;

            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}



/*
LeetCode 278 - First Bad Version

Why this problem is tricky:

This is not a normal Binary Search problem where we search for an exact target.
Instead, we are searching for the FIRST position where a condition becomes true.

Think of versions as:

Version: 1 2 3 4 5 6 7 8
Status : G G G B B B B B

or

false false false true true true true true

The goal is to find the first 'true'.

Key Insight:

If isBadVersion(mid) == true:

```
We CANNOT return immediately.
```

Because mid is bad, but there may be an earlier bad version.

Example:

1 2 3 4 5 6 7 8
G G G B B B B B

If mid = 6:

isBadVersion(6) == true

Version 6 is bad,
but version 4 is the first bad version.

Therefore continue searching on the left side.

Update:

```
high = mid;
```

NOT:

```
high = mid - 1;
```

because mid itself may be the answer.

---

If isBadVersion(mid) == false:

Version mid is still good.

Therefore the first bad version must be on the right side.

Update:

```
low = mid + 1;
```

---

Why use:

```
while(low < high)
```

instead of:

```
while(low <= high)
```

Eventually:

```
low == high
```

At this point only one possible answer remains.

The loop stops and:

```
return low;
```

---

Why return low?

The problem guarantees that a bad version exists.

Unlike normal Binary Search:

```
return -1;
```

is not needed.

After the search finishes:

```
low == high
```

and both point to the first bad version.

---

Overflow Bug:

Avoid:

```
int mid = (low + high) / 2;
```

because low + high may exceed Integer limit.

Use:

```
int mid = low + (high - low) / 2;
```

This computes the same middle value safely.

Main Lesson:

Binary Search is NOT only for arrays.

Binary Search can be used whenever:

1. Search space is ordered.
2. We can eliminate half the search space.
3. We are searching for a boundary.

First Bad Version is the first Binary Search problem that teaches
"find the boundary" instead of "find the value".
*/

//recursive way

class Solution7 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int low, int high){
        if(low>high){
            return low;
        }
        int mid = (low+high)/2;
        if(target==nums[mid]){
            return mid;
        }else if(target<nums[mid]){
            return binarySearch(nums, target, low, mid-1);
        }else{
            return binarySearch(nums, target, mid+1, high);
        }
    }
}


// recursive binary search
class Solution0 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int low, int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;

        if(target == nums[mid]){
            return mid;
        }else if(target < nums[mid]){
            return binarySearch(nums, target, low, mid-1);
        }else{
            return binarySearch(nums, target, mid+1, high);
        }
    }
}


// lower bound practice 

class Solution10 {
    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}

//upper bound

class Solution11 {
    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}



// leetcode 34 using both upper and lower bound

class Solution12 {

    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0){
            return new int[]{-1,-1};
        }

        int first = lowerBound(nums, target, 0, nums.length);
        int upper = upperBound(nums, target, 0, nums.length);

        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }

        return new int[]{first, upper - 1};
    }

    public int lowerBound(int[] nums, int target, int low, int high){

        while(low < high){

            int mid = low + (high - low) / 2;

            if(nums[mid] >= target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int upperBound(int[] nums, int target, int low, int high){

        while(low < high){

            int mid = low + (high - low) / 2;

            if(nums[mid] > target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}




