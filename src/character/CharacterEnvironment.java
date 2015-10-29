/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Kyle
 */
class CharacterEnvironment extends Environment {
    
    private Isaac isaac;
    private Isaac testIsaac;
    private Fly fly;
    
    private int colorChange;
    private int wingChange;
    private int xChange;
    private int yChange;
    private int widthChange;
    private int heightChange;
    
    public CharacterEnvironment() {
        
        fly = new Fly(260, 140, 30, 30);
        
        isaac = new Isaac(250, 100, 400, 400);
//        testIsaac = new Isaac(10, 10, 200, 200);
        
        this.setBackground(new Color(117, 37, 41));
    }

    @Override
    public void initializeEnvironment() {
    
    }

    @Override
    public void timerTaskHandler() {
        
        if (fly != null) {
            if (colorChange <= 3) {
                colorChange++;
                
            } else {
                colorChange = 0;
            }
            
            fly.setColor(colorChange);
            
            if (wingChange == 0) {
               wingChange++;
            } else {
               wingChange = 0;
            }
            
            fly.setWing(wingChange);
            if (colorChange == 0) {
            xChange = (int) (Math.random() * 3)- 1;
            yChange = (int) (Math.random() * 3)- 1;
            widthChange = (int) (Math.random() * 3)- 1;
            
            widthChange = 0; //cancels the fly moving towards and away from the screen
            
            fly.setPos(xChange, yChange, widthChange);
            
            }
        }
    
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        //IGNORE THIS STUFF! I didn't finish it B)
        
        //purple lump
//        graphics.setColor(Color.BLACK);                   // - outline
//        graphics.fillOval(212, 292, 216, 136);
//        graphics.fillOval(64, 240, 256, 186);
//        graphics.fillOval(-120, 190, 340, 250);
//        graphics.setColor(new Color(37, 23, 30));         // - dark shade
//        graphics.fillOval(220, 300, 200, 120);
//        graphics.fillOval(72, 248, 240, 170);
//        graphics.fillOval(-112, 198, 324, 234);
//        graphics.setColor(new Color(56, 33, 45));         // - body
//        graphics.fillOval(224, 300, 188, 96);
//        graphics.fillOval(87, 248, 220, 150);
//        graphics.fillOval(-108, 198, 312, 204);
//        graphics.setColor(new Color(104, 62, 88));        // - light shade
//        graphics.fillOval(140, 254, 144, 80);
//        graphics.setColor(new Color(255, 255, 255, 120)); // - shine
//        graphics.fillOval(230, 264, 24, 12);
        
        if (isaac != null) {
            isaac.draw(graphics);
        }
        if (fly != null) {
            fly.draw(graphics);
        }
            if (testIsaac != null) {
            testIsaac.draw(graphics);
        }
        
        
    }
    
}
