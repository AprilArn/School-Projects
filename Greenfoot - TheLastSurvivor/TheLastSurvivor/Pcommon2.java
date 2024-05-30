import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pcommon2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pcommon2 extends Actor
{
    private GreenfootImage myImages= getImage();
    private String[] paCom = {"RPara1.png","RPara2,5.png","RPara2.png","RPara3.png","RPara4.png","RPara5.png"};
    private int currentPar = 0;
    int xPos;
    int yPos;
    /**
     * Act - do whatever the Pcommon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pcommon2(){
        getImage().scale(getImage().getWidth()*4, getImage().getHeight()*4);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+2,getY());
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
            
            if(getX()<xPos)
                newImage.mirrorHorizontally();
            
            setImage(newImage);
            myImages=getImage();    
            getImage().scale(getImage().getWidth()*4, getImage().getHeight()*4);
            }
        xPos = getX();
        yPos = getY();
    }
}
