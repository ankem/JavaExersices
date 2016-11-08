package com.yash.exercise;

/**
 * Created by jayanthi on 11/8/2016.
 */
public class BlockScope {

    static int j= 4;
    public static int scope1 (){
        int i =2;
         j = i*4;
        return j;
    }

    public static void main(String[] args) {
        System.out.println("value of j outside of block" +  j);
        System.out.println("value of j inside " + scope1());

    }

}
