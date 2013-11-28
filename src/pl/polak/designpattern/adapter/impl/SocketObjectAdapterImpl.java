package pl.polak.designpattern.adapter.impl;

import pl.polak.designpattern.adapter.SocketAdapter;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:40
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolts();
    }

    @Override
    public Volt get12Volt() {
        return convertVolts(10);
    }


    @Override
    public Volt get3Volt() {
        return convertVolts(40);
    }

    private Volt convertVolts(int i) {
        return new Volt(socket.getVolts().getVolts()/i);
    }
}
