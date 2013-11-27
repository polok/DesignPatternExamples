package pl.polak.designpattern.bridge.impl;

import pl.polak.designpattern.bridge.Picture;
import pl.polak.designpattern.bridge.ScreenAbstract;

import java.util.ArrayList;
import java.util.List;

/**
 * User: marcin
 * Date: 27.11.13
 * Time: 21:18
 */
public class BridgeMain {

    public static void main(String[] args) {
        List<ScreenAbstract> screenAbstracts = new ArrayList<ScreenAbstract>();
        screenAbstracts.add(new WideScreen(new WhiteBlackPicture(), 54, 23));
        screenAbstracts.add(new WideScreen(new SepiaPicture(), 43, 23));

        for(ScreenAbstract a : screenAbstracts) {
            a.drawOnScreen(3,2);
        }


    }

}
