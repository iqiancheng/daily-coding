package io.github.iqiancheng.daily.designpattern.behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by iamya on 5/5/2016.
 */
public class Alarm implements Observer {
    public void update(Observable observable, Object o) {
        System.out.println("Alarm!!! It's BOILLING！ " + o + "°C now!");
    }
}
