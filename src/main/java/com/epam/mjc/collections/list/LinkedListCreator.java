package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        
        LinkedList <Integer> ans = new LinkedList<>();

        for (Integer value: sourceList) {
            if(value % 2 == 1){
                ans.add(0,value);
            }else{
                ans.add(ans.size(),value);
            }
        }
        return ans;
    }
}
