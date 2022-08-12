package com.day7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSON {
    public static void main(String[] args) {
        //Problem 2
        String str="{\"name\":\"anand\",\"id\":123,\"age\":21,\"Array\":[\"food\",\"vegetables\"]}";
        JSONObject Jobj= (JSONObject) JSONValue.parse(str);

        System.out.println(Jobj.get("name"));
        System.out.println(Jobj.get("id"));

        JSONArray arra=(JSONArray) Jobj.get("Array");
        System.out.println(arra.get(1));
    }
}
