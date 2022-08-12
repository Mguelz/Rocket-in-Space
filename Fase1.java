import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends World
{
    /**
     * Constructor for objects of class Fase1.
     * 
     */
    public Fase1()
    {    
        super(1100, 600, 1); 

        addObject(new Rocket(),129 ,286);
        addObject(new Enemy(),1023 ,270);
        addObject(new Asteroide(),196 ,115);
        addObject(new Asteroide(),648 ,81);
        addObject(new Asteroide(),563 ,309);
        addObject(new Asteroide(),1058 ,120);
        addObject(new Asteroide(),969 ,477);
    }
}
