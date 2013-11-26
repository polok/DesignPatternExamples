package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.Command;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 21:12
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

}
