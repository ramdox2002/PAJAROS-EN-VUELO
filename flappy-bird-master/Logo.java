import greenfoot.*;  

public class Logo extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")||Greenfoot.mouseClicked(null)||Greenfoot.isKeyDown("space")) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
        }
    }    
}
