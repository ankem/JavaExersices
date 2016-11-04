package com.yash.exercise;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by jayanthi on 11/3/2016.
 */
public class PrePost {

    public static void main(String[] args) {

        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("enter value for i");
        i = in.nextInt();
        System.out.println("pre increment value" + ++i);
        System.out.println("post increment value" + i++);
    }
}
