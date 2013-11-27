package pl.polak.designpattern.bridge.impl;

import pl.polak.designpattern.bridge.Picture;

/**
 * User: marcin
 * Date: 27.11.13
 * Time: 21:17
 */
public class WhiteBlackPicture implements Picture {

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw white and black picture");
    }

}
