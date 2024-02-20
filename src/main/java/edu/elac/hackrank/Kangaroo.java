package edu.elac.hackrank;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-06 17:41
 */
public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        boolean exceed = false;
        boolean isx1behind = x2 > x1;
        int jump = 0;
        String result;

        while (x1 != x2 && !exceed) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (isx1behind && x1 > x2) {
                exceed = true;
            } else if (!isx1behind && x2 > x1) {
                exceed = true;
            }
            if (jump > 10000) {
                break;
            }
            jump++;
        }

        if (x1 == x2) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }
}