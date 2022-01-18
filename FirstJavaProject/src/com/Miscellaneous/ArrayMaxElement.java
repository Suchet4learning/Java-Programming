package com.Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaxElement {
    public int Solve(ArrayList<Integer> A)
    {
        int FLarge =0;
        int SLarge =0;
        int Rem;

        for (int i=0; i<A.size(); i++)
        {
                if(A.get(i) > FLarge)
                {
                    SLarge = FLarge;
                    FLarge = A.get(i);
                }
                else if ((A.get(i) > SLarge) && (A.get(i) != FLarge))
                {
                    SLarge = A.get(i);
                }
        }
        Rem = SLarge % FLarge;
        System.out.println(Rem);
        return Rem;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int Inp = sc.nextInt();
        int Count = 1;

        while(Count <= Inp) {
            int num = sc.nextInt();
            A.add(num);
            System.out.println(num);
            Count += 1;
        }
        ArrayMaxElement MyVal = new ArrayMaxElement();
        MyVal.Solve(A);
    }
}
