/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem {

    public static ArrayList<Integer> exacltyTwice(int[]arr)
    {
        if(arr.length == 0)
        {
            throw new IllegalArgumentException("Error01 : Empty Array");
        }
        if(arr.length == 1)
        {
            throw new IllegalArgumentException("Error02 : Arrayhas only one element");
        }
         HashMap<Integer, Integer> map = new HashMap<>();
         ArrayList<Integer> listoftwiceint = new ArrayList<>();
         for(int i : arr)
         {
             if(map.containsKey(i))
             {
                map.put(i, (map.get(i)+1));
             }
             else
             {
                 map.put(i, 1);
             }
         }
         for(int i : map.keySet())
         {
             if(map.get(i) == 2)
             {
                 listoftwiceint.add(i);
             }
         }
         return listoftwiceint;
    }
    //The Time Complexity for this code is O(n)
}
