ArrayList<Integer> integerList;
ArrayList<String> stringList;
ArrayList<Boolean> booleanList;

void setup() {
  integerList = new ArrayList<Integer>();
  stringList = new ArrayList<String>();
  booleanList = new ArrayList<Boolean>();
  
  for (int i = 0; i < 3; i++) {
    integerList.add(i+1);
    stringList.add("This is test: "+(i+1));
    boolean result = i % 2 == 0 ? true : false;
    booleanList.add(result);
  }
  printList(stringList);
  
  
  int sum = sumOfList(integerList);
  println("\nThe sum of the list is: "+sum);
  
  int averageValue = averageValue(integerList);
  println("\nThe average valute of the list is: " +averageValue);
}

int averageValue(ArrayList<Integer> list) {
  int sum = 0;
  for(Integer i : list) {
    sum += i;
  }
  return sum / list.size();
}

int sumOfList(ArrayList<Integer> list) {
  int sum = 0;
  for(Integer i : list) {
    sum += i;
  }
  return sum;
}

void printList(ArrayList<String> listToPrint) {
  println("This is the list: " +listToPrint);
  for (String i : listToPrint) {
     println(i); 
  }
}
