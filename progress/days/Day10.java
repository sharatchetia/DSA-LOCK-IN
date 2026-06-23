// completed oops video from apna college

public class Day10 {
    class ParkingSystem {

    int big;
    int medium;
    int small;
        

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
        
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big>0){
                big--;
                return true;
            }
        }
        else if(carType==2){
            if(medium>0){
                medium--;
                return true;
            }
        }
        else if(carType==3){
            if(small>0){
                small--;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
}




class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;

        for (int student : students) {
            if (student == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        for (int sandwich : sandwiches) {

            if (sandwich == 0) {

                if (count0 == 0) {
                    return count1;
                }

                count0--;

            } else {

                if (count1 == 0) {
                    return count0;
                }

                count1--;
            }
        }

        return 0;

    }
}



// ## Day 10 — OOP Fundamentals + First Design Problem

// **Problems Solved Today:** 2

// * Design Parking System (#1603) ✅
// * Number of Students Unable to Eat Lunch (#1700) ✅

// ### Topics Covered

// #### OOP Fundamentals

// Learned and revised:

// * Class vs Object
// * Object creation using `new`
// * Constructors
// * Default Constructor
// * No-Argument Constructor
// * Parameterized Constructor
// * Copy Constructor (basic understanding)
// * `this` keyword
// * Constructor execution flow
// * Inheritance
// * Polymorphism

//   * Method Overloading (Compile-Time Polymorphism)
//   * Method Overriding (Runtime Polymorphism)

// #### Major OOP Realizations

// **Constructor Flow**

// ```java
// ParkingSystem p = new ParkingSystem(1, 1, 0);
// ```

// * Values are received by constructor parameters.
// * Constructor copies them into object variables.
// * Object variables remain after constructor finishes.
// * Constructor parameters disappear after execution.

// **Understanding `this`**

// ```java
// this.big = big;
// ```

// means:

// ```text
// object's big = parameter big
// ```

// `this` does not create a new variable. It refers to the current object's variable.

// **Object State**

// Realized that:

// ```java
// ParkingSystem p1 = new ParkingSystem(1,1,0);
// ParkingSystem p2 = new ParkingSystem(5,3,2);
// ```

// create two separate objects with independent data.

// Changing `p1` does not affect `p2`.

// ---

// ### LeetCode #1603 — Design Parking System

// Initially struggled because I treated the constructor like a `main()` function.

// Important realization:

// ```text
// Constructor runs once
// Methods run many times
// ```

// Learned how:

// * Instance variables store object state.
// * Constructor initializes state.
// * Methods modify state.

// This was my first OOP design-style LeetCode problem.

// ---

// ### LeetCode #1700 — Number of Students Unable to Eat Lunch

// Initial idea:

// * Simulate queue rotation.
// * Move students around using pointers or extra arrays.

// Key realization:

// ```text
// Order does not matter.
// Only counts matter.
// ```

// Used counting:

// ```text
// count0
// count1
// ```

// instead of queue simulation.

// Learned to look for what information is actually important before simulating a process.

// ---

// ### Key Lessons

// * Constructors initialize object state.
// * `this` refers to the current object's variables.
// * Each object has its own copy of instance variables.
// * Runtime polymorphism is achieved through method overriding.
// * Not every simulation problem requires simulation.
// * Counting can sometimes replace queue operations entirely.

// ---

// ### Struggled With

// * Understanding constructors vs object variables.
// * Understanding what `this` actually refers to.
// * First OOP design question felt unfamiliar.
// * Initially overcomplicated #1700 by trying to simulate the queue.

// ---

// ### Tomorrow's Goal

// * Java Collections Framework
// * ArrayList
// * List Interface
// * add()
// * get()
// * remove()
// * size()

// After Collections:

// * Continue OOP/Design questions
// * Return to backtracking later with better understanding of List and ArrayList

// ### Day Status

// ✅ OOP fundamentals completed

// ✅ First Design LeetCode solved

// ✅ Maintained GitHub streak

// ✅ Stronger understanding of object state and constructors
