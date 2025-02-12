String firstName = "Andreas";
String middleName= "Alexander";
String lastName = "Rovelt";
int age = 24;
boolean happy = true;

String message = "My name is %s %s %s \nI am %s years old \nAnd I%s clap my hands!";

String claps = "";
if (!happy) {
  claps = " doesn't";
}
println(String.format(message, firstName, middleName, lastName, age, claps));
