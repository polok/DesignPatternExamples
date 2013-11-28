package pl.polak.designpattern.adapter;

import pl.polak.designpattern.adapter.impl.Volt;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:35
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();

}
