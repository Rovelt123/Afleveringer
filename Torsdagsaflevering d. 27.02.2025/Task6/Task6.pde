int board[][] = new int[8][8];
int size = 40;

void setup() {
  size(320, 320);
  for (int a = 0; a < board.length; a++) {
    for (int b = 0; b < board[a].length; b++) {
      board[a][b] = (a+b) % 2;
    }
  }
}


void draw() {
  for (int a = 0; a < board.length; a++) {
    for (int b = 0; b < board[a].length; b++) {
      int myColor =  board[a][b] == 0 ? #030000 : #FFFFFF;
      fill(myColor);
      rect(a*size, b*size, size, size);
    }
  }
}
