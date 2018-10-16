package com.neuedu.bean;

import java.util.Comparator;

public class MyCompartor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getSage()-((Student)o2).getSage();
    }
}
