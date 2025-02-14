String monthNames[] = {"January", "Feburary", "Marts", "April", "May", "June", "July", "August", "Oktober", "November", "December"};
int monthNumber = int(random(0, 11));
int day = int(random(1, 30));
String firstText = "There are %s days in %s";
String otherText = "Today is %s'th of %s - Date %s-%s-%s";
String month = "January";
int days;
void setup() {
  switch (month) {
  case "January":
  case "Feburary":
    days = 28;
    break;
  case "Marts":
  case "April":
    days = 30;
    break;
  case "May":
  case "June":
    days = 30;
    break;
  case "July":
  case "August":
  case "September":
    days = 30;
    break;
  case "October":
  case "November":
    days = 30;
    break;
  case "December":
  case "Default":
    println("ERROR");
    break;
  }
  println(String.format(firstText, days, month));
  
  
  //Instead of using a switch case, I would use a array to define the month
  println(String.format(otherText, day, monthNames[monthNumber], monthNumber+1, day, year()));
}
