package com.hynning.bean;

import org.junit.Test;

import java.util.Arrays;

public class Customer {

    String name;

//    @Test
    public static void main(String[] args) {
//        System.out.println("hello world!!!");
//        ArrayList al = new ArrayList();

//        main2(new String['a']);
        Customer a = new Customer();
        a.name = "1";
        System.out.println(a.toString());


    }


    @Override
    public String toString() {
        return "custer[name = "+ name;
    }

    @Test
    public void method(){
        System.out.println("1");
    }

//    @Test
    public void main1(String[] args) {

        for (String arg : args) {
            
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        for (int i = 0; i <3 ; i++) {
            
        }

        if (args != null) {
            
        }

    }


//    @Test
    public void main2(String[] args) {

        System.out.println("args = " + Arrays.deepToString(args));

    }

    @Test
    public void test2(){
        Integer in1 = new Integer(12);

        int i1 = in1.intValue();

        System.out.println(i1+1);
    }



}
