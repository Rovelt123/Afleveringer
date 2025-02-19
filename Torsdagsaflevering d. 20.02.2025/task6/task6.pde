void setup() {
  divisible(10);
}

void divisible(int number) {
  for (int a = 1; a <= 100; a++) {
   if (a % number == 0) {
    println(a); 
   }
  }
}
