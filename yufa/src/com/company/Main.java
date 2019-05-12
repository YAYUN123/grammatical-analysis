package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static SearchList searchList;
    public static Stack stack;
    public static CharStack char_stack;
    public static String words;
    public static ArrayList list;
    public static boolean sign = true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char_stack = new CharStack();
        stack = new Stack();
        char_stack.new_push("#", stack);
        char_stack.new_push("E", stack);
        words = input.nextLine();
        searchList = new SearchList();
        list = searchList.createList();
        //对输入的字符串进行逐项匹配
        for (int i = 0; i < words.length(); i++)
        {
            sign = true;
            while(sign == true)
            {
                String head = char_stack.new_peek(stack);
                way(head, i);
            }

        }
        System.out.println("The match is successful.");
    }
    //特殊情况特殊处理
    public static void way(String head, int i)
    {
        try{
            String input_word = String.valueOf(words.charAt(i));
            if (head.equals(input_word))
            {
                char_stack.new_pop(stack);
                sign = false;
            }
            else{
                String push_in = searchList.findWord(head, input_word, list);
                if (push_in.equals(""))
                {
                    char_stack.new_pop(stack);
                }
                else{
                    char_stack.new_pop(stack);
                    char_stack.new_push(push_in, stack);
                }
            }
        }catch (NullPointerException e){
            e.toString();
        }
    }
}