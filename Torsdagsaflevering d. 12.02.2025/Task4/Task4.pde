boolean oddNumbers = true;
String assignment = "2"; // use "1" for assignment number one, and "2" for assignment number two
if (assignment == "1") {
  // Alle tal fra 1-20
  for (int a = 1; a <= 20; a += 1) {
    if (oddNumbers) { //Checks whether we should have odd or even numbers
      println(a);
    } else {
      if (a % 2 == 0) { //Use modulus to define whether we should have even or odd numbers
        println(a);
      }
    }
  }

  /*This is another solution for even numbers from 1-20
   for (int a = 2; a <= 20; a += 2){
   println(a);
   }
   */
   
} else if (assignment == "2") {
  String counterText = "";
  for (int start = 20; start >= 0; start -= 1) {
    switch (start) {
    case 3:
      counterText = "THREE";
      break;
    case 2:
      counterText = "TWO";
      break;
    case 1:
      counterText = "ONE";
      break;
    case 0:
      counterText = "TAKE OFF!";
      break;
    }
    println(counterText);
  }
}
