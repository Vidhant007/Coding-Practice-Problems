/*
 *  1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 *  1 2 3 4 5
*/

import java.util.*;

public class Q3 {

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}
