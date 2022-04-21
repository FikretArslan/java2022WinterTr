package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Integer> sinifKeySet=sinifListMap.keySet();
        List<Integer> keyList=new ArrayList<>();

        System.out.println(keyList);
        keyList.addAll(sinifKeySet);
        System.out.println(keyList);

        System.out.println(keyList.get(1));

        Collection<String>sinifValueColl=sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String>sinifvalueList=new ArrayList<>();
        sinifvalueList.addAll(sinifValueColl);
        System.out.println(sinifvalueList);

        int outerArrayBoyut=sinifvalueList.size();
        System.out.println(outerArrayBoyut);
        String ilkValue=sinifvalueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut= ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifvalueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];

            }

        }
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("========================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+"  ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
