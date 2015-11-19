import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSpriteOne;
    Bouncer movingSpriteTwo;
    StraightMover movingSpriteThree;
    StraightMover movingSpriteFour;
    
    ArrayList<Rectangle> Moving = new ArrayList <>();
    ArrayList<Rectangle> NotMoving = new ArrayList <>();    
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        
        Moving.add(new Rectangle(15, 20, Color.RED));
        movingSpriteOne = new Bouncer(100, 170, Moving.get(0));
        movingSpriteOne.setMovementVector(3, 1);
        
        Moving.add(new Rectangle(30, 40, Color.YELLOW));
        movingSpriteTwo = new Bouncer(10, 17, Moving.get(1));
        movingSpriteTwo.setMovementVector(6, 2);        
        
        NotMoving.add(new Rectangle(15, 20, Color.BLUE));    
        movingSpriteThree = new StraightMover(50, 100, NotMoving.get(0));
        movingSpriteThree.setMovementVector(2, 2);
        
        NotMoving.add(new Rectangle(15, 20, Color.GREEN));    
        movingSpriteFour = new StraightMover(150, 150, NotMoving.get(1));
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
