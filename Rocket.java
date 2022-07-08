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
        trocarImagem();
        finalDoJogo();
        fase1to2();
        fase2to3();
    }

    public void trocarImagem() {
        GreenfootImage rocket = new GreenfootImage("rocket_player.png");
        rocket.scale(111, 110);
        setImage(rocket);
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
            getWorld().showText("Asteroides Coletados:"+pontos, 130, 20);
        }
    }
    
    public void finalDoJogo() {
        if (pontos == 29) {
            Greenfoot.stop();
            getWorld().showText("You Win, Congratulations", 575, 300);
        }
    }
    
    public void fase1to2() {
        if( pontos == 5) {
            Greenfoot.setWorld(new Fase2());
        }
    }
    
    public void fase2to3() {
        if( pontos == 15) {
            Greenfoot.setWorld(new Fase3());
        }
    }
}
