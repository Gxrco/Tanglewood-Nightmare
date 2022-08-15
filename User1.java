import greenfoot.*;

public class User1 extends Actor
{
    private int visibility = 250;
    
    public User1()
    {
        getImage().scale(60, 60);
    }

    public void act()
    {
        mover();
        
        
        int x = 0, y = 0;
        
        if(x == 0 && y == 0) return;
        
        x = 0; y = 0;
        
        
    }
    
    public void mover()
    {
        int x = getX(), y = getY();
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-5);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+5,getY());
        }
        if (isTouching(wall.class))
        {
            setLocation(x,y);
        }
        if (isTouching(mueble.class))
        {
            setLocation(x,y);
            if (Greenfoot.isKeyDown("Space"))
            {
                move1();
            }
        }
        if (isTouching(mueble.class)==false )
        {
            move2();
        }
    }
    public void move1()
    {
        getImage().setTransparency(0);
        setVisibility(0);
    }
    public void move2()
    {
        if (Greenfoot.isKeyDown("Space")==false)
        {
            getImage().setTransparency(250);
            setVisibility(250);
        }
    }
    
    public void setVisibility(int visibility){
        this.visibility = visibility;
    }
    
    public int getVisibility(){
        return visibility;
    }
    
    
}
