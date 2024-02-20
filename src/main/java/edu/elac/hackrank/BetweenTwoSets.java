package edu.elac.hackrank;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-14 20:38
 */
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
        boolean flag1 = true, flag2 = true;
        for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {
            for (Integer j : a) {
                if (i % j != 0) {
                    flag1 = false;
                    break;
                }
            }
            if (!flag1) {
                flag1 = true;
                continue;
            }

            for (Integer k : b) {
                if (k % i != 0) {
                    flag2 = false;
                    break;
                }
            }
            if (flag2) {
                System.out.println(i);
                count++;
            }
            flag1 = true;
            flag2 = true;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        System.out.println(getTotalX(a, b));
    }

}