package day21_arrays;

import java.util.Arrays;

public class day03_Arrays {
    public static void main(String[] args) {


        int arr[];

        arr=new int[6];
        System.out.println(Arrays.toString(arr));//[0,0,0,0,0,0]
        System.out.println(arr.length);//6

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));//[0,1,2,3,4,5]

        //son index teki elementi yazdiralim
        System.out.println(arr[arr.length-1]);//5
    }
}
