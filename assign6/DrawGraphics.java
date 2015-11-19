import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSpriteOne;
    Bouncer movingSpriteTwo;
    NotBouncer movingSpriteThree;
    NotBouncer movingSpriteFour;
    
    ArrayList<Rectangle> rekts = new ArrayList <>();
    ArrayList<Rectangle> StraightMovers = new ArrayList <>();    
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        
        rekts.add(new Rectangle(15, 20, Color.RED));
        movingSpriteOne = new Bouncer(100, 170, rekts.get(0));
        movingSpriteOne.setMovementVector(3, 1);
        
        rekts.add(new Rectangle(30, 40, Color.RED));
        movingSpriteTwo = new Bouncer(10, 17, rekts.get(1));
        movingSpriteTwo.setMovementVector(6, 2);        
        
        StraightMovers.add(new Rectangle(15, 20, Color.BLUE));    
        movingSpriteThree = new NotBouncer(50, 100, StraightMovers.get(0));
        movingSpriteThree.setMovementVector(2, 2);
        
        StraightMovers.add(new Rectangle(15, 20, Color.GREEN));    
        movingSpriteFour = new NotBouncer(150, 150, StraightMovers.get(0));
        movingSpriteFour.setMovementVector(-2, -2);        

    }

    /** Draw the contents of the window on surface.
     * @param surface */
    public void draw(Graphics surface) {
        movingSpriteOne.draw(surface);
        movingSpriteTwo.draw(surface);
        movingSpriteThree.draw(surface);
        movingSpriteFour.draw(surface);        
    }
}
