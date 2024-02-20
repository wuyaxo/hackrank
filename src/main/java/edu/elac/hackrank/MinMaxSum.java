package edu.elac.hackrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-02 12:13
 */
public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        Collections.sort(arr);
         Integer min=0, max=0;
        for (int i = 0; i < arr.size(); i++) {
            if(i==0){
                min+=arr.get(i);
            } else if(i==arr.size()-1){
                max+=arr.get(i);
            } else{
                min+=arr.get(i);
                max+=arr.get(i);
            }
        }
        System.out.println(String.format("%s %s", min,max));
    }
}