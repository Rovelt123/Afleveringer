int input = 20; // Tæller op fra 1-20
int input2 = -20;  // Den vil stadig tælle op fra 1-20, da vi starter fra 1.
void setup() {
  // Virker med positiv input
  for (int i = 1; i < input; i += 1) {
    println(i);
    if (i == 6) {
      println("SIX");
    } else if (i == input/2) {
      println("HALF");
    }
  }
  
  // Virker med negativ input
  for (int i = -1; i > input2; i -= 1) {
    println(i);
    if (i == 6) {
      println("SIX");
    } else if (i == input2/2) {
      println("HALF");
    }
  }
}
