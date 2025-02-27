boolean errorMessage = true;

String city = "København";
void setup() {
  println(PartOfWord(city, 0, 3));
  println(PartOfWord(city, city.length()-4, city.length()));
  
  // For at teste mine beskeder ved følgende kriterier. 
  /*println(PartOfWord(city, 1, 1));
  println(PartOfWord(city, -1, 1));
  println(PartOfWord(city, 1, 100));*/
}

/*
Jeg fandt en masse problematiker, som jeg satte mig for at løse. 
1.) startNumber må ikke være under 0 eller over længden på min string. Derfor benytter jeg en ternær operator til at sikrer mig at disse overholdes, hvis ikke sættes værdien til 0.
2.) startNumber og endNumber må ikke være det samme.
3.) endNumber skal være støre startNumber
4.) endNumber må ikke være større end længden på min string
(Jeg så så lige, at vi skulle lave en passende besked, hvis disse kriterier overskrides, så har lavet det også. Sæt variablen "errorMessage" til true for at få beskeder! :D
*/

String PartOfWord(String name, int startNumber, int endNumber) {
  String message = "";
  if (startNumber >= 0 && startNumber <= city.length() && startNumber != endNumber && endNumber <= city.length() || errorMessage == false) {
    int start =  startNumber >= 0 && startNumber <= city.length() ? startNumber : 0;
    message = (start != endNumber) && endNumber > start && city.length() >= endNumber ? name.substring(start, endNumber) : name.substring(start); 
  } else {
    if (startNumber < 0) {
      message = "Start number must be 0 or above!";
    } else if (startNumber > city.length()) {
      message = "Start number must be under: "+city.length() +" and above 0!";
    } else if (endNumber > city.length()) {
      message = "End number must be under: "+city.length() +" and above "+ startNumber +"!";
    } else if ( startNumber == endNumber) {
      message = "Start nubmer and end number cannot be equal!";
    }   
  }
  return message;
}
