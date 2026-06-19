// string patterns
// it was on day 3 but somehow i missed it 

//watched a video from love babbar
//https://youtu.be/_hvBbiMRoo0?si=OnoBC4EZsM7-RF11

//strings - sequence of characters

//creation of string (two ways)
//string literal -> String str = "love";
//using new keyword -> String str = new String("love");

// learned string pool

// Access of characters -> .charAt(index number)

//strings are immutable -> cannot be changed once created

//string builder already learned

//comparing strings -> .equals() and .equalsIgnoreCase() and ==

//string input -> Scanner sc = new Scanner(System.in); String str = sc.nextLine();   or using next

//common string methods -> length(), toLowerCase(), toUpperCase(), trim(), substring(), replace(), split(), contains(), startsWith(), endsWith()

// 125. Valid Palindrome (amost done by myself. just syntax mistakes by me)

// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
//         int low = 0;
//         int high = s.length()-1;
//         while(low<high){
//             if(!Character.isLetterOrDigit(s.charAt(low))){
//                 low++;
//                 continue;
//             }
//             if(!Character.isLetterOrDigit(s.charAt(high))){
//                 high--;
//                 continue;
//             }
//             if(s.charAt(low)!=s.charAt(high)){
//                 return false;
//             }
//             low++;
//             high--;
//         }
//         return true;
//     }
// }



// 387. First Unique Character in a String (done by myself)
// class Solution {
//     public int firstUniqChar(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(map.containsKey(ch)){
//                 map.put(ch, map.get(ch)+1);
//             }else{
//                 map.put(ch, 1);
//             }
//         }
//         for(int i=0; i<s.length(); i++){
//             if(map.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }




// leetcode 14. Longest Common Prefix (not done by myself) have to see this tomorrow carefully and understand it.
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";
//         }

//         int minLength = strs[0].length();

//         for (int i = 1; i < strs.length; i++) {
//             minLength = Math.min(minLength, strs[i].length());
//         }

//         for (int i = 0; i < minLength; i++) {

//             char ch = strs[0].charAt(i);

//             for (int j = 1; j < strs.length; j++) {

//                 if (strs[j].charAt(i) != ch) {
//                     return strs[0].substring(0, i);
//                 }
//             }
//         }

//         return strs[0].substring(0, minLength);
//     }
// }






// these two not done and will be done on day 7 revision 	
// Longest	Substring Without	Repeating	(#3)
// Group	Anagrams	(#49)