package com.angpe.tes;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Integer[] A={-3, -7, -5, -2, 4, 2, -1};
        System.out.println("Array: "+Arrays.toString(A));
        System.out.println("Largest negative not in Array: "+ solution(A));
    }

    public static int solution(Integer[] a) {
        // write the solution
        ArrayList<Integer> negative = new ArrayList<>();//store negative value
        int min = a[0];//assign minimal value to first element array
        int res=0; //store result
        int temp=0; //index




        for (Integer integer : a) {
            if (integer < 0) negative.add(integer);//find negative value
            if (min > integer) min = integer;//find & assign minimum value
        }

        negative.sort(Collections.reverseOrder());//sort in descending order
        for(int i=-1; i>=min; i--){//loop to find largest negative
            if(i != negative.get(temp)){ //match value i with element index
                res=i; //assign negative value
                break;
            }
            temp++;
        }

        if(res == 0) res=min+(-1);
        return res;

    }

}
