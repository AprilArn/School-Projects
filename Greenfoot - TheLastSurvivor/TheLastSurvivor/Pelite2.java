import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelite2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelite2 extends Actor
{
    private GreenfootImage[] images=new GreenfootImage[10];
    private int jeda=4, num=0;
    int count=0;
    public void addedToWorld(World W)
    {
        for(int i=1;i<images.length;i++){
            images[i]=new GreenfootImage("Pelite"+i+".png");
        }
        setImage(images[1]);
    }
    public void act()
    {
        // Add your action code here.
        animate();
        slash();
    }
    public void animate()
    {
        if(jeda==0)jeda=4;
        if(jeda==1){
            setImage(images[num]);
            num++;
            if(num>=images.length)num=0;
            setLocation(getX(),getY());
        }
        if(jeda>0)jeda--;
    }
    public void slash()
    {
        count++;
        if(count>=45){
        sles();
        count = 0;
    }
    }
    public void sles()
    {
        Elslash2 elslash = new Elslash2();
        getWorld().addObject(elslash,getX(), getY());
    }
}
