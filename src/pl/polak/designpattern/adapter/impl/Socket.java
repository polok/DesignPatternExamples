package pl.polak.designpattern.adapter.impl;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:25
 */
public class Socket {

    private final static int DEFAULT_VOLTS_VALUE = 120;

    public Volt getVolts() {
        return new Volt(DEFAULT_VOLTS_VALUE);
    }

}
