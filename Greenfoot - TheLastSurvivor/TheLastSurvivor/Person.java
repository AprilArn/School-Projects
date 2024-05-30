import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private GreenfootImage myImages= getImage();
    private String[] runSur = {"State.png","Run1.png","Run2.png","Run3.png","Run4.png"};
    private int currentRun = 0;
    private int health = 5000;
    int count = 0;
    int xPos;
    int yPos;
    public Person(){
        getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
    }
    int vSpeed = 0;
    int accel = 0;
    public void addedToWorld(World W)
    {
        xPos = getX();
        yPos = getY();
    }
    public void act(){
        fall();
        checkFalling();
        astroMovement();
        levelUp();
        ded();
        bim();
        showStatus();
        removeHealth();
        gameOver();
        enemy2Spawn();
    }
    public void bim()
    {
        if(Greenfoot.isKeyDown("right")){
            beam();
        }else if (Greenfoot.isKeyDown("left")){
            Lbeam();
        }
    }
    public void beam()
    {   currentRun++;
        if(currentRun >=5)
        {
            getWorld().addObject(new bomb(), getX(), getY()); 
            setImage("Shoot.png");
            getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
            currentRun = 0;
        }
    }
    public void Lbeam()
    {   currentRun++;
        if(currentRun >=5)
        {
            getWorld().addObject(new bomb2(), getX(), getY()); 
            setImage("LShoot.png");
            getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
            currentRun = 0;
        }
    }
    public void animateOnMove()
    {
        if(getX()!=xPos|| getY()!=yPos)  //jika karakter berjalan, ini berubah
        {
            currentRun++;
            if (currentRun >= runSur.length) //animasi karakter berubah seperti awal jika gerakan berhenti
                currentRun=0;
                
            GreenfootImage newImage = new GreenfootImage(runSur[currentRun]);
            
            if(getX()<xPos)
                newImage.mirrorHorizontally();
            
            setImage(newImage);
            myImages=getImage();
            getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
        }
        xPos = getX();
        yPos = getY();
    }
    public void astroMovement(){
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+5, getY());
            animateOnMove();
        }
        else{
            setImage("State.png");
            getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-5, getY());
            animateOnMove();
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
            animateOnMove();
        }
        if(Greenfoot.isKeyDown("space")){
            setLocation(getX(), getY()-12);
            setImage("Jump3.png");
            getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
        }
    }
    public void fall(){
        setLocation(getX(), getY() + vSpeed);
    }
    public void checkFalling(){
        GreenfootImage newImage = new GreenfootImage(runSur[0]);
        if(isTouching(Ground.class)){
            vSpeed = 0;
        }
        else if(isTouching(Ground2.class)){
            vSpeed = 0;
        }
        else if(isTouching(ground3.class)){
            vSpeed = 0;
        }
        else if(isTouching(Floaty.class)){
            vSpeed = 0;
        }
        else if(isTouching(Floaty2.class)){
            vSpeed = 0;
        }
        else if(isTouching(wall.class)){
            vSpeed = 0;
        }
        else if (isTouching(Ft1.class))
        {
            vSpeed = 0;
        }
        else if (isTouching(Ft2.class))
        {
            vSpeed = 0;
        }
        else{
            vSpeed++;
        }
    }
    public void levelUp(){
        if(isTouching(Portal.class)){
            Greenfoot.setWorld(new Level2());
            //Greenfoot.playSound("tele.png");
        } else if (isTouching(Portal3.class)){
            Greenfoot.setWorld(new level3());
            //Greenfoot.playSound("tele.png");
            setLocation(86, 49);
        }
    }
    public void ded(){
        if (isTouching(Fireball.class)){
            setLocation(getX()-150, getY()-50);
            health-=1000;
            showStatus();
            gameOver();
            //Greenfoot.playSound("FBhit.wav");
        } else if (isTouching(Fireball2.class)) {
            setLocation(getX()-150, getY()-50);
            health-=1000;
            showStatus();
            gameOver();
            //Greenfoot.playSound("FBhit.wav");
        }
    }
    public void showStatus() {
        getWorld().showText("score : "+health, 1000, 15);
    }
    public void removeHealth() {
        if (isTouching(Pcommon.class)) { 
            setLocation(getX()-150, getY()-50);
            health-=1000;;
            Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        } else if (isTouching(Pcommon2.class)) {
            setLocation(getX()+150, getY()-50);
            health-=1000;
            Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        } else if (isTouching(Elslash.class)) {
            setLocation(31, 300);
            health-=1000;
            Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        } else if (isTouching(Elslash2.class)) {
            setLocation(1064, 380);
            health-=1000;
            Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        }else if (isTouching(Bossfire.class)) {
            setLocation(86, 49);
            health-=2000;
            //Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        }else if (isTouching(Bossfire2.class)) {
            setLocation(86, 49);
            health-=2000;
            //Greenfoot.playSound("FBhit.wav");
            showStatus();
            gameOver();
        }
    }
    public void gameOver() {
        if(health <= 0){
            setImage("GOt.png");
            setLocation(550,300);
            Greenfoot.delay(10);
            Greenfoot.playSound("dead.wav");
            getWorld().addObject(new back(), 66, 30);
        }
    }
    public void enemy2Spawn() {
        count++;
        if (isTouching(Ft1.class) && (count>=5)) {
            spawn();
            count=0;
        }
    }
    public void spawn() {
        if (count>40) {
            Pcommon2 pcommon2 = new Pcommon2();
            getWorld().addObject(new Pcommon2(), 130, 340);
        }
    }
}
