/*
Problem Description
Given a string A consisting of lowercase characters.
Check if characters of the given string can be rearranged to form a palindrome.
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

Problem Constraints
1 <= |A| <= 105
A consists only of lower-case characters.

Input Format
First argument is an string A.

Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

Example Input

Input 1:
 A = "abcde"

Input 2:
 A = "abbaee"

Example Output

Output 1:
 0

Output 2:
 1

Example Explanation

Explanation 1:
 No possible rearrangement to make the string palindrome.

Explanation 2:
 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
 */
package com.March.Day40;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check_palindrome_2 {

    public int solve(String A) {
        int n = A.length(), odd=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<A.length(); i++) {
            if (map.containsKey(A.charAt(i))) {
                map.put(A.charAt(i), map.get(A.charAt(i))+1);
            }
            else {
                map.put(A.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
             if (e.getValue()%2==1) {
                     odd++;
             }
        }
        if (odd > 1) {
            return 0;
        }
        else if (A.length()%2==0 && (odd!=0)) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check_palindrome_2 obj = new Check_palindrome_2();
        String S = sc.nextLine();
        System.out.println(obj.solve(S));
    }

}

