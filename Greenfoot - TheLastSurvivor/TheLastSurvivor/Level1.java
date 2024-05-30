import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private int score;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public int getScore(){
        return score;
    }
    
    public void addScore(int amt){
        score += amt;
    }
    
    private void prepare()
    {
        for(int i = 22; i < 1150; i+=47)
            addObject(new Ground(), i, 577);
        for(int i = 34; i < 970; i+=47)
            addObject(new Floaty(), i, 175);
        for(int i = 160; i < 1100; i+=47)
            addObject(new Floaty(), i, 370);    
        Person person = new Person();
        addObject(person,69,509);
        Portal portal = new Portal();
        addObject(portal,856,303);
        portal.setLocation(1061,512);
        person.setLocation(21,37);

        Pcommon pcommon = new Pcommon();
        addObject(pcommon,945,141);
        Pcommon pcommon2 = new Pcommon();
        addObject(pcommon2,839,142);
        Pcommon pcommon3 = new Pcommon();
        addObject(pcommon3,739,141);
        pcommon3.setLocation(738,153);
        pcommon2.setLocation(816,147);
        pcommon.setLocation(900,153);
        Pelite pelite = new Pelite();
        addObject(pelite,24,536);
        Ft1 ft1 = new Ft1();
        addObject(ft1,1057,247);
        Ft2 ft2 = new Ft2();
        addObject(ft2,18,489);
        ft1.setLocation(1065,288);
        ft2.setLocation(22,480);
        ft1.setLocation(1053,266);
    }
}

