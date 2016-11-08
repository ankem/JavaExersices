package com.yash.exercise;

/**
 * Created by jayanthi on 11/7/2016.
 */
public class PrimeNumbers {

    public static void main(String[] args){
        int maxp =100;
        System.out.println("Prime numbers between 2 and" + maxp);
        for(int i=2;i<100;i++){
            boolean pno = true;
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    pno = false;
                    break;
                }
            }
                if(pno)
                    System.out.println(i+  " ");

        }

    }
}
