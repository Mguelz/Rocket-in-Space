import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    public void act()
    {
        redimencionarImagem();
        mover();
        virarAleatoriamente();
        virar360();
    }
    
    public void redimencionarImagem() {
        GreenfootImage rocket_enemy = new GreenfootImage("testestetes.png");
        rocket_enemy.scale(103,40);
        setImage(rocket_enemy);
        matarRocket();
    }
    
    public void mover() {
        move(-5);
    }
    
    public void virarAleatoriamente() {
        if  (Greenfoot.getRandomNumber(181) < 10) {
            turn(Greenfoot.getRandomNumber(30));
        }
    }
    
    public void virar360() {
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 5);
        }
    }
    
    public void matarRocket() {
        if (isTouching(Rocket.class)) {
            removeTouching(Rocket.class);
            Greenfoot.stop();
        }
    }
}
