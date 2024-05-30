import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
    int count=0;
    int hitCount = 0;
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        blast();
        ded();
    }
    public void blast()
    {
        count++;
        if(count==100){
            fire();
            //setImage("Boss.png");
        }else if(count==200){
            fire2();
            count = 0;
            //setImage("Boss.png");
        }
    }
    public void fire(){
        setImage("BossA.png");
        getWorld().addObject(new Bossfire(),getX() ,getY());
    }
    public void fire2(){
        setImage("BossA.png");
        getWorld().addObject(new Bossfire2(),getX(), getY());
    }
    public void ded() {
        if (isTouching(bomb.class)) {
            getWorld().addObject(new lenyap(), getX(), getY());
            hitCount++;
        } else if (hitCount >= 5) {
            getWorld().addObject(new lenyap(), getX(), getY());
            boss boss = new boss();
            getWorld().removeObject(boss);
            hitCount = 0;
        }
    }
}