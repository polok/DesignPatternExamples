package pl.polak.designpattern.adapter.impl;

import pl.polak.designpattern.adapter.SocketAdapter;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:36
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolts();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolts();
        return convertVolts(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolts(getVolts(), 40);
    }

    private Volt convertVolts(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }
}
