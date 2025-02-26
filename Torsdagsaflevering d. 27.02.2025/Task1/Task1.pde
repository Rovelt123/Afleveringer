int[] arr = {28, 230, 9, 310,72};

void setup() {
  println(getRandom());
}

int getRandom() {
  int number = (int) random(arr.length);
  return arr[number];
}
