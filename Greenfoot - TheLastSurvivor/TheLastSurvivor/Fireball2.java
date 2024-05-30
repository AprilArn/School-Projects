import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball2 extends Actor
{
    public Fireball2(){
        getImage().scale(getImage().getWidth()*1/12, getImage().getHeight()*1/12);
        GreenfootImage img = getImage();
        img.mirrorHorizontally();
        setImage(img);
        
    }
    
    public void act()
    {
        // Add your action code here.
        Movement();
        himlang();
    }
    public void himlang()
    {
        if(getX()>1098){
            setLocation(1,340);
        }
    }
    public void Movement(){
        setLocation(getX()+4, getY());
        //if(isTouching(Trigger2.class)){
          //  setLocation(1,340);
        }
    }