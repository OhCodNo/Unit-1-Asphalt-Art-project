import org.code.neighborhood.*;

/*
Note: This is meant to be precise at the bottom.
It's very reliant on other methods and the starting position of the painter.
I do doubt that most parts of this program would be able to function 
outside of the 32x32 grid.
*/

public class CharacterPainter extends PainterPlus {
/*
This code below this comment causes
the painter to go to the bottom Left corner to start.
*/
  public void startPosition() {
    turnRight();
    moveFast();
    turnRight();
    turnRight();
  }

  // Draws the first shoulder to the left.
  public void drawShoulder1() {
    paint("chocolate");
    drawUp("black", 2);
    drawRight("black");
    drawLeft("black");
    drawRight("black");
    drawUp("black", 5);
    drawRight("black");
    drawUp("black");
    drawRight("black");
    drawUp("black", 2);
    drawLeft("black");
    drawRight("chocolate");
    drawUp("chocolate", 2);
    drawRight("gold", 2);
    drawUp("chocolate");
    drawLeft("gold");
    drawRight("gold");
    drawUp("gold", 2);
    turnRight();
    turnRight();
    move();
    move();
    move();
    drawUp("gold");
  }

  // Draws the torso of the character + the neck, mostly paints in layers.
  public void drawTorso() {
    /*
    Draws a black box which seperates the Left
    shoulder from the torso.
    */
    drawUp("black");
    drawLeft("black");
    drawRight("black", 2);
    drawLeft("black", 2);
    drawRight("black", 2);
    drawLeft("black", 2);
    drawUp("black");
    drawRight("black");
    /*
    Begins the red area or the neck.
    or the armor collar to be specific
    */
    drawUp("maroon", 6);
    drawUp("red");
    drawLeft("maroon");
    drawRight("black");
    drawUp("black");
    turnRight();
    turnRight();
    move();
    drawLeft("black");
    drawUp("black");
    drawLeft("black");
    drawRight("chocolate");
    drawLeft("black");
    drawUp("black", 4);
    drawRight("black");
    drawLeft("black");
    drawRight("black");
    drawRight("chocolate");
    drawUp("gold");
    drawRight("chocolate");
    drawLeft("chocolate");
    drawUp("gold", 3);
    turnRight();
    move();
    drawLeft("black");
    drawUp("black");
    drawRight("red");
    drawLeft("red");
    drawUp("maroon", 4);
    drawUp("red", 2);
    drawLeft("red", 2);
    drawUp("red", 5);
    drawRight("black", 2);
    /*
    Draws the pattern below the red neck area,
    goes from Left to Right.
    */
    drawUp("brown");
    drawUp("maroon", 2);
    drawUp("brown");
    drawUp("black", 2);
    drawUp("chocolate");
    drawUp("gold", 2);
    drawUp("chocolate");
    move();
    move();
    move();
    turnLeft();
    /*
    Finishes the torso by drawing
    the last patch of color to the right.
    */
    drawUp("chocolate");
    drawLeft("chocolate");
    drawUp("chocolate");
    drawUp("gold", 4);
    drawUp("chocolate");
    drawUp("brown", 2);
    drawUp("maroon", 2);
    drawUp("brown", 2);
    drawUp("chocolate");
    drawUp("gold");
    drawLeft("chocolate");
    drawRight("gold", 2);
    drawLeft("gold");
    drawUp("gold", 3);
  }

  // Draws the last shoulder to the right.
  public void drawShoulder2() {
    drawUp("chocolate", 2);
    drawUp("gold");
    drawLeft("black");
    drawLeft("gold");
    drawUp("chocolate");
    drawRight("chocolate");
    drawLeft("chocolate");
    turnRight();
    turnRight();
    move();
    drawUp("black", 2);
    turnLeft();
    turnLeft();
    move();
    drawRight("black");
    drawLeft("black");
    drawUp("black");
    //Painter gets into position for hairPainter.
  }

