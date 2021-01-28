package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//  Write a program to sum all the values of a given Array in Java.
        int[] myArr = {2, 3, 4, 6, 8};
        int sum = 0;
        for (int value : myArr) {
            sum += value;
        }
        System.out.println("The sum of the array is: \n" + sum);



//  What is the output?
// Line 1: we have an array named 'exampleArray' that has been initialized as a 'double' for its data type.

//  Line 2: a new 'double' data type initialized named 'maximum' and set equal to the previous array at its 0 index. (In 'exampleArray,' the 0 index has a value of 1.

//  Line 3: initializing a new integer variable named 'index' and setting it to 0.

//  Line 4: Creating a for loop that evaluates... "If the index (i) is set to equal 1; and the value of i is less than the ~length~ of the array (in this case, it would be 6); as i increases by 1 incrementally (moving from index 1 onward)"

//  Line 5: LOOK FOR: "If the index (i) is greater than the variable called "maximum" (which is equal to the array's 0 index), then...

//  Line 6: then set "maximum" equal to exampleArray who's index is "i" at that location.

//  Line 7: then set the index = "i"

//  Line 10: Print out the index in which these conditions are met. in this case it's i=2, or (6).

        double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }
        System.out.println(index);

//        calling toPower
        toPower(4,2);
    }

    //  Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].

    public static void toPower(int size, int power){
size = 4;
power = 2;

Integer powerArray[] = new Integer[size];
for (int i = 0; i < size; i++){
    powerArray[i] = (int)Math.pow(i, power);
}
System.out.println(Arrays.toString(powerArray));
    }
}
