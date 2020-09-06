package com.codingblog;

import com.codingblog.implementations.JohnSubscription;
import com.codingblog.implementations.MagazinePublisher;
import com.codingblog.implementations.SportsMagazine;

public class Main {

    public static void main(String[] args)
    {
        MagazinePublisher magazinePublisher = new MagazinePublisher();
        JohnSubscription johnSubscription = new JohnSubscription(magazinePublisher);
        johnSubscription.display();
        magazinePublisher.publishMagazine(new SportsMagazine());

    }
}
