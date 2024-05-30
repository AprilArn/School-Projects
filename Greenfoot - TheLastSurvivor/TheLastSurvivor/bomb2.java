import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb2 extends Actor
{
    int count = 5;
    /**
     * Act - do whatever the bomb2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gerak();
    }
    public void gerak()
    {
        setLocation(getX()-10,getY());
        if (getX()<2){
            getWorld().removeObject(this);
        }else{
            hit_par();
        }
    }
    public void hit_par()
    {
        if(isTouching(Pcommon2.class)){
            count--;
            if (count <= 0) {
                getWorld().addObject(new lenyap(), getX(), getY());
                removeTouching(Pcommon2.class);
                getWorld().removeObject(this);
            }
        }
        else if(isTouching(Pcommon.class)){
            getWorld().addObject(new lenyap(), getX(), getY());
            removeTouching(Pcommon.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(Pelite.class)){
            getWorld().addObject(new lenyap(), getX(), getY());
            removeTouching(Pelite.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(Pelite2.class)){
            getWorld().addObject(new lenyap(), getX(), getY());
            removeTouching(Pelite2.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(boss.class)){
            getWorld().addObject(new lenyap(), getX(), getY());
            removeTouching(boss.class);
            getWorld().removeObject(this);
        }
    }
}
