import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
// paints a singular line
    public void paintLine(String color){
        while (canMove()){
            paint(color);
            move();
        }
        paint(color);
    }

    public void paintBackground(String color){
        /* The painter will keep painting quarters until it's equal to 4 times,
     If the painter reaches 3 times, it's triggered as a conditional to state that the 4th quarter is the last.
     This is used for the NOT operator below.
     This method uses a string command to get the color
      */
        for (int i = 0; i < 4; i++) {
            boolean isLast = (i == 3);
            paintQuarter(color, isLast);
        }
    }

    /* This is a repeated code, it's meant to take a quarter of the board. 
  This means it does a 8x32 fill when it's called once.
  This method uses a string command to get the color and a boolean if paintBackground is called.
  */
    public void paintQuarter(String color, boolean lastQuarter){
        paintLine(color);
        paint(color);
        turnRight();
        move();
        turnRight();
        paintLine(color);
        paint(color);    
        turnLeft();
        move();
        turnLeft();
        paintLine(color);
        paint(color);
        turnRight();
        move();
        turnRight();
        paintLine(color);
        paint(color);
        turnLeft();
        move();
        turnLeft();
        paintLine(color);
        paint(color);
        turnRight();
        move();
        turnRight();
        paintLine(color);
        paint(color);
        turnLeft();
        move();
        turnLeft();
        paintLine(color);
        paint(color);
        turnRight();
        move();
        turnRight();
        paintLine(color);
        paint(color);
        /* If the code isn't the last quarter, the painter won't move down and to the left again,
      I added this here to make sure a logic error doesn't happen.
          */
        if (!lastQuarter) {
            turnLeft();
            move();
            turnLeft();
        }
    }
  /* This simply brings the painter back to the top and facing the east
  [DO NOT USE THIS UNTIL AFTER THE PAINT BACKGROUND METHOD IS USED]
  This is mostly obvious for programmers due to the name of the method.
  */
  public void returnAfterBackground(){
    turnRight();
    moveFast();
    turnRight();
  }
}