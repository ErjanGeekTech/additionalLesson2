package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String string = new String();
        String str = "Бишкек;8:170.0;10:500.0;30:800.0;50:3495.0->1.0:-1.0";
        String[] hhh = str.split(";");
        System.out.println(Arrays.toString(hhh));
    }
}
