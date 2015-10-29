/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Kyle
 */
public class Fly {
    
    public Fly(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        wingPos = 0;
        color = 0;
    }
    
    public void draw(Graphics graphics) {
        
        //wings
        if (wingPos == 0) {
            
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x - (width / 5), y - (height * 7 / 10), (width * 4 / 5), (width * 6 / 5));
        graphics.fillOval(x + (width * 2 / 5), y - (height * 7 / 10), (width * 4 / 5), (width * 6 / 5));
        graphics.setColor(new Color(72, 72, 72));
        graphics.fillOval(x, y - (height / 2), (width * 2 / 5), (height * 4 / 5));
        graphics.fillOval(x + (width * 3 / 5), y - (height / 2), (width * 2 / 5), (height * 4 / 5));
        
        } else {
            
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x - (width * 7 / 10), y, (width * 6 / 5), (width * 4 / 5));
        graphics.fillOval(x + (width / 2), y, (width * 6 / 5), (height * 4 / 5));
        graphics.setColor(new Color(72, 72, 72));
        graphics.fillOval(x - (width / 2), y + (height / 5), (width * 4 / 5), (height * 2 / 5));
        graphics.fillOval(x + (width * 7 / 10), y + (height / 5), (width * 4 / 5), (height * 2 / 5));
            
        }
        
        //body
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x, y, width, height);
        if (color <= 2) {
            graphics.setColor(new Color(32, 32, 32));   
        } else {
            graphics.setColor(new Color(156, 0, 0));
        }
        graphics.fillOval(x + (width / 5), y + (height / 5), (width * 3 / 5), (height * 3 / 5));
        graphics.setColor(new Color(160, 160, 160, 50));
        graphics.fillOval(x + (width * 2 / 5), y + (height * 3 / 10), (height * 3 / 10), (height * 3 / 10));

    }
    
    private int x;
    private int y;
    private int width;
    private int height;
    private int wingPos;
    private int color;
    
    void setColor(int colorChange) {
        
        this.color = colorChange;
        
    }

    void setWing(int wingChange) {
        
        this.wingPos = wingChange;
        
    }

    void setPos(int xChange, int yChange, int widthChange) {
        this.x = this.x + xChange - widthChange;
        this.y = this.y + yChange - widthChange;
        this.width = this.width + (widthChange * 2);
        this.height = this.height + (widthChange * 2);
    }
    
}
