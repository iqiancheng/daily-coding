package io.github.iqiancheng.daily.designpattern.behavioral.Observer;

import org.junit.Test;

/**
 * Created by qian.cheng on 5/5/2016.
 */

public class ObserverTest {

    @Test
    public void testboil(){
        Heater heater = new Heater();
        Thermometer thermometer = new Thermometer();
        thermometer.addObserver(new Alarm());
        heater.addObserver(thermometer);

        //
        heater.boilwater();
    }
}
