class Teacher {
  String name;
  int age;
  boolean isFemale;
  Teacher(String tmpName, int tmpAge, boolean tpmIsFemale) {
    name = tmpName;
    age = tmpAge;
    isFemale = tpmIsFemale;
  }
  void changeName(String newName) {
    name = newName;
  }
  
  void printData() {
    println("\nTeacher name: " + name);
    println("Student age: " +age);
    println("Is teacher a female: " + isFemale);
  }
  
}
