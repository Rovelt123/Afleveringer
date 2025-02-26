int numberList[] = new int[10];

void setup() {
 for (int i = 0; i < numberList.length; i++) {
   numberList[i] = (int) random(1,100);
 }
 numberList = sort(numberList);
 println(numberList);
}
