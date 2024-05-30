import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gorrilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gorrilla extends Actor
{
    /**
     * Act - do whatever the gorrilla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gorrilla()
    {
        getImage().scale(getImage().getWidth()*1/3, getImage().getHeight()*1/3);
    }
    public void act()
    {
        // Add your action code here.
        getWorld().showText("v0.6.666.beta", 66, 15);
        getWorld().showText("©theGorilla's.inc.", 80, 580);
    }
}
