package io.github.iqiancheng.daily.designpattern.behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by iamya on 5/5/2016.
 */
public class Thermometer extends Observable implements Observer {
    public void update(Observable observable, Object o) {
        display(((Heater) observable).getTemperature());
    }

    public void display(Integer temperature) {
        if (null != temperature && temperature >= 100) {
            setChanged();
            notifyObservers(temperature);
        }
        System.out.println("The water is " + temperature + "°C now!");
    }
}
