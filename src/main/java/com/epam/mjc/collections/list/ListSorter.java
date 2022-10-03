package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        for(int i=0;i<sourceList.size();i++){
            for (int j=0;j< sourceList.size()-1;j++){
                if (comparator.compare(sourceList.get(j), sourceList.get(j+1))>=0){
                    Collections.swap(sourceList,j,j+1);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int first = Math.abs(Integer.parseInt(a)), second= Math.abs(Integer.parseInt(b));

        return Integer.compare(first, second);
    }
}
