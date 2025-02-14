int timer = 0;
size(600, 600);

int randomSize = 200;
while (timer < 100) {
  timer += 1;
  int red = (int) random(1,255);
  int green = (int) random(1,255);
  int blue = (int) random(1,255);
  int randomX = (int) random(1, width);
  int randomY = (int) random(1, height);
  randomSize -= 2;
  fill(color(red, green, blue));
  ellipse(randomX, randomY, randomSize, randomSize); 
  println("There is " +timer+ " Circles now");
}
