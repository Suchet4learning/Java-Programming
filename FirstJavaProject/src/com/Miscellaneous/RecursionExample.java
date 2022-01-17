package com.Miscellaneous;

public class RecursionExample {

    static int bar(int x, int y) {
        System.out.println("In bar, x is: " + x + ", y is: " + y);
        if(y ==0) return 0;
            return (x + bar(x,y-1));
        }

    static int foo(int x, int y) {
        System.out.println("In foo, x is: " + x + ", y is: " + y);
        if (y==0) return 1;
            return bar(x,foo(x,y-1));
        }

        public static void main(String[] args) {
                System.out.println(foo(3,5));
        }
}
