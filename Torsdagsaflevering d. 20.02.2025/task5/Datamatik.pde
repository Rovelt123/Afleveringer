Student myStudent;
Student otherStudent;
void setup() {
  myStudent = new Student("Andreas", 25, false, "TEAM1");
  otherStudent = new Student("Freja", 25, true, "TEAM2");
  Boolean classMates = isClassmates(myStudent, otherStudent);
  if (classMates) {
    println(myStudent.name + " and " + otherStudent.name + " are classmates");
  } else {
    println(myStudent.name + " and " + otherStudent.name + " are not classmates");
  }
}

boolean isClassmates(Student myStudent, Student otherStudent) {
  return myStudent.datamatikerTeam.equals(otherStudent.datamatikerTeam);
}
