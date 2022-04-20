package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        //int arr[]={2,4,6,7,4,6,9};

        String arr[]={"A","B","C"};
        List<String>arraydenList=Arrays.asList(arr);
        System.out.println(arraydenList);

        //arraydenList.add("J");

        System.out.println("19. satirda Array :"+arraydenList);
        arr[1]="F";
        System.out.println("23. satirda Array :"+Arrays.toString(arr));
        System.out.println("24. satirda list :"+arraydenList);

    }
}
