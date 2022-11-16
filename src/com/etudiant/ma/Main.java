package com.etudiant.ma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> removeDuplicate(ArrayList<String> lists) {
        ArrayList<String> newList = new ArrayList<>();
        for (String element: lists) {
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args)  {
       String path = "purchases.txt";
       String line = "";
        ArrayList<String> category = new ArrayList<>();
        ArrayList<String> list  = new ArrayList<>();

       try {
           BufferedReader br = new BufferedReader(new FileReader(path));
           while ((line = br.readLine()) != null) {
               String[] values = line.split("\t");
               category.add(values[3]);
              list = removeDuplicate(category);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       // display the categories
        for(String cat: list) {
            System.out.println(cat);
        }

    }

}

