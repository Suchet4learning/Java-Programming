package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Subarrays {

    public String solve(ArrayList<Integer> A) {

        int s=0, e, i=0, c=0;

        if (A.size() % 2 != 0) return "NO";

        else {

            if ((A.get(0) % 2 !=0) || (A.get(A.size()-1) % 2 !=0)) return "NO";
            //else e = 1;

            /* while(e < A.size()) {

                if (A.get(e) % 2 == 0) {
                    if (e == A.size()-1) {
                    //    c++;
                        break;
                    }
                    //if (A.get(e + 1) % 2 == 0)
                    //    c++;
                }
                e = e + 2;
            }*/
        }
        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Even_Subarrays obj = new Even_Subarrays();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));

    }

}
