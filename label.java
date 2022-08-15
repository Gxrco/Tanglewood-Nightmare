import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class label extends Actor
{
    public void label()
    {
        String text = "Press and hold SPACE to hide";
        GreenfootImage img = new GreenfootImage(text, 20, Color.WHITE, new Color(0, 0, 0, 0));
        img.drawImage(img, 420-img.getWidth()/2, 200);
        setImage (img);
    }
    /**
     * Act - do whatever the label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        label();
    }
    
}
