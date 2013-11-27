package pl.polak.designpattern.bridge.impl;

import pl.polak.designpattern.bridge.Picture;

/**
 * User: marcin
 * Date: 27.11.13
 * Time: 21:16
 */
public class SepiaPicture implements Picture {

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw sepia picture");
    }

}
