package com.test.json;

import com.person.Address;
import com.person.Person;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Parse {
static String json = "{\n" +
        "  \"name\": \"Vsevolod\",\n" +
        "  \"surname\": \"Ievgiienko\",\n" +
        "  \"phones\": [\"044-256-78-90\", \"066-123-45-67\"],\n" +
        "  \"sites\": [\"http://site1.com\", \"http://site2.com\"],\n" +
        "  \"address\": {\n" +
        "    \"country\": \"UA\",\n" +
        "    \"city\": \"Kiev\",\n" +
        "    \"street\": \"Victory avenue\"\n" +
        "  }\n" +
        "}";
private static List<Person> person = new ArrayList<Person>();
    public static void main(String[] args) {
        parseJSON();
    }
    static void parseJSON(){
        JSONObject obj = new JSONObject(json);
        JSONObject address = obj.getJSONObject("address");
        person.add(new Person(obj.getString("name"),obj.getString("surname"),obj.getJSONArray("phones"),
                obj.getJSONArray("sites"),new Address(address.getString("country"),
                address.getString("city"),address.getString("street"))));
        for (Person p: person) {
            System.out.println(p+"\n"+p.getAddress());
        }
    }
}