/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Graphics;

/**
 *
 * @author Kyle
 */
public class Isaac {
    
    public Isaac(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics graphics) {
        
        graphics.drawRect(x, y, 200, 200);
        
        //start drawing here
        
    }
    
    private int x;
    private int y;
    
    
    
}
