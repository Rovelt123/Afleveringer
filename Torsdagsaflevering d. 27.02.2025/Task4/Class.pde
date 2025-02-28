class circle {
  float x;
  float y;
  circle(float tempx, float tempy) {
    x += tempx;
    y += tempy;
  }
  void display() {
    fill(0);
    ellipse(x, y, circleSize, circleSize);
  }

  void move(float tempx, float tempy) {
    x += tempx;
    y += tempy;
    display();
    
  }
}
