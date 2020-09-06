package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;

public class SportsMagazine implements Magazine {
    @Override
    public void display() {
        System.out.println("--- This is Sports magazine ---");
    }
}
