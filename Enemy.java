import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    public void act()
    {
        mover();
        tocarBorda();
        tocarRocket();
    }
    
    public void mover() {
        move(-5);
        if  (Greenfoot.getRandomNumber(181) < 10) {
            turn(Greenfoot.getRandomNumber(30));
        }
    }
    
    public void tocarBorda() {
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 5);
        }
    }
    
    public void tocarRocket() {
        if (isTouching(Rocket.class)) {
            removeTouching(Rocket.class);
            Greenfoot.stop();
        }
    }
}
