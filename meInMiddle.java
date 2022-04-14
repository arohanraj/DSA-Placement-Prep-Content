/*
Me in middle

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
You are given an array of size n containing distinct integers, where n is odd. Find
the element which has the same number of lesser elements and the same number
of greater elements in the array.
Input
First line of the input contains an integer, N, which denotes the length of the array.
Next N inputs are elements of the array.
Constraints
1 <= N <= 20
-10000 <= Arr[i] <= 10000
Output
Single integer n which has the same number of lesser elements and the same
number of greater elements.

Example
Input:
3
3 1 2
Output:
2
Explanation:-
2 has one greater element 3 and one smaller element 1
Input:
5
2 3 4 9 1
Output:
3

*/

import java.util.*;

class meInMiddle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // Arrays.toString(arr);
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = arr.length/2;

        System.out.println(arr[x]);
    }
}

// This is Contributed by Amit.
