
package br.com.projuris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyFindArray implements FindArray {

    public MyFindArray() {};

    public int findArray(int[] array, int[] subarray) {

        List<Integer> listArray = new ArrayList<Integer>();
        List<Integer> listSubarray = new ArrayList<Integer>();

        for(int element: array){
            listArray.add(element);
        }

        for(int element: subarray){
            listSubarray.add(element);
        }

        return Collections.lastIndexOfSubList(listArray, listSubarray);
    }
}
