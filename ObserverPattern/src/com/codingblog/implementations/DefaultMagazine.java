package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;

public class DefaultMagazine implements Magazine {
    @Override
    public void display() {
        System.out.println("-- no new subscription --");
    }
}
