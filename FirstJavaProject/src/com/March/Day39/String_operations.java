/*
Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.

Problem Constraints
1<=N<=100000

Input Format
First argument is a string A of size N.

Output Format
Return the resultant string.

Example Input
A="AbcaZeoB"

Example Output
"bc###bc###"

Example Explanation
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###".
 */

package com.March.Day39;

import java.util.Scanner;

public class String_operations {

    public String solve(String A) {

        StringBuilder str = new StringBuilder(A);
        str.append(A);
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                str.deleteCharAt(i);
                i--;
            }
            else if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                str.replace(i,i+1,"#");
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String_operations obj = new String_operations();
        System.out.println(obj.solve(s));
    }

}
