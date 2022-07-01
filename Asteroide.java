import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Asteroide extends Actor
{
    public void act()
    {
        mover();
        tocarBorda();
    }
    
    public void mover() {
        move(1);
        if (Greenfoot.getRandomNumber(7) < 4) {
            turn(Greenfoot.getRandomNumber(10));
        }
    }
    
    public void tocarBorda() {
        if (isAtEdge()) {
           turn(Greenfoot.getRandomNumber(181)); 
        }
    }
}
