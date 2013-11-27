package pl.polak.designpattern.bridge.impl;

import pl.polak.designpattern.bridge.Picture;
import pl.polak.designpattern.bridge.ScreenAbstract;

/**
 * User: marcin
 * Date: 27.11.13
 * Time: 21:10
 */
public class WideScreen extends ScreenAbstract {

    protected WideScreen(Picture picture, int screenWidth, int screenHeight) {
        super(picture, screenWidth, screenHeight);
    }

    @Override
    public void drawOnScreen(int x, int y) {
        System.out.println("Draw on wide screen.");
        picture.draw(x, y);
    }
}
