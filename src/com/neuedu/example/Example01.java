package com.neuedu.example;

public class Example01 {
    public static void main(String[] args) {
        char[] a={'a','a'};
        String str="123456";
        StringBuffer sb=new StringBuffer("abcdef");
        StringBuffer sa=new StringBuffer("124578");
        fun(a,str,sb,sa);
        System.out.println(new String(a));//
        System.out.println(str);//
        System.out.println(new String(sb));//
    }
    //传值和传址
    public static void fun(char[] a,String str,StringBuffer sb,StringBuffer sa){
        a[0]='h';
        str="abcedf";
        sb=sa;
    }
}
