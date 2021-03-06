/*
Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9

Input Format
First argument is an integer N, denoting the size of square 2D matrix.
Second argument is a 2D array A of size N * N.

Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.

Example Input
Input 1:
3
1 2 3
4 5 6
7 8 9
Input 2:
1 2
3 4

Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:
1 0
2 3
4 0

Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Anti_Diagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        int x, y, z=0;
        for (int i=0; i<A.size(); i++) {
            B.add(new ArrayList<>());
            x = 0; y = i;
            while ((x<A.size()) && (y>=0)) {
                B.get(z).add(A.get(x).get(y));
                x++; y--;
            }
            while (x<A.size()) {
                B.get(z).add(0);
                x++;
            }
            z++;
        }
        for (int i=1; i<A.size(); i++) {
            B.add(new ArrayList<>());
            x = i; y = A.size()-1;
            while ((x<A.size()) && (y>=0)) {
                B.get(z).add(A.get(x).get(y));
                x++; y--;
            }
            while(y>=0){
                B.get(z).add(0);
                y--;
            }
            z++;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int row = sc.nextInt();
        int col = sc.nextInt();

        Anti_Diagonals obj = new Anti_Diagonals();

        for (int i=0; i<row; i++) {
            a.add(new ArrayList<>());
            for (int j=0; j<col;j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(a);
        System.out.println(obj.diagonal(a));

    }

}
