package com.company;

import java.util.Stack;

public class CharStack{
    public void new_pop(Stack st)
    {
        st.pop();
        print_Stack(st);
    }
    public void new_push(String arr, Stack st)
    {
        for(int i = arr.length() - 1; i >= 0; i--) {
            st.push(String.valueOf(arr.charAt(i)));
        }
        print_Stack(st);
    }
    public String new_peek(Stack st)
    {
        return String.valueOf(st.peek());
    }
    public void print_Stack(Stack st)
    {
        for (Object x : st) {
            System.out.print(x);
        }
        System.out.println();
    }
}
