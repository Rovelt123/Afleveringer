Teacher myTeacher;
void setup() {
  myTeacher = new Teacher("Tess", 30, true);
  
  println("Teacher name: "+myTeacher.name);
  myTeacher.changeName("Tine");
  println("New teacher name: "+myTeacher.name);
  
}
