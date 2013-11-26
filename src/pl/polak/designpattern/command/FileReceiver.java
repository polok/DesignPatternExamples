package pl.polak.designpattern.command;

import java.io.File;

/**
 * User: marcin
 * Date: 26.11.13
 * Time: 20:51
 */
public interface FileReceiver {

    void openFile(String fileName);

    void closeFile();

}
