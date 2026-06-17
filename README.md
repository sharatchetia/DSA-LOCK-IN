# DSA Lock-In

I am following a 30 day DSA schedule and uploading my daily progress here.

This repo is mainly for keeping my code, notes, and revision points in one
place. Some solutions are brute force right now because I am still building the
basics properly before moving to optimized approaches.

## Progress

| Day | What I studied | Status |
| --- | --- | --- |
| 01 | Arrays, 2D arrays, strings, brute force problems | Done |
| 02 | HashSet, HashMap, frequency counting, hashmap questions | Done for now, more practice pending |
| 03 | Prefix sum, two pointers, Kadane's algorithm basics | Done |
| 04 | Binary search, bounds, and sorted-array search patterns | Done |

## Folder setup

```text
progress/days/            daily code and practice questions
notes/my_notes/           my handwritten notes
notes/apna_college_notes/ reference PDFs
archive/                  older practice files kept locally
```

## Day 1

On Day 1, I revised array basics, input using `Scanner`, linear search, 2D
arrays, and string reversal.

I also tried LeetCode style questions:

- Reverse String
- Two Sum with brute force
- Contains Duplicate with brute force

Contains Duplicate was not submitted because the brute force solution can give
TLE. I also need to revisit Rotate Array, Valid Anagram, HashMap, and HashSet.

Handwritten notes for Day 1 are in `notes/my_notes/day 1 dsa.pdf`.

## Day 2

On Day 2, I focused on HashSet and HashMap.

I practiced the basic HashMap operations like `put`, `containsKey`, `get`,
`entrySet`, `keySet`, and `remove`. I also did a frequency counter question for
finding elements that appear more than `n/3` times.

LeetCode practice:

- Two Sum using HashMap
- Ransom Note
- Isomorphic Strings

I am still confused with HashMap in some places, so this topic needs more
practice. I was not able to do the medium questions today because of time and
mental fatigue, but I watched the HashSet videos and can probably jump into the
questions next.

Handwritten notes for Day 2 are in `notes/my_notes/day 2 dsa.pdf`.

## Day 3

On Day 3, I did not watch new playlist lectures. I focused on topics I needed
for questions: prefix sum and two pointers.

For prefix sum, I understood the basic formula:

```text
prefix[i] = prefix[i - 1] + nums[i]
```

I also practiced two pointers with the common left/right pattern on a sorted
array.

LeetCode practice:

- Running Sum of 1D Array
- Two Sum II
- Squares of a Sorted Array
- Move Zeroes
- Maximum Subarray

Maximum Subarray was done in two ways. One is the better Kadane's algorithm
style, and one is my own version that still works.

Handwritten notes for Day 3 are in `notes/my_notes/day 3 dsa.pdf`.

## Day 4

On Day 4, I practiced HashMap and HashSet once again before starting binary
search. I did Two Sum and Contains Duplicate again by myself, including a
HashMap version of Contains Duplicate.

The main topic for the day was binary search. I learned the normal iterative
pattern, recursive binary search, search insert position, lower bound, upper
bound, and how to combine lower and upper bound for finding the first and last
position of an element.

LeetCode practice:

- Binary Search
- Search Insert Position
- First Bad Version
- Find First and Last Position of Element in Sorted Array

Main learning: binary search is not only for directly finding a value in an
array. It is also useful when the search space is ordered and I need to find a
boundary.

Handwritten notes for Day 4 are in `notes/my_notes/day 4 dsa.pdf`.
