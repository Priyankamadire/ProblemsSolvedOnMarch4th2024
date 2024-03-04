/*
 Given an matrix with no duplicate values, return all lucky numbers in the
matrix.

A lucky number is an element of the matrix such that, it is the maximum element in its row and minimum in its column.

ex:
input =
3 3
3 7 8
9 11 13
15 16 17
output =8
explanantion: 8 is the only lucky number since it is the maximum number in row and minimum in its column.


ex2:
input =
3
4
15 16 17 12
9 3 8 7
1 10 4 2
output =-1
none of the elements in the matrix matches the luckynumber rules. so print -1.

input =
2 2
1 2
7 8
output =2
explanantion: 2 is the only lucky number since it is the maximum number in row and minimum in its column.
 */

import java.util.*;

public class MaxEleinRowMininCol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print(solve(n,m,mat));
    }

    public static int solve(int n, int m, int mat[][]) {

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < m; j++) {
                max = Math.max(max, mat[i][j]);

            }
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == max) {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < n; k++) {
                        min = Math.min(min, mat[k][j]);
                    }
                    if (min != max) {
                        flag = false;
                        break;
                    }

                }
            }
            if (flag) {
                return max;
            }

        }
        return -1;
    }

}