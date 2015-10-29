/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Kyle
 */
public class Isaac {
    
    public Isaac(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void draw(Graphics graphics) {
        
        //shadow
        graphics.setColor(new Color(0, 0, 0, 40));
        graphics.fillOval(x + (width * 110 / 400), y + (height * 350 / 400), width * 178 / 400, (height * 50 / 400));
        
        //legs - NOTE: Brighter leg skin tone located in the "body" section
        graphics.setColor(Color.BLACK);
        graphics.fillRoundRect(x + (width * 136 / 400), y + (height * 276 / 400), (width * 62 / 400), (height * 102 / 400), (width * 24 / 400), (height  * 24 / 400));  // - outline
        graphics.fillRoundRect(x + (width * 202 / 400), y + (height * 276 / 400), (width * 62 / 400), (height * 102 / 400), (width * 24 / 400), (height  * 24 / 400));  // - outline
        graphics.setColor(new Color(192, 133, 136));
        graphics.fillRoundRect(x + (width * 144 / 400), y + (height  * 276 / 400), (width * 46 / 400), (height  * 94 / 400), (width * 11 / 400), (height  * 11 / 400)); // - dark shade
        graphics.fillRoundRect(x + (width * 210 / 400), y + (height  * 276 / 400), (width * 46 / 400), (height  * 94 / 400), (width * 11 / 400), (height  * 11 / 400)); // - dark shade
        
        //arms
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 106 / 400), y + (height * 206 / 400), (width * 60 / 400), (height * 90 / 400));        // - outline
        graphics.fillOval(x + (width * 234 / 400), y + (height * 206 / 400), (int)(width * 60 / 400.9), (height * 90 / 400)); // - outline
        graphics.setColor(new Color(192, 133, 136));
        graphics.fillOval(x + (width * 114 / 400), y + (height * 214 / 400), (width * 44 / 400), (height * 74 / 400));        // - dark shade
        graphics.fillOval(x + (width * 242 / 400), y + (height * 214 / 400), (width * 44 / 400), (height * 74 / 400));        // - dark shade
        graphics.setColor(new Color(210, 146, 148));
        graphics.fillOval(x + (width * 120 / 400), y + (height * 206 / 400), (width * 44 / 400), (height * 74 / 400));        // - light shade
        graphics.fillOval(x + (width * 236 / 400), y + (height * 206 / 400), (width * 44 / 400), (height * 74 / 400));        // - light shade
        
