import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    public Fireball(){
        getImage().scale(getImage().getWidth()*1/12, getImage().getHeight()*1/12);
    }
    public void act()
    {
        // Add your action code here.
        Movement();
        hilang();
    }
    public void hilang()
    {
        if(getX()<2){
            setLocation(1099,540);
        }
    }
    public void Movement(){
        setLocation(getX()-4, getY());
        //if(isTouching(Trigger.class)){
            //setLocation(1099,540);
        }
}

