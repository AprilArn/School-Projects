import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pcommon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pcommon extends Actor
{
    private GreenfootImage myImages= getImage();
    private String[] paCom = {"Para1.png","Para2,5.png","Para2.png","Para3.png","Para4.png","Para5.png"};
    private int currentPar = 0;
    int xPos;
    int yPos;
    /**
     * Act - do whatever the Pcommon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pcommon(){
        getImage().scale(getImage().getWidth()*4, getImage().getHeight()*4);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-1,getY());
        animate();
    }
    public void animate()
    {
        if(getX()!=xPos|| getY()!=yPos)  //jika karakter berjalan, ini berubah
        {
            currentPar++;
            if (currentPar >= paCom.length) //animasi karakter berubah seperti awal jika gerakan berhenti
                currentPar=0;
                
            GreenfootImage newImage = new GreenfootImage(paCom[currentPar]);
            
            if(getX()>xPos)
                newImage.mirrorHorizontally();
            
            setImage(newImage);
            myImages=getImage();    
            getImage().scale(getImage().getWidth()*4, getImage().getHeight()*4);
            }
        xPos = getX();
        yPos = getY();
    }
}
