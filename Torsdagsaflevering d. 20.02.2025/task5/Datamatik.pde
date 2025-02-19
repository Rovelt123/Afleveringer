/*
Var lidt i tvivl om jeg forstod denne opgave korrekt.
*/ 

Student myStudent;
Student otherStudent;
void setup() {
  myStudent = new Student("Andreas", 25, false, "TEAM1");
  otherStudent = new Student("Freja", 25, true, "TEAM1");
  Boolean isStudentsSameTeam = isSameTeam(myStudent.datamatikerTeam, otherStudent.datamatikerTeam);
  println(isStudentsSameTeam);
  Boolean classMates = isClassmates(myStudent, otherStudent);
  if (classMates) {
    println(myStudent.name + " and " + otherStudent.name + " are classmates");
  } else {
    println(myStudent.name + " and " + otherStudent.name + " are not classmates");
  }
}
boolean isSameTeam(String myStudentTeam, String otherStudentTeam) {
 return (myStudentTeam == otherStudentTeam); 
}

boolean isClassmates(Student myStudent, Student otherStudent) {
  return (myStudent.datamatikerTeam == otherStudent.datamatikerTeam);
}
