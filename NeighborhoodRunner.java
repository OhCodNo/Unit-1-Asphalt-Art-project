import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
//Rella paints the background, being a full yellow
BackgroundPainter rella = new BackgroundPainter();

rella.paintBackground("yellow");
    rella.returnAfterBackground();

    CharacterPainter kliff = new CharacterPainter();
//my Kliff painter goes to the bottom left.
    kliff.startPosition();
    //Kliff draws and colors the shoulder on the left
    kliff.drawShoulder1();
    //kliff moves to the next position to draw the next part
    kliff.turnRight();
    kliff.turnRight();
    kliff.move();
    kliff.move();
    kliff.move();
    kliff.move();
    kliff.move();
    //kliff draws the next part, being the torso, then moves to draw right shoulder
    kliff.drawTorso();
    kliff.move();
    kliff.move();
    kliff.move();
    kliff.drawShoulder2();
    //kliff then goes from the shoulder to the hair, no movement required.
    kliff.drawHair();
    //Kliff draws the face, the final part.
    kliff.drawFace();
    /*
    If this is all done correct, Kliff should've painted the character.
   Every detail of the character is finished with no broken lines. 
   If so, we did it! We did the drawing!

   P.S. This character is actually Rella, the painter, which is a
   character of mine, so this was fun to make despite the time.
    */
  }
}
