Teacher myTeacher;
Student myStudent;
Student otherStudent;
void setup() {
  myTeacher = new Teacher("Tess", 30, true);
  myStudent = new Student("Andreas", 25, false, "TEAM1");
  otherStudent = new Student("Freja", 25, true, "TEAM2");
  
  println("Teacher name: "+myTeacher.name);
  println("Name: " + myStudent.name + "\nTeam: " + myStudent.datamatikerTeam);
  println("\nName: " + otherStudent.name + "\nTeam: " + otherStudent.datamatikerTeam);


  //Also made a function to print all data in both teacher and students
  myTeacher.printData();
  myStudent.printData();
  otherStudent.printData();
}
