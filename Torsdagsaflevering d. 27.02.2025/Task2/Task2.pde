String city = "København";
void setup() {
  println(PartOfWord(city, 10, 0));
  println(PartOfWord("Other String", 2, 8));
}

/*
Jeg fandt en masse problematiker, som jeg satte mig for at løse. 
1.) startNumber må ikke være under 0 eller over længden på min string. Derfor benytter jeg en ternær operator til at sikrer mig at disse overholdes, hvis ikke sættes værdien til 0.
2.) startNumber og endNumber må ikke være det samme.
3.) endNumber skal være støre startNumber
4.) endNumber må ikke være større end længden på min string

*/

String PartOfWord(String name, int startNumber, int endNumber) {
    int start =  startNumber >= 0 && startNumber <= city.length() ? startNumber : 0;
    String result = (start != endNumber) && endNumber > start && city.length() >= endNumber ? name.substring(start, endNumber) : name.substring(start); 
    return result;
}
