package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //task1
        String [] listOfWords = {"cat", "dog", "hamster", "cat", "raccoon", "raccoon", "avocado", "raccoon", "dog", "dog", "dog"};
        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String word : listOfWords) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(Arrays.toString(listOfWords));
        System.out.println(wordsMap);


        //task2
        Phonebook phones = new Phonebook();
        phones.add("Masha", "9999999");
        phones.add("Sasha", "72733");
        phones.add("Pasha", "123457");
        phones.add("Sasha", "218768124");
        phones.add("Olesya", "12312312");

        System.out.println(phones.forPrint("Sasha"));
        System.out.println(phones.forPrint("Olesya"));
        System.out.println(phones.forPrint("Philipp"));
    }
}
//useless comment for pull request