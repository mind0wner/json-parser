package com.person;

import org.json.JSONArray;

public class Person {
    private String name;
    private String surname;
    private JSONArray phones;
    private JSONArray sites;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Person(String name, String surname, JSONArray phones, JSONArray sites, Address address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONArray getPhones() {
        return phones;
    }

    public void setPhones(JSONArray phones) {
        this.phones = phones;
    }

    public JSONArray getSites() {
        return sites;
    }

    public void setSites(JSONArray sites) {
        this.sites = sites;
    }

    @Override
    public String toString() {
        return "Surname = " + surname + ", \nname = " + name + ", \nphones = " + phones + ", \nsites = " + sites;
    }
}
