boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   int sumOfThisMath = sum(5, 10);
   println(sumOfThisMath);
   
   String upperCaseMessage = upperCase("this is meant to be in upper case. fix this please");
   println(upperCaseMessage);
   
   boolean isFirstUpperCase = firstLetterUpperCase("This begins with a big letter!");
  print(isFirstUpperCase);
}

boolean iAmHappy(){
  return happy;
}

int sum(int a, int b) {
 return a+b; 
}

String upperCase(String message) {
 return message.toUpperCase();
}

boolean firstLetterUpperCase(String message){
return Character.isUpperCase(message.charAt(0));
}
