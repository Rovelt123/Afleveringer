boolean oddNumbers = true;
// Alle tal fra 1-20
for (int a = 1; a <= 20; a += 1) {
  if (oddNumbers) { //Tjekker efter om vi skal have ulige eller lige tal
    println(a);
  } else {
    if (a % 2 == 0) { //Bruger modulus til at definere om vi skal have lige eller ulige tal
      println(a);
    }
  }
}

/*Dette er en anden løsning på lige tal fra 1-20
 for (int a = 2; a <= 20; a += 2){
 println(a);
 }
 */
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
