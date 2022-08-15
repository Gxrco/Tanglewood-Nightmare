import greenfoot.*;
import java.util.Random;
public class Room103 extends ControlWorld
{
    public Room103()
    {
        
        super(800, 600, 1);
        prepare();
        showText("Score: " + score, 50, 25);
        // set portals
        portalLeft = new Door();
        addObject(portalLeft, 30, getHeight()/2);
        portalUp = new Door();
        addObject(portalUp, getWidth()/2, 30);
    }

    public void act()
    {
        if (portalLeft.isUser1On())
        {
            World world = new Room102();
            world.addObject(player, world.getWidth()-2, player.getY());
            delaySpawning(world);
            Greenfoot.setWorld(world);
        }
        if (portalUp.isUser1On())
        {
            World world = new Room203();
            world.addObject(player, player.getX(), world.getHeight()-2);
            delaySpawning(world);
            Greenfoot.setWorld(world);
        }
    }
    
    private void prepare(){
        
        wall wall = new wall();
        addObject(wall,51,50);
        wall wall1 = new wall();
        addObject(wall1,51,150);
        wall wall2 = new wall();
        addObject(wall2,151,50);
        wall wall3 = new wall();
        addObject(wall3,251,50);
        wall wall4 = new wall();
        addObject(wall4,351,550);
        wall wall5 = new wall();
        addObject(wall5,451,550);
        wall wall6 = new wall();
        addObject(wall6,551,50);
        wall wall7 = new wall();
        addObject(wall7,651,50);
        wall wall8 = new wall();
        addObject(wall8,751,50);
        wall wall9 = new wall();
        addObject(wall9,751,150);
        wall wall10 = new wall();
        addObject(wall10,51,450);
        wall wall11 = new wall();
        addObject(wall11,51,550);
        wall wall12 = new wall();
        addObject(wall12,151,550);
        wall wall13 = new wall();
        addObject(wall13,251,550);
        wall wall14 = new wall();
        addObject(wall14,551,550);
        wall wall15 = new wall();
        addObject(wall15,651,550);
        wall wall16 = new wall();
        addObject(wall16,751,550);
        wall wall17 = new wall();
        addObject(wall17,751,450);
        wall wall18 = new wall();
        addObject(wall18,751,250);
        wall wall19 = new wall();
        addObject(wall19,751,350);
        wall wall20 = new wall();
        addObject(wall20,751,450);
        mueble mueble= new mueble();
        addObject(mueble,150,150);
        label label = new label();
        addObject(label, 151,151);
        
        Random random = new Random();
        int height = random.nextInt(450 - 200) + 200;
        int width = random.nextInt(450 - 200) + 200;
        Objeto incienso = new Objeto();
        incienso.setImage("incienso.png");
        addObject(incienso, height, width);
    }
    
}