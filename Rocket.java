import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Actor
{
    int pontos = 0;
    
    public void act()
    {
        mover();
        moverUsandoTecla();
        tocarBorda();
        tocarAsteroide();
    }

    public void mover() {
        move(4);
    }

    public void moverUsandoTecla() {
        if (Greenfoot.isKeyDown("w")) {
            move(7);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-7);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(7);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-7);
        }
        if (Greenfoot.isKeyDown("space")) {
            move(-4);
        }
    }
    
    public void tocarBorda() {
        if(isAtEdge()) {
            turn(180);
        }
    }
    
    public void tocarAsteroide() {
        if (isTouching(Asteroide.class)) {
            removeTouching(Asteroide.class);
            pontos++;
            getWorld().showText("Asteroides:"+pontos, 70, 20);
        }
    }
}
