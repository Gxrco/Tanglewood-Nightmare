import greenfoot.*;

public class Portal extends Actor
{
    boolean isActive;
    
    public Portal()
    {
    }
    
    public boolean isUser1On()
    {
        return isActive && getOneIntersectingObject(User1.class)!= null;
    }
    
    public void act()
    {
        if (!isActive && getOneIntersectingObject(User1.class) == null) isActive = true;
    }
}