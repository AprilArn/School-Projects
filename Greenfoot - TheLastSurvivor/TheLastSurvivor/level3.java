import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        for(int i = 22; i < 1150; i+=42)
            addObject(new ground3(), i, 580);
        for(int i = 19; i < 650; i+=42)
            addObject(new wall(), 19, i);
        Portel4 portel4 = new Portel4();
        addObject(portel4,97,11);
        portel4.setLocation(86,49);
        portel4.setLocation(88,67);
        Person person = new Person();
        addObject(person,88,67);
        boss boss = new boss();
        addObject(boss,907,351);
    }
}
