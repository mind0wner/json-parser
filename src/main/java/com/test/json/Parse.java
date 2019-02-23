package com.test.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parse {
static String json = "{\n" +
        "  \"name\": \"Vsevolod\",\n" +
        "  \"surname\": \"Ievgiienko\",\n" +
        "  \"phones\": [\"044-256-78-90\", \"066-123-45-67\"],\n" +
        "  \"sites\": [\"http://site1.com\", \"http://site2.com\"],\n" +
        "  \"address\": {\n" +
        "    \"country\": \"Ukraine\",\n" +
        "    \"city\": \"Kiev\",\n" +
        "    \"street\": \"Victory avenue\"\n" +
        "  }\n" +
        "}";
    public static void main(String[] args) {
        JSONObject obj = new JSONObject(json);
        String name = obj.getString("name");
        System.out.println("Name: "+name);
        String surname = obj.getString("surname");
        System.out.println("Surname: "+surname);
        JSONArray phones = obj.getJSONArray("phones");
        System.out.println("Phones:");
        for(Object phone:phones){
            System.out.println(phone);
        }
        JSONArray sites = obj.getJSONArray("sites");
        System.out.println("Sites:");
        for(Object site:sites){
            System.out.println(site);
        }
        String country = obj.getJSONObject("address").getString("country");
        String city = obj.getJSONObject("address").getString("city");
        String street = obj.getJSONObject("address").getString("street");
        System.out.println("Country: "+country+"\nCity: "+city+"\nStreet: "+street);
    }
}