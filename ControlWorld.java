import greenfoot.*;
import java.lang.*;

public class ControlWorld extends World
{
    static Actor player;
    static Actor enemy;
    public static int score = 0;
    Portal portalLeft, portalRight, portalUp, portalDown;
    GreenfootSound music = new GreenfootSound("Tanglewood Nightmare OST.mp3");
    GreenfootSound sfx = new GreenfootSound("GhostSFX.mp3");
    /**
     * This initial world constructor starts the control of changing worlds for a 3x3 grid of worlds.
     */
    
    
    
    public ControlWorld()
    {
        super(800, 600, 1);
        player = new User1();
        enemy = new Enemy1();
        String text = "Tanglewood Nightmare\n\nAlpha Version\n\nPress 'Run' to play.";
        GreenfootImage img = new GreenfootImage(text, 40, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(img, 420-img.getWidth()/2, 225);
        music.setVolume(50);
        music.playLoop();
        prepare();
        showText("Score: " + score, 50, 25);
    }

    public void act()
    {
        World world = new Room301();
        world.addObject(player, 1, 300);
        Greenfoot.setWorld(world);
        world.addObject(enemy, 600, 300);
        sfx.setVolume(60);
        sfx.playLoop();
    }

    public ControlWorld(int wide, int high, int cellsize)
    {
        super(wide, high, cellsize);
    }
    
    public void delaySpawning(World world) {
        world.addObject(enemy, player.getX()-150, player.getY()-150);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
    }
    
}