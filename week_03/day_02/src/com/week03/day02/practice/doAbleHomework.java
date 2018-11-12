package com.week03.day02.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class doAbleHomework {

  public static void main(String[] args) {
    HashMap<String, String> tree1 = new HashMap<>();
    tree1.put("type", "Prunus pensylvanica");
    tree1.put("leaf color", "green");
    tree1.put("age", "old");
    tree1.put("sex", "male");

    HashMap<String, String> tree2 = new HashMap<>();
    tree2.put("type", "Ostrya virginiana");
    tree2.put("leaf color", "green");
    tree2.put("age", "young");
    tree2.put("sex", "female");

    HashMap<String, String> tree3 = new HashMap<>();
    tree3.put("type", "Black tupelo");
    tree3.put("leaf color", "strawberry");
    tree3.put("age", "young");
    tree3.put("sex", "male");

    HashMap<String, String> tree4 = new HashMap<>();
    tree4.put("type", "Juglans cinerea");
    tree4.put("leaf color", "green");
    tree4.put("age", "old");
    tree4.put("sex", "female");

    HashMap<String, String> tree5 = new HashMap<>();
    tree5.put("type", "Populus tremuloides");
    tree5.put("leaf color", "yellow");
    tree5.put("age", "old");
    tree5.put("sex", "male");

    ArrayList<HashMap<String, String>> treeList = new ArrayList<>();
    treeList.add(0,tree1);
    treeList.add(1,tree2);
    treeList.add(2,tree3);
    treeList.add(3,tree4);
    treeList.add(4,tree5);

    for (HashMap<String, String> theMaps : treeList) {
      System.out.println(theMaps);
    }

  }

}
