package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;

public class BusinessMagazine implements Magazine {
    @Override
    public void display() {
        System.out.println("--- This is Business magazine ---");
    }
}
