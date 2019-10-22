package dev.m13d.mynavdrawer.class6;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<String> list;

    public Data() {
        list = new ArrayList<>();
        list.add("Strawberry");
        list.add("Raspberry");
        list.add("Lemon");
        list.add("Orange");
        list.add("Kiwi");
        list.add("Blueberry");
        list.add("Blackberry");
        list.add("Pineapple");
        list.add("Raspberry");
        list.add("Strawberry");
        list.add("Mango");
        list.add("Watermelon");
    }

    public List<String> getList() {
        return list;
    }
}
