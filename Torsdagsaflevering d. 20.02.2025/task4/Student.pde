class Student {
  String name;
  int age;
  boolean isFemale;
  boolean datamatikerTeam;
  Student(String tmpName, int tmpAge, boolean tpmIsFemale, boolean tmpDatamatikerTeam) {
    name = tmpName;
    age = tmpAge;
    isFemale = tpmIsFemale;
    datamatikerTeam = tmpDatamatikerTeam;
  }
  
  void printData() {
    println("\nStudent name: " + name);
    println("Student age: " +age);
    println("Is student a female: " + isFemale);
    println("Is student a part of the datamatiker team: " + datamatikerTeam);
  }
  
}
