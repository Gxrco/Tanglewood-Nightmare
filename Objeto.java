import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objeto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objeto extends Actor
{
    /**
     * Act - do whatever the Objeto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ControlWorld thisWorld;
    public void act()
    {
        Actor player = getOneIntersectingObject(User1.class);
        
        if(player != null){
            thisWorld.score++;
            getWorld().removeObject(this);         
        }
    }

}
