package pl.polak.designpattern.bridge;

/**
 * User: marcin
 * Date: 27.11.13
 * Time: 21:04
 */
public abstract class ScreenAbstract {

    protected Picture picture;
    protected int screenWidth;
    protected int screenHeight;

    protected ScreenAbstract(Picture picture, int screenWidth, int screenHeight) {
        this.picture = picture;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public abstract void drawOnScreen(int x, int y);
}
