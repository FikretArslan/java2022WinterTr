package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayşe"};
        System.out.println(arr1[0]);//Ali

        arr1[1]="Esila";
        System.out.println(arr1[1]);//Esila

        //

        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
       // System.out.println(arr2[5]);//

        System.out.println(arr2);//[I@5b464ce8


        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]+" ");

        }
        //

        System.out.println(Arrays.toString(arr2));//[0,0,0,0]

        arr2[1]=11;
        arr2[3]=22;

        System.out.println(Arrays.toString(arr2));//[011,0,22]

        System.out.println(Arrays.toString(arr1));//["Ali","Veli","Ayşe"]




    }
}
