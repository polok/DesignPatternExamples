package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.Command;
import pl.polak.designpattern.command.FileReceiver;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 21:05
 */
public class OpenFileCommand implements Command {


    private FileReceiver fileReceiver;

    public OpenFileCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing...");
        fileReceiver.openFile("file");
    }

}
