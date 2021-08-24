package com.bridgelabz;

public class MaxNumber {
    public static int maximumint() {
        Integer obj1 = new Integer("50");
        Integer obj2 = new Integer("30");
        Integer obj3 = new Integer("10");

        int max=obj1;

        if(obj2.compareTo(max)>0)
            max=obj2;
        if(obj3.compareTo(max)>0)
            max=obj3;
        System.out.println("Maximum of three intnumber is :" +max);
        return max;
    }
    public static int maximumfloat() {
        Float obj1 = new Float("5.5");
        Float obj2 = new Float("3.8");
        Float obj3 = new Float("10.1");

        float max=obj1;

        if(obj2.compareTo(max)>0)
            max=obj2;
        if(obj3.compareTo(max)>0)
            max=obj3;
        System.out.println("Maximum of three floatnumber is :" +max);
        return (int) max;
    }
    public static void maximumString() {
        String obj1 = new String("I");
        String obj2 = new String("am");
        String obj3 = new String("BATMAN");

        String max=obj1;

        if(obj2.compareTo(max)>0)
            max=obj2;
        if(obj3.compareTo(max)>0)
            max=obj3;
        System.out.println("Maximum of three Stringnumber is :" +max);
    }

    public static void main(String[] args) {
        maximumint();
        maximumfloat();
        maximumString();
    }
    }
