import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bumwi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bumwi extends Actor
{
    GifImage myGif = new GifImage("egipto.gif");
    /**
     * Act - do whatever the bumwi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bumwi()
    {
        getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
    }
    public void act()
    {
        // Add your action code here.
        egip();
    }
    public void egip()
    {
        setImage(myGif.getCurrentImage());
    }
}
