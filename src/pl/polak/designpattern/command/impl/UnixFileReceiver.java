package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.FileReceiver;

import java.io.File;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 21:01
 */
public class UnixFileReceiver implements FileReceiver {

    @Override
    public void openFile(String fileName) {
        System.out.println("UNIX: Open file: " + fileName);
    }

    @Override
    public void closeFile() {
        System.out.println("UNIX: Closing file.");
    }
}
