/*
Problem Description
You are given a function to_lower() which takes a character array A as an argument.
Convert each character of A into lowercase character if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z is converted to lowercase letters from a to z respectively.
Return the lowercase version of the given character array.

Problem Constraints
1 <= |A| <= 105

Input Format
Only argument is a character array A.

Output Format
Return the lowercase version of the given character array.

Example Input
Input 1:
 A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:
 A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']

Example Output
Output 1:
 ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
Output 2:
 ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']

Example Explanation
Explanation 1:
 All the characters in the returned array are in lowercase alphabets.
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Scanner;

public class To_lower {

    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for (int i =0; i<A.size(); i++) {
            if (A.get(i)>=65 && A.get(i)<=90) {
               A.set(i,(char)(A.get(i) ^ (1<<5)));
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> a = new ArrayList<>();
        To_lower obj = new To_lower();
        String s = sc.nextLine();
        for (int i=0; i<s.length();i++) {
            a.add(s.charAt(i));
        }
        System.out.println(obj.to_lower(a));
    }


}
