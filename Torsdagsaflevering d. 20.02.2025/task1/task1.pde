void setup() {
  sayThis(null);
  sayThis("This is a string!");
  nameAndAge(returnName(), 15);
}

void sayThis(String message) {
  if (message == null) {
    println("Hello from the method");
  } else {
    println(message);
  }
}

void nameAndAge(String name, int age) {
  String messageFormat = (String.format("My name is %s, and I am %s years old", name, age));
  println(messageFormat);
}

String returnName() {
  return("Andreas");
}
