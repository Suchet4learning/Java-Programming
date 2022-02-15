package com.february.exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class Powers_of_two {

        public int power(String A) {
            int n=0;
            BigInteger ans1 = new BigInteger(A);
            BigInteger ans2 = ans1.subtract(BigInteger.valueOf(1));
            BigInteger Result;
            Result = ans1.and(ans2);
            if (ans2.signum() > 0) {
                if (Result.intValue() == 0) {
                    n = 1;
                } else {
                    n = 0;
                }
            }
            return n;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            Powers_of_two obj = new Powers_of_two();
            System.out.println(obj.power(S));
        }

    }
