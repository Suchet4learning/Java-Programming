/*
Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].
He wants to select some trees to replace his broken branches.
But he wants uniformity in his selection of trees.
So he picks only those trees whose heights have frequency K.
He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).
But the sum he ended up getting was huge so he prints it modulo 10^9+7.
In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:
1.   1<=N<=100000
2.   1<=K<=N
3.   0<=H[i]<=10^9

Input: Integers N and K and array of size A

Output: Sum of all numbers in the array that occur exactly K times.

Example:

Input:
N=5 ,K=2 ,A=[1 2 2 3 3]

Output:
5

Explanation:
There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
 */
package com.March.Day40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class K_Occurrences {

    public int getSum(int A, int B, ArrayList<Integer> C) {
        int sum = 0;
        char Flg = 'N';
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i:C) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if (e.getValue() == B) {
                sum = ((sum % ((10^9)+7)) + (e.getKey() % ((10^9)+7)) % ((10^9)+7));
                Flg = 'Y';
            }
        }
        if (Flg=='N') sum = -1;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K_Occurrences obj = new K_Occurrences();
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.getSum(n,k,a));
    }
}
