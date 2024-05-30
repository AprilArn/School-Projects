import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elslash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elslash extends Actor
{
    int count=0;
    /**
     * Act - do whatever the Elslash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elslash()
    {
        
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+4,getY());
        if (getX()>1089){
            getWorld().removeObject(this);
        }
    }
    }

