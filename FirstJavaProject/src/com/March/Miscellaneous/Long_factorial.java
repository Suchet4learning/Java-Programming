package com.March.Miscellaneous;

public class Long_factorial {

    public static void main(String[] args) {
        long num = 1L;
        long res = 0L;
        long sum = 1L;

        for (int i=1; i<20; i++) {
            num = (num * i);
            sum = sum * i;
            res = Long.sum(res, Long.sum(sum,num));
            System.out.println(num + " , " + res);
        }
    }
}
