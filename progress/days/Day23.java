import java.util.*;


// class RecentCounter {
//     Queue <Integer> queue;
//     public RecentCounter(){
//         queue = new LinkedList<>();
//     }

//     public int ping(int t) {
//         queue.add(t);

//         while(!queue.isEmpty()&&queue.peek()<(t-3000)){
//             queue.remove();
//         }

//         return queue.size();
//     }
// }

// /**
//  * Your RecentCounter object will be instantiated and called as such:
//  * RecentCounter obj = new RecentCounter();
//  * int param_1 = obj.ping(t);
//  */



// leetcode #3 almost did it myself. just maxlength issue got me. variable size sliding window q1

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}


// small session today but completed sliding window