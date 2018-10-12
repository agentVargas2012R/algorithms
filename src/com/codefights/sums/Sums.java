package com.codefights.sums;

/**
* Created by mvargas  on 9/28/2018.
* Write a function that returns the sum of two numbers.
*
* Example
*
* For param1 = 1 and param2 = 2, the output should be
* add(param1, param2) = 3.
*
* Input/Output
* [execution time limit] 3 seconds (java)
*
* [input] integer param1
*
* Guaranteed constraints:
* -1000 ≤ param1 ≤ 1000.
* [input] integer param2
*
* Guaranteed constraints
* -1000 ≤ param2 ≤ 1000.
*
* [output] integer
*
* The sum of the two inputs.
*/
public class Sums {
    public int add(int param1, int param2) {
        int sum = 0;
        if(-1000 <= param1 && param1 <= 1000){
            sum = param1;
        }

        if(-1000 <= param2 && param2 <= 1000){
            sum  = sum + param2;
        }

        return sum;
    }
}
