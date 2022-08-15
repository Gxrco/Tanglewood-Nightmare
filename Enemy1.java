import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    private User1 player;
      
    public Enemy1() {
        getImage().scale(60, 60);
        
    }
      
    public void act() {
        
        if (getWorld().getObjects(User1.class).get(0).getVisibility() == 250){
            hitGhost();
            movementAI();
        } else {
            moveAround();
        }
    }
      
    private void movementAI() {
        move(3);
        if (getWorld().getObjects(User1.class).isEmpty()) return;
        Actor player = (Actor)getWorld().getObjects(User1.class).get(0);
        turnTowards(player.getX(), player.getY());
    }
    
    private void moveAround() {
        move(4);
        if (Greenfoot.getRandomNumber(100)< 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        
    }
    
    public void hitGhost(){
        Actor player = getOneIntersectingObject(User1.class);
        if(player != null){
        World world = getWorld();
        GameOver gameover = new GameOver();
        world.addObject(gameover, world.getWidth()/2, world.getHeight()/2);
        player.getImage().setTransparency(0);
        GreenfootSound scream = new GreenfootSound("ScreamV2.mp3");
        scream.play();
        scream.setVolume(100);
        Greenfoot.stop();    
        
    }
    
}}
