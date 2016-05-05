package com.challions.daily.designpattern.behavioral.Observer;

import java.util.Observable;

/**
 * Created by iamya on 5/5/2016.
 */
public class Heater extends Observable {

    protected static Integer temperature = 95;


    public void boilwater() {
        for (; temperature <= 105; temperature++) {
            setChanged();
            notifyObservers();
        }
    }

    public Integer getTemperature() {
        return temperature;
    }
}
