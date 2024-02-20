package edu.elac.hackrank;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-02 14:22
 */
public class MergeSort4 {

    public static void main(String[] args) {
        int[] array = new int[]{22, 89, 32, 93, 47, 72, 20, 29, 0};
        int[] temp = new int[array.length];
        int low = 0, high = array.length;
        reserveSplit(array, temp, low, high);
        System.out.println(Arrays.toString(array));
    }

    private static void reserveSplit(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            reserveSplit(array, temp, low, mid);
            reserveSplit(array, temp, mid, high);
            mergerSortHelper(array, temp, low, mid, high);
        }
    }

    private static void mergerSortHelper(int[] array, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;

            while (i <= mid) {
                array[k] = temp[i];
                k++;
                i++;
            }
        }
    }
}