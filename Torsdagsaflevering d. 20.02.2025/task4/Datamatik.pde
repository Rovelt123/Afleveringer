Teacher myTeacher;
Student myStudent;
Student otherStudent;
void setup() {
  myTeacher = new Teacher("Tess", 30, true);
  myStudent = new Student("Andreas", 25, false, true);
  otherStudent = new Student("Freja", 25, true, false);
  
  println("Teacher name: "+myTeacher.name);
  println("Name: " + myStudent.name + "\nAre a part of Datamatiker team: " + myStudent.datamatikerTeam);
  println("\nName: " + otherStudent.name + "\nAre a part of Datamatiker team: " + otherStudent.datamatikerTeam);


  //Also made a function to print all data in both teacher and students
  myTeacher.printData();
  myStudent.printData();
  otherStudent.printData();
}
