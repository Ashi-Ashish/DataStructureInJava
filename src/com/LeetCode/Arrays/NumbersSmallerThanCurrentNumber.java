package com.LeetCode.Arrays;

//Given the array listOfNumbers, for each listOfNumbers[i] find out how many numbers in the array are smaller than it. That is, for each listOfNumbers[i] you have to count the number of valid j's such that j != i and listOfNumbers[j] < listOfNumbers[i].
//Return the answer in an array.
//Example 1:
//Input: listOfNumbers = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For listOfNumbers[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For listOfNumbers[1]=1 does not exist any smaller number than it.
//For listOfNumbers[2]=2 there exist one smaller number than it (1).
//For listOfNumbers[3]=2 there exist one smaller number than it (1).
//For listOfNumbers[4]=3 there exist three smaller numbers than it (1, 2 and 2).

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {

    public static void main(String[] args){
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] listOfNumbers) {
        int[] newList = new int[listOfNumbers.length];
        for (int i = 0; i < listOfNumbers.length; i++) {
            int numbersSmallerThanCurrentNumber = 0;
            for (int j = 0; j < listOfNumbers.length; j++) {
                if (listOfNumbers[i] > listOfNumbers[j]){
                    numbersSmallerThanCurrentNumber += 1;
                }
            }
            newList[i] = numbersSmallerThanCurrentNumber;
        }
        return newList;
    }

}