  // Moves the painter right and paints, made this to save time.
  public void drawRight(String color) {
    turnRight();
    move();
    paint(color);
  }

  // Does multiple turns and paints to the right, this is for repeated patterns.
  public void drawRight(String color, int times) {
    for (int i = 0; i < times; i++) {
      drawRight(color);
    }
  }

  /*
  * Moves the painter left and paints, made this to save time.
  */
  public void drawLeft(String color) {
    turnLeft();
    move();
    paint(color);
  }

  // Does multiple turns and paints to the left.
  public void drawLeft(String color, int times) {
    for (int i = 0; i < times; i++) {
      drawLeft(color);
    }
  }

  // Moves the painter up and paints once.
  public void drawUp(String color) {
    move();
    paint(color);
  }

  // Moves the painter up and paints multiple times.
  public void drawUp(String color, int times) {
    for (int i = 0; i < times; i++) {
      move();
      paint(color);
    }
  }

  /*
   * Makes the hair of the character.
   */
  public void drawHair() {
    /* stage 1: back hair
    creates a silver shade meant to act as shading
    for the back of the hair, moves up in layers to the next stage.
    */
    drawUp("black", 3);
    drawUp("silver", 2);
    move();
    drawRight("silver", 2);
    drawUp("silver");
    drawUp("black", 4);
    drawLeft("black", 2);
    drawUp("silver");
    drawUp("black", 2);
    drawUp("silver");
    move();
    move();
    move();
    /* Stage 2, beginning the actual hair
    draws the actual hair with a white color.
    */
    drawRight("black", 2);
    drawUp("black", 3);
    drawUp("silver", 3);
    drawUp("black");
    move();
    drawLeft("black");
    drawLeft("silver");
    drawUp("white", 2);
    drawRight("white", 2);
    drawUp("silver");
    drawUp("black");
    /* beginning the ponytail thing
    While drawing the hair, the length has to extend
    to the right to create the hair accessory.
    */
    move();
    drawLeft("black", 2);
    drawUp("silver");
    drawUp("white", 2);
    drawRight("white", 2);
    drawUp("silver");
    drawUp("black", 3);
    drawLeft("black", 2);
    drawUp("black");
    drawUp("silver", 2);
    drawUp("white");
    drawRight("white");
    drawRight("silver");
    drawUp("black", 3);
    /*
    A bit more ponytail layering.
    */
    drawUp("silver");
    drawLeft("silver", 2);
    drawUp("black", 2);
    drawUp("white", 2);
    drawUp("silver");
    drawRight("silver");
    drawRight("white");
    drawUp("white", 2);
    drawUp("black");
    drawUp("silver", 2);
    drawLeft("silver");
    drawLeft("silver");
    drawUp("black");
    drawUp("white", 3);
    drawUp("silver");
    drawUp("black",3);
    move();
    drawRight("black");
    drawRight("black");
    drawUp("silver");
    /*
    Midsection of the hair.
    Usually does repeated layers with
    a bit of shading with the silver coloring.
    */
    drawUp("black");
    drawUp("silver");
    drawUp("white", 3);
    drawUp("black");
    drawUp("silver", 2);
    drawLeft("silver");
    drawLeft("silver");
    drawUp("black");
    drawUp("white", 4);
    drawUp("silver");
    drawUp("white");
    drawUp("silver");
    drawUp("black");
    turnRight();
    turnRight();
    moveFast();
    /*Long lines of hair color made me impliment the int value
      to save both time and space in the program.
*/
    drawLeft("white");
    drawLeft("silver");
    drawUp("black");
    drawUp("white",7);
    drawUp("silver");
    drawUp("black");
    /*
    Resets the position to continue the longer
    layers of hair.
    I used move fast to go all the way back to the Right.
    */
    turnRight();
    turnRight();
    moveFast();
    drawLeft("white");
    drawLeft("white");
    drawUp("black");
    drawUp("white", 8);
    drawUp("silver");
    drawUp("black", 4);
    drawLeft("black");
    move();
    drawRight("black");
    drawUp("gray");
    drawLeft("black");
    drawRight("black");
    drawRight("silver");
    drawLeft("black");
    drawRight("black");
    drawRight("silver");
    drawUp("white");
    drawUp("silver");
    drawLeft("silver");
    drawLeft("white");
    drawUp("white");
    drawUp("silver");
    drawUp("black");
    drawRight("black");
    drawRight("white");
    drawUp("white",4);
    drawUp("black",2);
    drawUp("silver");
    drawUp("white",9);
    drawUp("black");
    drawUp("white",2);
    drawLeft("white");
    drawLeft("black");
    drawUp("black", 2);
    drawUp("white",9);
    drawUp("silver",2);
    drawUp("white", 5);
    drawUp("silver");
    drawUp("white",4);
    drawUp("black", 3);
    drawRight("black");
    drawRight("black");
    drawUp("silver");
    drawUp("white",21);
    drawUp("black", 3);
    drawUp("white");
    drawLeft("white");
    drawLeft("black");
    drawUp("black", 2);
    drawUp("white", 22);
    drawUp("black", 2);
  /*
  At this point, the painter is
  nearing the end of the upperhalf of the hair, 
  meaning that the painter has to move to another spot to paint the next
  layer.
  */
    drawRight("black", 2);
    drawUp("White", 20);
    drawUp("silver", 2);
    drawUp("black", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    drawUp("black", 2);
    drawUp("silver", 4);
    drawUp("white", 18);
    drawUp("black");
    drawRight("black");
    drawRight("white");
    drawUp("white", 16);
    drawUp("silver", 4);
    drawUp("black");
    drawLeft("black");
    drawLeft("silver");
    drawUp("silver", 3);
    drawUp("white", 16);
    drawUp("black", 2);
    turnRight();
    move();
    drawRight("black");
    drawUp("black", 2);
    drawUp("white", 11);
    drawUp("silver");
    drawUp("white");
    drawUp("silver", 3);
    drawUp("Black", 3);
    turnLeft();
    move();
    turnLeft();
    move();
    drawUp("black", 4);
    drawUp("silver", 3);
    drawUp("white", 7);
    drawUp("black", 3);
    turnRight();
    move();
    turnRight();
    move();
    move();
    drawUp("black", 10);
    turnRight();
    /*
    Moves downward and to the Left
    This is to get into a position to start the left strands 
    of hair.
    */
    for (int i = 0; i < 10; i++) {
    move();
}
    turnRight();
    for (int i = 0; i < 10; i++){
      move();
    }
    drawUp("silver");
    drawLeft("black");
    drawUp("black");
    drawRight("black");
    drawLeft("black");
    drawRight("black");
    drawLeft("black");
    move();
    move();
    drawRight("black",2);
    drawUp("black", 4);
    drawRight("silver", 2);
    turnLeft();
    move();
    drawLeft("silver");
    drawUp("white");
    drawLeft("white");
    drawUp("silver");
    /*
    Drawing the last lines of hair on the left,
    this also makes the backhair to the left, as well
    as positions itself for the next method step.
    */
    drawUp("black");
    drawUp("silver");
    drawUp("black");
    drawLeft("black",2);
    drawUp("black");
    drawRight("black");
    drawRight("silver");
    drawUp("black");
    drawLeft("black",2);
    drawUp("black");
    turnRight();
    drawUp("black", 9);
    drawRight("silver", 2);
    drawUp("silver",4);
    drawUp("white",3);
    drawLeft("black",2);
    drawUp("black",7);
    drawLeft("silver");
    drawUp("silver");
    turnLeft();
    move();
    turnRight();
    drawUp("black");
    drawRight("black");
    drawUp("black");
    drawRight("silver");
    drawUp("black", 2);
    turnLeft();
    move();
    drawLeft("black");
    drawUp("black",2);
    drawUp("silver");
    drawUp("black",2);
    drawRight("black");
    drawRight("silver");
    drawUp("silver");
    drawUp("black", 3);
    drawLeft("black",2);
    drawUp("black");
    drawUp("silver", 3);
    drawUp("black",2);
    //The hair is finally complete.
  }
  /*
  This draws the face of the character.
  This includes:
  Eyes, 
  Nose,
  mouth.
  this is also the final part of the character Painter,
  used after the HairPainter is completed.
  */
  public void drawFace(){
    drawLeft("black",2);
    turnRight();
    turnRight();
    move();
    /* creates the black outline that separates
    the red neck area from the head

    Due to not having a skin color, had to use orange
      */
    drawUp("black",7);
    drawLeft("orange",2);
    drawUp("orange", 7);
    move();
    move();
    move();
    // draws 1/3 layers of mouth
    drawRight("black");
    drawRight("chocolate");
    drawUp("orange", 2);
    drawUp("black", 6);
    drawUp("orange", 6);
    drawUp("black", 2);
    //draw 2/3 layers of the mouth
    drawLeft("black");
    drawLeft("orange");
    drawUp("orange",5);
    drawUp("black");
    drawUp("orange",6);
    drawUp("black");
    drawUp("orange",2);
    drawUp("chocolate");
    //Finishes the mouth 3/3
    drawRight("chocolate");
    drawRight("orange");
    drawUp("orange", 9);
    drawUp("black");
    drawUp("orange", 5);
    drawUp("chocolate");
    //Draws the nose and starts the eyes
    drawLeft("chocolate");
    drawLeft("orange");
    drawUp("orange", 7);
    drawUp("chocolate", 3);
    drawUp("orange",2);
    drawUp("black");
    drawUp("orange", 3);
    drawUp("chocolate");
    //adds red to the eyes, starts right eye
    drawRight("chocolate");
    drawRight("orange");
    drawUp("orange");
    drawUp("black");
    drawUp("maroon");
    drawUp("white", 2);
    drawUp("orange", 4);
    drawUp("black");
    drawUp("orange", 6);
    drawUp("chocolate");
    //adds the second layer of the eyes, and finishes right eye
    drawLeft("chocolate");
    drawLeft("orange");
    drawUp("orange",2);
    drawUp("black",3);
    drawUp("orange",5);
    drawUp("white",2);
    drawUp("maroon");
    drawUp("red");
    drawUp("black",2);
    drawUp("chocolate");
    //adds the third layer of the left eye
    drawRight("chocolate");
    drawRight("orange");
    drawUp("black");
    drawUp("red");
    drawUp("maroon");
    drawUp("white",2);
    drawUp("orange",10);
    drawUp("chocolate");
    //finishes the last layer of the Left eye
    drawLeft("chocolate",2);
    drawUp("chocolate");
    drawUp("orange",8);
    drawUp("black",5);
    drawUp("orange");
    //finishes the last layers of the face.
    drawRight("chocolate");
    drawRight("orange");
    drawUp("orange", 11);
    drawUp("chocolate");
    turnLeft();
    move();
    drawLeft("chocolate");
    drawUp("orange", 4);
    drawUp("chocolate");
    move();
    drawUp("chocolate");
    drawUp("orange",3);
    drawUp("chocolate");
    /* 
    Last two layers underneath the hair.
    uses chocolate and spaces as shading.
      */
    turnRight();
    move();
    drawRight("chocolate");
    drawUp("chocolate");
    move();
    move();
    move();
    move();
    drawUp("chocolate",2);
    drawUp("orange");
    drawUp("chocolate",2);
    turnLeft();
    move();
    drawLeft("chocolate");
    drawUp("chocolate",2);
    for (int i = 0; i < 5; i++){
      move();
    }
    drawUp("chocolate");
    //The face is finished, Yay!
  }
}
