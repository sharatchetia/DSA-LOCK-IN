// // today no lectures are seen
// // gpt told me to see array inroduction video again ( not required for now )
// // check prefix sum video ( not on the playlist )
// // two pointers ( not on playlist ) 



// // prefix sum
// // eg arr = {2,4,1,3,5}
// // if asked to find sum of 2nd to 4th element ( 4 + 1 + 3 ) = 8

// // process or formula of how its done
// public class Day03 {
//     public static void main(String[] args) {
//         int arr[] = {2,4,1,3,5};

//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];

//         for(int i=1; i<arr.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//     }
// }


// //leetcode question runningSum #1480

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int prefix[] = new int[nums.length];

//         prefix[0]= nums[0];

//         for(int i=1; i<nums.length; i++){
//             prefix[i] = prefix[i-1] + nums[i];
//         }
//         return prefix;
//     }
// }

// // Day 2

// // Learned:
// // - Prefix Sum

// // Solved:
// // - Running Sum of 1D Array (#1480)

// // Key Learning:
// // prefix[i] = prefix[i-1] + nums[i]

// // I can now build a prefix array and understand why prefix[0] is initialized before the loop.


//two pointers

//most common strategies are :
// 1. converging pointers
// 2. parallel pointers
// 3. trigger based pointers

// simple eg:
// [ 1 , 2, 4, 6, 10]     target = 8
//   L            R

// step 1 -> 1+10 = 11 (11>8 so R move backward)

// [ 1 , 2, 4, 6, 10]     
//   L         R

// step 2 -> 1+6 = 7 (7<8 so L move forward)

// [ 1 , 2, 4, 6, 10]     
//       L     R

// step 4 -> 2+6 = 8 (target)


// code self try

// public class Day03{
//     public static void main(String[] args) {
//         int arr[] = {1,2,4,6,10};
//         int left = 0;
//         int right = arr.length - 1;                         // my try was wrong ofc

//         int target = 8;
        
//         for(right ; right)
//     }
// }


// generic two pointer code pattern

public class Day03{
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 10};
        int target = 8;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println(left + " " + right);
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(left+" "+right);
    }
}



// leetcode two sum II #167
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left+1, right+1};
    }
}


// leetcode squares of a sorted array #977

class Solution2 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[nums.length];
        int pos = nums.length - 1;

        while(left<=right){
            int sqleft=nums[left]*nums[left];
            int sqright=nums[right]*nums[right];

            if(sqleft>sqright){
                ans[pos]=sqleft;
                left++;
            }else{
                ans[pos]= sqright;
                right--;
            }
            pos--;
        }
        return ans;
    }
}


// leetcode move zeroes #283

class Solution3 {
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

// leetcode maximum subarray #53
class Solution4 {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = nums[0];

        for (int i=1; i<nums.length; i++){
            cursum = Math.max(nums[i], cursum+nums[i]);
            maxsum = Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}


// another way i did this maximum subarray problem ( not the best way but it works )
class Solution5 {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;

        for (int i=0; i<nums.length; i++){
            cursum = cursum + nums[i];
            if(cursum>maxsum){
                maxsum = cursum;
            }
            if(cursum<0){
                cursum = 0;
            }
        }
        return maxsum;
    }
}




// 3 sum not done due to the warning of losing confidence by gpt 