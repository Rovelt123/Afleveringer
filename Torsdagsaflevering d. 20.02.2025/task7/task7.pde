void setup() {
  printNumber(10);
}

void printNumber(int number) {
   println(number);
   number--;
   if (number > 0) {
     printNumber(number);
   }
}
