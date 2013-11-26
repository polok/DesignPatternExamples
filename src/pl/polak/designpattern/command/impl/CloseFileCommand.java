package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.Command;
import pl.polak.designpattern.command.FileReceiver;

import java.io.File;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 21:06
 */
public class CloseFileCommand implements Command {

    private FileReceiver fileReceiver;

    public CloseFileCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing...");
        fileReceiver.closeFile();
    }

}
