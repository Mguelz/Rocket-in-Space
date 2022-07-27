import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Actor
{
    /**
     * Act - do whatever the Enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("enterBotao.png");
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse != null) {
            if(mouse.getActor() != null) {
                if(mouse.getActor().getClass() == Enter.class && mouse.getButton() == 1) {
                    //Greenfoot.setWorld(new Fase1()); (comando certo)
                    Greenfoot.setWorld(new Fase1()); //(comando errado)enquanto o bug da fase infinita nao funciona
                }
            }
        }
    }
}
