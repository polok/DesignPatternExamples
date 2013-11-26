package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.Command;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 21:18
 */
public class Client {

    public static void main(String[] args) {

        UnixFileReceiver unixFileReceiver = new UnixFileReceiver();
        Command command = new CloseFileCommand(unixFileReceiver);

        Invoker invoker = new Invoker(command);

        invoker.execute();
    }

}
