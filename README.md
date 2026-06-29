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
| 05 | Recursion basics, recursive patterns, and first backtracking exposure | Done, backtracking needs revision |
| 06 | String patterns, string methods, and string practice problems | Done for now, two problems pending |
| 07 | Revision of arrays, HashMap, two pointers, strings, binary search, and recursion | Done, backtracking postponed |
| 08 | Sorting algorithms, merge sort, and sorting practice problems | Done, more dry runs needed |
| 09 | OOP revision and backtracking reflection | Done, Collections Framework pending |
| 10 | OOP fundamentals and first design problems | Done |
| 11 | ArrayList, Collections Framework basics, practice problems | Done |
| 12 | Rest day, attempted linked list review, copied code for streak | Done |
| X | Recovery day; skipped another day, copied an easy LeetCode solution | Done |
| 16 | Linked list fundamentals and print method | Done |

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

## Day 5

On Day 5, I focused on recursion basics from the Apna College one-shot. I
revised base cases, the call stack, stack overflow, and how to break a problem
into smaller recursive calls.

Practice and examples:

- Natural sum using recursion
- Factorial with both parameter-carrying and return-based recursion
- Fibonacci number and Fibonacci series
- Reverse String using both iterative two pointers and recursion
- Climbing Stairs
- Power of Two
- First look at Subsets and the take / do not take backtracking pattern

Main learning: recursion is starting to feel less like magic. I can usually
identify the base case, the smaller problem or choice, and the recursive call.
Climbing Stairs also showed why a correct recursive relation can still be too
slow, which is my first real reason to learn memoization and DP.

Still weak in backtracking, subsets, and reading recursion trees quickly. I
will revisit these during revision.

Handwritten notes for Day 5 are in `notes/my_notes/day 5 dsa.pdf`.

## Day 6

On Day 6, I covered the string pattern topics that were missed earlier. I
revised string creation, the string pool, character access with `charAt`,
immutability, string comparison, string input, and common string methods like
`length`, `toLowerCase`, `toUpperCase`, `trim`, `substring`, `replace`,
`split`, `contains`, `startsWith`, and `endsWith`.

LeetCode practice:

- Valid Palindrome
- First Unique Character in a String
- Longest Common Prefix

Valid Palindrome was almost done by myself, with mainly syntax mistakes. First
Unique Character was done by myself using a HashMap frequency count. Longest
Common Prefix was not done by myself, so I need to revisit it carefully.

Pending for Day 7 revision:

- Longest Substring Without Repeating Characters
- Group Anagrams

Handwritten notes for Day 6 are in `notes/my_notes/day 6 dsa.pdf`.

## Day 7

Day 7 was a revision day with no new lectures. I focused on re-solving problems
from earlier topics and checking how much I could recall from memory.

Revision practice:

- Running Sum of 1D Array
- Contains Duplicate
- Two Sum
- Palindrome Number
- Majority Element
- Find the Difference
- Move Zeroes
- Valid Anagram
- Squares of a Sorted Array
- Valid Palindrome
- Binary Search
- Fibonacci Number
- Power of Two
- Reverse String

Main learning: I can usually identify the correct pattern now. HashMap
frequency counting, HashSet existence checks, two pointers, binary search, and
basic recursion feel more natural than before. Most mistakes were syntax,
control flow, or implementation details rather than not knowing the pattern.

Backtracking and Subsets are still weak, so I postponed Subsets until a proper
backtracking day.

No handwritten notes for Day 7.

## Day 8

On Day 8, I focused on sorting. I practiced merge sort recursively and also
covered bubble sort, insertion sort, selection sort, and quick sort notes.

Practice:

- Merge Sort
- Sort Array By Parity
- Sort Colors
- Bubble Sort
- Insertion Sort
- Selection Sort

Main learning: merge sort depends on dividing the array recursively and then
merging the sorted parts. For the two-pointer sorting problems, I did a lot of
dry runs to understand how the pointers move and when swaps should happen.

Handwritten notes for Day 8 are in `notes/my_notes/day 8 dsa.pdf`.
Reference PDFs added for Day 8:

- `notes/apna_college_notes/Merge Sort (2).pdf`
- `notes/apna_college_notes/Quick Sort (1).pdf`

## Day 9

