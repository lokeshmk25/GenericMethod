package com.bridgelabz;

public class MaxNumber {
    public static int maximum() {
        Integer obj1 = new Integer("50");
        Integer obj2 = new Integer("30");
        Integer obj3 = new Integer("10");

        int max=obj1;

        if(obj2.compareTo(max)>0)
            max=obj2;
        if(obj3.compareTo(max)>0)
            max=obj3;
        System.out.println("Maximum of three number is :" +max);
        return max;
    }

    public static void main(String[] args) {
        maximum();
    }
    }
