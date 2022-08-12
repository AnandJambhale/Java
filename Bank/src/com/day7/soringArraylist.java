package com.day7;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class soringArraylist {
    public static void main(String[] args) {

        //Problem 1  sorting using logic
        ArrayList<String>array=new ArrayList<>(Arrays.asList("Anand","Hansu", "Vilas", "Mamta","priyanka","mamta"));

        ArrayList<String>modified=new ArrayList<>();

        System.out.println(array);

        for(int i=65;i<=122;i++){
            for(int j=0;j< array.size();j++){
                if ((char)i==array.get(j).charAt(0)){
                    modified.add(array.get(j));
                }
            }
        }

        System.out.println(modified);


        //using sort method in collection
        ArrayList<String>arrays=new ArrayList<>(Arrays.asList("Anand","Hansu", "Vilas", "Mamta","priyanka","mamta"));
        Collections.sort(arrays);
        System.out.println(arrays);

    }
}
