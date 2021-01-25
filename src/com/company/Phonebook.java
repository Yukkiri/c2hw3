package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone){
        HashSet<String> contact = phoneBook.getOrDefault(name, new HashSet<>());
        contact.add(phone);
        phoneBook.put(name, contact);
    }

    public HashSet<String> forPrint(String name){
        return phoneBook.get(name);
    }

    public HashMap<String, HashSet<String>> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(HashMap<String, HashSet<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }
}
