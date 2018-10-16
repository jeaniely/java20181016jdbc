package com.neuedu.example;

public class Example02 {
    public static void main(String[] args) {
        char a='a';
        String str="123456";
        StringBuffer sb=new StringBuffer("abcdef");

        fun(a,str,sb);
        System.out.println(a);//
        System.out.println(str);//
        System.out.println(new String(sb));//
    }
    //传值和传址
    public static void fun(char a,String str,StringBuffer sb){
        a='h';
        str+="abcedf";
        sb.append("123456");
    }
}
