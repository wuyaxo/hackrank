package edu.elac.hackrank;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-02 12:29
 */
public class MergeSort3 {

    public static void main(String[] args) {
        int[] array = new int[]{22, 89, 32, 93, 47, 72, 20, 29, 0};
        int[] temp = new int[array.length];
        int left = 0, right = array.length - 1;
        divide(array, temp, left, right);
        System.out.println(Arrays.toString(array));
    }

    private static void divide(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            divide(array, temp, low, mid);
            divide(array, temp, mid + 1, high);
            mergeSort(array, temp, low, mid, high);
        }
    }

    private static void mergeSort(int[] array, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }
        System.out.printf("temp=" + Arrays.toString(temp) +"%n");
        System.out.printf("low=%s, mid=%s, high=%s%n", low, mid, high);
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            System.out.printf("low=%s, mid=%s, high=%s, j=%s%n", low, mid, high, j);
            System.out.printf("i=%s, mid=%s, k=%s", i, mid, k);
            System.out.printf(" temp=" + Arrays.toString(temp));
            System.out.printf(" array=" + Arrays.toString(array));
            array[k] = temp[i];
            System.out.println(Arrays.toString(array));
            i++;
            k++;
        }
    }
}