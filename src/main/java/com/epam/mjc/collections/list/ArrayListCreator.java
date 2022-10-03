package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> ans = new ArrayList<>(sourceList.size()/3*2);

        for (int i=2;i< sourceList.size();i+=3){
            ans.add(sourceList.get(i));
            ans.add(sourceList.get(i));
        }

        return ans;
    }
}