        //body
        graphics.setColor(Color.BLACK);
        graphics.fillRoundRect(x + (width * 130 / 400), y + (height * 176 / 400), (width * 139 / 400), (height * 156 / 400), (width * 139 / 400), (height * 96 / 400)); // - outline
        graphics.setColor(new Color(210, 146, 148));
        graphics.fillRoundRect(x + (width * 138 / 400), y + (height * 192 / 400), (width * 123 / 400), (height * 132 / 400), (width * 123 / 400), (height * 76 / 400)); // - light shade
        graphics.fillRoundRect(x + (width * 144 / 400), y + (height * 276 / 400), (width * 46 / 400), (height * 88 / 400), (width * 24 / 400), 13 / (height * 400));    // - leg part
        graphics.fillRoundRect(x + (width * 210 / 400), y + (height * 276 / 400), (width * 46 / 400), (height * 88 / 400), (width * 24 / 400), 13 / (height * 400));    // - leg part
        graphics.setColor(new Color(192, 133, 136));
        graphics.fillOval(x + (width * 138 / 400), y + (height * 206 / 400), (width * 123 / 400), (height * 46 / 400));                                                                                                                   // - dark shade
        
        
        //head base
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 70 / 400), y + (height / 400), (width * 260 / 400), ((height * 240 / 400) - 2));
        graphics.setColor(new Color(192, 133, 136));
        graphics.fillOval(x + (width * 77 / 400), y + (height * 7 / 400), (width * 246 / 400), (height * 226 / 400));
        graphics.setColor(new Color(210, 146, 148));
        graphics.fillOval(x + (width * 77 / 400), y + (height * 7 / 400), (width * 246 / 400), (height * 210 / 400));      // - 
        graphics.setColor(new Color(255, 255, 255, 30));
        graphics.fillOval(x + (width * 132 / 400), y + (height * 20 / 400), (width * 60 / 400), (height * 30 / 400));      // - head shine
        graphics.fillOval(x + (width * 110 / 400), y + (height * 50 / 400), (width * 20 / 400), (height * 14 / 400));      // - head shine
        graphics.fillOval(x + (width * 147 / 400), y + (height * 308 / 400), (width * 8 / 400), (height * 36 / 400));      // - leg shine
        
        //mouth
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 183 / 400), y + (height * 170 / 400), (width * 34 / 400), (height * 30 / 400));
        graphics.setColor(new Color(210, 146, 148));
        graphics.fillOval(x + (width * 181 / 400), y + (height * 184 / 400), (width * 38 / 400), (height * 18 / 400));
        
        //tears base
        graphics.setColor(new Color(110, 242, 250, 140));
        graphics.fillRect(x + (width * 120 / 400), y + (height * 140 / 400), (width * 10 / 400), (height * 74 / 400));
        graphics.fillRect(x + (width * 130 / 400), y + (height * 140 / 400), (width * 14 / 400), (height * 80 / 400));
        graphics.fillRect(x + (width * 144 / 400), y + (height * 140 / 400), (width * 30 / 400), (height * 88 / 400));
        graphics.fillRect(x + (width * 164 / 400), y + (height * 228 / 400), (width * 10 / 400), (height * 4 / 400));
        graphics.fillRect(x + (width * 270 / 400), y + (height * 140 / 400), (width * 10 / 400), (height * 74 / 400));
        graphics.fillRect(x + (width * 256 / 400), y + (height * 140 / 400), (width * 14 / 400), (height * 80 / 400));
        graphics.fillRect(x + (width * 226 / 400), y + (height * 140 / 400), (width * 30 / 400), (height * 88 / 400));
        graphics.fillRect(x + (width * 226 / 400), y + (height * 228 / 400), (width * 10 / 400), (height * 4 / 400));
        graphics.setColor(new Color(138, 194, 198));
        graphics.fillOval(x + (width * 118 / 400), y + (height * 150 / 400), (width * 56 / 400), (height * 30 / 400));
        graphics.fillOval(x + (width * 226 / 400), y + (height * 150 / 400), (width * 56 / 400), (height * 30 / 400));
        
        //tears outline
        graphics.setColor(Color.BLACK);
        graphics.fillRoundRect(x + (width * 110 / 400), y + (height * 140 / 400), (width * 10 / 400), (height * 70 / 400), (width * 10 / 400), (height * 10 / 400));
        graphics.fillRoundRect(x + (width * 172 / 400), y + (height * 142 / 400), (width * 10 / 400), (height * 96 / 400), (width * 10 / 400), (height * 10 / 400));
        graphics.fillRoundRect(x + (width * 280 / 400), y + (height * 140 / 400), (width * 10 / 400), (height * 70 / 400), (width * 10 / 400), (height * 10 / 400));
        graphics.fillRoundRect(x + (width * 218 / 400), y + (height * 142 / 400), (width * 10 / 400), (height * 96 / 400), (width * 10 / 400), (height * 10 / 400));
        
        //eyes
        graphics.fillOval(x + (width * 102 / 400), y + (height * 86 / 400), (width * 86 / 400), (height * 86 / 400));
        graphics.fillOval(x + (width * 210 / 400), y + (height * 86 / 400), (width * 86 / 400), (height * 86 / 400));
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 116 / 400), y + (height * 100 / 400), (width * 30 / 400), (height * 30 / 400));
        graphics.fillOval(x + (width * 154 / 400), y + (height * 138 / 400), (width * 18 / 400), (height * 18 / 400));
        graphics.fillOval(x + (width * 224 / 400), y + (height * 100 / 400), (width * 30 / 400), (height * 30 / 400));
        graphics.fillOval(x + (width * 262 / 400), y + (height * 138 / 400), (width * 18 / 400), (height * 18 / 400));
        
        //head outline
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + (width * 70 / 400), y + (height / 400), (width * 260 / 400), ((height * 240 / 400) - 2));
        graphics.drawOval(x + (width * 71 / 400), y + (height * 1 / 400), (width * 258 / 400), (height * 238 / 400));
        graphics.drawOval(x + (width * 72 / 400), y + (height * 2 / 400), (width * 256 / 400), (height * 236 / 400));
        graphics.drawOval(x + (width * 73 / 400), y + (height * 3 / 400), (width * 254 / 400), (height * 234 / 400));
        graphics.drawOval(x + (width * 74 / 400), y + (height * 4 / 400), (width * 252 / 400), (height * 232 / 400));
        graphics.drawOval(x + (width * 75 / 400), y + (height * 5 / 400), (width * 250 / 400), (height * 230 / 400));
        graphics.drawOval(x + (width * 76 / 400), y + (height * 6 / 400), (width * 248 / 400), (height * 228 / 400));
        graphics.drawOval(x + (width * 77 / 400), y + (height * 7 / 400), (width * 246 / 400), (height * 226 / 400));
        
    }
    
    private int x;
    private int y;
    private int width;
    private int height;
    
}
