package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;
import com.codingblog.interfaces.Observer;
import com.codingblog.interfaces.Subject;

public class DavidSubscription implements Observer {
    private Magazine magazine;
    private Subject publisher;
    public DavidSubscription(Subject magazinePublisher){
        this.magazine = new DefaultMagazine();
        this.publisher = magazinePublisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update(Magazine magazine) {
        this.magazine = magazine;
        display();

    }
    public void display(){
        this.magazine.display();
    }
}
