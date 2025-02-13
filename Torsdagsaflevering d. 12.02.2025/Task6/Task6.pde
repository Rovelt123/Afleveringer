int red = color(255, 0, 0);
int grey = color(160, 160, 160);
int yellow = color(255, 248, 15);
int green = color(0, 255, 0);


void setup() {
  size(500, 500);
  background(255);
}

int light1 = grey;
int light2 = grey;
int light3 = green;
void draw() {
  switch (frameCount % 400) {
  case 0:
    light3 = green;
    light1 = grey;
    break;
  case 100:
    light2 = yellow;
    break;
  case 200:
    light3 = grey;
    light2 = grey;
    light1 = red;
    break;
  }
  rectMode(CENTER);
  fill(0);
  rect(width / 2, height / 2, 70, 300, 28);
  fill(light1);
  ellipse(width / 2, height  / 2 - 100, 50, 50);
  fill(light2);
  ellipse(width / 2, height / 2, 50, 50);
  fill(light3);
  ellipse(width /2, height / 2 + 100, 50, 50);
}
