import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fase2 extends World
{
   public Fase2()
    {    
        super(1100, 600, 1); 
        
        addObject(new Rocket(),129 ,286);
        addObject(new Enemy(),1023 ,270);
        addObject(new Asteroide(),196 ,115);
        addObject(new Asteroide(),648 ,81);
        addObject(new Asteroide(),563 ,309);
        addObject(new Asteroide(),1058 ,120);
        addObject(new Asteroide(),969 ,477);
        
        //asteroides teste para consguir passar do nivel 2 pro 3
        addObject(new Asteroide(),969 ,47);
        addObject(new Asteroide(),67 ,47);
        addObject(new Asteroide(),56 ,81);
        addObject(new Asteroide(),9 ,477);
        addObject(new Asteroide(),62 ,7);
        addObject(new Asteroide(),969 ,50);
        addObject(new Asteroide(),59 ,477);
        addObject(new Asteroide(),33 ,31);
        addObject(new Asteroide(),55 ,71);
        addObject(new Asteroide(),39 ,10);
        addObject(new Enemy(),323 ,121);
    }
}
