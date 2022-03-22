
/*
Repeat and Missing
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.
 */
package com.March.Day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeat_XOR_Missing {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();

        int xor1, n = A.size();

        /* Will have only single set bit of xor1 */
        int set_bit_no;

        int i, x = 0, y = 0;

        xor1 = A.get(0);

        /* Get the xor of all array elements  */
        for (i = 1; i < n; i++)
            xor1 = xor1 ^ A.get(i);

        /* XOR the previous result with numbers from 1 to n*/
        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;

        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = xor1 & -xor1;

        /* Now divide elements into two sets by comparing rightmost set bits of xor1 with the bit at the
        same position in each element. Also, get XORs of two sets. The two XORs are the output elements.
        The following two for loops serve the purpose */

        for (i = 0; i < n; i++) {

            if ((A.get(i) & set_bit_no) != 0)
                /* belongs to first set */
                x = x ^ A.get(i);

            else
                /* belongs to second set*/
                y = y ^ A.get(i);
        }
        for (i = 1; i <= n; i++) {

            if ((i & set_bit_no) != 0)
                /* i, belongs to first set */
                x = x ^ i;
            else
                /* i, belongs to second set*/
                y = y ^ i;
        }

        n = A.indexOf(x);

        if (n>=0) {
            ans.add(x);
            ans.add(y);
        }
        else {
            ans.add(y);
            ans.add(x);
        }

        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        Repeat_XOR_Missing obj = new Repeat_XOR_Missing();

        for (int i=0; i<m; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.repeatedNumber(a));
    }
}
