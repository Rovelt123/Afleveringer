int input = 20; // Counts from 1-20
int input2 = -20;  // It will still count up from 1-20, since we start from 1, therefore we need to set i to -1 and i -= 1.
void setup() {
  // Works with positive input
  for (int i = 1; i < input; i += 1) {
    println(i);
    if (i == 6) {
      println("SIX");
    } else if (i == input/2) {
      println("HALF");
    }
  }
  
  // Works with negative input
  for (int i = -1; i > input2; i -= 1) {
    println(i);
    if (i == 6) {
      println("SIX");
    } else if (i == input2/2) {
      println("HALF");
    }
  }
}
