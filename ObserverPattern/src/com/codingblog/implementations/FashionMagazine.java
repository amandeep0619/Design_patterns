package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;

public class FashionMagazine  implements Magazine {
    @Override
    public void display() {
        System.out.println("--- This is Fashion magazine ---");
    }
}
