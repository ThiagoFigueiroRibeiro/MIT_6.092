import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing.*/ 
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second.
     * @param surface */
    public void draw(Graphics surface) {
        
        /* Drawing a line */
        surface.drawLine(50, 50, 250, 250);
        
        /* Drawing a string */        
        surface.drawString("String!", 50, 50);
        
        /* Drawing a polygon */
        int [ ] x = {20, 35, 50, 65, 80, 95};
        int [ ] y = {60, 105, 105, 110, 95, 95};
        surface.drawPolygon(x, y, 6);
        
        /* Drawing a box */
        box.draw(surface);

        /* Drawing a rectangle */        
        surface.drawRoundRect(35,45,25,35,10,10);
    }
} 
