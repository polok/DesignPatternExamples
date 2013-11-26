package pl.polak.designpattern.command.impl;

import pl.polak.designpattern.command.FileReceiver;

import java.io.File;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 20:54
 */
public class WindowsFileReceiver implements FileReceiver {
    @Override
    public void openFile(String fileName) {
        System.out.println("Windows: Open file: " + fileName);
    }

    @Override
    public void closeFile() {
        System.out.println("Windows: Closing file.");
    }
}
