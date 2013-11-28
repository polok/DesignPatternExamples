package pl.polak.designpattern.adapter.impl;

import pl.polak.designpattern.adapter.SocketAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: marcin
 * Date: 28.11.13
 * Time: 19:44
 */
public class AdapterMain {

    public static void main(String[] args) {
        List<SocketAdapter> socketAdapters = new ArrayList<SocketAdapter>(Arrays.asList(new SocketClassAdapterImpl(), new SocketObjectAdapterImpl()));

        for(SocketAdapter adapter : socketAdapters) {
            System.out.println(adapter.getClass().getSimpleName() + " : " + adapter.get120Volt().getVolts());
            System.out.println(adapter.getClass().getSimpleName() + " : " + adapter.get12Volt().getVolts());
            System.out.println(adapter.getClass().getSimpleName() + " : " + adapter.get3Volt().getVolts());
        }

    }

}
