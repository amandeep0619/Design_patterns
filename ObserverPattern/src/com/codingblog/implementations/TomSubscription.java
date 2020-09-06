package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;
import com.codingblog.interfaces.Observer;
import com.codingblog.interfaces.Subject;

public class TomSubscription implements Observer {
    private Magazine magazine;
    private Subject publisher;
    public TomSubscription(Subject magazinePublisher){
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
