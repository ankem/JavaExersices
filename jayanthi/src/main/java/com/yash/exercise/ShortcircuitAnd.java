package com.yash.exercise;

import java.util.Scanner;

/**
 * Created by jayanthi on 11/7/2016.
 */
public class ShortcircuitAnd {
    public static void main(String[] args) {

        int a ;
        int b ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter value for a");
        a = s.nextInt();

        System.out.println("enter value for b");
        b = s.nextInt();
        if (a != 0 || b / a < 4) {
            System.out.println("a is greater than 0");
        }else {
            System.out.println("this is example for short-circuit AND");
        }
    }
}
