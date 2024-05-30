import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bossfire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bossfire extends Actor
{
    /**
     * Act - do whatever the Bossfire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bossfire(){
        getImage().scale(getImage().getWidth()*1/5, getImage().getHeight()*1/5);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-4, getY());
        if (getX()<2){
            getWorld().removeObject(this);
        }
    }
}
