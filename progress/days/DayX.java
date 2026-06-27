// ## Day X - Recovery Day

// Today was intentionally kept as a recovery day.

// Over the past few days I have been studying Java DSA consistently, covering arrays, strings, binary search, recursion, sorting, OOP and starting linked lists. I noticed my focus and problem-solving ability had dropped, so instead of forcing new topics, I decided to take a short break.

// To maintain consistency, I solved one easy LeetCode problem to keep my streak alive. Rest is also part of preparation, and coming back with a fresh mind is more valuable than spending hours without understanding.

// Tomorrow I will resume Linked Lists with a fresh start.



// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] ans = new int[nums.length * 2];

//         for (int i = 0; i < nums.length; i++) {
//             ans[i] = nums[i];
//             ans[i + nums.length] = nums[i];
//         }

//         return ans;
//     }
// }





// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i = 0; i < nums.length; i++){
//             list.add(index[i], nums[i]);
//         }

//         int[] ans = new int[nums.length];

//         for(int i = 0; i < list.size(); i++){
//             ans[i] = list.get(i);
//         }

//         return ans;
//     }
// }