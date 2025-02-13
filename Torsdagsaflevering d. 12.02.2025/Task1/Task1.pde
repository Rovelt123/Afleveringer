String monthNames[] = {"January", "Feburary", "Marts", "April", "May", "June", "July", "August", "Oktober", "November", "December"};
int monthNumber = int(random(0, 11));
int day = int(random(1, 30));
String text = "Today is %s'th of %s - Date %s-%s-%s";
String month;
void setup() {
  switch (monthNumber) {
  case 0:
    month = "January";
    break;
  case 1:
    month = "Febuary";
    break;
  case 2:
    month = "Marts";
    break;
  case 3:
    month = "April";
    break;
  case 4:
    month = "May";
    break;
  case 5:
    month = "June";
    break;
  case 6:
    month = "July";
    break;
  case 7:
    month = "August";
    break;
  case 8:
    month = "September";
    break;
  case 9:
    month = "Oktober";
    break;
  case 10:
    month = "November";
    break;
  case 11:
    month = "December";
    break;
  }
  println(String.format(text, day, month, monthNumber+1, day, year()));
  
  
  //Instead of using a switch case, I would use a array to define the month
  println(String.format(text, day, monthNames[monthNumber], monthNumber+1, day, year()));
}
