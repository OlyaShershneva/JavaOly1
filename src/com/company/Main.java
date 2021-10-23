package com.company;

import java.util.Scanner;
public class Main {

    public static void main (String[]args)
    {
        Stack st = new Stack();
        System.out.println("Create a 7-item container: ");
        for(int i=0; i<7; i++)
        {
            st.push_back(i);
            System.out.println("Container size:" + st.getSize()+ " №" +st.getCounter()+": "+ st.getElem());
        }

        System.out.println("Remove 3 items: ");
        for(int i=0; i<3; i++)
        {
            st.pop_back();
        }
        System.out.println("Current item: №" + st.getCounter()+ ", Container size:" + st.getSize());
        System.out.println(st.get_i_Elem(3));
    }
}
