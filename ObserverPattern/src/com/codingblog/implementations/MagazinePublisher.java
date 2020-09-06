package com.codingblog.implementations;

import com.codingblog.interfaces.Magazine;
import com.codingblog.interfaces.Observer;
import com.codingblog.interfaces.Subject;

import java.util.ArrayList;

public class MagazinePublisher implements Subject {
    private ArrayList<Observer> observers;
    private Magazine magazine;

    public MagazinePublisher(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index>=0)
            observers.remove(index);

    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers)
            o.update(magazine);

    }

    public void newPublicationArrived(){
        notifyObservers();
    }

    public void publishMagazine(Magazine newMagazine){
        this.magazine = newMagazine;
        newPublicationArrived();
    }
}
