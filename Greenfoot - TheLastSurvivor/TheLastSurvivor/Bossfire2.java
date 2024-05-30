import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bossfire2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bossfire2 extends Actor
{
    /**
     * Act - do whatever the Bossfire2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bossfire2()
    {
        getImage().scale(getImage().getWidth()*10, getImage().getHeight()*10);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-3, getY()+1);
        if (getY()==580){
            getWorld().removeObject(this);
        }
    }
}
