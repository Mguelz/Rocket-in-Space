import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,129,286);
        Enemy enemy = new Enemy();
        addObject(enemy,941,91);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,941,91);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,605,475);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,50,65);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,239,470);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,481,179);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,906,360);
        Asteroide asteroide = new Asteroide();
        addObject(asteroide,593,82);
        Asteroide asteroide2 = new Asteroide();
        addObject(asteroide2,92,512);
        Asteroide asteroide3 = new Asteroide();
        addObject(asteroide3,92,512);
        Asteroide asteroide4 = new Asteroide();
        addObject(asteroide4,120,166);
        Asteroide asteroide5 = new Asteroide();
        addObject(asteroide5,56,376);
        Asteroide asteroide6 = new Asteroide();
        addObject(asteroide6,278,17);
        Asteroide asteroide7 = new Asteroide();
        addObject(asteroide7,412,352);
        Asteroide asteroide8 = new Asteroide();
        addObject(asteroide8,318,206);
        Asteroide asteroide9 = new Asteroide();
        addObject(asteroide9,799,274);
        Asteroide asteroide10 = new Asteroide();
        addObject(asteroide10,682,206);
        Asteroide asteroide11 = new Asteroide();
        addObject(asteroide11,581,323);
        Asteroide asteroide12 = new Asteroide();
        addObject(asteroide12,803,494);
        Asteroide asteroide13 = new Asteroide();
        addObject(asteroide13,742,414);
        Asteroide asteroide14 = new Asteroide();
        addObject(asteroide14,425,478);
        Asteroide asteroide15 = new Asteroide();
        addObject(asteroide15,232,357);
        Asteroide asteroide16 = new Asteroide();
        addObject(asteroide16,957,461);
        Asteroide asteroide17 = new Asteroide();
        addObject(asteroide17,957,461);
        Asteroide asteroide18 = new Asteroide();
        addObject(asteroide18,961,232);
        Asteroide asteroide19 = new Asteroide();
        addObject(asteroide19,961,232);
        Asteroide asteroide20 = new Asteroide();
        addObject(asteroide20,1118,31);
        Asteroide asteroide21 = new Asteroide();
        addObject(asteroide21,833,158);
        Asteroide asteroide22 = new Asteroide();
        addObject(asteroide22,444,24);
        Asteroide asteroide23 = new Asteroide();
        addObject(asteroide23,444,24);
        Asteroide asteroide24 = new Asteroide();
        addObject(asteroide24,1102,432);
        Asteroide asteroide25 = new Asteroide();
        addObject(asteroide25,1089,201);
        Asteroide asteroide26 = new Asteroide();
        addObject(asteroide26,1059,560);
        Asteroide asteroide27 = new Asteroide();
        addObject(asteroide27,649,571);
        Asteroide asteroide28 = new Asteroide();
        addObject(asteroide28,649,571);
        Asteroide asteroide29 = new Asteroide();
        addObject(asteroide29,388,581);
        removeObject(enemy3);
        enemy7.setLocation(724,394);
        enemy6.setLocation(594,170);
        enemy7.setLocation(899,360);
        asteroide14.setLocation(529,460);
    }
}
