import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bumwi bumwi = new bumwi();
        addObject(bumwi,960,459);
        bumwi.setLocation(822,448);
        bumwi.setLocation(787,367);
        bumwi.setLocation(778,394);
        bumwi.setLocation(815,592);
        bumwi.setLocation(977,519);
        bumwi.setLocation(946,535);
        bumwi.setLocation(1052,548);
        bumwi.setLocation(1051,713);
        bumwi.setLocation(1152,587);
        bumwi.setLocation(1414,487);
        bumwi.setLocation(1011,550);
        bumwi.setLocation(874,491);
        bumwi.setLocation(915,450);
        bumwi.setLocation(850,469);
        bumwi.setLocation(866,424);
        bumwi.setLocation(1074,636);
        bumwi.setLocation(1021,616);
        bumwi.setLocation(875,489);
        bumwi.setLocation(888,463);
        bumwi.setLocation(912,533);
        bumwi.setLocation(880,454);
        bumwi.setLocation(974,527);
        bumwi.setLocation(793,566);
        Starto starto = new Starto();
        addObject(starto,294,355);
        starto.setLocation(291,353);
        starto.setLocation(249,343);
        gorrilla gorrilla = new gorrilla();
        addObject(gorrilla,249,222);
        gorrilla.setLocation(249,229);
        starto.setLocation(235,349);
        gorrilla.setLocation(240,245);
        gorrilla.setLocation(240,232);
        gorrilla.setLocation(233,232);
        titeru titeru = new titeru();
        addObject(titeru,706,70);
    }
}
