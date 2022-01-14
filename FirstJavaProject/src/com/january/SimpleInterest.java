package com.january;

public class SimpleInterest {
    public static void main(String[] args) {
        int Principal = 150;
        float Interest = 6.5f;
        int NoOfYears = 5;
        float SI = ((Principal * Interest * NoOfYears) / 100.0f);
        System.out.println("The simple interest after is: " + SI);
    }

}
