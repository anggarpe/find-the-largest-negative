package com.angpe.tes;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Integer[] A={3, -7, -5, -3, -2, 0, 4, 2, -1};
        System.out.println(solution(A));
    }

    public static int solution(Integer[] a) {
        // write the solution
        ArrayList<Integer> x = new ArrayList<>();
        int min = a[0];
        int temp=0;
        int res=0;

        for (int i = 0; i < a.length; i++){

            if (a[i] < 0) x.add(a[i]);
            if (min>a[i]) min=a[i];
        }

        Collections.sort(x, Collections.reverseOrder());
        for(int i=-1; i>=min; i--){
            if(i != x.get(temp)){
                res=i;
                break;
            }
            temp++;
        }

        if(res == 0) res=min+(-1);


        return res;

    }

}