On Day 9, I started with backtracking but decided to postpone it after realizing
that many examples depend on Collections Framework syntax like `ArrayList`,
`List`, and `List<List<Integer>>`. I understood the basic take / do not take
decision-tree idea, `idx`, base cases, and making / undoing choices, but I need
more Java foundation before going deeper.

I switched to OOP revision for the day.

Topics covered:

- Class vs object
- Object creation using `new`
- Constructor basics
- Default constructor
- No-argument constructor
- Parameterized constructor
- Copy constructor basics
- `this` keyword
- Constructor execution flow
- Inheritance started
- Basic polymorphism

Practice:

- Simple `Pen` and `Student` class examples
- Length of Last Word

Main learning: constructors run automatically when an object is created, and
copy constructors create a new object with the same data instead of pointing to
the same object. OOP took longer than expected, but the basics are improving.

Handwritten notes for Day 9 are in `notes/my_notes/day 9 dsa.pdf`.
Reference PDF added for Day 9:

- `notes/apna_college_notes/OOPS in Java.pdf`

## Day 10

On Day 10, I completed the OOP fundamentals from Apna College and applied them
to LeetCode design problems. I worked on the Parking System design problem,
where I had to create a class that simulates a parking lot with different car
sizes.

Key OOP Realizations:

- **Constructor vs Methods**: Constructors run once to initialize state, while
  methods run many times and modify state. I initially confused constructors
  with the `main()` function.
- **The `this` keyword**: Understood that `this.big = big` means "object's big
  = parameter big". It refers to the current object's variable, not creating a
  new one.
- **Object Independence**: Each object created has its own independent data.
  Creating two `ParkingSystem` objects with different capacities doesn't affect
  each other.
- **Method Overloading and Overriding**: Compiled-time polymorphism through
  method overloading and runtime polymorphism through method overriding.

LeetCode practice:

- Design Parking System (#1603) - First OOP design problem
- Number of Students Unable to Eat Lunch (#1700) - Learned that order doesn't
  matter, only counts matter

Main learning: OOP design problems require thinking about object state,
initialization, and methods that modify that state. The Parking System problem
was the first real-world style design problem I solved, and it helped solidify
how constructors and instance variables work together.

Handwritten notes for Day 10 are in `notes/my_notes/day 10 dsa.pdf`.

## Day 11

On Day 11, I focused on ArrayList in Java. I learned the basic operations: add,
get, set, remove, size, looping, and sorting with `Collections.sort`. I also
started learning about the Java Collections Framework (names of main interfaces
and classes so far).

LeetCode practice:

- Kids With the Greatest Number of Candies — found the maximum candies, then
  checked for each kid if `candies[i] + extraCandies >= max`
- Baseball Game (Cal Points) — used ArrayList to simulate scorekeeping with
  operations: integer (add the score), "C" (remove last score), "D" (double
  last score), "+" (sum of last two scores)

Main learning: ArrayList operations feel similar to working with dynamic arrays.
The Baseball Game problem was a good test of using `list.get(list.size() - 2)`
and `list.get(list.size() - 1)` to access the last two elements. The "+" case
was tricky at first but made sense with practice.

Handwritten notes for Day 11 are in `notes/my_notes/day 11 dsa.pdf`.
Reference PDFs added for Day 11:

- `notes/apna_college_notes/ArrayList in Java.pdf`
- `notes/apna_college_notes/Collection Framework - Java.pdf`

## Day 12

Day 12 was a recovery/review day. I was feeling burnt out and only attempted to
start linked list review, but I couldn’t focus properly. I copied a Roman numeral
solution to keep the streak going, but I did not truly learn or solve the
problem on my own.

What happened:

- Tried to learn linked list concepts, but could not concentrate.
- Copied a Roman numeral conversion solution for the streak.
- Took the day as a rest/recovery day and will continue once I feel better.

Handwritten notes for Day 12 are not available yet.

## Day X

Day X was a recovery day after skipping another day. I skipped an additional
day due to burnout and did not make progress on new concepts. To keep the
streak alive, I copied an easy LeetCode solution (solution copied for streak
maintenance) and focused on rest rather than forced study.

What happened:

- Skipped another day due to low energy and lack of focus.
- Copied an easy LeetCode solution to maintain the streak (not solved
  independently).
- Took the day to rest and recover.
- Planned to resume Linked Lists when ready.

Handwritten notes for Day X are not available yet.

