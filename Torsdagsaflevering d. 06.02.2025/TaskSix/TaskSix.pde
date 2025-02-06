int numberOfCircles;
int circleSize;
int counter = 0;
int rowCounter = 0;
int red = 255;
int green = 255;
int blue = 255;

void setup() {
  size(400, 400);

  numberOfCircles = 30;
  circleSize = width/numberOfCircles;
  ellipseMode(CORNER);
}
void draw() {

  int x = circleSize*counter;
  int y = circleSize*rowCounter;

  // red, green and blue variables added to fill()
  fill(red,green,blue);

  ellipse(x, y, circleSize, circleSize);

  // Explaining conditional assignments.
  // First part before the ?-mark, is a conditional.
  // If this is true, the value after the ?-mark will be assigned.
  // If not, the last value will.
  counter =  frameCount % numberOfCircles == 0 ? 0 : counter+1;
  rowCounter =  counter==0 ? rowCounter+1:rowCounter;

  //Code from 6c here (Changing color)
  red = counter==0 ? (int)random(255):red;
  green = counter==0 ? (int)random(255):green;
  blue = counter==0 ? (int)random(255):blue;
}
