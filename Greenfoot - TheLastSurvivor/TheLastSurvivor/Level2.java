import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    private void prepare(){
        for(int i = 22; i < 1150; i+=47)
            addObject(new Ground2(), i, 577);
        for(int i = 160; i < 1100; i+=47)
            addObject(new Floaty2(), i, 175);
        for(int i = 34; i < 970; i+=47)
            addObject(new Floaty2(), i, 370);
        Person person = new Person();
        addObject(person,0,526);
        Floaty2 floaty241 = new Floaty2();
        addObject(floaty241,1074,475);
        floaty241.setLocation(1090,477);
        Floaty2 floaty242 = new Floaty2();
        addObject(floaty242,59,277);
        floaty242.setLocation(8,269);
        Portal3 portal3 = new Portal3();
        addObject(portal3,1044,108);
        portal3.setLocation(1065,115);
        Portal2 portal2 = new Portal2();
        addObject(portal2,182,394);
        portal2.setLocation(35,524);
        person.setLocation(110,529);
        Fireball2 fireball2 = new Fireball2();
        addObject(fireball2,200,431);
        fireball2.setLocation(1,340);
        Fireball fireball = new Fireball();
        addObject(fireball,1065,549);
        fireball.setLocation(1099,540);
        Pelite2 pelite = new Pelite2();
        addObject(pelite,26,240);
        Pcommon pcommon = new Pcommon();
        addObject(pcommon,986,546);
        Pcommon pcommon2 = new Pcommon();
        addObject(pcommon2,892,547);
        Pcommon pcommon3 = new Pcommon();
        addObject(pcommon3,792,549);
        Pcommon pcommon4 = new Pcommon();
        addObject(pcommon4,710,547);
        Pcommon pcommon5 = new Pcommon();
        addObject(pcommon5,627,549);
        Pcommon pcommon6 = new Pcommon();
        addObject(pcommon6,548,552);
    }
}
