circle []myCircles = new circle[10];
int circleSize = 50;
void setup() {
  size(500, 500);
  for (int i = 0; i < myCircles.length; i++) {
    float x = random(50, width-circleSize);
    float y = random(50, height-circleSize);
    myCircles[i] = new circle(x, y);
    myCircles[i].display();
  }
}

void draw() {
  background(255);
  for (circle Circle : myCircles) {
    float x = random(-2, 2);
    float y = random(-2, 2);
    Circle.move(x, y);
  }
}
