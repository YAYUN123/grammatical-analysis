package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchList {
    public ArrayList maplist;
    public HashMap map, Wordmap;
    public String[][] arr = {{"Te", "@", "@", "Te", "@", "@"}, {"@", "+Te", "@", "@", "", ""},
            {"Ft", "@", "@", "Ft", "@", "@"}, {"@", "", "*Ft", "@", "", ""}, {"a", "@", "@", "(E)", "@", "@"}};
    public String[] arr2 = {"E", "e", "T", "t", "F"};
    public String[] arr3 = {"a", "+", "*", "(", ")", "#"};
    public ArrayList findlist;
    //创建一个查询表
    public ArrayList createList() {
        maplist = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Wordmap = new HashMap();
            map = new HashMap();
            for (int j = 0; j < 6; j++) {
                map.put(arr3[j], arr[i][j]);
            }
            Wordmap.put(arr2[i], map);
            maplist.add(Wordmap);
        }
        return maplist;
    }
    //查找对应的表达式
    public String findWord(String word, String input_word, ArrayList list) {
        String push_in = null;
        findlist = list;
        for (int i = 0; i < arr2.length; i++)
        {
            if (word.equals(arr2[i]))
            {
                HashMap map = (HashMap) findlist.get(i);
                HashMap map1 = (HashMap) map.get(word);
                push_in = String.valueOf(map1.get(input_word));
                break;
            }
        }
        if (push_in == "@")
        {
            push_in = null;
            return push_in;
        }
        return push_in;
    }
}
