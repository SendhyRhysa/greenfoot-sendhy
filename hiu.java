import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hiu here.
 * 
 * @author (your name) 
 * @version (a version number or a da\te)
 */
public class hiu extends Actor
{
    /**
     * Act - do whatever the hiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if(Greenfoot.getRandomNumber(10)<1)
        {
            int randomAngle = Greenfoot.getRandomNumber(91)-45;
            setRotation(getRotation() + randomAngle);
        }
        
        
        
        checkForJangkar();
    }
    private void checkBounds()
    {
        int x = getX();
        int y = getY();
        
        int minX = 25;
        int maxX = getWorld().getWidth() - 25;
        int minY = 25;
        int maxY = getWorld().getHeight() - 25;
        
        if (x <= minX || x >= maxX || y <= minY || y >= maxY)
        {            
            setRotation(getRotation() + 180 + 
            Greenfoot.getRandomNumber(90) - 45) ;
        }
    }
    private void checkForJangkar()
    {
        Actor Jangkar = getOneObjectAtOffset(0, 0, Jangkar.class);
        if (Jangkar != null)
        {
            setRotation(getRotation() + 180 + 
            Greenfoot.getRandomNumber(90) - 45) ;
        }
    }
}
