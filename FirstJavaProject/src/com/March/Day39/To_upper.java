/*
Problem Description
You are given a function to_upper() consisting of a character array A.
Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.
Return the uppercase version of the given character array.

Problem Constraints
1 <= |A| <= 105

Input Format
Only argument is a character array A.

Output Format
Return the uppercase version of the given character array.

Example Input
Input 1:
 A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:
 A = ['S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0']

Example Output
Output 1:
 ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']
Output 2:
 ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']

Example Explanation
Explanation 1:
 All the characters in the returned array are in uppercase alphabets.
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Scanner;

public class To_upper {

    public ArrayList<Character> to_upper(ArrayList<Character> A) {

        for (int i =0; i<A.size(); i++) {
            if (A.get(i)>=97 && A.get(i)<=122) {
                A.set(i,(char)(A.get(i) ^ (1<<5)));
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> a = new ArrayList<>();
        To_upper obj = new To_upper();
        String s = sc.nextLine();
        for (int i=0; i<s.length();i++) {
            a.add(s.charAt(i));
        }
        System.out.println(obj.to_upper(a));
    }

}
