package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {

    List<String> sortedCatalogList;

    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
    
        if (unSortedCatalogList == null) {
            return "The catalog list is null";
        }

        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        } 
        

        // iterate and check each value
        for (String item : unSortedCatalogList) {
            if (item==null || item=="" || item==" ") {
                return "The catalog List contains empty or null or blank space as a value";
            }
        }

        sortedCatalogList = new ArrayList<>(unSortedCatalogList);
        Collections.sort(sortedCatalogList);

        return sortedCatalogList.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if (value==null || value=="" || value==" ") {
            return "Input is not accepted";
        }

        for (String item : sortedCatalogList) {
            if (item.equalsIgnoreCase(value)) {
                return "Found: " + item;
            }
        }
        return "Not Found";
    }
}

