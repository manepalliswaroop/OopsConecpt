package com.epam.onboarding.mentoring.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionPractice {

    public static void arrayToList() {
        String[] vowels = {"a", "e", "i", "o", "u"};

        List<String> vowelsList = Arrays.asList(vowels);

        for (String letters : vowelsList) {
            System.out.println(letters);
        }
    }

    public static void listToArray(){
        List<String> students = new ArrayList<String>();
        students.add("Suresh");
        students.add("Ramesh");
        students.add("Satish");

        String str[]= new String[students.size()];
        str=students.toArray(str);
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
    //arrayToList();
    listToArray();
    }

}
