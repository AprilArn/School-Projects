import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starto extends Actor
{
    /**
     * Act - do whatever the Starto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Starto()
    {
        getImage().scale(getImage().getWidth()*1/5, getImage().getHeight()*1/5);
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Level1());
        }
    }
}
