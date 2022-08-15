import greenfoot.*;

public class Room203 extends ControlWorld
{
    public Room203()
    {
        super(800, 600, 1);
        showText("Score: " + score, 50, 25);
        prepare();
        // set portals
        portalLeft = new Door();
        addObject(portalLeft, 30, getHeight()/2);
        portalUp = new Door();
        addObject(portalUp, getWidth()/2, 30);
        portalDown = new Door();
        addObject(portalDown, getWidth()/2, getHeight()-30);
    }

    public void act()
    {
        if (portalLeft.isUser1On())
        {
            World world = new Room202();
            world.addObject(player, world.getWidth()-2, player.getY());
            delaySpawning(world);
            Greenfoot.setWorld(world);
        }
        if (portalUp.isUser1On())
        {
            World world = new Room303();
            world.addObject(player, player.getX(), world.getHeight()-2);
            delaySpawning(world);
            Greenfoot.setWorld(world);
        }
        if (portalDown.isUser1On())
        {
            World world = new Room103();
            world.addObject(player, player.getX(), 1);
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
        addObject(wall4,751,250);
        wall wall5 = new wall();
        addObject(wall5,751,350);
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
        mueble mueble= new mueble();
        addObject(mueble,650,300);
        label label = new label();
        addObject(label, 651,301);
    }
}