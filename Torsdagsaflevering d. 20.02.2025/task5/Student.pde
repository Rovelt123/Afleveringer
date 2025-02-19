class Student {
  String name;
  int age;
  boolean isFemale;
  String datamatikerTeam;
  Student(String tmpName, int tmpAge, boolean tpmIsFemale, String tmpDatamatikerTeam) {
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
