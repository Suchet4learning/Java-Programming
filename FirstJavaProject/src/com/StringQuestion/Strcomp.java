package com.StringQuestion;

public class Strcomp {
    public static void main(String[] args) {

        String Inp1 = "This is a Java Exercise";
        String Inp2 = "This is a Java exercise";
        int diff;

        diff = Inp1.compareTo(Inp2);
        if (diff > 0) {
            System.out.println("The value of: " + Inp1 + ", is greater than: " + Inp2);
        }
        else {
            System.out.println("The value of: " + Inp2 + ", is greater than: " + Inp1);
        }

        diff = Inp1.compareToIgnoreCase(Inp2);
        if (diff > 0) {
            System.out.println("The value : " + Inp1 + ", is greater than: " + Inp2);
        }
        else if (diff < 0){
            System.out.println("The value of: " + Inp2 + ", is greater than: " + Inp1);
        }
        else {
            System.out.println("The value of: " + Inp1 + ", is equal to: " + Inp2);
        }

        Inp1 = "This is Exercise 1";
        Inp2 = "This is Exercise 2";

        diff = Inp1.compareTo(Inp2);
        if (diff > 0) {
            System.out.println("The value : " + Inp1 + ", is greater than: " + Inp2);
        }
        else if (diff < 0){
            System.out.println("The value of: " + Inp2 + ", is greater than: " + Inp1);
        }
        else {
            System.out.println("The value of: " + Inp1 + ", is equal to: " + Inp1);
        }

        Inp1 = "PHP Exercises and ";
        Inp2 = "Python Exercises";

        Inp1 = Inp1.concat(Inp2);
        System.out.println("The concatenated string is: " + Inp1);

    }
}
