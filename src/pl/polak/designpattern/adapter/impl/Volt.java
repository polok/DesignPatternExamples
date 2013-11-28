package pl.polak.designpattern.adapter.impl;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:24
 */
public class Volt {

    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
